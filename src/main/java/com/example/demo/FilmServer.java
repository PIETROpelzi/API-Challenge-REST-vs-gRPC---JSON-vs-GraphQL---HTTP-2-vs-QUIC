package com.example.demo;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FilmServer implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Server server = ServerBuilder.forPort(9090)
                .addService(new FilmServiceImpl())
                .build()
                .start();

        System.out.println("Server gRPC avviato sulla porta 9090");
    }

    static class FilmServiceImpl extends FilmServiceGrpc.FilmServiceImplBase {

        private final List<FilmProto.Film> films = List.of(
                FilmProto.Film.newBuilder().setId(1).setTitolo("Il Padrino").setRegista("Francis Ford Coppola").setAnno(1972).build(),
                FilmProto.Film.newBuilder().setId(2).setTitolo("Interstellar").setRegista("Christopher Nolan").setAnno(2014).build(),
                FilmProto.Film.newBuilder().setId(3).setTitolo("La vita è bella").setRegista("Roberto Benigni").setAnno(1997).build()
        );

        @Override
        public void getFilm(FilmProto.FilmRequest request, StreamObserver<FilmProto.FilmResponse> responseObserver) {
            films.stream()
                    .filter(f -> f.getId() == request.getId())
                    .findFirst()
                    .ifPresentOrElse(
                            film -> responseObserver.onNext(FilmProto.FilmResponse.newBuilder().setFilm(film).build()),
                            ()   -> responseObserver.onNext(FilmProto.FilmResponse.getDefaultInstance())
                    );
            responseObserver.onCompleted();
        }

        @Override
        public void getAllFilms(FilmProto.EmptyRequest request, StreamObserver<FilmProto.FilmListResponse> responseObserver) {
            responseObserver.onNext(FilmProto.FilmListResponse.newBuilder().addAllFilms(films).build());
            responseObserver.onCompleted();
        }
    }
}