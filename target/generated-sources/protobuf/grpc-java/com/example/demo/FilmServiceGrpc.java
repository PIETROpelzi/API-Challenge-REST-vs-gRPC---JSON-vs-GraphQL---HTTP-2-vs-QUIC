package com.example.demo;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: film.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FilmServiceGrpc {

  private FilmServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "FilmService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.FilmProto.FilmRequest,
      com.example.demo.FilmProto.FilmResponse> getGetFilmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFilm",
      requestType = com.example.demo.FilmProto.FilmRequest.class,
      responseType = com.example.demo.FilmProto.FilmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.FilmProto.FilmRequest,
      com.example.demo.FilmProto.FilmResponse> getGetFilmMethod() {
    io.grpc.MethodDescriptor<com.example.demo.FilmProto.FilmRequest, com.example.demo.FilmProto.FilmResponse> getGetFilmMethod;
    if ((getGetFilmMethod = FilmServiceGrpc.getGetFilmMethod) == null) {
      synchronized (FilmServiceGrpc.class) {
        if ((getGetFilmMethod = FilmServiceGrpc.getGetFilmMethod) == null) {
          FilmServiceGrpc.getGetFilmMethod = getGetFilmMethod =
              io.grpc.MethodDescriptor.<com.example.demo.FilmProto.FilmRequest, com.example.demo.FilmProto.FilmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFilm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.FilmProto.FilmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.FilmProto.FilmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FilmServiceMethodDescriptorSupplier("GetFilm"))
              .build();
        }
      }
    }
    return getGetFilmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.FilmProto.EmptyRequest,
      com.example.demo.FilmProto.FilmListResponse> getGetAllFilmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllFilms",
      requestType = com.example.demo.FilmProto.EmptyRequest.class,
      responseType = com.example.demo.FilmProto.FilmListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.FilmProto.EmptyRequest,
      com.example.demo.FilmProto.FilmListResponse> getGetAllFilmsMethod() {
    io.grpc.MethodDescriptor<com.example.demo.FilmProto.EmptyRequest, com.example.demo.FilmProto.FilmListResponse> getGetAllFilmsMethod;
    if ((getGetAllFilmsMethod = FilmServiceGrpc.getGetAllFilmsMethod) == null) {
      synchronized (FilmServiceGrpc.class) {
        if ((getGetAllFilmsMethod = FilmServiceGrpc.getGetAllFilmsMethod) == null) {
          FilmServiceGrpc.getGetAllFilmsMethod = getGetAllFilmsMethod =
              io.grpc.MethodDescriptor.<com.example.demo.FilmProto.EmptyRequest, com.example.demo.FilmProto.FilmListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllFilms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.FilmProto.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.FilmProto.FilmListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FilmServiceMethodDescriptorSupplier("GetAllFilms"))
              .build();
        }
      }
    }
    return getGetAllFilmsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FilmServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FilmServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FilmServiceStub>() {
        @java.lang.Override
        public FilmServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FilmServiceStub(channel, callOptions);
        }
      };
    return FilmServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FilmServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FilmServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FilmServiceBlockingStub>() {
        @java.lang.Override
        public FilmServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FilmServiceBlockingStub(channel, callOptions);
        }
      };
    return FilmServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FilmServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FilmServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FilmServiceFutureStub>() {
        @java.lang.Override
        public FilmServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FilmServiceFutureStub(channel, callOptions);
        }
      };
    return FilmServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getFilm(com.example.demo.FilmProto.FilmRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.FilmProto.FilmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFilmMethod(), responseObserver);
    }

    /**
     */
    default void getAllFilms(com.example.demo.FilmProto.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.FilmProto.FilmListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllFilmsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FilmService.
   */
  public static abstract class FilmServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FilmServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FilmService.
   */
  public static final class FilmServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FilmServiceStub> {
    private FilmServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FilmServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FilmServiceStub(channel, callOptions);
    }

    /**
     */
    public void getFilm(com.example.demo.FilmProto.FilmRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.FilmProto.FilmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFilmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllFilms(com.example.demo.FilmProto.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.FilmProto.FilmListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllFilmsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FilmService.
   */
  public static final class FilmServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FilmServiceBlockingStub> {
    private FilmServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FilmServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FilmServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.demo.FilmProto.FilmResponse getFilm(com.example.demo.FilmProto.FilmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFilmMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.FilmProto.FilmListResponse getAllFilms(com.example.demo.FilmProto.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllFilmsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FilmService.
   */
  public static final class FilmServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FilmServiceFutureStub> {
    private FilmServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FilmServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FilmServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.FilmProto.FilmResponse> getFilm(
        com.example.demo.FilmProto.FilmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFilmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.FilmProto.FilmListResponse> getAllFilms(
        com.example.demo.FilmProto.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllFilmsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FILM = 0;
  private static final int METHODID_GET_ALL_FILMS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FILM:
          serviceImpl.getFilm((com.example.demo.FilmProto.FilmRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.FilmProto.FilmResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_FILMS:
          serviceImpl.getAllFilms((com.example.demo.FilmProto.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.FilmProto.FilmListResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetFilmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.demo.FilmProto.FilmRequest,
              com.example.demo.FilmProto.FilmResponse>(
                service, METHODID_GET_FILM)))
        .addMethod(
          getGetAllFilmsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.demo.FilmProto.EmptyRequest,
              com.example.demo.FilmProto.FilmListResponse>(
                service, METHODID_GET_ALL_FILMS)))
        .build();
  }

  private static abstract class FilmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FilmServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.FilmProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FilmService");
    }
  }

  private static final class FilmServiceFileDescriptorSupplier
      extends FilmServiceBaseDescriptorSupplier {
    FilmServiceFileDescriptorSupplier() {}
  }

  private static final class FilmServiceMethodDescriptorSupplier
      extends FilmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FilmServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FilmServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FilmServiceFileDescriptorSupplier())
              .addMethod(getGetFilmMethod())
              .addMethod(getGetAllFilmsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
