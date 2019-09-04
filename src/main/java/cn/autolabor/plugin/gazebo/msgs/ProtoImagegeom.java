// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imagegeom.proto

package cn.autolabor.plugin.gazebo.msgs;

public final class ProtoImagegeom {
  private ProtoImagegeom() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ImageGeomOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.ImageGeom)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string uri = 1;</code>
     */
    boolean hasUri();
    /**
     * <code>required string uri = 1;</code>
     */
    java.lang.String getUri();
    /**
     * <code>required string uri = 1;</code>
     */
    com.google.protobuf.ByteString
        getUriBytes();

    /**
     * <code>optional double scale = 2;</code>
     */
    boolean hasScale();
    /**
     * <code>optional double scale = 2;</code>
     */
    double getScale();

    /**
     * <code>optional int32 threshold = 3 [default = 255];</code>
     */
    boolean hasThreshold();
    /**
     * <code>optional int32 threshold = 3 [default = 255];</code>
     */
    int getThreshold();

    /**
     * <code>optional double height = 4;</code>
     */
    boolean hasHeight();
    /**
     * <code>optional double height = 4;</code>
     */
    double getHeight();

    /**
     * <code>optional int32 granularity = 5;</code>
     */
    boolean hasGranularity();
    /**
     * <code>optional int32 granularity = 5;</code>
     */
    int getGranularity();
  }
  /**
   * Protobuf type {@code gazebo.msgs.ImageGeom}
   */
  public static final class ImageGeom extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.ImageGeom)
      ImageGeomOrBuilder {
    // Use ImageGeom.newBuilder() to construct.
    private ImageGeom(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ImageGeom(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ImageGeom defaultInstance;
    public static ImageGeom getDefaultInstance() {
      return defaultInstance;
    }

    public ImageGeom getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ImageGeom(
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
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              uri_ = bs;
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              scale_ = input.readDouble();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              threshold_ = input.readInt32();
              break;
            }
            case 33: {
              bitField0_ |= 0x00000008;
              height_ = input.readDouble();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              granularity_ = input.readInt32();
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
      return cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.internal_static_gazebo_msgs_ImageGeom_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.internal_static_gazebo_msgs_ImageGeom_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom.class, cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom.Builder.class);
    }

    public static com.google.protobuf.Parser<ImageGeom> PARSER =
        new com.google.protobuf.AbstractParser<ImageGeom>() {
      public ImageGeom parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ImageGeom(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ImageGeom> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int URI_FIELD_NUMBER = 1;
    private java.lang.Object uri_;
    /**
     * <code>required string uri = 1;</code>
     */
    public boolean hasUri() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string uri = 1;</code>
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          uri_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string uri = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SCALE_FIELD_NUMBER = 2;
    private double scale_;
    /**
     * <code>optional double scale = 2;</code>
     */
    public boolean hasScale() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional double scale = 2;</code>
     */
    public double getScale() {
      return scale_;
    }

    public static final int THRESHOLD_FIELD_NUMBER = 3;
    private int threshold_;
    /**
     * <code>optional int32 threshold = 3 [default = 255];</code>
     */
    public boolean hasThreshold() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 threshold = 3 [default = 255];</code>
     */
    public int getThreshold() {
      return threshold_;
    }

    public static final int HEIGHT_FIELD_NUMBER = 4;
    private double height_;
    /**
     * <code>optional double height = 4;</code>
     */
    public boolean hasHeight() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional double height = 4;</code>
     */
    public double getHeight() {
      return height_;
    }

    public static final int GRANULARITY_FIELD_NUMBER = 5;
    private int granularity_;
    /**
     * <code>optional int32 granularity = 5;</code>
     */
    public boolean hasGranularity() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int32 granularity = 5;</code>
     */
    public int getGranularity() {
      return granularity_;
    }

    private void initFields() {
      uri_ = "";
      scale_ = 0D;
      threshold_ = 255;
      height_ = 0D;
      granularity_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasUri()) {
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
        output.writeBytes(1, getUriBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeDouble(2, scale_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, threshold_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeDouble(4, height_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, granularity_);
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
          .computeBytesSize(1, getUriBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, scale_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, threshold_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, height_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, granularity_);
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

    public static cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom prototype) {
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
     * Protobuf type {@code gazebo.msgs.ImageGeom}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.ImageGeom)
        cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeomOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.internal_static_gazebo_msgs_ImageGeom_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.internal_static_gazebo_msgs_ImageGeom_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom.class, cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom.newBuilder()
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
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        uri_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        scale_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        threshold_ = 255;
        bitField0_ = (bitField0_ & ~0x00000004);
        height_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000008);
        granularity_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.internal_static_gazebo_msgs_ImageGeom_descriptor;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom build() {
        cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom buildPartial() {
        cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom result = new cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.uri_ = uri_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.scale_ = scale_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.threshold_ = threshold_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.height_ = height_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.granularity_ = granularity_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom) {
          return mergeFrom((cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom other) {
        if (other == cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom.getDefaultInstance()) return this;
        if (other.hasUri()) {
          bitField0_ |= 0x00000001;
          uri_ = other.uri_;
          onChanged();
        }
        if (other.hasScale()) {
          setScale(other.getScale());
        }
        if (other.hasThreshold()) {
          setThreshold(other.getThreshold());
        }
        if (other.hasHeight()) {
          setHeight(other.getHeight());
        }
        if (other.hasGranularity()) {
          setGranularity(other.getGranularity());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasUri()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.msgs.ProtoImagegeom.ImageGeom) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object uri_ = "";
      /**
       * <code>required string uri = 1;</code>
       */
      public boolean hasUri() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string uri = 1;</code>
       */
      public java.lang.String getUri() {
        java.lang.Object ref = uri_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            uri_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string uri = 1;</code>
       */
      public com.google.protobuf.ByteString
          getUriBytes() {
        java.lang.Object ref = uri_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          uri_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string uri = 1;</code>
       */
      public Builder setUri(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        uri_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string uri = 1;</code>
       */
      public Builder clearUri() {
        bitField0_ = (bitField0_ & ~0x00000001);
        uri_ = getDefaultInstance().getUri();
        onChanged();
        return this;
      }
      /**
       * <code>required string uri = 1;</code>
       */
      public Builder setUriBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        uri_ = value;
        onChanged();
        return this;
      }

      private double scale_ ;
      /**
       * <code>optional double scale = 2;</code>
       */
      public boolean hasScale() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional double scale = 2;</code>
       */
      public double getScale() {
        return scale_;
      }
      /**
       * <code>optional double scale = 2;</code>
       */
      public Builder setScale(double value) {
        bitField0_ |= 0x00000002;
        scale_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double scale = 2;</code>
       */
      public Builder clearScale() {
        bitField0_ = (bitField0_ & ~0x00000002);
        scale_ = 0D;
        onChanged();
        return this;
      }

      private int threshold_ = 255;
      /**
       * <code>optional int32 threshold = 3 [default = 255];</code>
       */
      public boolean hasThreshold() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 threshold = 3 [default = 255];</code>
       */
      public int getThreshold() {
        return threshold_;
      }
      /**
       * <code>optional int32 threshold = 3 [default = 255];</code>
       */
      public Builder setThreshold(int value) {
        bitField0_ |= 0x00000004;
        threshold_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 threshold = 3 [default = 255];</code>
       */
      public Builder clearThreshold() {
        bitField0_ = (bitField0_ & ~0x00000004);
        threshold_ = 255;
        onChanged();
        return this;
      }

      private double height_ ;
      /**
       * <code>optional double height = 4;</code>
       */
      public boolean hasHeight() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional double height = 4;</code>
       */
      public double getHeight() {
        return height_;
      }
      /**
       * <code>optional double height = 4;</code>
       */
      public Builder setHeight(double value) {
        bitField0_ |= 0x00000008;
        height_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double height = 4;</code>
       */
      public Builder clearHeight() {
        bitField0_ = (bitField0_ & ~0x00000008);
        height_ = 0D;
        onChanged();
        return this;
      }

      private int granularity_ ;
      /**
       * <code>optional int32 granularity = 5;</code>
       */
      public boolean hasGranularity() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int32 granularity = 5;</code>
       */
      public int getGranularity() {
        return granularity_;
      }
      /**
       * <code>optional int32 granularity = 5;</code>
       */
      public Builder setGranularity(int value) {
        bitField0_ |= 0x00000010;
        granularity_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 granularity = 5;</code>
       */
      public Builder clearGranularity() {
        bitField0_ = (bitField0_ & ~0x00000010);
        granularity_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.ImageGeom)
    }

    static {
      defaultInstance = new ImageGeom(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.ImageGeom)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_ImageGeom_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_ImageGeom_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017imagegeom.proto\022\013gazebo.msgs\"d\n\tImageG" +
      "eom\022\013\n\003uri\030\001 \002(\t\022\r\n\005scale\030\002 \001(\001\022\026\n\tthres" +
      "hold\030\003 \001(\005:\003255\022\016\n\006height\030\004 \001(\001\022\023\n\013granu" +
      "larity\030\005 \001(\005B1\n\037cn.autolabor.plugin.gaze" +
      "bo.msgsB\016ProtoImagegeom"
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
    internal_static_gazebo_msgs_ImageGeom_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_ImageGeom_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_ImageGeom_descriptor,
        new java.lang.String[] { "Uri", "Scale", "Threshold", "Height", "Granularity", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
