// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wrench_stamped.proto

package cn.autolabor.plugin.gazebo.msgs;

public final class ProtoWrenchStamped {
  private ProtoWrenchStamped() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface WrenchStampedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.WrenchStamped)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    boolean hasTime();
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time getTime();
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoTime.TimeOrBuilder getTimeOrBuilder();

    /**
     * <code>required .gazebo.msgs.Wrench wrench = 2;</code>
     */
    boolean hasWrench();
    /**
     * <code>required .gazebo.msgs.Wrench wrench = 2;</code>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench getWrench();
    /**
     * <code>required .gazebo.msgs.Wrench wrench = 2;</code>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoWrench.WrenchOrBuilder getWrenchOrBuilder();
  }
  /**
   * Protobuf type {@code gazebo.msgs.WrenchStamped}
   */
  public static final class WrenchStamped extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.WrenchStamped)
      WrenchStampedOrBuilder {
    // Use WrenchStamped.newBuilder() to construct.
    private WrenchStamped(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private WrenchStamped(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final WrenchStamped defaultInstance;
    public static WrenchStamped getDefaultInstance() {
      return defaultInstance;
    }

    public WrenchStamped getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private WrenchStamped(
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
              cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = time_.toBuilder();
              }
              time_ = input.readMessage(cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(time_);
                time_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = wrench_.toBuilder();
              }
              wrench_ = input.readMessage(cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(wrench_);
                wrench_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
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
      return cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.internal_static_gazebo_msgs_WrenchStamped_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.internal_static_gazebo_msgs_WrenchStamped_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped.class, cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped.Builder.class);
    }

    public static com.google.protobuf.Parser<WrenchStamped> PARSER =
        new com.google.protobuf.AbstractParser<WrenchStamped>() {
      public WrenchStamped parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WrenchStamped(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<WrenchStamped> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TIME_FIELD_NUMBER = 1;
    private cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time time_;
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time getTime() {
      return time_;
    }
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoTime.TimeOrBuilder getTimeOrBuilder() {
      return time_;
    }

    public static final int WRENCH_FIELD_NUMBER = 2;
    private cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench wrench_;
    /**
     * <code>required .gazebo.msgs.Wrench wrench = 2;</code>
     */
    public boolean hasWrench() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .gazebo.msgs.Wrench wrench = 2;</code>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench getWrench() {
      return wrench_;
    }
    /**
     * <code>required .gazebo.msgs.Wrench wrench = 2;</code>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoWrench.WrenchOrBuilder getWrenchOrBuilder() {
      return wrench_;
    }

    private void initFields() {
      time_ = cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.getDefaultInstance();
      wrench_ = cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasWrench()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getTime().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getWrench().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, time_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, wrench_);
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
          .computeMessageSize(1, time_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, wrench_);
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

    public static cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped prototype) {
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
     * Protobuf type {@code gazebo.msgs.WrenchStamped}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.WrenchStamped)
        cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStampedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.internal_static_gazebo_msgs_WrenchStamped_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.internal_static_gazebo_msgs_WrenchStamped_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped.class, cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped.newBuilder()
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
          getTimeFieldBuilder();
          getWrenchFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (timeBuilder_ == null) {
          time_ = cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.getDefaultInstance();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (wrenchBuilder_ == null) {
          wrench_ = cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench.getDefaultInstance();
        } else {
          wrenchBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.internal_static_gazebo_msgs_WrenchStamped_descriptor;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped build() {
        cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped buildPartial() {
        cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped result = new cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (timeBuilder_ == null) {
          result.time_ = time_;
        } else {
          result.time_ = timeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (wrenchBuilder_ == null) {
          result.wrench_ = wrench_;
        } else {
          result.wrench_ = wrenchBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped) {
          return mergeFrom((cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped other) {
        if (other == cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped.getDefaultInstance()) return this;
        if (other.hasTime()) {
          mergeTime(other.getTime());
        }
        if (other.hasWrench()) {
          mergeWrench(other.getWrench());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTime()) {
          
          return false;
        }
        if (!hasWrench()) {
          
          return false;
        }
        if (!getTime().isInitialized()) {
          
          return false;
        }
        if (!getWrench().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.msgs.ProtoWrenchStamped.WrenchStamped) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time time_ = cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time, cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoTime.TimeOrBuilder> timeBuilder_;
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public boolean hasTime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time getTime() {
        if (timeBuilder_ == null) {
          return time_;
        } else {
          return timeBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public Builder setTime(cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time value) {
        if (timeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          time_ = value;
          onChanged();
        } else {
          timeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public Builder setTime(
          cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.Builder builderForValue) {
        if (timeBuilder_ == null) {
          time_ = builderForValue.build();
          onChanged();
        } else {
          timeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public Builder mergeTime(cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time value) {
        if (timeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              time_ != cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.getDefaultInstance()) {
            time_ =
              cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.newBuilder(time_).mergeFrom(value).buildPartial();
          } else {
            time_ = value;
          }
          onChanged();
        } else {
          timeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public Builder clearTime() {
        if (timeBuilder_ == null) {
          time_ = cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.getDefaultInstance();
          onChanged();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.Builder getTimeBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTimeFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoTime.TimeOrBuilder getTimeOrBuilder() {
        if (timeBuilder_ != null) {
          return timeBuilder_.getMessageOrBuilder();
        } else {
          return time_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time, cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoTime.TimeOrBuilder> 
          getTimeFieldBuilder() {
        if (timeBuilder_ == null) {
          timeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time, cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoTime.TimeOrBuilder>(
                  getTime(),
                  getParentForChildren(),
                  isClean());
          time_ = null;
        }
        return timeBuilder_;
      }

      private cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench wrench_ = cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench, cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoWrench.WrenchOrBuilder> wrenchBuilder_;
      /**
       * <code>required .gazebo.msgs.Wrench wrench = 2;</code>
       */
      public boolean hasWrench() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .gazebo.msgs.Wrench wrench = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench getWrench() {
        if (wrenchBuilder_ == null) {
          return wrench_;
        } else {
          return wrenchBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Wrench wrench = 2;</code>
       */
      public Builder setWrench(cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench value) {
        if (wrenchBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          wrench_ = value;
          onChanged();
        } else {
          wrenchBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Wrench wrench = 2;</code>
       */
      public Builder setWrench(
          cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench.Builder builderForValue) {
        if (wrenchBuilder_ == null) {
          wrench_ = builderForValue.build();
          onChanged();
        } else {
          wrenchBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Wrench wrench = 2;</code>
       */
      public Builder mergeWrench(cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench value) {
        if (wrenchBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              wrench_ != cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench.getDefaultInstance()) {
            wrench_ =
              cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench.newBuilder(wrench_).mergeFrom(value).buildPartial();
          } else {
            wrench_ = value;
          }
          onChanged();
        } else {
          wrenchBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Wrench wrench = 2;</code>
       */
      public Builder clearWrench() {
        if (wrenchBuilder_ == null) {
          wrench_ = cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench.getDefaultInstance();
          onChanged();
        } else {
          wrenchBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Wrench wrench = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench.Builder getWrenchBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getWrenchFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Wrench wrench = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoWrench.WrenchOrBuilder getWrenchOrBuilder() {
        if (wrenchBuilder_ != null) {
          return wrenchBuilder_.getMessageOrBuilder();
        } else {
          return wrench_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Wrench wrench = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench, cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoWrench.WrenchOrBuilder> 
          getWrenchFieldBuilder() {
        if (wrenchBuilder_ == null) {
          wrenchBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench, cn.autolabor.plugin.gazebo.msgs.ProtoWrench.Wrench.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoWrench.WrenchOrBuilder>(
                  getWrench(),
                  getParentForChildren(),
                  isClean());
          wrench_ = null;
        }
        return wrenchBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.WrenchStamped)
    }

    static {
      defaultInstance = new WrenchStamped(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.WrenchStamped)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_WrenchStamped_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_WrenchStamped_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024wrench_stamped.proto\022\013gazebo.msgs\032\ntim" +
      "e.proto\032\014wrench.proto\"U\n\rWrenchStamped\022\037" +
      "\n\004time\030\001 \002(\0132\021.gazebo.msgs.Time\022#\n\006wrenc" +
      "h\030\002 \002(\0132\023.gazebo.msgs.WrenchB5\n\037cn.autol" +
      "abor.plugin.gazebo.msgsB\022ProtoWrenchStam" +
      "ped"
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
          cn.autolabor.plugin.gazebo.msgs.ProtoTime.getDescriptor(),
          cn.autolabor.plugin.gazebo.msgs.ProtoWrench.getDescriptor(),
        }, assigner);
    internal_static_gazebo_msgs_WrenchStamped_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_WrenchStamped_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_WrenchStamped_descriptor,
        new java.lang.String[] { "Time", "Wrench", });
    cn.autolabor.plugin.gazebo.msgs.ProtoTime.getDescriptor();
    cn.autolabor.plugin.gazebo.msgs.ProtoWrench.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
