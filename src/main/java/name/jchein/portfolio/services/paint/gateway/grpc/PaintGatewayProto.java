// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto.proto

package name.jchein.portfolio.services.paint.gateway.grpc;

public final class PaintGatewayProto {
  private PaintGatewayProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_name_jchein_portfolio_services_paint_gateway_CreatePaintArtworkTask_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_name_jchein_portfolio_services_paint_gateway_CreatePaintArtworkTask_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_name_jchein_portfolio_services_paint_gateway_MonitorPaintArtworkTask_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_name_jchein_portfolio_services_paint_gateway_MonitorPaintArtworkTask_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_name_jchein_portfolio_services_paint_gateway_CancelPaintArtworkTask_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_name_jchein_portfolio_services_paint_gateway_CancelPaintArtworkTask_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_name_jchein_portfolio_services_paint_gateway_AcknowledgePaintArtworkTask_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_name_jchein_portfolio_services_paint_gateway_AcknowledgePaintArtworkTask_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_name_jchein_portfolio_services_paint_gateway_RequestReceived_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_name_jchein_portfolio_services_paint_gateway_RequestReceived_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_name_jchein_portfolio_services_paint_gateway_ArtworkTaskProgressEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_name_jchein_portfolio_services_paint_gateway_ArtworkTaskProgressEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013proto.proto\022,name.jchein.portfolio.ser" +
      "vices.paint.gateway\"\220\001\n\026CreatePaintArtwo" +
      "rkTask\022\022\n\nseedPrefix\030\007 \001(\t\022\022\n\nseedSuffix" +
      "\030\010 \001(\t\022\020\n\010newModel\030\t \001(\010\022\024\n\014renderPolicy" +
      "\030\n \001(\t\022\025\n\rstoragePolicy\030\013 \001(\t\022\017\n\007autoAck" +
      "\030\014 \001(\010\"6\n\027MonitorPaintArtworkTask\022\n\n\002id\030" +
      "\001 \001(\t\022\017\n\007autoAck\030\014 \001(\010\"5\n\026CancelPaintArt" +
      "workTask\022\n\n\002id\030\001 \001(\t\022\017\n\007autoAck\030\014 \001(\010\")\n" +
      "\033AcknowledgePaintArtworkTask\022\n\n\002id\030\001 \001(\t" +
      "\"\035\n\017RequestReceived\022\n\n\002id\030\001 \001(\t\"\237\001\n\030Artw" +
      "orkTaskProgressEvent\022\n\n\002id\030\001 \001(\t\022N\n\ttask" +
      "State\030\003 \001(\0162;.name.jchein.portfolio.serv" +
      "ices.paint.gateway.TaskStateType\022\026\n\016perc" +
      "entPainted\030\004 \001(\r\022\017\n\007message\030\005 \001(\t*\234\001\n\rTa" +
      "skStateType\022\022\n\016IN_PAINT_QUEUE\020\000\022\023\n\017IN_UP" +
      "LOAD_QUEUE\020\001\022\022\n\016PAINT_PROGRESS\020\002\022\r\n\tUPLO" +
      "ADING\020\003\022\t\n\005ERROR\020\006\022\014\n\010FINISHED\020\007\022\r\n\tCANC" +
      "ELLED\020\010\022\013\n\007DROPPED\020\t\022\n\n\006CLOSED\020\n2\215\006\n\014Pai" +
      "ntGateway\022\217\001\n\006create\022D.name.jchein.portf" +
      "olio.services.paint.gateway.CreatePaintA" +
      "rtworkTask\032=.name.jchein.portfolio.servi" +
      "ces.paint.gateway.RequestReceived\"\000\022\244\001\n\020" +
      "createAndMonitor\022D.name.jchein.portfolio" +
      ".services.paint.gateway.CreatePaintArtwo" +
      "rkTask\032F.name.jchein.portfolio.services." +
      "paint.gateway.ArtworkTaskProgressEvent\"\000" +
      "0\001\022\232\001\n\007monitor\022E.name.jchein.portfolio.s" +
      "ervices.paint.gateway.MonitorPaintArtwor" +
      "kTask\032F.name.jchein.portfolio.services.p" +
      "aint.gateway.ArtworkTaskProgressEvent0\001\022" +
      "\224\001\n\013acknowledge\022D.name.jchein.portfolio." +
      "services.paint.gateway.CancelPaintArtwor" +
      "kTask\032=.name.jchein.portfolio.services.p" +
      "aint.gateway.RequestReceived\"\000\022\217\001\n\006cance" +
      "l\022D.name.jchein.portfolio.services.paint" +
      ".gateway.CancelPaintArtworkTask\032=.name.j" +
      "chein.portfolio.services.paint.gateway.R" +
      "equestReceived\"\000BH\n1name.jchein.portfoli" +
      "o.services.paint.gateway.grpcB\021PaintGate" +
      "wayProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_name_jchein_portfolio_services_paint_gateway_CreatePaintArtworkTask_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_name_jchein_portfolio_services_paint_gateway_CreatePaintArtworkTask_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_name_jchein_portfolio_services_paint_gateway_CreatePaintArtworkTask_descriptor,
        new java.lang.String[] { "SeedPrefix", "SeedSuffix", "NewModel", "RenderPolicy", "StoragePolicy", "AutoAck", });
    internal_static_name_jchein_portfolio_services_paint_gateway_MonitorPaintArtworkTask_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_name_jchein_portfolio_services_paint_gateway_MonitorPaintArtworkTask_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_name_jchein_portfolio_services_paint_gateway_MonitorPaintArtworkTask_descriptor,
        new java.lang.String[] { "Id", "AutoAck", });
    internal_static_name_jchein_portfolio_services_paint_gateway_CancelPaintArtworkTask_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_name_jchein_portfolio_services_paint_gateway_CancelPaintArtworkTask_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_name_jchein_portfolio_services_paint_gateway_CancelPaintArtworkTask_descriptor,
        new java.lang.String[] { "Id", "AutoAck", });
    internal_static_name_jchein_portfolio_services_paint_gateway_AcknowledgePaintArtworkTask_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_name_jchein_portfolio_services_paint_gateway_AcknowledgePaintArtworkTask_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_name_jchein_portfolio_services_paint_gateway_AcknowledgePaintArtworkTask_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_name_jchein_portfolio_services_paint_gateway_RequestReceived_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_name_jchein_portfolio_services_paint_gateway_RequestReceived_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_name_jchein_portfolio_services_paint_gateway_RequestReceived_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_name_jchein_portfolio_services_paint_gateway_ArtworkTaskProgressEvent_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_name_jchein_portfolio_services_paint_gateway_ArtworkTaskProgressEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_name_jchein_portfolio_services_paint_gateway_ArtworkTaskProgressEvent_descriptor,
        new java.lang.String[] { "Id", "TaskState", "PercentPainted", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
