package Main.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: UserService.proto")
public final class CRUDServiceGrpc {

  private CRUDServiceGrpc() {}

  public static final String SERVICE_NAME = "CRUDService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Main.proto.UserRequestId,
      Main.proto.userProto> getReadUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "readUser",
      requestType = Main.proto.UserRequestId.class,
      responseType = Main.proto.userProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Main.proto.UserRequestId,
      Main.proto.userProto> getReadUserMethod() {
    io.grpc.MethodDescriptor<Main.proto.UserRequestId, Main.proto.userProto> getReadUserMethod;
    if ((getReadUserMethod = CRUDServiceGrpc.getReadUserMethod) == null) {
      synchronized (CRUDServiceGrpc.class) {
        if ((getReadUserMethod = CRUDServiceGrpc.getReadUserMethod) == null) {
          CRUDServiceGrpc.getReadUserMethod = getReadUserMethod = 
              io.grpc.MethodDescriptor.<Main.proto.UserRequestId, Main.proto.userProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CRUDService", "readUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Main.proto.UserRequestId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Main.proto.userProto.getDefaultInstance()))
                  .setSchemaDescriptor(new CRUDServiceMethodDescriptorSupplier("readUser"))
                  .build();
          }
        }
     }
     return getReadUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Main.proto.userRequest,
      Main.proto.userProto> getCreateUSerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createUSer",
      requestType = Main.proto.userRequest.class,
      responseType = Main.proto.userProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Main.proto.userRequest,
      Main.proto.userProto> getCreateUSerMethod() {
    io.grpc.MethodDescriptor<Main.proto.userRequest, Main.proto.userProto> getCreateUSerMethod;
    if ((getCreateUSerMethod = CRUDServiceGrpc.getCreateUSerMethod) == null) {
      synchronized (CRUDServiceGrpc.class) {
        if ((getCreateUSerMethod = CRUDServiceGrpc.getCreateUSerMethod) == null) {
          CRUDServiceGrpc.getCreateUSerMethod = getCreateUSerMethod = 
              io.grpc.MethodDescriptor.<Main.proto.userRequest, Main.proto.userProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CRUDService", "createUSer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Main.proto.userRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Main.proto.userProto.getDefaultInstance()))
                  .setSchemaDescriptor(new CRUDServiceMethodDescriptorSupplier("createUSer"))
                  .build();
          }
        }
     }
     return getCreateUSerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Main.proto.UserUpdate,
      Main.proto.userProto> getUpdateUSerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateUSer",
      requestType = Main.proto.UserUpdate.class,
      responseType = Main.proto.userProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Main.proto.UserUpdate,
      Main.proto.userProto> getUpdateUSerMethod() {
    io.grpc.MethodDescriptor<Main.proto.UserUpdate, Main.proto.userProto> getUpdateUSerMethod;
    if ((getUpdateUSerMethod = CRUDServiceGrpc.getUpdateUSerMethod) == null) {
      synchronized (CRUDServiceGrpc.class) {
        if ((getUpdateUSerMethod = CRUDServiceGrpc.getUpdateUSerMethod) == null) {
          CRUDServiceGrpc.getUpdateUSerMethod = getUpdateUSerMethod = 
              io.grpc.MethodDescriptor.<Main.proto.UserUpdate, Main.proto.userProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CRUDService", "updateUSer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Main.proto.UserUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Main.proto.userProto.getDefaultInstance()))
                  .setSchemaDescriptor(new CRUDServiceMethodDescriptorSupplier("updateUSer"))
                  .build();
          }
        }
     }
     return getUpdateUSerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Main.proto.UserRequestId,
      Main.proto.OperationalStatusProto> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteUser",
      requestType = Main.proto.UserRequestId.class,
      responseType = Main.proto.OperationalStatusProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Main.proto.UserRequestId,
      Main.proto.OperationalStatusProto> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<Main.proto.UserRequestId, Main.proto.OperationalStatusProto> getDeleteUserMethod;
    if ((getDeleteUserMethod = CRUDServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (CRUDServiceGrpc.class) {
        if ((getDeleteUserMethod = CRUDServiceGrpc.getDeleteUserMethod) == null) {
          CRUDServiceGrpc.getDeleteUserMethod = getDeleteUserMethod = 
              io.grpc.MethodDescriptor.<Main.proto.UserRequestId, Main.proto.OperationalStatusProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CRUDService", "deleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Main.proto.UserRequestId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Main.proto.OperationalStatusProto.getDefaultInstance()))
                  .setSchemaDescriptor(new CRUDServiceMethodDescriptorSupplier("deleteUser"))
                  .build();
          }
        }
     }
     return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Main.proto.UserListLimit,
      Main.proto.UserRestProtoColl> getReadListUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "readListUser",
      requestType = Main.proto.UserListLimit.class,
      responseType = Main.proto.UserRestProtoColl.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Main.proto.UserListLimit,
      Main.proto.UserRestProtoColl> getReadListUserMethod() {
    io.grpc.MethodDescriptor<Main.proto.UserListLimit, Main.proto.UserRestProtoColl> getReadListUserMethod;
    if ((getReadListUserMethod = CRUDServiceGrpc.getReadListUserMethod) == null) {
      synchronized (CRUDServiceGrpc.class) {
        if ((getReadListUserMethod = CRUDServiceGrpc.getReadListUserMethod) == null) {
          CRUDServiceGrpc.getReadListUserMethod = getReadListUserMethod = 
              io.grpc.MethodDescriptor.<Main.proto.UserListLimit, Main.proto.UserRestProtoColl>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CRUDService", "readListUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Main.proto.UserListLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Main.proto.UserRestProtoColl.getDefaultInstance()))
                  .setSchemaDescriptor(new CRUDServiceMethodDescriptorSupplier("readListUser"))
                  .build();
          }
        }
     }
     return getReadListUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CRUDServiceStub newStub(io.grpc.Channel channel) {
    return new CRUDServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CRUDServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CRUDServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CRUDServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CRUDServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CRUDServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void readUser(Main.proto.UserRequestId request,
        io.grpc.stub.StreamObserver<Main.proto.userProto> responseObserver) {
      asyncUnimplementedUnaryCall(getReadUserMethod(), responseObserver);
    }

    /**
     */
    public void createUSer(Main.proto.userRequest request,
        io.grpc.stub.StreamObserver<Main.proto.userProto> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUSerMethod(), responseObserver);
    }

    /**
     */
    public void updateUSer(Main.proto.UserUpdate request,
        io.grpc.stub.StreamObserver<Main.proto.userProto> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUSerMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(Main.proto.UserRequestId request,
        io.grpc.stub.StreamObserver<Main.proto.OperationalStatusProto> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    public void readListUser(Main.proto.UserListLimit request,
        io.grpc.stub.StreamObserver<Main.proto.UserRestProtoColl> responseObserver) {
      asyncUnimplementedUnaryCall(getReadListUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Main.proto.UserRequestId,
                Main.proto.userProto>(
                  this, METHODID_READ_USER)))
          .addMethod(
            getCreateUSerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Main.proto.userRequest,
                Main.proto.userProto>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getUpdateUSerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Main.proto.UserUpdate,
                Main.proto.userProto>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getDeleteUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Main.proto.UserRequestId,
                Main.proto.OperationalStatusProto>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            getReadListUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Main.proto.UserListLimit,
                Main.proto.UserRestProtoColl>(
                  this, METHODID_READ_LIST_USER)))
          .build();
    }
  }

  /**
   */
  public static final class CRUDServiceStub extends io.grpc.stub.AbstractStub<CRUDServiceStub> {
    private CRUDServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CRUDServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CRUDServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CRUDServiceStub(channel, callOptions);
    }

    /**
     */
    public void readUser(Main.proto.UserRequestId request,
        io.grpc.stub.StreamObserver<Main.proto.userProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createUSer(Main.proto.userRequest request,
        io.grpc.stub.StreamObserver<Main.proto.userProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUSerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUSer(Main.proto.UserUpdate request,
        io.grpc.stub.StreamObserver<Main.proto.userProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUSerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(Main.proto.UserRequestId request,
        io.grpc.stub.StreamObserver<Main.proto.OperationalStatusProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readListUser(Main.proto.UserListLimit request,
        io.grpc.stub.StreamObserver<Main.proto.UserRestProtoColl> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadListUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CRUDServiceBlockingStub extends io.grpc.stub.AbstractStub<CRUDServiceBlockingStub> {
    private CRUDServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CRUDServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CRUDServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CRUDServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public Main.proto.userProto readUser(Main.proto.UserRequestId request) {
      return blockingUnaryCall(
          getChannel(), getReadUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public Main.proto.userProto createUSer(Main.proto.userRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateUSerMethod(), getCallOptions(), request);
    }

    /**
     */
    public Main.proto.userProto updateUSer(Main.proto.UserUpdate request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUSerMethod(), getCallOptions(), request);
    }

    /**
     */
    public Main.proto.OperationalStatusProto deleteUser(Main.proto.UserRequestId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public Main.proto.UserRestProtoColl readListUser(Main.proto.UserListLimit request) {
      return blockingUnaryCall(
          getChannel(), getReadListUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CRUDServiceFutureStub extends io.grpc.stub.AbstractStub<CRUDServiceFutureStub> {
    private CRUDServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CRUDServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CRUDServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CRUDServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Main.proto.userProto> readUser(
        Main.proto.UserRequestId request) {
      return futureUnaryCall(
          getChannel().newCall(getReadUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Main.proto.userProto> createUSer(
        Main.proto.userRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUSerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Main.proto.userProto> updateUSer(
        Main.proto.UserUpdate request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUSerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Main.proto.OperationalStatusProto> deleteUser(
        Main.proto.UserRequestId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Main.proto.UserRestProtoColl> readListUser(
        Main.proto.UserListLimit request) {
      return futureUnaryCall(
          getChannel().newCall(getReadListUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ_USER = 0;
  private static final int METHODID_CREATE_USER = 1;
  private static final int METHODID_UPDATE_USER = 2;
  private static final int METHODID_DELETE_USER = 3;
  private static final int METHODID_READ_LIST_USER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CRUDServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CRUDServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ_USER:
          serviceImpl.readUser((Main.proto.UserRequestId) request,
              (io.grpc.stub.StreamObserver<Main.proto.userProto>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUSer((Main.proto.userRequest) request,
              (io.grpc.stub.StreamObserver<Main.proto.userProto>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUSer((Main.proto.UserUpdate) request,
              (io.grpc.stub.StreamObserver<Main.proto.userProto>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((Main.proto.UserRequestId) request,
              (io.grpc.stub.StreamObserver<Main.proto.OperationalStatusProto>) responseObserver);
          break;
        case METHODID_READ_LIST_USER:
          serviceImpl.readListUser((Main.proto.UserListLimit) request,
              (io.grpc.stub.StreamObserver<Main.proto.UserRestProtoColl>) responseObserver);
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

  private static abstract class CRUDServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CRUDServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Main.proto.UserService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CRUDService");
    }
  }

  private static final class CRUDServiceFileDescriptorSupplier
      extends CRUDServiceBaseDescriptorSupplier {
    CRUDServiceFileDescriptorSupplier() {}
  }

  private static final class CRUDServiceMethodDescriptorSupplier
      extends CRUDServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CRUDServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CRUDServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CRUDServiceFileDescriptorSupplier())
              .addMethod(getReadUserMethod())
              .addMethod(getCreateUSerMethod())
              .addMethod(getUpdateUSerMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getReadListUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
