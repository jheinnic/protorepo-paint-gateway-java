package name.jchein.portfolio.services.paint.gateway.grpc;

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
 * <pre>
 * Incoming paint task queue.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.1-SNAPSHOT)",
    comments = "Source: proto.proto")
public final class PaintGatewayGrpc {

  private PaintGatewayGrpc() {}

  public static final String SERVICE_NAME = "name.jchein.portfolio.services.paint.gateway.PaintGateway";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask,
      name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask.class,
      responseType = name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask,
      name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived> getCreateMethod() {
    io.grpc.MethodDescriptor<name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask, name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived> getCreateMethod;
    if ((getCreateMethod = PaintGatewayGrpc.getCreateMethod) == null) {
      synchronized (PaintGatewayGrpc.class) {
        if ((getCreateMethod = PaintGatewayGrpc.getCreateMethod) == null) {
          PaintGatewayGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask, name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "name.jchein.portfolio.services.paint.gateway.PaintGateway", "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived.getDefaultInstance()))
                  .setSchemaDescriptor(new PaintGatewayMethodDescriptorSupplier("create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask,
      name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent> getCreateAndMonitorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createAndMonitor",
      requestType = name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask.class,
      responseType = name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask,
      name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent> getCreateAndMonitorMethod() {
    io.grpc.MethodDescriptor<name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask, name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent> getCreateAndMonitorMethod;
    if ((getCreateAndMonitorMethod = PaintGatewayGrpc.getCreateAndMonitorMethod) == null) {
      synchronized (PaintGatewayGrpc.class) {
        if ((getCreateAndMonitorMethod = PaintGatewayGrpc.getCreateAndMonitorMethod) == null) {
          PaintGatewayGrpc.getCreateAndMonitorMethod = getCreateAndMonitorMethod = 
              io.grpc.MethodDescriptor.<name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask, name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "name.jchein.portfolio.services.paint.gateway.PaintGateway", "createAndMonitor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent.getDefaultInstance()))
                  .setSchemaDescriptor(new PaintGatewayMethodDescriptorSupplier("createAndMonitor"))
                  .build();
          }
        }
     }
     return getCreateAndMonitorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<name.jchein.portfolio.services.paint.gateway.grpc.MonitorPaintArtworkTask,
      name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent> getMonitorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "monitor",
      requestType = name.jchein.portfolio.services.paint.gateway.grpc.MonitorPaintArtworkTask.class,
      responseType = name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<name.jchein.portfolio.services.paint.gateway.grpc.MonitorPaintArtworkTask,
      name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent> getMonitorMethod() {
    io.grpc.MethodDescriptor<name.jchein.portfolio.services.paint.gateway.grpc.MonitorPaintArtworkTask, name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent> getMonitorMethod;
    if ((getMonitorMethod = PaintGatewayGrpc.getMonitorMethod) == null) {
      synchronized (PaintGatewayGrpc.class) {
        if ((getMonitorMethod = PaintGatewayGrpc.getMonitorMethod) == null) {
          PaintGatewayGrpc.getMonitorMethod = getMonitorMethod = 
              io.grpc.MethodDescriptor.<name.jchein.portfolio.services.paint.gateway.grpc.MonitorPaintArtworkTask, name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "name.jchein.portfolio.services.paint.gateway.PaintGateway", "monitor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.paint.gateway.grpc.MonitorPaintArtworkTask.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent.getDefaultInstance()))
                  .setSchemaDescriptor(new PaintGatewayMethodDescriptorSupplier("monitor"))
                  .build();
          }
        }
     }
     return getMonitorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask,
      name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived> getAcknowledgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "acknowledge",
      requestType = name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask.class,
      responseType = name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask,
      name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived> getAcknowledgeMethod() {
    io.grpc.MethodDescriptor<name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask, name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived> getAcknowledgeMethod;
    if ((getAcknowledgeMethod = PaintGatewayGrpc.getAcknowledgeMethod) == null) {
      synchronized (PaintGatewayGrpc.class) {
        if ((getAcknowledgeMethod = PaintGatewayGrpc.getAcknowledgeMethod) == null) {
          PaintGatewayGrpc.getAcknowledgeMethod = getAcknowledgeMethod = 
              io.grpc.MethodDescriptor.<name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask, name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "name.jchein.portfolio.services.paint.gateway.PaintGateway", "acknowledge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived.getDefaultInstance()))
                  .setSchemaDescriptor(new PaintGatewayMethodDescriptorSupplier("acknowledge"))
                  .build();
          }
        }
     }
     return getAcknowledgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask,
      name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived> getCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cancel",
      requestType = name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask.class,
      responseType = name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask,
      name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived> getCancelMethod() {
    io.grpc.MethodDescriptor<name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask, name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived> getCancelMethod;
    if ((getCancelMethod = PaintGatewayGrpc.getCancelMethod) == null) {
      synchronized (PaintGatewayGrpc.class) {
        if ((getCancelMethod = PaintGatewayGrpc.getCancelMethod) == null) {
          PaintGatewayGrpc.getCancelMethod = getCancelMethod = 
              io.grpc.MethodDescriptor.<name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask, name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "name.jchein.portfolio.services.paint.gateway.PaintGateway", "cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived.getDefaultInstance()))
                  .setSchemaDescriptor(new PaintGatewayMethodDescriptorSupplier("cancel"))
                  .build();
          }
        }
     }
     return getCancelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaintGatewayStub newStub(io.grpc.Channel channel) {
    return new PaintGatewayStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaintGatewayBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PaintGatewayBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaintGatewayFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PaintGatewayFutureStub(channel);
  }

  /**
   * <pre>
   * Incoming paint task queue.
   * </pre>
   */
  public static abstract class PaintGatewayImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask request,
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void createAndMonitor(name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask request,
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAndMonitorMethod(), responseObserver);
    }

    /**
     */
    public void monitor(name.jchein.portfolio.services.paint.gateway.grpc.MonitorPaintArtworkTask request,
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent> responseObserver) {
      asyncUnimplementedUnaryCall(getMonitorMethod(), responseObserver);
    }

    /**
     */
    public void acknowledge(name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask request,
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived> responseObserver) {
      asyncUnimplementedUnaryCall(getAcknowledgeMethod(), responseObserver);
    }

    /**
     */
    public void cancel(name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask request,
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask,
                name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCreateAndMonitorMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask,
                name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent>(
                  this, METHODID_CREATE_AND_MONITOR)))
          .addMethod(
            getMonitorMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                name.jchein.portfolio.services.paint.gateway.grpc.MonitorPaintArtworkTask,
                name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent>(
                  this, METHODID_MONITOR)))
          .addMethod(
            getAcknowledgeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask,
                name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived>(
                  this, METHODID_ACKNOWLEDGE)))
          .addMethod(
            getCancelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask,
                name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived>(
                  this, METHODID_CANCEL)))
          .build();
    }
  }

  /**
   * <pre>
   * Incoming paint task queue.
   * </pre>
   */
  public static final class PaintGatewayStub extends io.grpc.stub.AbstractStub<PaintGatewayStub> {
    private PaintGatewayStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaintGatewayStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaintGatewayStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaintGatewayStub(channel, callOptions);
    }

    /**
     */
    public void create(name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask request,
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAndMonitor(name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask request,
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCreateAndMonitorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void monitor(name.jchein.portfolio.services.paint.gateway.grpc.MonitorPaintArtworkTask request,
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getMonitorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void acknowledge(name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask request,
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAcknowledgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancel(name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask request,
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Incoming paint task queue.
   * </pre>
   */
  public static final class PaintGatewayBlockingStub extends io.grpc.stub.AbstractStub<PaintGatewayBlockingStub> {
    private PaintGatewayBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaintGatewayBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaintGatewayBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaintGatewayBlockingStub(channel, callOptions);
    }

    /**
     */
    public name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived create(name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent> createAndMonitor(
        name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask request) {
      return blockingServerStreamingCall(
          getChannel(), getCreateAndMonitorMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent> monitor(
        name.jchein.portfolio.services.paint.gateway.grpc.MonitorPaintArtworkTask request) {
      return blockingServerStreamingCall(
          getChannel(), getMonitorMethod(), getCallOptions(), request);
    }

    /**
     */
    public name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived acknowledge(name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask request) {
      return blockingUnaryCall(
          getChannel(), getAcknowledgeMethod(), getCallOptions(), request);
    }

    /**
     */
    public name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived cancel(name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask request) {
      return blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Incoming paint task queue.
   * </pre>
   */
  public static final class PaintGatewayFutureStub extends io.grpc.stub.AbstractStub<PaintGatewayFutureStub> {
    private PaintGatewayFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaintGatewayFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaintGatewayFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaintGatewayFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived> create(
        name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived> acknowledge(
        name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask request) {
      return futureUnaryCall(
          getChannel().newCall(getAcknowledgeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived> cancel(
        name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_CREATE_AND_MONITOR = 1;
  private static final int METHODID_MONITOR = 2;
  private static final int METHODID_ACKNOWLEDGE = 3;
  private static final int METHODID_CANCEL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PaintGatewayImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PaintGatewayImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask) request,
              (io.grpc.stub.StreamObserver<name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived>) responseObserver);
          break;
        case METHODID_CREATE_AND_MONITOR:
          serviceImpl.createAndMonitor((name.jchein.portfolio.services.paint.gateway.grpc.CreatePaintArtworkTask) request,
              (io.grpc.stub.StreamObserver<name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent>) responseObserver);
          break;
        case METHODID_MONITOR:
          serviceImpl.monitor((name.jchein.portfolio.services.paint.gateway.grpc.MonitorPaintArtworkTask) request,
              (io.grpc.stub.StreamObserver<name.jchein.portfolio.services.paint.gateway.grpc.ArtworkTaskProgressEvent>) responseObserver);
          break;
        case METHODID_ACKNOWLEDGE:
          serviceImpl.acknowledge((name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask) request,
              (io.grpc.stub.StreamObserver<name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((name.jchein.portfolio.services.paint.gateway.grpc.CancelPaintArtworkTask) request,
              (io.grpc.stub.StreamObserver<name.jchein.portfolio.services.paint.gateway.grpc.RequestReceived>) responseObserver);
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

  private static abstract class PaintGatewayBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaintGatewayBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return name.jchein.portfolio.services.paint.gateway.grpc.PaintGatewayProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PaintGateway");
    }
  }

  private static final class PaintGatewayFileDescriptorSupplier
      extends PaintGatewayBaseDescriptorSupplier {
    PaintGatewayFileDescriptorSupplier() {}
  }

  private static final class PaintGatewayMethodDescriptorSupplier
      extends PaintGatewayBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PaintGatewayMethodDescriptorSupplier(String methodName) {
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
      synchronized (PaintGatewayGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaintGatewayFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getCreateAndMonitorMethod())
              .addMethod(getMonitorMethod())
              .addMethod(getAcknowledgeMethod())
              .addMethod(getCancelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
