// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tactile.proto

package cn.autolabor.plugin.gazebo.msgs;

public final class ProtoTactile {
  private ProtoTactile() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TactileOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.Tactile)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated string collision_name = 1;</code>
     */
    com.google.protobuf.ProtocolStringList
        getCollisionNameList();
    /**
     * <code>repeated string collision_name = 1;</code>
     */
    int getCollisionNameCount();
    /**
     * <code>repeated string collision_name = 1;</code>
     */
    java.lang.String getCollisionName(int index);
    /**
     * <code>repeated string collision_name = 1;</code>
     */
    com.google.protobuf.ByteString
        getCollisionNameBytes(int index);

    /**
     * <code>repeated uint32 collision_id = 2;</code>
     */
    java.util.List<java.lang.Integer> getCollisionIdList();
    /**
     * <code>repeated uint32 collision_id = 2;</code>
     */
    int getCollisionIdCount();
    /**
     * <code>repeated uint32 collision_id = 2;</code>
     */
    int getCollisionId(int index);

    /**
     * <code>repeated double pressure = 3;</code>
     */
    java.util.List<java.lang.Double> getPressureList();
    /**
     * <code>repeated double pressure = 3;</code>
     */
    int getPressureCount();
    /**
     * <code>repeated double pressure = 3;</code>
     */
    double getPressure(int index);

    /**
     * <code>required .gazebo.msgs.Time time = 4;</code>
     */
    boolean hasTime();
    /**
     * <code>required .gazebo.msgs.Time time = 4;</code>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time getTime();
    /**
     * <code>required .gazebo.msgs.Time time = 4;</code>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoTime.TimeOrBuilder getTimeOrBuilder();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Tactile}
   */
  public static final class Tactile extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.Tactile)
      TactileOrBuilder {
    // Use Tactile.newBuilder() to construct.
    private Tactile(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Tactile(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Tactile defaultInstance;
    public static Tactile getDefaultInstance() {
      return defaultInstance;
    }

    public Tactile getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Tactile(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                collisionName_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              collisionName_.add(bs);
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                collisionId_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              collisionId_.add(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
                collisionId_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                collisionId_.add(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 25: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                pressure_ = new java.util.ArrayList<java.lang.Double>();
                mutable_bitField0_ |= 0x00000004;
              }
              pressure_.add(input.readDouble());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004) && input.getBytesUntilLimit() > 0) {
                pressure_ = new java.util.ArrayList<java.lang.Double>();
                mutable_bitField0_ |= 0x00000004;
              }
              while (input.getBytesUntilLimit() > 0) {
                pressure_.add(input.readDouble());
              }
              input.popLimit(limit);
              break;
            }
            case 34: {
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
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          collisionName_ = collisionName_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          collisionId_ = java.util.Collections.unmodifiableList(collisionId_);
        }
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          pressure_ = java.util.Collections.unmodifiableList(pressure_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.autolabor.plugin.gazebo.msgs.ProtoTactile.internal_static_gazebo_msgs_Tactile_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.msgs.ProtoTactile.internal_static_gazebo_msgs_Tactile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile.class, cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile.Builder.class);
    }

    public static com.google.protobuf.Parser<Tactile> PARSER =
        new com.google.protobuf.AbstractParser<Tactile>() {
      public Tactile parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Tactile(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Tactile> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int COLLISION_NAME_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList collisionName_;
    /**
     * <code>repeated string collision_name = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getCollisionNameList() {
      return collisionName_;
    }
    /**
     * <code>repeated string collision_name = 1;</code>
     */
    public int getCollisionNameCount() {
      return collisionName_.size();
    }
    /**
     * <code>repeated string collision_name = 1;</code>
     */
    public java.lang.String getCollisionName(int index) {
      return collisionName_.get(index);
    }
    /**
     * <code>repeated string collision_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCollisionNameBytes(int index) {
      return collisionName_.getByteString(index);
    }

    public static final int COLLISION_ID_FIELD_NUMBER = 2;
    private java.util.List<java.lang.Integer> collisionId_;
    /**
     * <code>repeated uint32 collision_id = 2;</code>
     */
    public java.util.List<java.lang.Integer>
        getCollisionIdList() {
      return collisionId_;
    }
    /**
     * <code>repeated uint32 collision_id = 2;</code>
     */
    public int getCollisionIdCount() {
      return collisionId_.size();
    }
    /**
     * <code>repeated uint32 collision_id = 2;</code>
     */
    public int getCollisionId(int index) {
      return collisionId_.get(index);
    }

    public static final int PRESSURE_FIELD_NUMBER = 3;
    private java.util.List<java.lang.Double> pressure_;
    /**
     * <code>repeated double pressure = 3;</code>
     */
    public java.util.List<java.lang.Double>
        getPressureList() {
      return pressure_;
    }
    /**
     * <code>repeated double pressure = 3;</code>
     */
    public int getPressureCount() {
      return pressure_.size();
    }
    /**
     * <code>repeated double pressure = 3;</code>
     */
    public double getPressure(int index) {
      return pressure_.get(index);
    }

    public static final int TIME_FIELD_NUMBER = 4;
    private cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time time_;
    /**
     * <code>required .gazebo.msgs.Time time = 4;</code>
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .gazebo.msgs.Time time = 4;</code>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time getTime() {
      return time_;
    }
    /**
     * <code>required .gazebo.msgs.Time time = 4;</code>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoTime.TimeOrBuilder getTimeOrBuilder() {
      return time_;
    }

    private void initFields() {
      collisionName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      collisionId_ = java.util.Collections.emptyList();
      pressure_ = java.util.Collections.emptyList();
      time_ = cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.getDefaultInstance();
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
      if (!getTime().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < collisionName_.size(); i++) {
        output.writeBytes(1, collisionName_.getByteString(i));
      }
      for (int i = 0; i < collisionId_.size(); i++) {
        output.writeUInt32(2, collisionId_.get(i));
      }
      for (int i = 0; i < pressure_.size(); i++) {
        output.writeDouble(3, pressure_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(4, time_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < collisionName_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(collisionName_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getCollisionNameList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < collisionId_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(collisionId_.get(i));
        }
        size += dataSize;
        size += 1 * getCollisionIdList().size();
      }
      {
        int dataSize = 0;
        dataSize = 8 * getPressureList().size();
        size += dataSize;
        size += 1 * getPressureList().size();
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, time_);
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

    public static cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile prototype) {
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
     * Protobuf type {@code gazebo.msgs.Tactile}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.Tactile)
        cn.autolabor.plugin.gazebo.msgs.ProtoTactile.TactileOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoTactile.internal_static_gazebo_msgs_Tactile_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoTactile.internal_static_gazebo_msgs_Tactile_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile.class, cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile.newBuilder()
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
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        collisionName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        collisionId_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        pressure_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        if (timeBuilder_ == null) {
          time_ = cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.getDefaultInstance();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoTactile.internal_static_gazebo_msgs_Tactile_descriptor;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile build() {
        cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile buildPartial() {
        cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile result = new cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          collisionName_ = collisionName_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.collisionName_ = collisionName_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          collisionId_ = java.util.Collections.unmodifiableList(collisionId_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.collisionId_ = collisionId_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          pressure_ = java.util.Collections.unmodifiableList(pressure_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.pressure_ = pressure_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000001;
        }
        if (timeBuilder_ == null) {
          result.time_ = time_;
        } else {
          result.time_ = timeBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile) {
          return mergeFrom((cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile other) {
        if (other == cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile.getDefaultInstance()) return this;
        if (!other.collisionName_.isEmpty()) {
          if (collisionName_.isEmpty()) {
            collisionName_ = other.collisionName_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCollisionNameIsMutable();
            collisionName_.addAll(other.collisionName_);
          }
          onChanged();
        }
        if (!other.collisionId_.isEmpty()) {
          if (collisionId_.isEmpty()) {
            collisionId_ = other.collisionId_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureCollisionIdIsMutable();
            collisionId_.addAll(other.collisionId_);
          }
          onChanged();
        }
        if (!other.pressure_.isEmpty()) {
          if (pressure_.isEmpty()) {
            pressure_ = other.pressure_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensurePressureIsMutable();
            pressure_.addAll(other.pressure_);
          }
          onChanged();
        }
        if (other.hasTime()) {
          mergeTime(other.getTime());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTime()) {
          
          return false;
        }
        if (!getTime().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.msgs.ProtoTactile.Tactile) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.LazyStringList collisionName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureCollisionNameIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          collisionName_ = new com.google.protobuf.LazyStringArrayList(collisionName_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string collision_name = 1;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getCollisionNameList() {
        return collisionName_.getUnmodifiableView();
      }
      /**
       * <code>repeated string collision_name = 1;</code>
       */
      public int getCollisionNameCount() {
        return collisionName_.size();
      }
      /**
       * <code>repeated string collision_name = 1;</code>
       */
      public java.lang.String getCollisionName(int index) {
        return collisionName_.get(index);
      }
      /**
       * <code>repeated string collision_name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getCollisionNameBytes(int index) {
        return collisionName_.getByteString(index);
      }
      /**
       * <code>repeated string collision_name = 1;</code>
       */
      public Builder setCollisionName(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureCollisionNameIsMutable();
        collisionName_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string collision_name = 1;</code>
       */
      public Builder addCollisionName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureCollisionNameIsMutable();
        collisionName_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string collision_name = 1;</code>
       */
      public Builder addAllCollisionName(
          java.lang.Iterable<java.lang.String> values) {
        ensureCollisionNameIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, collisionName_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string collision_name = 1;</code>
       */
      public Builder clearCollisionName() {
        collisionName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string collision_name = 1;</code>
       */
      public Builder addCollisionNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureCollisionNameIsMutable();
        collisionName_.add(value);
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Integer> collisionId_ = java.util.Collections.emptyList();
      private void ensureCollisionIdIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          collisionId_ = new java.util.ArrayList<java.lang.Integer>(collisionId_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 collision_id = 2;</code>
       */
      public java.util.List<java.lang.Integer>
          getCollisionIdList() {
        return java.util.Collections.unmodifiableList(collisionId_);
      }
      /**
       * <code>repeated uint32 collision_id = 2;</code>
       */
      public int getCollisionIdCount() {
        return collisionId_.size();
      }
      /**
       * <code>repeated uint32 collision_id = 2;</code>
       */
      public int getCollisionId(int index) {
        return collisionId_.get(index);
      }
      /**
       * <code>repeated uint32 collision_id = 2;</code>
       */
      public Builder setCollisionId(
          int index, int value) {
        ensureCollisionIdIsMutable();
        collisionId_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 collision_id = 2;</code>
       */
      public Builder addCollisionId(int value) {
        ensureCollisionIdIsMutable();
        collisionId_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 collision_id = 2;</code>
       */
      public Builder addAllCollisionId(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCollisionIdIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, collisionId_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 collision_id = 2;</code>
       */
      public Builder clearCollisionId() {
        collisionId_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Double> pressure_ = java.util.Collections.emptyList();
      private void ensurePressureIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          pressure_ = new java.util.ArrayList<java.lang.Double>(pressure_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated double pressure = 3;</code>
       */
      public java.util.List<java.lang.Double>
          getPressureList() {
        return java.util.Collections.unmodifiableList(pressure_);
      }
      /**
       * <code>repeated double pressure = 3;</code>
       */
      public int getPressureCount() {
        return pressure_.size();
      }
      /**
       * <code>repeated double pressure = 3;</code>
       */
      public double getPressure(int index) {
        return pressure_.get(index);
      }
      /**
       * <code>repeated double pressure = 3;</code>
       */
      public Builder setPressure(
          int index, double value) {
        ensurePressureIsMutable();
        pressure_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated double pressure = 3;</code>
       */
      public Builder addPressure(double value) {
        ensurePressureIsMutable();
        pressure_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated double pressure = 3;</code>
       */
      public Builder addAllPressure(
          java.lang.Iterable<? extends java.lang.Double> values) {
        ensurePressureIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pressure_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated double pressure = 3;</code>
       */
      public Builder clearPressure() {
        pressure_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }

      private cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time time_ = cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time, cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoTime.TimeOrBuilder> timeBuilder_;
      /**
       * <code>required .gazebo.msgs.Time time = 4;</code>
       */
      public boolean hasTime() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required .gazebo.msgs.Time time = 4;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time getTime() {
        if (timeBuilder_ == null) {
          return time_;
        } else {
          return timeBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Time time = 4;</code>
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
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 4;</code>
       */
      public Builder setTime(
          cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.Builder builderForValue) {
        if (timeBuilder_ == null) {
          time_ = builderForValue.build();
          onChanged();
        } else {
          timeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 4;</code>
       */
      public Builder mergeTime(cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time value) {
        if (timeBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008) &&
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
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 4;</code>
       */
      public Builder clearTime() {
        if (timeBuilder_ == null) {
          time_ = cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.getDefaultInstance();
          onChanged();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 4;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.Builder getTimeBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getTimeFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Time time = 4;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoTime.TimeOrBuilder getTimeOrBuilder() {
        if (timeBuilder_ != null) {
          return timeBuilder_.getMessageOrBuilder();
        } else {
          return time_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Time time = 4;</code>
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

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Tactile)
    }

    static {
      defaultInstance = new Tactile(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Tactile)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Tactile_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_Tactile_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rtactile.proto\022\013gazebo.msgs\032\ntime.proto" +
      "\"j\n\007Tactile\022\026\n\016collision_name\030\001 \003(\t\022\024\n\014c" +
      "ollision_id\030\002 \003(\r\022\020\n\010pressure\030\003 \003(\001\022\037\n\004t" +
      "ime\030\004 \002(\0132\021.gazebo.msgs.TimeB/\n\037cn.autol" +
      "abor.plugin.gazebo.msgsB\014ProtoTactile"
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
        }, assigner);
    internal_static_gazebo_msgs_Tactile_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_Tactile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_Tactile_descriptor,
        new java.lang.String[] { "CollisionName", "CollisionId", "Pressure", "Time", });
    cn.autolabor.plugin.gazebo.msgs.ProtoTime.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
