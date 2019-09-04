// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package cn.autolabor.plugin.gazebo.msgs;

public final class ProtoTest {
  private ProtoTest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.Test)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .gazebo.msgs.Header header = 1;</code>
     */
    boolean hasHeader();
    /**
     * <code>required .gazebo.msgs.Header header = 1;</code>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header getHeader();
    /**
     * <code>required .gazebo.msgs.Header header = 1;</code>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoHeader.HeaderOrBuilder getHeaderOrBuilder();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Test}
   */
  public static final class Test extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.Test)
      TestOrBuilder {
    // Use Test.newBuilder() to construct.
    private Test(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Test(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Test defaultInstance;
    public static Test getDefaultInstance() {
      return defaultInstance;
    }

    public Test getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Test(
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
              cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = header_.toBuilder();
              }
              header_ = input.readMessage(cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(header_);
                header_ = subBuilder.buildPartial();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.autolabor.plugin.gazebo.msgs.ProtoTest.internal_static_gazebo_msgs_Test_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.msgs.ProtoTest.internal_static_gazebo_msgs_Test_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test.class, cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test.Builder.class);
    }

    public static com.google.protobuf.Parser<Test> PARSER =
        new com.google.protobuf.AbstractParser<Test>() {
      public Test parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Test(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Test> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int HEADER_FIELD_NUMBER = 1;
    private cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header header_;
    /**
     * <code>required .gazebo.msgs.Header header = 1;</code>
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .gazebo.msgs.Header header = 1;</code>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header getHeader() {
      return header_;
    }
    /**
     * <code>required .gazebo.msgs.Header header = 1;</code>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoHeader.HeaderOrBuilder getHeaderOrBuilder() {
      return header_;
    }

    private void initFields() {
      header_ = cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasHeader()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getHeader().isInitialized()) {
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
        output.writeMessage(1, header_);
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
          .computeMessageSize(1, header_);
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

    public static cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test prototype) {
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
     * Protobuf type {@code gazebo.msgs.Test}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.Test)
        cn.autolabor.plugin.gazebo.msgs.ProtoTest.TestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoTest.internal_static_gazebo_msgs_Test_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoTest.internal_static_gazebo_msgs_Test_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test.class, cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test.newBuilder()
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
          getHeaderFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (headerBuilder_ == null) {
          header_ = cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header.getDefaultInstance();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoTest.internal_static_gazebo_msgs_Test_descriptor;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test build() {
        cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test buildPartial() {
        cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test result = new cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (headerBuilder_ == null) {
          result.header_ = header_;
        } else {
          result.header_ = headerBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test) {
          return mergeFrom((cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test other) {
        if (other == cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test.getDefaultInstance()) return this;
        if (other.hasHeader()) {
          mergeHeader(other.getHeader());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasHeader()) {
          
          return false;
        }
        if (!getHeader().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.msgs.ProtoTest.Test) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header header_ = cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header, cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoHeader.HeaderOrBuilder> headerBuilder_;
      /**
       * <code>required .gazebo.msgs.Header header = 1;</code>
       */
      public boolean hasHeader() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .gazebo.msgs.Header header = 1;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header getHeader() {
        if (headerBuilder_ == null) {
          return header_;
        } else {
          return headerBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Header header = 1;</code>
       */
      public Builder setHeader(cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header value) {
        if (headerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          header_ = value;
          onChanged();
        } else {
          headerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Header header = 1;</code>
       */
      public Builder setHeader(
          cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header.Builder builderForValue) {
        if (headerBuilder_ == null) {
          header_ = builderForValue.build();
          onChanged();
        } else {
          headerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Header header = 1;</code>
       */
      public Builder mergeHeader(cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header value) {
        if (headerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              header_ != cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header.getDefaultInstance()) {
            header_ =
              cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header.newBuilder(header_).mergeFrom(value).buildPartial();
          } else {
            header_ = value;
          }
          onChanged();
        } else {
          headerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Header header = 1;</code>
       */
      public Builder clearHeader() {
        if (headerBuilder_ == null) {
          header_ = cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header.getDefaultInstance();
          onChanged();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Header header = 1;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header.Builder getHeaderBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHeaderFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Header header = 1;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoHeader.HeaderOrBuilder getHeaderOrBuilder() {
        if (headerBuilder_ != null) {
          return headerBuilder_.getMessageOrBuilder();
        } else {
          return header_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Header header = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header, cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoHeader.HeaderOrBuilder> 
          getHeaderFieldBuilder() {
        if (headerBuilder_ == null) {
          headerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header, cn.autolabor.plugin.gazebo.msgs.ProtoHeader.Header.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoHeader.HeaderOrBuilder>(
                  getHeader(),
                  getParentForChildren(),
                  isClean());
          header_ = null;
        }
        return headerBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Test)
    }

    static {
      defaultInstance = new Test(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Test)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Test_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_Test_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ntest.proto\022\013gazebo.msgs\032\014header.proto\"" +
      "+\n\004Test\022#\n\006header\030\001 \002(\0132\023.gazebo.msgs.He" +
      "aderB,\n\037cn.autolabor.plugin.gazebo.msgsB" +
      "\tProtoTest"
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
          cn.autolabor.plugin.gazebo.msgs.ProtoHeader.getDescriptor(),
        }, assigner);
    internal_static_gazebo_msgs_Test_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_Test_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_Test_descriptor,
        new java.lang.String[] { "Header", });
    cn.autolabor.plugin.gazebo.msgs.ProtoHeader.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
