package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/grpc")
public class FilmClient {

    // GET /grpc/films → chiama il server gRPC e mostra confronto JSON vs Protobuf
    @GetMapping("/films")
    public Map<String, Object> confronto() throws Exception {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        FilmServiceGrpc.FilmServiceBlockingStub stub = FilmServiceGrpc.newBlockingStub(channel);
        FilmProto.FilmListResponse response = stub.getAllFilms(FilmProto.EmptyRequest.getDefaultInstance());

        // Serializzazione Protobuf
        byte[] protobufBytes = response.toByteArray();

        // Serializzazione JSON equivalente
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> jsonList = response.getFilmsList().stream()
                .map(f -> {
                    Map<String, Object> map = new HashMap<>();
                    map.put("id",      f.getId());
                    map.put("titolo",  f.getTitolo());
                    map.put("regista", f.getRegista());
                    map.put("anno",    f.getAnno());
                    return map;
                })
                .toList();
        byte[] jsonBytes = mapper.writeValueAsBytes(jsonList);

        channel.shutdown();

        // Risposta con il confronto
        return Map.of(
                "films",           jsonList,
                "jsonBytes",       jsonBytes.length,
                "protobufBytes",   protobufBytes.length,
                "risparmio",       String.format("%.1f%%", (1.0 - (double) protobufBytes.length / jsonBytes.length) * 100)
        );
    }
}