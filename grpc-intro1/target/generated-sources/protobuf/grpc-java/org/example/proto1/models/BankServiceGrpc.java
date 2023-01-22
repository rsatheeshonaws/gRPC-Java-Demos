package org.example.proto1.models;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: bank-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.proto1.models.BalanceCheckRequest,
      org.example.proto1.models.Balance> getGetBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBalance",
      requestType = org.example.proto1.models.BalanceCheckRequest.class,
      responseType = org.example.proto1.models.Balance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.proto1.models.BalanceCheckRequest,
      org.example.proto1.models.Balance> getGetBalanceMethod() {
    io.grpc.MethodDescriptor<org.example.proto1.models.BalanceCheckRequest, org.example.proto1.models.Balance> getGetBalanceMethod;
    if ((getGetBalanceMethod = BankServiceGrpc.getGetBalanceMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetBalanceMethod = BankServiceGrpc.getGetBalanceMethod) == null) {
          BankServiceGrpc.getGetBalanceMethod = getGetBalanceMethod =
              io.grpc.MethodDescriptor.<org.example.proto1.models.BalanceCheckRequest, org.example.proto1.models.Balance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto1.models.BalanceCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto1.models.Balance.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getBalance"))
              .build();
        }
      }
    }
    return getGetBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.proto1.models.WithdrawRequest,
      org.example.proto1.models.Money> getWithdrawMoneyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "withdrawMoney",
      requestType = org.example.proto1.models.WithdrawRequest.class,
      responseType = org.example.proto1.models.Money.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.proto1.models.WithdrawRequest,
      org.example.proto1.models.Money> getWithdrawMoneyMethod() {
    io.grpc.MethodDescriptor<org.example.proto1.models.WithdrawRequest, org.example.proto1.models.Money> getWithdrawMoneyMethod;
    if ((getWithdrawMoneyMethod = BankServiceGrpc.getWithdrawMoneyMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getWithdrawMoneyMethod = BankServiceGrpc.getWithdrawMoneyMethod) == null) {
          BankServiceGrpc.getWithdrawMoneyMethod = getWithdrawMoneyMethod =
              io.grpc.MethodDescriptor.<org.example.proto1.models.WithdrawRequest, org.example.proto1.models.Money>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "withdrawMoney"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto1.models.WithdrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto1.models.Money.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("withdrawMoney"))
              .build();
        }
      }
    }
    return getWithdrawMoneyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.proto1.models.DepositRequest,
      org.example.proto1.models.Balance> getDepositMoneyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "depositMoney",
      requestType = org.example.proto1.models.DepositRequest.class,
      responseType = org.example.proto1.models.Balance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.proto1.models.DepositRequest,
      org.example.proto1.models.Balance> getDepositMoneyMethod() {
    io.grpc.MethodDescriptor<org.example.proto1.models.DepositRequest, org.example.proto1.models.Balance> getDepositMoneyMethod;
    if ((getDepositMoneyMethod = BankServiceGrpc.getDepositMoneyMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getDepositMoneyMethod = BankServiceGrpc.getDepositMoneyMethod) == null) {
          BankServiceGrpc.getDepositMoneyMethod = getDepositMoneyMethod =
              io.grpc.MethodDescriptor.<org.example.proto1.models.DepositRequest, org.example.proto1.models.Balance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "depositMoney"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto1.models.DepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto1.models.Balance.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("depositMoney"))
              .build();
        }
      }
    }
    return getDepositMoneyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceStub>() {
        @java.lang.Override
        public BankServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceStub(channel, callOptions);
        }
      };
    return BankServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub>() {
        @java.lang.Override
        public BankServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceBlockingStub(channel, callOptions);
        }
      };
    return BankServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub>() {
        @java.lang.Override
        public BankServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceFutureStub(channel, callOptions);
        }
      };
    return BankServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * unary
     * </pre>
     */
    public void getBalance(org.example.proto1.models.BalanceCheckRequest request,
        io.grpc.stub.StreamObserver<org.example.proto1.models.Balance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * server streaming
     * </pre>
     */
    public void withdrawMoney(org.example.proto1.models.WithdrawRequest request,
        io.grpc.stub.StreamObserver<org.example.proto1.models.Money> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawMoneyMethod(), responseObserver);
    }

    /**
     * <pre>
     * client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.proto1.models.DepositRequest> depositMoney(
        io.grpc.stub.StreamObserver<org.example.proto1.models.Balance> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getDepositMoneyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.proto1.models.BalanceCheckRequest,
                org.example.proto1.models.Balance>(
                  this, METHODID_GET_BALANCE)))
          .addMethod(
            getWithdrawMoneyMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.example.proto1.models.WithdrawRequest,
                org.example.proto1.models.Money>(
                  this, METHODID_WITHDRAW_MONEY)))
          .addMethod(
            getDepositMoneyMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.example.proto1.models.DepositRequest,
                org.example.proto1.models.Balance>(
                  this, METHODID_DEPOSIT_MONEY)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractAsyncStub<BankServiceStub> {
    private BankServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary
     * </pre>
     */
    public void getBalance(org.example.proto1.models.BalanceCheckRequest request,
        io.grpc.stub.StreamObserver<org.example.proto1.models.Balance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * server streaming
     * </pre>
     */
    public void withdrawMoney(org.example.proto1.models.WithdrawRequest request,
        io.grpc.stub.StreamObserver<org.example.proto1.models.Money> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWithdrawMoneyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.proto1.models.DepositRequest> depositMoney(
        io.grpc.stub.StreamObserver<org.example.proto1.models.Balance> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getDepositMoneyMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary
     * </pre>
     */
    public org.example.proto1.models.Balance getBalance(org.example.proto1.models.BalanceCheckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * server streaming
     * </pre>
     */
    public java.util.Iterator<org.example.proto1.models.Money> withdrawMoney(
        org.example.proto1.models.WithdrawRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWithdrawMoneyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BankServiceFutureStub> {
    private BankServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.proto1.models.Balance> getBalance(
        org.example.proto1.models.BalanceCheckRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BALANCE = 0;
  private static final int METHODID_WITHDRAW_MONEY = 1;
  private static final int METHODID_DEPOSIT_MONEY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((org.example.proto1.models.BalanceCheckRequest) request,
              (io.grpc.stub.StreamObserver<org.example.proto1.models.Balance>) responseObserver);
          break;
        case METHODID_WITHDRAW_MONEY:
          serviceImpl.withdrawMoney((org.example.proto1.models.WithdrawRequest) request,
              (io.grpc.stub.StreamObserver<org.example.proto1.models.Money>) responseObserver);
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
        case METHODID_DEPOSIT_MONEY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.depositMoney(
              (io.grpc.stub.StreamObserver<org.example.proto1.models.Balance>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.proto1.models.BankServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getGetBalanceMethod())
              .addMethod(getWithdrawMoneyMethod())
              .addMethod(getDepositMoneyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
