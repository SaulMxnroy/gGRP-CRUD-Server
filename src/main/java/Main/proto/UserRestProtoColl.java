// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserService.proto

package Main.proto;

/**
 * Protobuf type {@code UserRestProtoColl}
 */
public  final class UserRestProtoColl extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UserRestProtoColl)
        UserRestProtoCollOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserRestProtoColl.newBuilder() to construct.
  private UserRestProtoColl(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserRestProtoColl() {
    userRestProtos_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserRestProtoColl(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              userRestProtos_ = new java.util.ArrayList<Main.proto.userProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            userRestProtos_.add(
                input.readMessage(Main.proto.userProto.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        userRestProtos_ = java.util.Collections.unmodifiableList(userRestProtos_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Main.proto.UserService.internal_static_UserRestProtoColl_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Main.proto.UserService.internal_static_UserRestProtoColl_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Main.proto.UserRestProtoColl.class, Main.proto.UserRestProtoColl.Builder.class);
  }

  public static final int USER_REST_PROTOS_FIELD_NUMBER = 1;
  private java.util.List<Main.proto.userProto> userRestProtos_;
  /**
   * <code>repeated .userProto user_rest_protos = 1;</code>
   */
  public java.util.List<Main.proto.userProto> getUserRestProtosList() {
    return userRestProtos_;
  }
  /**
   * <code>repeated .userProto user_rest_protos = 1;</code>
   */
  public java.util.List<? extends Main.proto.userProtoOrBuilder> 
      getUserRestProtosOrBuilderList() {
    return userRestProtos_;
  }
  /**
   * <code>repeated .userProto user_rest_protos = 1;</code>
   */
  public int getUserRestProtosCount() {
    return userRestProtos_.size();
  }
  /**
   * <code>repeated .userProto user_rest_protos = 1;</code>
   */
  public Main.proto.userProto getUserRestProtos(int index) {
    return userRestProtos_.get(index);
  }
  /**
   * <code>repeated .userProto user_rest_protos = 1;</code>
   */
  public Main.proto.userProtoOrBuilder getUserRestProtosOrBuilder(
      int index) {
    return userRestProtos_.get(index);
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
    for (int i = 0; i < userRestProtos_.size(); i++) {
      output.writeMessage(1, userRestProtos_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < userRestProtos_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, userRestProtos_.get(i));
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
    if (!(obj instanceof Main.proto.UserRestProtoColl)) {
      return super.equals(obj);
    }
    Main.proto.UserRestProtoColl other = (Main.proto.UserRestProtoColl) obj;

    boolean result = true;
    result = result && getUserRestProtosList()
        .equals(other.getUserRestProtosList());
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
    if (getUserRestProtosCount() > 0) {
      hash = (37 * hash) + USER_REST_PROTOS_FIELD_NUMBER;
      hash = (53 * hash) + getUserRestProtosList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Main.proto.UserRestProtoColl parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Main.proto.UserRestProtoColl parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Main.proto.UserRestProtoColl parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Main.proto.UserRestProtoColl parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Main.proto.UserRestProtoColl parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Main.proto.UserRestProtoColl parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Main.proto.UserRestProtoColl parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Main.proto.UserRestProtoColl parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Main.proto.UserRestProtoColl parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Main.proto.UserRestProtoColl parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Main.proto.UserRestProtoColl parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Main.proto.UserRestProtoColl parseFrom(
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
  public static Builder newBuilder(Main.proto.UserRestProtoColl prototype) {
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
   * Protobuf type {@code UserRestProtoColl}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UserRestProtoColl)
      UserRestProtoCollOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Main.proto.UserService.internal_static_UserRestProtoColl_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Main.proto.UserService.internal_static_UserRestProtoColl_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Main.proto.UserRestProtoColl.class, Main.proto.UserRestProtoColl.Builder.class);
    }

    // Construct using Main.proto.UserRestProtoColl.newBuilder()
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
        getUserRestProtosFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (userRestProtosBuilder_ == null) {
        userRestProtos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        userRestProtosBuilder_.clear();
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Main.proto.UserService.internal_static_UserRestProtoColl_descriptor;
    }

    @Override
    public Main.proto.UserRestProtoColl getDefaultInstanceForType() {
      return getDefaultInstance();
    }

    @Override
    public Main.proto.UserRestProtoColl build() {
      Main.proto.UserRestProtoColl result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Main.proto.UserRestProtoColl buildPartial() {
      Main.proto.UserRestProtoColl result = new Main.proto.UserRestProtoColl(this);
      int from_bitField0_ = bitField0_;
      if (userRestProtosBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          userRestProtos_ = java.util.Collections.unmodifiableList(userRestProtos_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.userRestProtos_ = userRestProtos_;
      } else {
        result.userRestProtos_ = userRestProtosBuilder_.build();
      }
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
      if (other instanceof Main.proto.UserRestProtoColl) {
        return mergeFrom((Main.proto.UserRestProtoColl)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Main.proto.UserRestProtoColl other) {
      if (other == getDefaultInstance()) return this;
      if (userRestProtosBuilder_ == null) {
        if (!other.userRestProtos_.isEmpty()) {
          if (userRestProtos_.isEmpty()) {
            userRestProtos_ = other.userRestProtos_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserRestProtosIsMutable();
            userRestProtos_.addAll(other.userRestProtos_);
          }
          onChanged();
        }
      } else {
        if (!other.userRestProtos_.isEmpty()) {
          if (userRestProtosBuilder_.isEmpty()) {
            userRestProtosBuilder_.dispose();
            userRestProtosBuilder_ = null;
            userRestProtos_ = other.userRestProtos_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userRestProtosBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUserRestProtosFieldBuilder() : null;
          } else {
            userRestProtosBuilder_.addAllMessages(other.userRestProtos_);
          }
        }
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
      Main.proto.UserRestProtoColl parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Main.proto.UserRestProtoColl) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<Main.proto.userProto> userRestProtos_ =
      java.util.Collections.emptyList();
    private void ensureUserRestProtosIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        userRestProtos_ = new java.util.ArrayList<Main.proto.userProto>(userRestProtos_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        Main.proto.userProto, Main.proto.userProto.Builder, Main.proto.userProtoOrBuilder> userRestProtosBuilder_;

    /**
     * <code>repeated .userProto user_rest_protos = 1;</code>
     */
    public java.util.List<Main.proto.userProto> getUserRestProtosList() {
      if (userRestProtosBuilder_ == null) {
        return java.util.Collections.unmodifiableList(userRestProtos_);
      } else {
        return userRestProtosBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .userProto user_rest_protos = 1;</code>
     */
    public int getUserRestProtosCount() {
      if (userRestProtosBuilder_ == null) {
        return userRestProtos_.size();
      } else {
        return userRestProtosBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .userProto user_rest_protos = 1;</code>
     */
    public Main.proto.userProto getUserRestProtos(int index) {
      if (userRestProtosBuilder_ == null) {
        return userRestProtos_.get(index);
      } else {
        return userRestProtosBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .userProto user_rest_protos = 1;</code>
     */
    public Builder setUserRestProtos(
        int index, Main.proto.userProto value) {
      if (userRestProtosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserRestProtosIsMutable();
        userRestProtos_.set(index, value);
        onChanged();
      } else {
        userRestProtosBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .userProto user_rest_protos = 1;</code>
     */
    public Builder setUserRestProtos(
        int index, Main.proto.userProto.Builder builderForValue) {
      if (userRestProtosBuilder_ == null) {
        ensureUserRestProtosIsMutable();
        userRestProtos_.set(index, builderForValue.build());
        onChanged();
      } else {
        userRestProtosBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .userProto user_rest_protos = 1;</code>
     */
    public Builder addUserRestProtos(Main.proto.userProto value) {
      if (userRestProtosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserRestProtosIsMutable();
        userRestProtos_.add(value);
        onChanged();
      } else {
        userRestProtosBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .userProto user_rest_protos = 1;</code>
     */
    public Builder addUserRestProtos(
        int index, Main.proto.userProto value) {
      if (userRestProtosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserRestProtosIsMutable();
        userRestProtos_.add(index, value);
        onChanged();
      } else {
        userRestProtosBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .userProto user_rest_protos = 1;</code>
     */
    public Builder addUserRestProtos(
        Main.proto.userProto.Builder builderForValue) {
      if (userRestProtosBuilder_ == null) {
        ensureUserRestProtosIsMutable();
        userRestProtos_.add(builderForValue.build());
        onChanged();
      } else {
        userRestProtosBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .userProto user_rest_protos = 1;</code>
     */
    public Builder addUserRestProtos(
        int index, Main.proto.userProto.Builder builderForValue) {
      if (userRestProtosBuilder_ == null) {
        ensureUserRestProtosIsMutable();
        userRestProtos_.add(index, builderForValue.build());
        onChanged();
      } else {
        userRestProtosBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .userProto user_rest_protos = 1;</code>
     */
    public Builder addAllUserRestProtos(
        Iterable<? extends Main.proto.userProto> values) {
      if (userRestProtosBuilder_ == null) {
        ensureUserRestProtosIsMutable();
        addAll(
            values, userRestProtos_);
        onChanged();
      } else {
        userRestProtosBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .userProto user_rest_protos = 1;</code>
     */
    public Builder clearUserRestProtos() {
      if (userRestProtosBuilder_ == null) {
        userRestProtos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userRestProtosBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .userProto user_rest_protos = 1;</code>
     */
    public Builder removeUserRestProtos(int index) {
      if (userRestProtosBuilder_ == null) {
        ensureUserRestProtosIsMutable();
        userRestProtos_.remove(index);
        onChanged();
      } else {
        userRestProtosBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .userProto user_rest_protos = 1;</code>
     */
    public Main.proto.userProto.Builder getUserRestProtosBuilder(
        int index) {
      return getUserRestProtosFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .userProto user_rest_protos = 1;</code>
     */
    public Main.proto.userProtoOrBuilder getUserRestProtosOrBuilder(
        int index) {
      if (userRestProtosBuilder_ == null) {
        return userRestProtos_.get(index);  } else {
        return userRestProtosBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .userProto user_rest_protos = 1;</code>
     */
    public java.util.List<? extends Main.proto.userProtoOrBuilder> 
         getUserRestProtosOrBuilderList() {
      if (userRestProtosBuilder_ != null) {
        return userRestProtosBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(userRestProtos_);
      }
    }
    /**
     * <code>repeated .userProto user_rest_protos = 1;</code>
     */
    public Main.proto.userProto.Builder addUserRestProtosBuilder() {
      return getUserRestProtosFieldBuilder().addBuilder(
          Main.proto.userProto.getDefaultInstance());
    }
    /**
     * <code>repeated .userProto user_rest_protos = 1;</code>
     */
    public Main.proto.userProto.Builder addUserRestProtosBuilder(
        int index) {
      return getUserRestProtosFieldBuilder().addBuilder(
          index, Main.proto.userProto.getDefaultInstance());
    }
    /**
     * <code>repeated .userProto user_rest_protos = 1;</code>
     */
    public java.util.List<Main.proto.userProto.Builder> 
         getUserRestProtosBuilderList() {
      return getUserRestProtosFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        Main.proto.userProto, Main.proto.userProto.Builder, Main.proto.userProtoOrBuilder> 
        getUserRestProtosFieldBuilder() {
      if (userRestProtosBuilder_ == null) {
        userRestProtosBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            Main.proto.userProto, Main.proto.userProto.Builder, Main.proto.userProtoOrBuilder>(
                userRestProtos_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        userRestProtos_ = null;
      }
      return userRestProtosBuilder_;
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


    // @@protoc_insertion_point(builder_scope:UserRestProtoColl)
  }

  // @@protoc_insertion_point(class_scope:UserRestProtoColl)
  private static final Main.proto.UserRestProtoColl DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Main.proto.UserRestProtoColl();
  }

  public static Main.proto.UserRestProtoColl getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserRestProtoColl>
      PARSER = new com.google.protobuf.AbstractParser<UserRestProtoColl>() {
    @Override
    public UserRestProtoColl parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserRestProtoColl(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserRestProtoColl> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<UserRestProtoColl> getParserForType() {
    return PARSER;
  }

  @Override
  public Main.proto.UserRestProtoColl getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

