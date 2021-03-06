// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CalculatorMsg.proto

package org.tao.pbtest.proto;

public final class CalculatorMsg {
  private CalculatorMsg() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string methodName = 1;
    boolean hasMethodName();
    String getMethodName();
    
    // required int32 num1 = 2;
    boolean hasNum1();
    int getNum1();
    
    // required int32 num2 = 3;
    boolean hasNum2();
    int getNum2();
  }
  public static final class RequestProto extends
      com.google.protobuf.GeneratedMessage
      implements RequestProtoOrBuilder {
    // Use RequestProto.newBuilder() to construct.
    private RequestProto(Builder builder) {
      super(builder);
    }
    private RequestProto(boolean noInit) {}
    
    private static final RequestProto defaultInstance;
    public static RequestProto getDefaultInstance() {
      return defaultInstance;
    }
    
    public RequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tao.pbtest.proto.CalculatorMsg.internal_static_RequestProto_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tao.pbtest.proto.CalculatorMsg.internal_static_RequestProto_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string methodName = 1;
    public static final int METHODNAME_FIELD_NUMBER = 1;
    private java.lang.Object methodName_;
    public boolean hasMethodName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getMethodName() {
      java.lang.Object ref = methodName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          methodName_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getMethodNameBytes() {
      java.lang.Object ref = methodName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        methodName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required int32 num1 = 2;
    public static final int NUM1_FIELD_NUMBER = 2;
    private int num1_;
    public boolean hasNum1() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getNum1() {
      return num1_;
    }
    
    // required int32 num2 = 3;
    public static final int NUM2_FIELD_NUMBER = 3;
    private int num2_;
    public boolean hasNum2() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getNum2() {
      return num2_;
    }
    
    private void initFields() {
      methodName_ = "";
      num1_ = 0;
      num2_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasMethodName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNum1()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNum2()) {
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
        output.writeBytes(1, getMethodNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, num1_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, num2_);
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
          .computeBytesSize(1, getMethodNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, num1_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, num2_);
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
    
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.tao.pbtest.proto.CalculatorMsg.RequestProto)) {
        return super.equals(obj);
      }
      org.tao.pbtest.proto.CalculatorMsg.RequestProto other = (org.tao.pbtest.proto.CalculatorMsg.RequestProto) obj;
      
      boolean result = true;
      result = result && (hasMethodName() == other.hasMethodName());
      if (hasMethodName()) {
        result = result && getMethodName()
            .equals(other.getMethodName());
      }
      result = result && (hasNum1() == other.hasNum1());
      if (hasNum1()) {
        result = result && (getNum1()
            == other.getNum1());
      }
      result = result && (hasNum2() == other.hasNum2());
      if (hasNum2()) {
        result = result && (getNum2()
            == other.getNum2());
      }
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }
    
    @java.lang.Override
    public int hashCode() {
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasMethodName()) {
        hash = (37 * hash) + METHODNAME_FIELD_NUMBER;
        hash = (53 * hash) + getMethodName().hashCode();
      }
      if (hasNum1()) {
        hash = (37 * hash) + NUM1_FIELD_NUMBER;
        hash = (53 * hash) + getNum1();
      }
      if (hasNum2()) {
        hash = (37 * hash) + NUM2_FIELD_NUMBER;
        hash = (53 * hash) + getNum2();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      return hash;
    }
    
    public static org.tao.pbtest.proto.CalculatorMsg.RequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.tao.pbtest.proto.CalculatorMsg.RequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.tao.pbtest.proto.CalculatorMsg.RequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.tao.pbtest.proto.CalculatorMsg.RequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.tao.pbtest.proto.CalculatorMsg.RequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.tao.pbtest.proto.CalculatorMsg.RequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.tao.pbtest.proto.CalculatorMsg.RequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.tao.pbtest.proto.CalculatorMsg.RequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.tao.pbtest.proto.CalculatorMsg.RequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.tao.pbtest.proto.CalculatorMsg.RequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.tao.pbtest.proto.CalculatorMsg.RequestProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.tao.pbtest.proto.CalculatorMsg.RequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tao.pbtest.proto.CalculatorMsg.internal_static_RequestProto_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tao.pbtest.proto.CalculatorMsg.internal_static_RequestProto_fieldAccessorTable;
      }
      
      // Construct using org.tao.pbtest.proto.CalculatorMsg.RequestProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
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
        methodName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        num1_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        num2_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tao.pbtest.proto.CalculatorMsg.RequestProto.getDescriptor();
      }
      
      public org.tao.pbtest.proto.CalculatorMsg.RequestProto getDefaultInstanceForType() {
        return org.tao.pbtest.proto.CalculatorMsg.RequestProto.getDefaultInstance();
      }
      
      public org.tao.pbtest.proto.CalculatorMsg.RequestProto build() {
        org.tao.pbtest.proto.CalculatorMsg.RequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.tao.pbtest.proto.CalculatorMsg.RequestProto buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.tao.pbtest.proto.CalculatorMsg.RequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.tao.pbtest.proto.CalculatorMsg.RequestProto buildPartial() {
        org.tao.pbtest.proto.CalculatorMsg.RequestProto result = new org.tao.pbtest.proto.CalculatorMsg.RequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.methodName_ = methodName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.num1_ = num1_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.num2_ = num2_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tao.pbtest.proto.CalculatorMsg.RequestProto) {
          return mergeFrom((org.tao.pbtest.proto.CalculatorMsg.RequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.tao.pbtest.proto.CalculatorMsg.RequestProto other) {
        if (other == org.tao.pbtest.proto.CalculatorMsg.RequestProto.getDefaultInstance()) return this;
        if (other.hasMethodName()) {
          setMethodName(other.getMethodName());
        }
        if (other.hasNum1()) {
          setNum1(other.getNum1());
        }
        if (other.hasNum2()) {
          setNum2(other.getNum2());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasMethodName()) {
          
          return false;
        }
        if (!hasNum1()) {
          
          return false;
        }
        if (!hasNum2()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              methodName_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              num1_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              num2_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string methodName = 1;
      private java.lang.Object methodName_ = "";
      public boolean hasMethodName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getMethodName() {
        java.lang.Object ref = methodName_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          methodName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setMethodName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        methodName_ = value;
        onChanged();
        return this;
      }
      public Builder clearMethodName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        methodName_ = getDefaultInstance().getMethodName();
        onChanged();
        return this;
      }
      void setMethodName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        methodName_ = value;
        onChanged();
      }
      
      // required int32 num1 = 2;
      private int num1_ ;
      public boolean hasNum1() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getNum1() {
        return num1_;
      }
      public Builder setNum1(int value) {
        bitField0_ |= 0x00000002;
        num1_ = value;
        onChanged();
        return this;
      }
      public Builder clearNum1() {
        bitField0_ = (bitField0_ & ~0x00000002);
        num1_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 num2 = 3;
      private int num2_ ;
      public boolean hasNum2() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getNum2() {
        return num2_;
      }
      public Builder setNum2(int value) {
        bitField0_ |= 0x00000004;
        num2_ = value;
        onChanged();
        return this;
      }
      public Builder clearNum2() {
        bitField0_ = (bitField0_ & ~0x00000004);
        num2_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:RequestProto)
    }
    
    static {
      defaultInstance = new RequestProto(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:RequestProto)
  }
  
  public interface ResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 result = 1;
    boolean hasResult();
    int getResult();
  }
  public static final class ResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements ResponseProtoOrBuilder {
    // Use ResponseProto.newBuilder() to construct.
    private ResponseProto(Builder builder) {
      super(builder);
    }
    private ResponseProto(boolean noInit) {}
    
    private static final ResponseProto defaultInstance;
    public static ResponseProto getDefaultInstance() {
      return defaultInstance;
    }
    
    public ResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tao.pbtest.proto.CalculatorMsg.internal_static_ResponseProto_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tao.pbtest.proto.CalculatorMsg.internal_static_ResponseProto_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 result = 1;
    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getResult() {
      return result_;
    }
    
    private void initFields() {
      result_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasResult()) {
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
        output.writeInt32(1, result_);
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
          .computeInt32Size(1, result_);
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
    
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.tao.pbtest.proto.CalculatorMsg.ResponseProto)) {
        return super.equals(obj);
      }
      org.tao.pbtest.proto.CalculatorMsg.ResponseProto other = (org.tao.pbtest.proto.CalculatorMsg.ResponseProto) obj;
      
      boolean result = true;
      result = result && (hasResult() == other.hasResult());
      if (hasResult()) {
        result = result && (getResult()
            == other.getResult());
      }
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }
    
    @java.lang.Override
    public int hashCode() {
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasResult()) {
        hash = (37 * hash) + RESULT_FIELD_NUMBER;
        hash = (53 * hash) + getResult();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      return hash;
    }
    
    public static org.tao.pbtest.proto.CalculatorMsg.ResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.tao.pbtest.proto.CalculatorMsg.ResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.tao.pbtest.proto.CalculatorMsg.ResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.tao.pbtest.proto.CalculatorMsg.ResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.tao.pbtest.proto.CalculatorMsg.ResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.tao.pbtest.proto.CalculatorMsg.ResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.tao.pbtest.proto.CalculatorMsg.ResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.tao.pbtest.proto.CalculatorMsg.ResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.tao.pbtest.proto.CalculatorMsg.ResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.tao.pbtest.proto.CalculatorMsg.ResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.tao.pbtest.proto.CalculatorMsg.ResponseProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.tao.pbtest.proto.CalculatorMsg.ResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tao.pbtest.proto.CalculatorMsg.internal_static_ResponseProto_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tao.pbtest.proto.CalculatorMsg.internal_static_ResponseProto_fieldAccessorTable;
      }
      
      // Construct using org.tao.pbtest.proto.CalculatorMsg.ResponseProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
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
        result_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tao.pbtest.proto.CalculatorMsg.ResponseProto.getDescriptor();
      }
      
      public org.tao.pbtest.proto.CalculatorMsg.ResponseProto getDefaultInstanceForType() {
        return org.tao.pbtest.proto.CalculatorMsg.ResponseProto.getDefaultInstance();
      }
      
      public org.tao.pbtest.proto.CalculatorMsg.ResponseProto build() {
        org.tao.pbtest.proto.CalculatorMsg.ResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.tao.pbtest.proto.CalculatorMsg.ResponseProto buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.tao.pbtest.proto.CalculatorMsg.ResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.tao.pbtest.proto.CalculatorMsg.ResponseProto buildPartial() {
        org.tao.pbtest.proto.CalculatorMsg.ResponseProto result = new org.tao.pbtest.proto.CalculatorMsg.ResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.result_ = result_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tao.pbtest.proto.CalculatorMsg.ResponseProto) {
          return mergeFrom((org.tao.pbtest.proto.CalculatorMsg.ResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.tao.pbtest.proto.CalculatorMsg.ResponseProto other) {
        if (other == org.tao.pbtest.proto.CalculatorMsg.ResponseProto.getDefaultInstance()) return this;
        if (other.hasResult()) {
          setResult(other.getResult());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasResult()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              result_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 result = 1;
      private int result_ ;
      public boolean hasResult() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getResult() {
        return result_;
      }
      public Builder setResult(int value) {
        bitField0_ |= 0x00000001;
        result_ = value;
        onChanged();
        return this;
      }
      public Builder clearResult() {
        bitField0_ = (bitField0_ & ~0x00000001);
        result_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:ResponseProto)
    }
    
    static {
      defaultInstance = new ResponseProto(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:ResponseProto)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_RequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ResponseProto_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023CalculatorMsg.proto\">\n\014RequestProto\022\022\n" +
      "\nmethodName\030\001 \002(\t\022\014\n\004num1\030\002 \002(\005\022\014\n\004num2\030" +
      "\003 \002(\005\"\037\n\rResponseProto\022\016\n\006result\030\001 \002(\005B+" +
      "\n\024org.tao.pbtest.protoB\rCalculatorMsg\210\001\001" +
      "\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_RequestProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_RequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_RequestProto_descriptor,
              new java.lang.String[] { "MethodName", "Num1", "Num2", },
              org.tao.pbtest.proto.CalculatorMsg.RequestProto.class,
              org.tao.pbtest.proto.CalculatorMsg.RequestProto.Builder.class);
          internal_static_ResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_ResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ResponseProto_descriptor,
              new java.lang.String[] { "Result", },
              org.tao.pbtest.proto.CalculatorMsg.ResponseProto.class,
              org.tao.pbtest.proto.CalculatorMsg.ResponseProto.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
