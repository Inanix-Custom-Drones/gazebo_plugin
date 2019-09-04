// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pointcloud.proto

package cn.autolabor.plugin.gazebo.msgs;

public final class ProtoPointcloud {
  private ProtoPointcloud() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PointCloudOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.PointCloud)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
     */
    java.util.List<cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d> 
        getPointsList();
    /**
     * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d getPoints(int index);
    /**
     * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
     */
    int getPointsCount();
    /**
     * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
     */
    java.util.List<? extends cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder> 
        getPointsOrBuilderList();
    /**
     * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder getPointsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code gazebo.msgs.PointCloud}
   */
  public static final class PointCloud extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.PointCloud)
      PointCloudOrBuilder {
    // Use PointCloud.newBuilder() to construct.
    private PointCloud(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PointCloud(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PointCloud defaultInstance;
    public static PointCloud getDefaultInstance() {
      return defaultInstance;
    }

    public PointCloud getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PointCloud(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                points_ = new java.util.ArrayList<cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d>();
                mutable_bitField0_ |= 0x00000001;
              }
              points_.add(input.readMessage(cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.PARSER, extensionRegistry));
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
          points_ = java.util.Collections.unmodifiableList(points_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.internal_static_gazebo_msgs_PointCloud_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.internal_static_gazebo_msgs_PointCloud_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud.class, cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud.Builder.class);
    }

    public static com.google.protobuf.Parser<PointCloud> PARSER =
        new com.google.protobuf.AbstractParser<PointCloud>() {
      public PointCloud parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PointCloud(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PointCloud> getParserForType() {
      return PARSER;
    }

    public static final int POINTS_FIELD_NUMBER = 1;
    private java.util.List<cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d> points_;
    /**
     * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
     */
    public java.util.List<cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d> getPointsList() {
      return points_;
    }
    /**
     * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
     */
    public java.util.List<? extends cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder> 
        getPointsOrBuilderList() {
      return points_;
    }
    /**
     * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
     */
    public int getPointsCount() {
      return points_.size();
    }
    /**
     * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d getPoints(int index) {
      return points_.get(index);
    }
    /**
     * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder getPointsOrBuilder(
        int index) {
      return points_.get(index);
    }

    private void initFields() {
      points_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getPointsCount(); i++) {
        if (!getPoints(i).isInitialized()) {
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
      for (int i = 0; i < points_.size(); i++) {
        output.writeMessage(1, points_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < points_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, points_.get(i));
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

    public static cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud prototype) {
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
     * Protobuf type {@code gazebo.msgs.PointCloud}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.PointCloud)
        cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloudOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.internal_static_gazebo_msgs_PointCloud_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.internal_static_gazebo_msgs_PointCloud_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud.class, cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud.newBuilder()
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
          getPointsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (pointsBuilder_ == null) {
          points_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          pointsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.internal_static_gazebo_msgs_PointCloud_descriptor;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud build() {
        cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud buildPartial() {
        cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud result = new cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud(this);
        int from_bitField0_ = bitField0_;
        if (pointsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            points_ = java.util.Collections.unmodifiableList(points_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.points_ = points_;
        } else {
          result.points_ = pointsBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud) {
          return mergeFrom((cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud other) {
        if (other == cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud.getDefaultInstance()) return this;
        if (pointsBuilder_ == null) {
          if (!other.points_.isEmpty()) {
            if (points_.isEmpty()) {
              points_ = other.points_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePointsIsMutable();
              points_.addAll(other.points_);
            }
            onChanged();
          }
        } else {
          if (!other.points_.isEmpty()) {
            if (pointsBuilder_.isEmpty()) {
              pointsBuilder_.dispose();
              pointsBuilder_ = null;
              points_ = other.points_;
              bitField0_ = (bitField0_ & ~0x00000001);
              pointsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getPointsFieldBuilder() : null;
            } else {
              pointsBuilder_.addAllMessages(other.points_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getPointsCount(); i++) {
          if (!getPoints(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.msgs.ProtoPointcloud.PointCloud) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d> points_ =
        java.util.Collections.emptyList();
      private void ensurePointsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          points_ = new java.util.ArrayList<cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d>(points_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder> pointsBuilder_;

      /**
       * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
       */
      public java.util.List<cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d> getPointsList() {
        if (pointsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(points_);
        } else {
          return pointsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
       */
      public int getPointsCount() {
        if (pointsBuilder_ == null) {
          return points_.size();
        } else {
          return pointsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d getPoints(int index) {
        if (pointsBuilder_ == null) {
          return points_.get(index);
        } else {
          return pointsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
       */
      public Builder setPoints(
          int index, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d value) {
        if (pointsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePointsIsMutable();
          points_.set(index, value);
          onChanged();
        } else {
          pointsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
       */
      public Builder setPoints(
          int index, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder builderForValue) {
        if (pointsBuilder_ == null) {
          ensurePointsIsMutable();
          points_.set(index, builderForValue.build());
          onChanged();
        } else {
          pointsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
       */
      public Builder addPoints(cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d value) {
        if (pointsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePointsIsMutable();
          points_.add(value);
          onChanged();
        } else {
          pointsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
       */
      public Builder addPoints(
          int index, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d value) {
        if (pointsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePointsIsMutable();
          points_.add(index, value);
          onChanged();
        } else {
          pointsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
       */
      public Builder addPoints(
          cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder builderForValue) {
        if (pointsBuilder_ == null) {
          ensurePointsIsMutable();
          points_.add(builderForValue.build());
          onChanged();
        } else {
          pointsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
       */
      public Builder addPoints(
          int index, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder builderForValue) {
        if (pointsBuilder_ == null) {
          ensurePointsIsMutable();
          points_.add(index, builderForValue.build());
          onChanged();
        } else {
          pointsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
       */
      public Builder addAllPoints(
          java.lang.Iterable<? extends cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d> values) {
        if (pointsBuilder_ == null) {
          ensurePointsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, points_);
          onChanged();
        } else {
          pointsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
       */
      public Builder clearPoints() {
        if (pointsBuilder_ == null) {
          points_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          pointsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
       */
      public Builder removePoints(int index) {
        if (pointsBuilder_ == null) {
          ensurePointsIsMutable();
          points_.remove(index);
          onChanged();
        } else {
          pointsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder getPointsBuilder(
          int index) {
        return getPointsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder getPointsOrBuilder(
          int index) {
        if (pointsBuilder_ == null) {
          return points_.get(index);  } else {
          return pointsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
       */
      public java.util.List<? extends cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder> 
           getPointsOrBuilderList() {
        if (pointsBuilder_ != null) {
          return pointsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(points_);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder addPointsBuilder() {
        return getPointsFieldBuilder().addBuilder(
            cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder addPointsBuilder(
          int index) {
        return getPointsFieldBuilder().addBuilder(
            index, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d points = 1;</code>
       */
      public java.util.List<cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder> 
           getPointsBuilderList() {
        return getPointsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder> 
          getPointsFieldBuilder() {
        if (pointsBuilder_ == null) {
          pointsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3dOrBuilder>(
                  points_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          points_ = null;
        }
        return pointsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.PointCloud)
    }

    static {
      defaultInstance = new PointCloud(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.PointCloud)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_PointCloud_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_PointCloud_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020pointcloud.proto\022\013gazebo.msgs\032\016vector3" +
      "d.proto\"3\n\nPointCloud\022%\n\006points\030\001 \003(\0132\025." +
      "gazebo.msgs.Vector3dB2\n\037cn.autolabor.plu" +
      "gin.gazebo.msgsB\017ProtoPointcloud"
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
    internal_static_gazebo_msgs_PointCloud_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_PointCloud_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_PointCloud_descriptor,
        new java.lang.String[] { "Points", });
    cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
