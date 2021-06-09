// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserService.proto

package Main.proto;

/**
 * Protobuf type {@code OperationalStatusProto}
 */
public  final class OperationalStatusProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:OperationalStatusProto)
        OperationalStatusProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OperationalStatusProto.newBuilder() to construct.
  private OperationalStatusProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OperationalStatusProto() {
    operationResult_ = "";
    operationName_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OperationalStatusProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
            String s = input.readStringRequireUtf8();

            operationResult_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            operationName_ = s;
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
    return Main.proto.UserService.internal_static_OperationalStatusProto_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Main.proto.UserService.internal_static_OperationalStatusProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Main.proto.OperationalStatusProto.class, Main.proto.OperationalStatusProto.Builder.class);
  }

  public static final int OPERATIONRESULT_FIELD_NUMBER = 1;
  private volatile Object operationResult_;
  /**
   * <code>string operationResult = 1;</code>
   */
  public String getOperationResult() {
    Object ref = operationResult_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      operationResult_ = s;
      return s;
    }
  }
  /**
   * <code>string operationResult = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOperationResultBytes() {
    Object ref = operationResult_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      operationResult_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPERATIONNAME_FIELD_NUMBER = 2;
  private volatile Object operationName_;
  /**
   * <code>string operationName = 2;</code>
   */
  public String getOperationName() {
    Object ref = operationName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      operationName_ = s;
      return s;
    }
  }
  /**
   * <code>string operationName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getOperationNameBytes() {
    Object ref = operationName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      operationName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getOperationResultBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, operationResult_);
    }
    if (!getOperationNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, operationName_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOperationResultBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, operationResult_);
    }
    if (!getOperationNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, operationName_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Main.proto.OperationalStatusProto)) {
      return super.equals(obj);
    }
    Main.proto.OperationalStatusProto other = (Main.proto.OperationalStatusProto) obj;

    boolean result = true;
    result = result && getOperationResult()
        .equals(other.getOperationResult());
    result = result && getOperationName()
        .equals(other.getOperationName());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + OPERATIONRESULT_FIELD_NUMBER;
    hash = (53 * hash) + getOperationResult().hashCode();
    hash = (37 * hash) + OPERATIONNAME_FIELD_NUMBER;
    hash = (53 * hash) + getOperationName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Main.proto.OperationalStatusProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Main.proto.OperationalStatusProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Main.proto.OperationalStatusProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Main.proto.OperationalStatusProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Main.proto.OperationalStatusProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Main.proto.OperationalStatusProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Main.proto.OperationalStatusProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Main.proto.OperationalStatusProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Main.proto.OperationalStatusProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Main.proto.OperationalStatusProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Main.proto.OperationalStatusProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Main.proto.OperationalStatusProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Main.proto.OperationalStatusProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code OperationalStatusProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:OperationalStatusProto)
      OperationalStatusProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Main.proto.UserService.internal_static_OperationalStatusProto_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Main.proto.UserService.internal_static_OperationalStatusProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Main.proto.OperationalStatusProto.class, Main.proto.OperationalStatusProto.Builder.class);
    }

    // Construct using Main.proto.OperationalStatusProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      operationResult_ = "";

      operationName_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Main.proto.UserService.internal_static_OperationalStatusProto_descriptor;
    }

    @Override
    public Main.proto.OperationalStatusProto getDefaultInstanceForType() {
      return getDefaultInstance();
    }

    @Override
    public Main.proto.OperationalStatusProto build() {
      Main.proto.OperationalStatusProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Main.proto.OperationalStatusProto buildPartial() {
      Main.proto.OperationalStatusProto result = new Main.proto.OperationalStatusProto(this);
      result.operationResult_ = operationResult_;
      result.operationName_ = operationName_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Main.proto.OperationalStatusProto) {
        return mergeFrom((Main.proto.OperationalStatusProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Main.proto.OperationalStatusProto other) {
      if (other == getDefaultInstance()) return this;
      if (!other.getOperationResult().isEmpty()) {
        operationResult_ = other.operationResult_;
        onChanged();
      }
      if (!other.getOperationName().isEmpty()) {
        operationName_ = other.operationName_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Main.proto.OperationalStatusProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Main.proto.OperationalStatusProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object operationResult_ = "";
    /**
     * <code>string operationResult = 1;</code>
     */
    public String getOperationResult() {
      Object ref = operationResult_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        operationResult_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string operationResult = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOperationResultBytes() {
      Object ref = operationResult_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        operationResult_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string operationResult = 1;</code>
     */
    public Builder setOperationResult(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      operationResult_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string operationResult = 1;</code>
     */
    public Builder clearOperationResult() {
      
      operationResult_ = getDefaultInstance().getOperationResult();
      onChanged();
      return this;
    }
    /**
     * <code>string operationResult = 1;</code>
     */
    public Builder setOperationResultBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      operationResult_ = value;
      onChanged();
      return this;
    }

    private Object operationName_ = "";
    /**
     * <code>string operationName = 2;</code>
     */
    public String getOperationName() {
      Object ref = operationName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        operationName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string operationName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getOperationNameBytes() {
      Object ref = operationName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        operationName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string operationName = 2;</code>
     */
    public Builder setOperationName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      operationName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string operationName = 2;</code>
     */
    public Builder clearOperationName() {
      
      operationName_ = getDefaultInstance().getOperationName();
      onChanged();
      return this;
    }
    /**
     * <code>string operationName = 2;</code>
     */
    public Builder setOperationNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      operationName_ = value;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:OperationalStatusProto)
  }

  // @@protoc_insertion_point(class_scope:OperationalStatusProto)
  private static final Main.proto.OperationalStatusProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Main.proto.OperationalStatusProto();
  }

  public static Main.proto.OperationalStatusProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OperationalStatusProto>
      PARSER = new com.google.protobuf.AbstractParser<OperationalStatusProto>() {
    @Override
    public OperationalStatusProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OperationalStatusProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OperationalStatusProto> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<OperationalStatusProto> getParserForType() {
    return PARSER;
  }

  @Override
  public Main.proto.OperationalStatusProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

