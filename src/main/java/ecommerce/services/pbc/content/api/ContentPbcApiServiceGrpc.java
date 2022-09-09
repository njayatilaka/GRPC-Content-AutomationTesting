package ecommerce.services.pbc.content.api;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: contents-pbc.proto")
public final class ContentPbcApiServiceGrpc {

  private ContentPbcApiServiceGrpc() {}

  public static final String SERVICE_NAME = "ecommerce.services.pbc.content.api.ContentPbcApiService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryRequest,
      ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryResponse> getGetContentByQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContentByQuery",
      requestType = ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryRequest.class,
      responseType = ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryRequest,
      ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryResponse> getGetContentByQueryMethod() {
    io.grpc.MethodDescriptor<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryRequest, ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryResponse> getGetContentByQueryMethod;
    if ((getGetContentByQueryMethod = ContentPbcApiServiceGrpc.getGetContentByQueryMethod) == null) {
      synchronized (ContentPbcApiServiceGrpc.class) {
        if ((getGetContentByQueryMethod = ContentPbcApiServiceGrpc.getGetContentByQueryMethod) == null) {
          ContentPbcApiServiceGrpc.getGetContentByQueryMethod = getGetContentByQueryMethod = 
              io.grpc.MethodDescriptor.<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryRequest, ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ecommerce.services.pbc.content.api.ContentPbcApiService", "GetContentByQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ContentPbcApiServiceMethodDescriptorSupplier("GetContentByQuery"))
                  .build();
          }
        }
     }
     return getGetContentByQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentRequest,
      ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentResponse> getGetContentByFragmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContentByFragment",
      requestType = ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentRequest.class,
      responseType = ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentRequest,
      ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentResponse> getGetContentByFragmentMethod() {
    io.grpc.MethodDescriptor<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentRequest, ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentResponse> getGetContentByFragmentMethod;
    if ((getGetContentByFragmentMethod = ContentPbcApiServiceGrpc.getGetContentByFragmentMethod) == null) {
      synchronized (ContentPbcApiServiceGrpc.class) {
        if ((getGetContentByFragmentMethod = ContentPbcApiServiceGrpc.getGetContentByFragmentMethod) == null) {
          ContentPbcApiServiceGrpc.getGetContentByFragmentMethod = getGetContentByFragmentMethod = 
              io.grpc.MethodDescriptor.<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentRequest, ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ecommerce.services.pbc.content.api.ContentPbcApiService", "GetContentByFragment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ContentPbcApiServiceMethodDescriptorSupplier("GetContentByFragment"))
                  .build();
          }
        }
     }
     return getGetContentByFragmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdRequest,
      ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdResponse> getGetContentByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContentById",
      requestType = ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdRequest.class,
      responseType = ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdRequest,
      ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdResponse> getGetContentByIdMethod() {
    io.grpc.MethodDescriptor<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdRequest, ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdResponse> getGetContentByIdMethod;
    if ((getGetContentByIdMethod = ContentPbcApiServiceGrpc.getGetContentByIdMethod) == null) {
      synchronized (ContentPbcApiServiceGrpc.class) {
        if ((getGetContentByIdMethod = ContentPbcApiServiceGrpc.getGetContentByIdMethod) == null) {
          ContentPbcApiServiceGrpc.getGetContentByIdMethod = getGetContentByIdMethod = 
              io.grpc.MethodDescriptor.<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdRequest, ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ecommerce.services.pbc.content.api.ContentPbcApiService", "GetContentById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ContentPbcApiServiceMethodDescriptorSupplier("GetContentById"))
                  .build();
          }
        }
     }
     return getGetContentByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContentPbcApiServiceStub newStub(io.grpc.Channel channel) {
    return new ContentPbcApiServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContentPbcApiServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ContentPbcApiServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContentPbcApiServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ContentPbcApiServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ContentPbcApiServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getContentByQuery(ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryRequest request,
        io.grpc.stub.StreamObserver<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContentByQueryMethod(), responseObserver);
    }

    /**
     */
    public void getContentByFragment(ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentRequest request,
        io.grpc.stub.StreamObserver<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContentByFragmentMethod(), responseObserver);
    }

    /**
     */
    public void getContentById(ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdRequest request,
        io.grpc.stub.StreamObserver<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContentByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetContentByQueryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryRequest,
                ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryResponse>(
                  this, METHODID_GET_CONTENT_BY_QUERY)))
          .addMethod(
            getGetContentByFragmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentRequest,
                ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentResponse>(
                  this, METHODID_GET_CONTENT_BY_FRAGMENT)))
          .addMethod(
            getGetContentByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdRequest,
                ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdResponse>(
                  this, METHODID_GET_CONTENT_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ContentPbcApiServiceStub extends io.grpc.stub.AbstractStub<ContentPbcApiServiceStub> {
    private ContentPbcApiServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContentPbcApiServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContentPbcApiServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContentPbcApiServiceStub(channel, callOptions);
    }

    /**
     */
    public void getContentByQuery(ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryRequest request,
        io.grpc.stub.StreamObserver<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContentByQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getContentByFragment(ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentRequest request,
        io.grpc.stub.StreamObserver<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContentByFragmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getContentById(ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdRequest request,
        io.grpc.stub.StreamObserver<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContentByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ContentPbcApiServiceBlockingStub extends io.grpc.stub.AbstractStub<ContentPbcApiServiceBlockingStub> {
    private ContentPbcApiServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContentPbcApiServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContentPbcApiServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContentPbcApiServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryResponse getContentByQuery(ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetContentByQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentResponse getContentByFragment(ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetContentByFragmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdResponse getContentById(ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetContentByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ContentPbcApiServiceFutureStub extends io.grpc.stub.AbstractStub<ContentPbcApiServiceFutureStub> {
    private ContentPbcApiServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContentPbcApiServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContentPbcApiServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContentPbcApiServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryResponse> getContentByQuery(
        ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContentByQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentResponse> getContentByFragment(
        ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContentByFragmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdResponse> getContentById(
        ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContentByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CONTENT_BY_QUERY = 0;
  private static final int METHODID_GET_CONTENT_BY_FRAGMENT = 1;
  private static final int METHODID_GET_CONTENT_BY_ID = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ContentPbcApiServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ContentPbcApiServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CONTENT_BY_QUERY:
          serviceImpl.getContentByQuery((ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByQueryResponse>) responseObserver);
          break;
        case METHODID_GET_CONTENT_BY_FRAGMENT:
          serviceImpl.getContentByFragment((ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByFragmentResponse>) responseObserver);
          break;
        case METHODID_GET_CONTENT_BY_ID:
          serviceImpl.getContentById((ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.services.pbc.content.api.ContentsPbc.GetContentByIdResponse>) responseObserver);
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

  private static abstract class ContentPbcApiServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContentPbcApiServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ecommerce.services.pbc.content.api.ContentsPbc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContentPbcApiService");
    }
  }

  private static final class ContentPbcApiServiceFileDescriptorSupplier
      extends ContentPbcApiServiceBaseDescriptorSupplier {
    ContentPbcApiServiceFileDescriptorSupplier() {}
  }

  private static final class ContentPbcApiServiceMethodDescriptorSupplier
      extends ContentPbcApiServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ContentPbcApiServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ContentPbcApiServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContentPbcApiServiceFileDescriptorSupplier())
              .addMethod(getGetContentByQueryMethod())
              .addMethod(getGetContentByFragmentMethod())
              .addMethod(getGetContentByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
