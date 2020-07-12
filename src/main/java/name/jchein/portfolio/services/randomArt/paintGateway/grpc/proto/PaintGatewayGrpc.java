package name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto;

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

  public static final String SERVICE_NAME = "name.jchein.portfolio.random_art.PaintGateway";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask,
      name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> getCreatePaintArtworkTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createPaintArtworkTasks",
      requestType = name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask.class,
      responseType = name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask,
      name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> getCreatePaintArtworkTasksMethod() {
    io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask, name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> getCreatePaintArtworkTasksMethod;
    if ((getCreatePaintArtworkTasksMethod = PaintGatewayGrpc.getCreatePaintArtworkTasksMethod) == null) {
      synchronized (PaintGatewayGrpc.class) {
        if ((getCreatePaintArtworkTasksMethod = PaintGatewayGrpc.getCreatePaintArtworkTasksMethod) == null) {
          PaintGatewayGrpc.getCreatePaintArtworkTasksMethod = getCreatePaintArtworkTasksMethod = 
              io.grpc.MethodDescriptor.<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask, name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "name.jchein.portfolio.random_art.PaintGateway", "createPaintArtworkTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived.getDefaultInstance()))
                  .setSchemaDescriptor(new PaintGatewayMethodDescriptorSupplier("createPaintArtworkTasks"))
                  .build();
          }
        }
     }
     return getCreatePaintArtworkTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask,
      name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> getCreatePaintArtworkTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createPaintArtworkTask",
      requestType = name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask.class,
      responseType = name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask,
      name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> getCreatePaintArtworkTaskMethod() {
    io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask, name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> getCreatePaintArtworkTaskMethod;
    if ((getCreatePaintArtworkTaskMethod = PaintGatewayGrpc.getCreatePaintArtworkTaskMethod) == null) {
      synchronized (PaintGatewayGrpc.class) {
        if ((getCreatePaintArtworkTaskMethod = PaintGatewayGrpc.getCreatePaintArtworkTaskMethod) == null) {
          PaintGatewayGrpc.getCreatePaintArtworkTaskMethod = getCreatePaintArtworkTaskMethod = 
              io.grpc.MethodDescriptor.<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask, name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "name.jchein.portfolio.random_art.PaintGateway", "createPaintArtworkTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived.getDefaultInstance()))
                  .setSchemaDescriptor(new PaintGatewayMethodDescriptorSupplier("createPaintArtworkTask"))
                  .build();
          }
        }
     }
     return getCreatePaintArtworkTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask,
      name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> getCancelPaintArtworkTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cancelPaintArtworkTasks",
      requestType = name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask.class,
      responseType = name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask,
      name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> getCancelPaintArtworkTasksMethod() {
    io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask, name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> getCancelPaintArtworkTasksMethod;
    if ((getCancelPaintArtworkTasksMethod = PaintGatewayGrpc.getCancelPaintArtworkTasksMethod) == null) {
      synchronized (PaintGatewayGrpc.class) {
        if ((getCancelPaintArtworkTasksMethod = PaintGatewayGrpc.getCancelPaintArtworkTasksMethod) == null) {
          PaintGatewayGrpc.getCancelPaintArtworkTasksMethod = getCancelPaintArtworkTasksMethod = 
              io.grpc.MethodDescriptor.<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask, name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "name.jchein.portfolio.random_art.PaintGateway", "cancelPaintArtworkTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived.getDefaultInstance()))
                  .setSchemaDescriptor(new PaintGatewayMethodDescriptorSupplier("cancelPaintArtworkTasks"))
                  .build();
          }
        }
     }
     return getCancelPaintArtworkTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask,
      name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> getCancelPaintArtworkTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cancelPaintArtworkTask",
      requestType = name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask.class,
      responseType = name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask,
      name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> getCancelPaintArtworkTaskMethod() {
    io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask, name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> getCancelPaintArtworkTaskMethod;
    if ((getCancelPaintArtworkTaskMethod = PaintGatewayGrpc.getCancelPaintArtworkTaskMethod) == null) {
      synchronized (PaintGatewayGrpc.class) {
        if ((getCancelPaintArtworkTaskMethod = PaintGatewayGrpc.getCancelPaintArtworkTaskMethod) == null) {
          PaintGatewayGrpc.getCancelPaintArtworkTaskMethod = getCancelPaintArtworkTaskMethod = 
              io.grpc.MethodDescriptor.<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask, name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "name.jchein.portfolio.random_art.PaintGateway", "cancelPaintArtworkTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived.getDefaultInstance()))
                  .setSchemaDescriptor(new PaintGatewayMethodDescriptorSupplier("cancelPaintArtworkTask"))
                  .build();
          }
        }
     }
     return getCancelPaintArtworkTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.UpdatePaintArtworkTask,
      name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> getReportTaskStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reportTaskState",
      requestType = name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.UpdatePaintArtworkTask.class,
      responseType = name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.UpdatePaintArtworkTask,
      name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> getReportTaskStateMethod() {
    io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.UpdatePaintArtworkTask, name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> getReportTaskStateMethod;
    if ((getReportTaskStateMethod = PaintGatewayGrpc.getReportTaskStateMethod) == null) {
      synchronized (PaintGatewayGrpc.class) {
        if ((getReportTaskStateMethod = PaintGatewayGrpc.getReportTaskStateMethod) == null) {
          PaintGatewayGrpc.getReportTaskStateMethod = getReportTaskStateMethod = 
              io.grpc.MethodDescriptor.<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.UpdatePaintArtworkTask, name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "name.jchein.portfolio.random_art.PaintGateway", "reportTaskState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.UpdatePaintArtworkTask.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived.getDefaultInstance()))
                  .setSchemaDescriptor(new PaintGatewayMethodDescriptorSupplier("reportTaskState"))
                  .build();
          }
        }
     }
     return getReportTaskStateMethod;
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
    public io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask> createPaintArtworkTasks(
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> responseObserver) {
      return asyncUnimplementedStreamingCall(getCreatePaintArtworkTasksMethod(), responseObserver);
    }

    /**
     */
    public void createPaintArtworkTask(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask request,
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePaintArtworkTaskMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask> cancelPaintArtworkTasks(
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> responseObserver) {
      return asyncUnimplementedStreamingCall(getCancelPaintArtworkTasksMethod(), responseObserver);
    }

    /**
     */
    public void cancelPaintArtworkTask(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask request,
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelPaintArtworkTaskMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.UpdatePaintArtworkTask> reportTaskState(
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> responseObserver) {
      return asyncUnimplementedStreamingCall(getReportTaskStateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePaintArtworkTasksMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask,
                name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>(
                  this, METHODID_CREATE_PAINT_ARTWORK_TASKS)))
          .addMethod(
            getCreatePaintArtworkTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask,
                name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>(
                  this, METHODID_CREATE_PAINT_ARTWORK_TASK)))
          .addMethod(
            getCancelPaintArtworkTasksMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask,
                name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>(
                  this, METHODID_CANCEL_PAINT_ARTWORK_TASKS)))
          .addMethod(
            getCancelPaintArtworkTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask,
                name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>(
                  this, METHODID_CANCEL_PAINT_ARTWORK_TASK)))
          .addMethod(
            getReportTaskStateMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.UpdatePaintArtworkTask,
                name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>(
                  this, METHODID_REPORT_TASK_STATE)))
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
    public io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask> createPaintArtworkTasks(
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCreatePaintArtworkTasksMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void createPaintArtworkTask(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask request,
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePaintArtworkTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask> cancelPaintArtworkTasks(
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCancelPaintArtworkTasksMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void cancelPaintArtworkTask(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask request,
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelPaintArtworkTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.UpdatePaintArtworkTask> reportTaskState(
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getReportTaskStateMethod(), getCallOptions()), responseObserver);
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
    public name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived createPaintArtworkTask(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask request) {
      return blockingUnaryCall(
          getChannel(), getCreatePaintArtworkTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived cancelPaintArtworkTask(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask request) {
      return blockingUnaryCall(
          getChannel(), getCancelPaintArtworkTaskMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> createPaintArtworkTask(
        name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePaintArtworkTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> cancelPaintArtworkTask(
        name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelPaintArtworkTaskMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PAINT_ARTWORK_TASK = 0;
  private static final int METHODID_CANCEL_PAINT_ARTWORK_TASK = 1;
  private static final int METHODID_CREATE_PAINT_ARTWORK_TASKS = 2;
  private static final int METHODID_CANCEL_PAINT_ARTWORK_TASKS = 3;
  private static final int METHODID_REPORT_TASK_STATE = 4;

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
        case METHODID_CREATE_PAINT_ARTWORK_TASK:
          serviceImpl.createPaintArtworkTask((name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask) request,
              (io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>) responseObserver);
          break;
        case METHODID_CANCEL_PAINT_ARTWORK_TASK:
          serviceImpl.cancelPaintArtworkTask((name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask) request,
              (io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>) responseObserver);
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
        case METHODID_CREATE_PAINT_ARTWORK_TASKS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createPaintArtworkTasks(
              (io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>) responseObserver);
        case METHODID_CANCEL_PAINT_ARTWORK_TASKS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.cancelPaintArtworkTasks(
              (io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>) responseObserver);
        case METHODID_REPORT_TASK_STATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.reportTaskState(
              (io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>) responseObserver);
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
      return name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.ExampleProto.getDescriptor();
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
              .addMethod(getCreatePaintArtworkTasksMethod())
              .addMethod(getCreatePaintArtworkTaskMethod())
              .addMethod(getCancelPaintArtworkTasksMethod())
              .addMethod(getCancelPaintArtworkTaskMethod())
              .addMethod(getReportTaskStateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
