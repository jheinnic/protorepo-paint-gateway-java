// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto.proto

package name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto;

/**
 * <pre>
 * Request messages contain command properties.
 * </pre>
 *
 * Protobuf type {@code name.jchein.portfolio.random_art.CreatePaintArtworkTask}
 */
public  final class CreatePaintArtworkTask extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:name.jchein.portfolio.random_art.CreatePaintArtworkTask)
    CreatePaintArtworkTaskOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreatePaintArtworkTask.newBuilder() to construct.
  private CreatePaintArtworkTask(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreatePaintArtworkTask() {
    id_ = "";
    seedPrefix_ = "";
    seedSuffix_ = "";
    newModel_ = false;
    renderPolicy_ = "";
    stagingPolicy_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreatePaintArtworkTask(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            seedPrefix_ = s;
            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            seedSuffix_ = s;
            break;
          }
          case 72: {

            newModel_ = input.readBool();
            break;
          }
          case 82: {
            java.lang.String s = input.readStringRequireUtf8();

            renderPolicy_ = s;
            break;
          }
          case 90: {
            java.lang.String s = input.readStringRequireUtf8();

            stagingPolicy_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.ExampleProto.internal_static_name_jchein_portfolio_random_art_CreatePaintArtworkTask_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.ExampleProto.internal_static_name_jchein_portfolio_random_art_CreatePaintArtworkTask_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask.class, name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEEDPREFIX_FIELD_NUMBER = 7;
  private volatile java.lang.Object seedPrefix_;
  /**
   * <code>string seedPrefix = 7;</code>
   */
  public java.lang.String getSeedPrefix() {
    java.lang.Object ref = seedPrefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      seedPrefix_ = s;
      return s;
    }
  }
  /**
   * <code>string seedPrefix = 7;</code>
   */
  public com.google.protobuf.ByteString
      getSeedPrefixBytes() {
    java.lang.Object ref = seedPrefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      seedPrefix_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEEDSUFFIX_FIELD_NUMBER = 8;
  private volatile java.lang.Object seedSuffix_;
  /**
   * <code>string seedSuffix = 8;</code>
   */
  public java.lang.String getSeedSuffix() {
    java.lang.Object ref = seedSuffix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      seedSuffix_ = s;
      return s;
    }
  }
  /**
   * <code>string seedSuffix = 8;</code>
   */
  public com.google.protobuf.ByteString
      getSeedSuffixBytes() {
    java.lang.Object ref = seedSuffix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      seedSuffix_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEWMODEL_FIELD_NUMBER = 9;
  private boolean newModel_;
  /**
   * <code>bool newModel = 9;</code>
   */
  public boolean getNewModel() {
    return newModel_;
  }

  public static final int RENDERPOLICY_FIELD_NUMBER = 10;
  private volatile java.lang.Object renderPolicy_;
  /**
   * <code>string renderPolicy = 10;</code>
   */
  public java.lang.String getRenderPolicy() {
    java.lang.Object ref = renderPolicy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      renderPolicy_ = s;
      return s;
    }
  }
  /**
   * <code>string renderPolicy = 10;</code>
   */
  public com.google.protobuf.ByteString
      getRenderPolicyBytes() {
    java.lang.Object ref = renderPolicy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      renderPolicy_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STAGINGPOLICY_FIELD_NUMBER = 11;
  private volatile java.lang.Object stagingPolicy_;
  /**
   * <code>string stagingPolicy = 11;</code>
   */
  public java.lang.String getStagingPolicy() {
    java.lang.Object ref = stagingPolicy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stagingPolicy_ = s;
      return s;
    }
  }
  /**
   * <code>string stagingPolicy = 11;</code>
   */
  public com.google.protobuf.ByteString
      getStagingPolicyBytes() {
    java.lang.Object ref = stagingPolicy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stagingPolicy_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!getSeedPrefixBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, seedPrefix_);
    }
    if (!getSeedSuffixBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, seedSuffix_);
    }
    if (newModel_ != false) {
      output.writeBool(9, newModel_);
    }
    if (!getRenderPolicyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 10, renderPolicy_);
    }
    if (!getStagingPolicyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 11, stagingPolicy_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!getSeedPrefixBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, seedPrefix_);
    }
    if (!getSeedSuffixBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, seedSuffix_);
    }
    if (newModel_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, newModel_);
    }
    if (!getRenderPolicyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, renderPolicy_);
    }
    if (!getStagingPolicyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, stagingPolicy_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask)) {
      return super.equals(obj);
    }
    name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask other = (name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask) obj;

    boolean result = true;
    result = result && getId()
        .equals(other.getId());
    result = result && getSeedPrefix()
        .equals(other.getSeedPrefix());
    result = result && getSeedSuffix()
        .equals(other.getSeedSuffix());
    result = result && (getNewModel()
        == other.getNewModel());
    result = result && getRenderPolicy()
        .equals(other.getRenderPolicy());
    result = result && getStagingPolicy()
        .equals(other.getStagingPolicy());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + SEEDPREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getSeedPrefix().hashCode();
    hash = (37 * hash) + SEEDSUFFIX_FIELD_NUMBER;
    hash = (53 * hash) + getSeedSuffix().hashCode();
    hash = (37 * hash) + NEWMODEL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNewModel());
    hash = (37 * hash) + RENDERPOLICY_FIELD_NUMBER;
    hash = (53 * hash) + getRenderPolicy().hashCode();
    hash = (37 * hash) + STAGINGPOLICY_FIELD_NUMBER;
    hash = (53 * hash) + getStagingPolicy().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request messages contain command properties.
   * </pre>
   *
   * Protobuf type {@code name.jchein.portfolio.random_art.CreatePaintArtworkTask}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:name.jchein.portfolio.random_art.CreatePaintArtworkTask)
      name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTaskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.ExampleProto.internal_static_name_jchein_portfolio_random_art_CreatePaintArtworkTask_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.ExampleProto.internal_static_name_jchein_portfolio_random_art_CreatePaintArtworkTask_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask.class, name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask.Builder.class);
    }

    // Construct using name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      seedPrefix_ = "";

      seedSuffix_ = "";

      newModel_ = false;

      renderPolicy_ = "";

      stagingPolicy_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.ExampleProto.internal_static_name_jchein_portfolio_random_art_CreatePaintArtworkTask_descriptor;
    }

    @java.lang.Override
    public name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask getDefaultInstanceForType() {
      return name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask.getDefaultInstance();
    }

    @java.lang.Override
    public name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask build() {
      name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask buildPartial() {
      name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask result = new name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask(this);
      result.id_ = id_;
      result.seedPrefix_ = seedPrefix_;
      result.seedSuffix_ = seedSuffix_;
      result.newModel_ = newModel_;
      result.renderPolicy_ = renderPolicy_;
      result.stagingPolicy_ = stagingPolicy_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask) {
        return mergeFrom((name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask other) {
      if (other == name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getSeedPrefix().isEmpty()) {
        seedPrefix_ = other.seedPrefix_;
        onChanged();
      }
      if (!other.getSeedSuffix().isEmpty()) {
        seedSuffix_ = other.seedSuffix_;
        onChanged();
      }
      if (other.getNewModel() != false) {
        setNewModel(other.getNewModel());
      }
      if (!other.getRenderPolicy().isEmpty()) {
        renderPolicy_ = other.renderPolicy_;
        onChanged();
      }
      if (!other.getStagingPolicy().isEmpty()) {
        stagingPolicy_ = other.stagingPolicy_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object seedPrefix_ = "";
    /**
     * <code>string seedPrefix = 7;</code>
     */
    public java.lang.String getSeedPrefix() {
      java.lang.Object ref = seedPrefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        seedPrefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string seedPrefix = 7;</code>
     */
    public com.google.protobuf.ByteString
        getSeedPrefixBytes() {
      java.lang.Object ref = seedPrefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        seedPrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string seedPrefix = 7;</code>
     */
    public Builder setSeedPrefix(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      seedPrefix_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string seedPrefix = 7;</code>
     */
    public Builder clearSeedPrefix() {
      
      seedPrefix_ = getDefaultInstance().getSeedPrefix();
      onChanged();
      return this;
    }
    /**
     * <code>string seedPrefix = 7;</code>
     */
    public Builder setSeedPrefixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      seedPrefix_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object seedSuffix_ = "";
    /**
     * <code>string seedSuffix = 8;</code>
     */
    public java.lang.String getSeedSuffix() {
      java.lang.Object ref = seedSuffix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        seedSuffix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string seedSuffix = 8;</code>
     */
    public com.google.protobuf.ByteString
        getSeedSuffixBytes() {
      java.lang.Object ref = seedSuffix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        seedSuffix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string seedSuffix = 8;</code>
     */
    public Builder setSeedSuffix(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      seedSuffix_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string seedSuffix = 8;</code>
     */
    public Builder clearSeedSuffix() {
      
      seedSuffix_ = getDefaultInstance().getSeedSuffix();
      onChanged();
      return this;
    }
    /**
     * <code>string seedSuffix = 8;</code>
     */
    public Builder setSeedSuffixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      seedSuffix_ = value;
      onChanged();
      return this;
    }

    private boolean newModel_ ;
    /**
     * <code>bool newModel = 9;</code>
     */
    public boolean getNewModel() {
      return newModel_;
    }
    /**
     * <code>bool newModel = 9;</code>
     */
    public Builder setNewModel(boolean value) {
      
      newModel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool newModel = 9;</code>
     */
    public Builder clearNewModel() {
      
      newModel_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object renderPolicy_ = "";
    /**
     * <code>string renderPolicy = 10;</code>
     */
    public java.lang.String getRenderPolicy() {
      java.lang.Object ref = renderPolicy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        renderPolicy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string renderPolicy = 10;</code>
     */
    public com.google.protobuf.ByteString
        getRenderPolicyBytes() {
      java.lang.Object ref = renderPolicy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        renderPolicy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string renderPolicy = 10;</code>
     */
    public Builder setRenderPolicy(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      renderPolicy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string renderPolicy = 10;</code>
     */
    public Builder clearRenderPolicy() {
      
      renderPolicy_ = getDefaultInstance().getRenderPolicy();
      onChanged();
      return this;
    }
    /**
     * <code>string renderPolicy = 10;</code>
     */
    public Builder setRenderPolicyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      renderPolicy_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object stagingPolicy_ = "";
    /**
     * <code>string stagingPolicy = 11;</code>
     */
    public java.lang.String getStagingPolicy() {
      java.lang.Object ref = stagingPolicy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stagingPolicy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string stagingPolicy = 11;</code>
     */
    public com.google.protobuf.ByteString
        getStagingPolicyBytes() {
      java.lang.Object ref = stagingPolicy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stagingPolicy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string stagingPolicy = 11;</code>
     */
    public Builder setStagingPolicy(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stagingPolicy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string stagingPolicy = 11;</code>
     */
    public Builder clearStagingPolicy() {
      
      stagingPolicy_ = getDefaultInstance().getStagingPolicy();
      onChanged();
      return this;
    }
    /**
     * <code>string stagingPolicy = 11;</code>
     */
    public Builder setStagingPolicyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stagingPolicy_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:name.jchein.portfolio.random_art.CreatePaintArtworkTask)
  }

  // @@protoc_insertion_point(class_scope:name.jchein.portfolio.random_art.CreatePaintArtworkTask)
  private static final name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask();
  }

  public static name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePaintArtworkTask>
      PARSER = new com.google.protobuf.AbstractParser<CreatePaintArtworkTask>() {
    @java.lang.Override
    public CreatePaintArtworkTask parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreatePaintArtworkTask(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreatePaintArtworkTask> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePaintArtworkTask> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public name.jchein.portfolio.services.randomArt.paintGateway.grpc.proto.CreatePaintArtworkTask getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

