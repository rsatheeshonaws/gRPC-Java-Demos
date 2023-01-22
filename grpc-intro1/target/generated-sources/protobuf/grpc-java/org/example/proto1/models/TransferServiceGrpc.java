package org.example.proto1.models;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: transfer-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TransferServiceGrpc {

  private TransferServiceGrpc() {}

  public static final String SERVICE_NAME = "service.TransferService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.proto1.models.TransferRequest,
      org.example.proto1.models.TransferResponse> getTransferMoneyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "transferMoney",
      requestType = org.example.proto1.models.TransferRequest.class,
      responseType = org.example.proto1.models.TransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.proto1.models.TransferRequest,
      org.example.proto1.models.TransferResponse> getTransferMoneyMethod() {
    io.grpc.MethodDescriptor<org.example.proto1.models.TransferRequest, org.example.proto1.models.TransferResponse> getTransferMoneyMethod;
    if ((getTransferMoneyMethod = TransferServiceGrpc.getTransferMoneyMethod) == null) {
      synchronized (TransferServiceGrpc.class) {
        if ((getTransferMoneyMethod = TransferServiceGrpc.getTransferMoneyMethod) == null) {
          TransferServiceGrpc.getTransferMoneyMethod = getTransferMoneyMethod =
              io.grpc.MethodDescriptor.<org.example.proto1.models.TransferRequest, org.example.proto1.models.TransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "transferMoney"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto1.models.TransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto1.models.TransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransferServiceMethodDescriptorSupplier("transferMoney"))
              .build();
        }
      }
    }
    return getTransferMoneyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransferServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransferServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransferServiceStub>() {
        @java.lang.Override
        public TransferServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransferServiceStub(channel, callOptions);
        }
      };
    return TransferServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransferServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransferServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransferServiceBlockingStub>() {
        @java.lang.Override
        public TransferServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransferServiceBlockingStub(channel, callOptions);
        }
      };
    return TransferServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransferServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransferServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransferServiceFutureStub>() {
        @java.lang.Override
        public TransferServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransferServiceFutureStub(channel, callOptions);
        }
      };
    return TransferServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TransferServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * bi-directional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.proto1.models.TransferRequest> transferMoney(
        io.grpc.stub.StreamObserver<org.example.proto1.models.TransferResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getTransferMoneyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTransferMoneyMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                org.example.proto1.models.TransferRequest,
                org.example.proto1.models.TransferResponse>(
                  this, METHODID_TRANSFER_MONEY)))
          .build();
    }
  }

  /**
   */
  public static final class TransferServiceStub extends io.grpc.stub.AbstractAsyncStub<TransferServiceStub> {
    private TransferServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransferServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransferServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * bi-directional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.proto1.models.TransferRequest> transferMoney(
        io.grpc.stub.StreamObserver<org.example.proto1.models.TransferResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getTransferMoneyMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class TransferServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TransferServiceBlockingStub> {
    private TransferServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransferServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransferServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class TransferServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TransferServiceFutureStub> {
    private TransferServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransferServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransferServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_TRANSFER_MONEY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TransferServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TransferServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRANSFER_MONEY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.transferMoney(
              (io.grpc.stub.StreamObserver<org.example.proto1.models.TransferResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TransferServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TransferServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.proto1.models.TransferServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TransferService");
    }
  }

  private static final class TransferServiceFileDescriptorSupplier
      extends TransferServiceBaseDescriptorSupplier {
    TransferServiceFileDescriptorSupplier() {}
  }

  private static final class TransferServiceMethodDescriptorSupplier
      extends TransferServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TransferServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TransferServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TransferServiceFileDescriptorSupplier())
              .addMethod(getTransferMoneyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
