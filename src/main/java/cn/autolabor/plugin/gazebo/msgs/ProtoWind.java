// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wind.proto

package cn.autolabor.plugin.gazebo.msgs;

public final class ProtoWind {
  private ProtoWind() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface WindOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.Wind)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .gazebo.msgs.Vector3d linear_velocity = 1;</code>
     */
    boolean hasLinearVelocity();
    /**
     * <code>optional .gazebo.msgs.Vector3d linear_velocity = 1;</code>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d getLinearVelocity();
    /**
     * <code>optional .gazebo.msgs.Vector3d linear_velocity = 1;</code>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder getLinearVelocityOrBuilder();

    /**
     * <code>optional bool enable_wind = 2;</code>
     */
    boolean hasEnableWind();
    /**
     * <code>optional bool enable_wind = 2;</code>
     */
    boolean getEnableWind();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Wind}
   */
  public static final class Wind extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.Wind)
      WindOrBuilder {
    // Use Wind.newBuilder() to construct.
    private Wind(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Wind(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Wind defaultInstance;
    public static Wind getDefaultInstance() {
      return defaultInstance;
    }

    public Wind getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Wind(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = linearVelocity_.toBuilder();
              }
              linearVelocity_ = input.readMessage(cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(linearVelocity_);
                linearVelocity_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              enableWind_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.autolabor.plugin.gazebo.msgs.ProtoWind.internal_static_gazebo_msgs_Wind_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.msgs.ProtoWind.internal_static_gazebo_msgs_Wind_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind.class, cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind.Builder.class);
    }

    public static com.google.protobuf.Parser<Wind> PARSER =
        new com.google.protobuf.AbstractParser<Wind>() {
      public Wind parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Wind(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Wind> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int LINEAR_VELOCITY_FIELD_NUMBER = 1;
    private cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d linearVelocity_;
    /**
     * <code>optional .gazebo.msgs.Vector3d linear_velocity = 1;</code>
     */
    public boolean hasLinearVelocity() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .gazebo.msgs.Vector3d linear_velocity = 1;</code>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d getLinearVelocity() {
      return linearVelocity_;
    }
    /**
     * <code>optional .gazebo.msgs.Vector3d linear_velocity = 1;</code>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder getLinearVelocityOrBuilder() {
      return linearVelocity_;
    }

    public static final int ENABLE_WIND_FIELD_NUMBER = 2;
    private boolean enableWind_;
    /**
     * <code>optional bool enable_wind = 2;</code>
     */
    public boolean hasEnableWind() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bool enable_wind = 2;</code>
     */
    public boolean getEnableWind() {
      return enableWind_;
    }

    private void initFields() {
      linearVelocity_ = cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.getDefaultInstance();
      enableWind_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasLinearVelocity()) {
        if (!getLinearVelocity().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, linearVelocity_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, enableWind_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, linearVelocity_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, enableWind_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code gazebo.msgs.Wind}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.Wind)
        cn.autolabor.plugin.gazebo.msgs.ProtoWind.WindOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoWind.internal_static_gazebo_msgs_Wind_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoWind.internal_static_gazebo_msgs_Wind_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind.class, cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getLinearVelocityFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (linearVelocityBuilder_ == null) {
          linearVelocity_ = cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.getDefaultInstance();
        } else {
          linearVelocityBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        enableWind_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoWind.internal_static_gazebo_msgs_Wind_descriptor;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind build() {
        cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind buildPartial() {
        cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind result = new cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (linearVelocityBuilder_ == null) {
          result.linearVelocity_ = linearVelocity_;
        } else {
          result.linearVelocity_ = linearVelocityBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.enableWind_ = enableWind_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind) {
          return mergeFrom((cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind other) {
        if (other == cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind.getDefaultInstance()) return this;
        if (other.hasLinearVelocity()) {
          mergeLinearVelocity(other.getLinearVelocity());
        }
        if (other.hasEnableWind()) {
          setEnableWind(other.getEnableWind());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (hasLinearVelocity()) {
          if (!getLinearVelocity().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.msgs.ProtoWind.Wind) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d linearVelocity_ = cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder> linearVelocityBuilder_;
      /**
       * <code>optional .gazebo.msgs.Vector3d linear_velocity = 1;</code>
       */
      public boolean hasLinearVelocity() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .gazebo.msgs.Vector3d linear_velocity = 1;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d getLinearVelocity() {
        if (linearVelocityBuilder_ == null) {
          return linearVelocity_;
        } else {
          return linearVelocityBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .gazebo.msgs.Vector3d linear_velocity = 1;</code>
       */
      public Builder setLinearVelocity(cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d value) {
        if (linearVelocityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          linearVelocity_ = value;
          onChanged();
        } else {
          linearVelocityBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Vector3d linear_velocity = 1;</code>
       */
      public Builder setLinearVelocity(
          cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder builderForValue) {
        if (linearVelocityBuilder_ == null) {
          linearVelocity_ = builderForValue.build();
          onChanged();
        } else {
          linearVelocityBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Vector3d linear_velocity = 1;</code>
       */
      public Builder mergeLinearVelocity(cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d value) {
        if (linearVelocityBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              linearVelocity_ != cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.getDefaultInstance()) {
            linearVelocity_ =
              cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.newBuilder(linearVelocity_).mergeFrom(value).buildPartial();
          } else {
            linearVelocity_ = value;
          }
          onChanged();
        } else {
          linearVelocityBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Vector3d linear_velocity = 1;</code>
       */
      public Builder clearLinearVelocity() {
        if (linearVelocityBuilder_ == null) {
          linearVelocity_ = cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.getDefaultInstance();
          onChanged();
        } else {
          linearVelocityBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Vector3d linear_velocity = 1;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder getLinearVelocityBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getLinearVelocityFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .gazebo.msgs.Vector3d linear_velocity = 1;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder getLinearVelocityOrBuilder() {
        if (linearVelocityBuilder_ != null) {
          return linearVelocityBuilder_.getMessageOrBuilder();
        } else {
          return linearVelocity_;
        }
      }
      /**
       * <code>optional .gazebo.msgs.Vector3d linear_velocity = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder> 
          getLinearVelocityFieldBuilder() {
        if (linearVelocityBuilder_ == null) {
          linearVelocityBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder>(
                  getLinearVelocity(),
                  getParentForChildren(),
                  isClean());
          linearVelocity_ = null;
        }
        return linearVelocityBuilder_;
      }

      private boolean enableWind_ ;
      /**
       * <code>optional bool enable_wind = 2;</code>
       */
      public boolean hasEnableWind() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bool enable_wind = 2;</code>
       */
      public boolean getEnableWind() {
        return enableWind_;
      }
      /**
       * <code>optional bool enable_wind = 2;</code>
       */
      public Builder setEnableWind(boolean value) {
        bitField0_ |= 0x00000002;
        enableWind_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool enable_wind = 2;</code>
       */
      public Builder clearEnableWind() {
        bitField0_ = (bitField0_ & ~0x00000002);
        enableWind_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Wind)
    }

    static {
      defaultInstance = new Wind(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Wind)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Wind_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_Wind_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nwind.proto\022\013gazebo.msgs\032\016vector3d.prot" +
      "o\"K\n\004Wind\022.\n\017linear_velocity\030\001 \001(\0132\025.gaz" +
      "ebo.msgs.Vector3d\022\023\n\013enable_wind\030\002 \001(\010B," +
      "\n\037cn.autolabor.plugin.gazebo.msgsB\tProto" +
      "Wind"
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
          cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.getDescriptor(),
        }, assigner);
    internal_static_gazebo_msgs_Wind_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_Wind_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_Wind_descriptor,
        new java.lang.String[] { "LinearVelocity", "EnableWind", });
    cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
