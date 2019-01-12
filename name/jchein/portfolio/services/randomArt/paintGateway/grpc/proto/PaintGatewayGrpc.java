package name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class PaintGatewayGrpc {

  private PaintGatewayGrpc() {}

  public static final String SERVICE_NAME = "name.jchein.portfolio.random_art.PaintGateway";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask,
      name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> METHOD_CREATE_PAINT_ARTWORK_TASKS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "name.jchein.portfolio.random_art.PaintGateway", "createPaintArtworkTasks"),
          io.grpc.protobuf.ProtoUtils.marshaller(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask,
      name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> METHOD_CREATE_PAINT_ARTWORK_TASK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "name.jchein.portfolio.random_art.PaintGateway", "createPaintArtworkTask"),
          io.grpc.protobuf.ProtoUtils.marshaller(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask,
      name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> METHOD_CANCEL_PAINT_ARTWORK_TASK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "name.jchein.portfolio.random_art.PaintGateway", "cancelPaintArtworkTask"),
          io.grpc.protobuf.ProtoUtils.marshaller(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.UpdatePaintArtworkTask,
      name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> METHOD_REPORT_TASK_STATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "name.jchein.portfolio.random_art.PaintGateway", "reportTaskState"),
          io.grpc.protobuf.ProtoUtils.marshaller(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.UpdatePaintArtworkTask.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived.getDefaultInstance()));

  public static PaintGatewayStub newStub(io.grpc.Channel channel) {
    return new PaintGatewayStub(channel);
  }

  public static PaintGatewayBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PaintGatewayBlockingStub(channel);
  }

  public static PaintGatewayFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PaintGatewayFutureStub(channel);
  }

  public static interface PaintGateway {

    public io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask> createPaintArtworkTasks(
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> responseObserver);

    public void createPaintArtworkTask(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask request,
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> responseObserver);

    public void cancelPaintArtworkTask(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask request,
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> responseObserver);

    public io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.UpdatePaintArtworkTask> reportTaskState(
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> responseObserver);
  }

  public static interface PaintGatewayBlockingClient {

    public java.util.Iterator<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> createPaintArtworkTask(
        name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask request);

    public java.util.Iterator<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> cancelPaintArtworkTask(
        name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask request);
  }

  public static interface PaintGatewayFutureClient {
  }

  public static class PaintGatewayStub extends io.grpc.stub.AbstractStub<PaintGatewayStub>
      implements PaintGateway {
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

    @java.lang.Override
    public io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask> createPaintArtworkTasks(
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_CREATE_PAINT_ARTWORK_TASKS, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public void createPaintArtworkTask(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask request,
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_CREATE_PAINT_ARTWORK_TASK, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void cancelPaintArtworkTask(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask request,
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_CANCEL_PAINT_ARTWORK_TASK, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.UpdatePaintArtworkTask> reportTaskState(
        io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_REPORT_TASK_STATE, getCallOptions()), responseObserver);
    }
  }

  public static class PaintGatewayBlockingStub extends io.grpc.stub.AbstractStub<PaintGatewayBlockingStub>
      implements PaintGatewayBlockingClient {
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

    @java.lang.Override
    public java.util.Iterator<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> createPaintArtworkTask(
        name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_CREATE_PAINT_ARTWORK_TASK, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived> cancelPaintArtworkTask(
        name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_CANCEL_PAINT_ARTWORK_TASK, getCallOptions(), request);
    }
  }

  public static class PaintGatewayFutureStub extends io.grpc.stub.AbstractStub<PaintGatewayFutureStub>
      implements PaintGatewayFutureClient {
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
  }

  private static final int METHODID_CREATE_PAINT_ARTWORK_TASK = 0;
  private static final int METHODID_CANCEL_PAINT_ARTWORK_TASK = 1;
  private static final int METHODID_CREATE_PAINT_ARTWORK_TASKS = 2;
  private static final int METHODID_REPORT_TASK_STATE = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PaintGateway serviceImpl;
    private final int methodId;

    public MethodHandlers(PaintGateway serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

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

    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PAINT_ARTWORK_TASKS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createPaintArtworkTasks(
              (io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>) responseObserver);
        case METHODID_REPORT_TASK_STATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.reportTaskState(
              (io.grpc.stub.StreamObserver<name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final PaintGateway serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_CREATE_PAINT_ARTWORK_TASKS,
          asyncBidiStreamingCall(
            new MethodHandlers<
              name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask,
              name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>(
                serviceImpl, METHODID_CREATE_PAINT_ARTWORK_TASKS)))
        .addMethod(
          METHOD_CREATE_PAINT_ARTWORK_TASK,
          asyncServerStreamingCall(
            new MethodHandlers<
              name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask,
              name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>(
                serviceImpl, METHODID_CREATE_PAINT_ARTWORK_TASK)))
        .addMethod(
          METHOD_CANCEL_PAINT_ARTWORK_TASK,
          asyncServerStreamingCall(
            new MethodHandlers<
              name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CancelPaintArtworkTask,
              name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>(
                serviceImpl, METHODID_CANCEL_PAINT_ARTWORK_TASK)))
        .addMethod(
          METHOD_REPORT_TASK_STATE,
          asyncBidiStreamingCall(
            new MethodHandlers<
              name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.UpdatePaintArtworkTask,
              name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CommandReceived>(
                serviceImpl, METHODID_REPORT_TASK_STATE)))
        .build();
  }
}
