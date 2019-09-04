// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shadows.proto

package cn.autolabor.plugin.gazebo.msgs;

public final class ProtoShadows {
  private ProtoShadows() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ShadowsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.Shadows)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .gazebo.msgs.Shadows.ShadowType type = 5;</code>
     */
    boolean hasType();
    /**
     * <code>optional .gazebo.msgs.Shadows.ShadowType type = 5;</code>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.ShadowType getType();

    /**
     * <code>optional .gazebo.msgs.Color color = 6;</code>
     */
    boolean hasColor();
    /**
     * <code>optional .gazebo.msgs.Color color = 6;</code>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color getColor();
    /**
     * <code>optional .gazebo.msgs.Color color = 6;</code>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoColor.ColorOrBuilder getColorOrBuilder();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Shadows}
   */
  public static final class Shadows extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.Shadows)
      ShadowsOrBuilder {
    // Use Shadows.newBuilder() to construct.
    private Shadows(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Shadows(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Shadows defaultInstance;
    public static Shadows getDefaultInstance() {
      return defaultInstance;
    }

    public Shadows getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Shadows(
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
            case 40: {
              int rawValue = input.readEnum();
              cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.ShadowType value = cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.ShadowType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(5, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                type_ = value;
              }
              break;
            }
            case 50: {
              cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = color_.toBuilder();
              }
              color_ = input.readMessage(cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(color_);
                color_ = subBuilder.buildPartial();
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
      return cn.autolabor.plugin.gazebo.msgs.ProtoShadows.internal_static_gazebo_msgs_Shadows_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.msgs.ProtoShadows.internal_static_gazebo_msgs_Shadows_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.class, cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.Builder.class);
    }

    public static com.google.protobuf.Parser<Shadows> PARSER =
        new com.google.protobuf.AbstractParser<Shadows>() {
      public Shadows parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Shadows(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Shadows> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code gazebo.msgs.Shadows.ShadowType}
     */
    public enum ShadowType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>STENCIL_ADDITIVE = 1;</code>
       */
      STENCIL_ADDITIVE(0, 1),
      /**
       * <code>STENCIL_MODULATIVE = 2;</code>
       */
      STENCIL_MODULATIVE(1, 2),
      /**
       * <code>TEXTURE_ADDITIVE = 3;</code>
       */
      TEXTURE_ADDITIVE(2, 3),
      /**
       * <code>TEXTURE_MODULATIVE = 4;</code>
       */
      TEXTURE_MODULATIVE(3, 4),
      ;

      /**
       * <code>STENCIL_ADDITIVE = 1;</code>
       */
      public static final int STENCIL_ADDITIVE_VALUE = 1;
      /**
       * <code>STENCIL_MODULATIVE = 2;</code>
       */
      public static final int STENCIL_MODULATIVE_VALUE = 2;
      /**
       * <code>TEXTURE_ADDITIVE = 3;</code>
       */
      public static final int TEXTURE_ADDITIVE_VALUE = 3;
      /**
       * <code>TEXTURE_MODULATIVE = 4;</code>
       */
      public static final int TEXTURE_MODULATIVE_VALUE = 4;


      public final int getNumber() { return value; }

      public static ShadowType valueOf(int value) {
        switch (value) {
          case 1: return STENCIL_ADDITIVE;
          case 2: return STENCIL_MODULATIVE;
          case 3: return TEXTURE_ADDITIVE;
          case 4: return TEXTURE_MODULATIVE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ShadowType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<ShadowType>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ShadowType>() {
              public ShadowType findValueByNumber(int number) {
                return ShadowType.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.getDescriptor().getEnumTypes().get(0);
      }

      private static final ShadowType[] VALUES = values();

      public static ShadowType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private ShadowType(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:gazebo.msgs.Shadows.ShadowType)
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 5;
    private cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.ShadowType type_;
    /**
     * <code>optional .gazebo.msgs.Shadows.ShadowType type = 5;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .gazebo.msgs.Shadows.ShadowType type = 5;</code>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.ShadowType getType() {
      return type_;
    }

    public static final int COLOR_FIELD_NUMBER = 6;
    private cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color color_;
    /**
     * <code>optional .gazebo.msgs.Color color = 6;</code>
     */
    public boolean hasColor() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .gazebo.msgs.Color color = 6;</code>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color getColor() {
      return color_;
    }
    /**
     * <code>optional .gazebo.msgs.Color color = 6;</code>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoColor.ColorOrBuilder getColorOrBuilder() {
      return color_;
    }

    private void initFields() {
      type_ = cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.ShadowType.STENCIL_ADDITIVE;
      color_ = cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasColor()) {
        if (!getColor().isInitialized()) {
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
        output.writeEnum(5, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(6, color_);
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
          .computeEnumSize(5, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, color_);
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

    public static cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows prototype) {
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
     * Protobuf type {@code gazebo.msgs.Shadows}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.Shadows)
        cn.autolabor.plugin.gazebo.msgs.ProtoShadows.ShadowsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoShadows.internal_static_gazebo_msgs_Shadows_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoShadows.internal_static_gazebo_msgs_Shadows_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.class, cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.newBuilder()
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
          getColorFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        type_ = cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.ShadowType.STENCIL_ADDITIVE;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (colorBuilder_ == null) {
          color_ = cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color.getDefaultInstance();
        } else {
          colorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoShadows.internal_static_gazebo_msgs_Shadows_descriptor;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows build() {
        cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows buildPartial() {
        cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows result = new cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (colorBuilder_ == null) {
          result.color_ = color_;
        } else {
          result.color_ = colorBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows) {
          return mergeFrom((cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows other) {
        if (other == cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasColor()) {
          mergeColor(other.getColor());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (hasColor()) {
          if (!getColor().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.ShadowType type_ = cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.ShadowType.STENCIL_ADDITIVE;
      /**
       * <code>optional .gazebo.msgs.Shadows.ShadowType type = 5;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .gazebo.msgs.Shadows.ShadowType type = 5;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.ShadowType getType() {
        return type_;
      }
      /**
       * <code>optional .gazebo.msgs.Shadows.ShadowType type = 5;</code>
       */
      public Builder setType(cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.ShadowType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Shadows.ShadowType type = 5;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = cn.autolabor.plugin.gazebo.msgs.ProtoShadows.Shadows.ShadowType.STENCIL_ADDITIVE;
        onChanged();
        return this;
      }

      private cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color color_ = cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color, cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoColor.ColorOrBuilder> colorBuilder_;
      /**
       * <code>optional .gazebo.msgs.Color color = 6;</code>
       */
      public boolean hasColor() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .gazebo.msgs.Color color = 6;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color getColor() {
        if (colorBuilder_ == null) {
          return color_;
        } else {
          return colorBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .gazebo.msgs.Color color = 6;</code>
       */
      public Builder setColor(cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color value) {
        if (colorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          color_ = value;
          onChanged();
        } else {
          colorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Color color = 6;</code>
       */
      public Builder setColor(
          cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color.Builder builderForValue) {
        if (colorBuilder_ == null) {
          color_ = builderForValue.build();
          onChanged();
        } else {
          colorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Color color = 6;</code>
       */
      public Builder mergeColor(cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color value) {
        if (colorBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              color_ != cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color.getDefaultInstance()) {
            color_ =
              cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color.newBuilder(color_).mergeFrom(value).buildPartial();
          } else {
            color_ = value;
          }
          onChanged();
        } else {
          colorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Color color = 6;</code>
       */
      public Builder clearColor() {
        if (colorBuilder_ == null) {
          color_ = cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color.getDefaultInstance();
          onChanged();
        } else {
          colorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Color color = 6;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color.Builder getColorBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getColorFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .gazebo.msgs.Color color = 6;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoColor.ColorOrBuilder getColorOrBuilder() {
        if (colorBuilder_ != null) {
          return colorBuilder_.getMessageOrBuilder();
        } else {
          return color_;
        }
      }
      /**
       * <code>optional .gazebo.msgs.Color color = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color, cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoColor.ColorOrBuilder> 
          getColorFieldBuilder() {
        if (colorBuilder_ == null) {
          colorBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color, cn.autolabor.plugin.gazebo.msgs.ProtoColor.Color.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoColor.ColorOrBuilder>(
                  getColor(),
                  getParentForChildren(),
                  isClean());
          color_ = null;
        }
        return colorBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Shadows)
    }

    static {
      defaultInstance = new Shadows(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Shadows)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Shadows_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_Shadows_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rshadows.proto\022\013gazebo.msgs\032\013color.prot" +
      "o\"\305\001\n\007Shadows\022-\n\004type\030\005 \001(\0162\037.gazebo.msg" +
      "s.Shadows.ShadowType\022!\n\005color\030\006 \001(\0132\022.ga" +
      "zebo.msgs.Color\"h\n\nShadowType\022\024\n\020STENCIL" +
      "_ADDITIVE\020\001\022\026\n\022STENCIL_MODULATIVE\020\002\022\024\n\020T" +
      "EXTURE_ADDITIVE\020\003\022\026\n\022TEXTURE_MODULATIVE\020" +
      "\004B/\n\037cn.autolabor.plugin.gazebo.msgsB\014Pr" +
      "otoShadows"
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
          cn.autolabor.plugin.gazebo.msgs.ProtoColor.getDescriptor(),
        }, assigner);
    internal_static_gazebo_msgs_Shadows_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_Shadows_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_Shadows_descriptor,
        new java.lang.String[] { "Type", "Color", });
    cn.autolabor.plugin.gazebo.msgs.ProtoColor.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
