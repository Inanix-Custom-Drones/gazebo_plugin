// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axis.proto

package cn.autolabor.plugin.gazebo.msgs;

public final class ProtoAxis {
  private ProtoAxis() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AxisOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.Axis)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .gazebo.msgs.Vector3d xyz = 1;</code>
     */
    boolean hasXyz();
    /**
     * <code>required .gazebo.msgs.Vector3d xyz = 1;</code>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d getXyz();
    /**
     * <code>required .gazebo.msgs.Vector3d xyz = 1;</code>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder getXyzOrBuilder();

    /**
     * <code>required double limit_lower = 2;</code>
     */
    boolean hasLimitLower();
    /**
     * <code>required double limit_lower = 2;</code>
     */
    double getLimitLower();

    /**
     * <code>required double limit_upper = 3;</code>
     */
    boolean hasLimitUpper();
    /**
     * <code>required double limit_upper = 3;</code>
     */
    double getLimitUpper();

    /**
     * <code>required double limit_effort = 4;</code>
     */
    boolean hasLimitEffort();
    /**
     * <code>required double limit_effort = 4;</code>
     */
    double getLimitEffort();

    /**
     * <code>required double limit_velocity = 5;</code>
     */
    boolean hasLimitVelocity();
    /**
     * <code>required double limit_velocity = 5;</code>
     */
    double getLimitVelocity();

    /**
     * <code>required double damping = 6;</code>
     */
    boolean hasDamping();
    /**
     * <code>required double damping = 6;</code>
     */
    double getDamping();

    /**
     * <code>required double friction = 7;</code>
     */
    boolean hasFriction();
    /**
     * <code>required double friction = 7;</code>
     */
    double getFriction();

    /**
     * <code>required bool use_parent_model_frame = 8;</code>
     */
    boolean hasUseParentModelFrame();
    /**
     * <code>required bool use_parent_model_frame = 8;</code>
     */
    boolean getUseParentModelFrame();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Axis}
   */
  public static final class Axis extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.Axis)
      AxisOrBuilder {
    // Use Axis.newBuilder() to construct.
    private Axis(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Axis(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Axis defaultInstance;
    public static Axis getDefaultInstance() {
      return defaultInstance;
    }

    public Axis getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Axis(
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
                subBuilder = xyz_.toBuilder();
              }
              xyz_ = input.readMessage(cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(xyz_);
                xyz_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              limitLower_ = input.readDouble();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              limitUpper_ = input.readDouble();
              break;
            }
            case 33: {
              bitField0_ |= 0x00000008;
              limitEffort_ = input.readDouble();
              break;
            }
            case 41: {
              bitField0_ |= 0x00000010;
              limitVelocity_ = input.readDouble();
              break;
            }
            case 49: {
              bitField0_ |= 0x00000020;
              damping_ = input.readDouble();
              break;
            }
            case 57: {
              bitField0_ |= 0x00000040;
              friction_ = input.readDouble();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              useParentModelFrame_ = input.readBool();
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
      return cn.autolabor.plugin.gazebo.msgs.ProtoAxis.internal_static_gazebo_msgs_Axis_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.msgs.ProtoAxis.internal_static_gazebo_msgs_Axis_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis.class, cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis.Builder.class);
    }

    public static com.google.protobuf.Parser<Axis> PARSER =
        new com.google.protobuf.AbstractParser<Axis>() {
      public Axis parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Axis(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Axis> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int XYZ_FIELD_NUMBER = 1;
    private cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d xyz_;
    /**
     * <code>required .gazebo.msgs.Vector3d xyz = 1;</code>
     */
    public boolean hasXyz() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .gazebo.msgs.Vector3d xyz = 1;</code>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d getXyz() {
      return xyz_;
    }
    /**
     * <code>required .gazebo.msgs.Vector3d xyz = 1;</code>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder getXyzOrBuilder() {
      return xyz_;
    }

    public static final int LIMIT_LOWER_FIELD_NUMBER = 2;
    private double limitLower_;
    /**
     * <code>required double limit_lower = 2;</code>
     */
    public boolean hasLimitLower() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required double limit_lower = 2;</code>
     */
    public double getLimitLower() {
      return limitLower_;
    }

    public static final int LIMIT_UPPER_FIELD_NUMBER = 3;
    private double limitUpper_;
    /**
     * <code>required double limit_upper = 3;</code>
     */
    public boolean hasLimitUpper() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required double limit_upper = 3;</code>
     */
    public double getLimitUpper() {
      return limitUpper_;
    }

    public static final int LIMIT_EFFORT_FIELD_NUMBER = 4;
    private double limitEffort_;
    /**
     * <code>required double limit_effort = 4;</code>
     */
    public boolean hasLimitEffort() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required double limit_effort = 4;</code>
     */
    public double getLimitEffort() {
      return limitEffort_;
    }

    public static final int LIMIT_VELOCITY_FIELD_NUMBER = 5;
    private double limitVelocity_;
    /**
     * <code>required double limit_velocity = 5;</code>
     */
    public boolean hasLimitVelocity() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required double limit_velocity = 5;</code>
     */
    public double getLimitVelocity() {
      return limitVelocity_;
    }

    public static final int DAMPING_FIELD_NUMBER = 6;
    private double damping_;
    /**
     * <code>required double damping = 6;</code>
     */
    public boolean hasDamping() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required double damping = 6;</code>
     */
    public double getDamping() {
      return damping_;
    }

    public static final int FRICTION_FIELD_NUMBER = 7;
    private double friction_;
    /**
     * <code>required double friction = 7;</code>
     */
    public boolean hasFriction() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>required double friction = 7;</code>
     */
    public double getFriction() {
      return friction_;
    }

    public static final int USE_PARENT_MODEL_FRAME_FIELD_NUMBER = 8;
    private boolean useParentModelFrame_;
    /**
     * <code>required bool use_parent_model_frame = 8;</code>
     */
    public boolean hasUseParentModelFrame() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>required bool use_parent_model_frame = 8;</code>
     */
    public boolean getUseParentModelFrame() {
      return useParentModelFrame_;
    }

    private void initFields() {
      xyz_ = cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.getDefaultInstance();
      limitLower_ = 0D;
      limitUpper_ = 0D;
      limitEffort_ = 0D;
      limitVelocity_ = 0D;
      damping_ = 0D;
      friction_ = 0D;
      useParentModelFrame_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasXyz()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLimitLower()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLimitUpper()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLimitEffort()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLimitVelocity()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDamping()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFriction()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUseParentModelFrame()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getXyz().isInitialized()) {
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
        output.writeMessage(1, xyz_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeDouble(2, limitLower_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeDouble(3, limitUpper_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeDouble(4, limitEffort_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeDouble(5, limitVelocity_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeDouble(6, damping_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeDouble(7, friction_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeBool(8, useParentModelFrame_);
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
          .computeMessageSize(1, xyz_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, limitLower_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, limitUpper_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, limitEffort_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(5, limitVelocity_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(6, damping_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(7, friction_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, useParentModelFrame_);
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

    public static cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis prototype) {
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
     * Protobuf type {@code gazebo.msgs.Axis}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.Axis)
        cn.autolabor.plugin.gazebo.msgs.ProtoAxis.AxisOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoAxis.internal_static_gazebo_msgs_Axis_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoAxis.internal_static_gazebo_msgs_Axis_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis.class, cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis.newBuilder()
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
          getXyzFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (xyzBuilder_ == null) {
          xyz_ = cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.getDefaultInstance();
        } else {
          xyzBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        limitLower_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        limitUpper_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000004);
        limitEffort_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000008);
        limitVelocity_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000010);
        damping_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000020);
        friction_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000040);
        useParentModelFrame_ = false;
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoAxis.internal_static_gazebo_msgs_Axis_descriptor;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis build() {
        cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis buildPartial() {
        cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis result = new cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (xyzBuilder_ == null) {
          result.xyz_ = xyz_;
        } else {
          result.xyz_ = xyzBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.limitLower_ = limitLower_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.limitUpper_ = limitUpper_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.limitEffort_ = limitEffort_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.limitVelocity_ = limitVelocity_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.damping_ = damping_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.friction_ = friction_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.useParentModelFrame_ = useParentModelFrame_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis) {
          return mergeFrom((cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis other) {
        if (other == cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis.getDefaultInstance()) return this;
        if (other.hasXyz()) {
          mergeXyz(other.getXyz());
        }
        if (other.hasLimitLower()) {
          setLimitLower(other.getLimitLower());
        }
        if (other.hasLimitUpper()) {
          setLimitUpper(other.getLimitUpper());
        }
        if (other.hasLimitEffort()) {
          setLimitEffort(other.getLimitEffort());
        }
        if (other.hasLimitVelocity()) {
          setLimitVelocity(other.getLimitVelocity());
        }
        if (other.hasDamping()) {
          setDamping(other.getDamping());
        }
        if (other.hasFriction()) {
          setFriction(other.getFriction());
        }
        if (other.hasUseParentModelFrame()) {
          setUseParentModelFrame(other.getUseParentModelFrame());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasXyz()) {
          
          return false;
        }
        if (!hasLimitLower()) {
          
          return false;
        }
        if (!hasLimitUpper()) {
          
          return false;
        }
        if (!hasLimitEffort()) {
          
          return false;
        }
        if (!hasLimitVelocity()) {
          
          return false;
        }
        if (!hasDamping()) {
          
          return false;
        }
        if (!hasFriction()) {
          
          return false;
        }
        if (!hasUseParentModelFrame()) {
          
          return false;
        }
        if (!getXyz().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.msgs.ProtoAxis.Axis) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d xyz_ = cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder> xyzBuilder_;
      /**
       * <code>required .gazebo.msgs.Vector3d xyz = 1;</code>
       */
      public boolean hasXyz() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .gazebo.msgs.Vector3d xyz = 1;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d getXyz() {
        if (xyzBuilder_ == null) {
          return xyz_;
        } else {
          return xyzBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector3d xyz = 1;</code>
       */
      public Builder setXyz(cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d value) {
        if (xyzBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          xyz_ = value;
          onChanged();
        } else {
          xyzBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d xyz = 1;</code>
       */
      public Builder setXyz(
          cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder builderForValue) {
        if (xyzBuilder_ == null) {
          xyz_ = builderForValue.build();
          onChanged();
        } else {
          xyzBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d xyz = 1;</code>
       */
      public Builder mergeXyz(cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d value) {
        if (xyzBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              xyz_ != cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.getDefaultInstance()) {
            xyz_ =
              cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.newBuilder(xyz_).mergeFrom(value).buildPartial();
          } else {
            xyz_ = value;
          }
          onChanged();
        } else {
          xyzBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d xyz = 1;</code>
       */
      public Builder clearXyz() {
        if (xyzBuilder_ == null) {
          xyz_ = cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.getDefaultInstance();
          onChanged();
        } else {
          xyzBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d xyz = 1;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder getXyzBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getXyzFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Vector3d xyz = 1;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder getXyzOrBuilder() {
        if (xyzBuilder_ != null) {
          return xyzBuilder_.getMessageOrBuilder();
        } else {
          return xyz_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector3d xyz = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder> 
          getXyzFieldBuilder() {
        if (xyzBuilder_ == null) {
          xyzBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder>(
                  getXyz(),
                  getParentForChildren(),
                  isClean());
          xyz_ = null;
        }
        return xyzBuilder_;
      }

      private double limitLower_ ;
      /**
       * <code>required double limit_lower = 2;</code>
       */
      public boolean hasLimitLower() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required double limit_lower = 2;</code>
       */
      public double getLimitLower() {
        return limitLower_;
      }
      /**
       * <code>required double limit_lower = 2;</code>
       */
      public Builder setLimitLower(double value) {
        bitField0_ |= 0x00000002;
        limitLower_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double limit_lower = 2;</code>
       */
      public Builder clearLimitLower() {
        bitField0_ = (bitField0_ & ~0x00000002);
        limitLower_ = 0D;
        onChanged();
        return this;
      }

      private double limitUpper_ ;
      /**
       * <code>required double limit_upper = 3;</code>
       */
      public boolean hasLimitUpper() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required double limit_upper = 3;</code>
       */
      public double getLimitUpper() {
        return limitUpper_;
      }
      /**
       * <code>required double limit_upper = 3;</code>
       */
      public Builder setLimitUpper(double value) {
        bitField0_ |= 0x00000004;
        limitUpper_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double limit_upper = 3;</code>
       */
      public Builder clearLimitUpper() {
        bitField0_ = (bitField0_ & ~0x00000004);
        limitUpper_ = 0D;
        onChanged();
        return this;
      }

      private double limitEffort_ ;
      /**
       * <code>required double limit_effort = 4;</code>
       */
      public boolean hasLimitEffort() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required double limit_effort = 4;</code>
       */
      public double getLimitEffort() {
        return limitEffort_;
      }
      /**
       * <code>required double limit_effort = 4;</code>
       */
      public Builder setLimitEffort(double value) {
        bitField0_ |= 0x00000008;
        limitEffort_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double limit_effort = 4;</code>
       */
      public Builder clearLimitEffort() {
        bitField0_ = (bitField0_ & ~0x00000008);
        limitEffort_ = 0D;
        onChanged();
        return this;
      }

      private double limitVelocity_ ;
      /**
       * <code>required double limit_velocity = 5;</code>
       */
      public boolean hasLimitVelocity() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required double limit_velocity = 5;</code>
       */
      public double getLimitVelocity() {
        return limitVelocity_;
      }
      /**
       * <code>required double limit_velocity = 5;</code>
       */
      public Builder setLimitVelocity(double value) {
        bitField0_ |= 0x00000010;
        limitVelocity_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double limit_velocity = 5;</code>
       */
      public Builder clearLimitVelocity() {
        bitField0_ = (bitField0_ & ~0x00000010);
        limitVelocity_ = 0D;
        onChanged();
        return this;
      }

      private double damping_ ;
      /**
       * <code>required double damping = 6;</code>
       */
      public boolean hasDamping() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required double damping = 6;</code>
       */
      public double getDamping() {
        return damping_;
      }
      /**
       * <code>required double damping = 6;</code>
       */
      public Builder setDamping(double value) {
        bitField0_ |= 0x00000020;
        damping_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double damping = 6;</code>
       */
      public Builder clearDamping() {
        bitField0_ = (bitField0_ & ~0x00000020);
        damping_ = 0D;
        onChanged();
        return this;
      }

      private double friction_ ;
      /**
       * <code>required double friction = 7;</code>
       */
      public boolean hasFriction() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>required double friction = 7;</code>
       */
      public double getFriction() {
        return friction_;
      }
      /**
       * <code>required double friction = 7;</code>
       */
      public Builder setFriction(double value) {
        bitField0_ |= 0x00000040;
        friction_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double friction = 7;</code>
       */
      public Builder clearFriction() {
        bitField0_ = (bitField0_ & ~0x00000040);
        friction_ = 0D;
        onChanged();
        return this;
      }

      private boolean useParentModelFrame_ ;
      /**
       * <code>required bool use_parent_model_frame = 8;</code>
       */
      public boolean hasUseParentModelFrame() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>required bool use_parent_model_frame = 8;</code>
       */
      public boolean getUseParentModelFrame() {
        return useParentModelFrame_;
      }
      /**
       * <code>required bool use_parent_model_frame = 8;</code>
       */
      public Builder setUseParentModelFrame(boolean value) {
        bitField0_ |= 0x00000080;
        useParentModelFrame_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool use_parent_model_frame = 8;</code>
       */
      public Builder clearUseParentModelFrame() {
        bitField0_ = (bitField0_ & ~0x00000080);
        useParentModelFrame_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Axis)
    }

    static {
      defaultInstance = new Axis(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Axis)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Axis_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_Axis_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\naxis.proto\022\013gazebo.msgs\032\016vector3d.prot" +
      "o\"\305\001\n\004Axis\022\"\n\003xyz\030\001 \002(\0132\025.gazebo.msgs.Ve" +
      "ctor3d\022\023\n\013limit_lower\030\002 \002(\001\022\023\n\013limit_upp" +
      "er\030\003 \002(\001\022\024\n\014limit_effort\030\004 \002(\001\022\026\n\016limit_" +
      "velocity\030\005 \002(\001\022\017\n\007damping\030\006 \002(\001\022\020\n\010frict" +
      "ion\030\007 \002(\001\022\036\n\026use_parent_model_frame\030\010 \002(" +
      "\010B,\n\037cn.autolabor.plugin.gazebo.msgsB\tPr" +
      "otoAxis"
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
    internal_static_gazebo_msgs_Axis_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_Axis_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_Axis_descriptor,
        new java.lang.String[] { "Xyz", "LimitLower", "LimitUpper", "LimitEffort", "LimitVelocity", "Damping", "Friction", "UseParentModelFrame", });
    cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
