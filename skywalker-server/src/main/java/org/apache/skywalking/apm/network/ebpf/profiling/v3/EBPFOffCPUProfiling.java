// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ebpf/profiling/Profile.proto

package org.apache.skywalking.apm.network.ebpf.profiling.v3;

/**
 * Protobuf type {@code skywalking.v3.EBPFOffCPUProfiling}
 */
public final class EBPFOffCPUProfiling extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:skywalking.v3.EBPFOffCPUProfiling)
    EBPFOffCPUProfilingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EBPFOffCPUProfiling.newBuilder() to construct.
  private EBPFOffCPUProfiling(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EBPFOffCPUProfiling() {
    stacks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EBPFOffCPUProfiling();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EBPFOffCPUProfiling(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              stacks_ = new java.util.ArrayList<org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata>();
              mutable_bitField0_ |= 0x00000001;
            }
            stacks_.add(
                input.readMessage(org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata.parser(), extensionRegistry));
            break;
          }
          case 16: {

            switchCount_ = input.readInt32();
            break;
          }
          case 24: {

            duration_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        stacks_ = java.util.Collections.unmodifiableList(stacks_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.skywalking.apm.network.ebpf.profiling.v3.Profile.internal_static_skywalking_v3_EBPFOffCPUProfiling_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.apm.network.ebpf.profiling.v3.Profile.internal_static_skywalking_v3_EBPFOffCPUProfiling_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling.class, org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling.Builder.class);
  }

  public static final int STACKS_FIELD_NUMBER = 1;
  private java.util.List<org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata> stacks_;
  /**
   * <pre>
   * stack data in one task(thread)
   * </pre>
   *
   * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata> getStacksList() {
    return stacks_;
  }
  /**
   * <pre>
   * stack data in one task(thread)
   * </pre>
   *
   * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadataOrBuilder> 
      getStacksOrBuilderList() {
    return stacks_;
  }
  /**
   * <pre>
   * stack data in one task(thread)
   * </pre>
   *
   * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
   */
  @java.lang.Override
  public int getStacksCount() {
    return stacks_.size();
  }
  /**
   * <pre>
   * stack data in one task(thread)
   * </pre>
   *
   * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
   */
  @java.lang.Override
  public org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata getStacks(int index) {
    return stacks_.get(index);
  }
  /**
   * <pre>
   * stack data in one task(thread)
   * </pre>
   *
   * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
   */
  @java.lang.Override
  public org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadataOrBuilder getStacksOrBuilder(
      int index) {
    return stacks_.get(index);
  }

  public static final int SWITCHCOUNT_FIELD_NUMBER = 2;
  private int switchCount_;
  /**
   * <pre>
   * total count of the process is switched to off cpu by the scheduler.
   * </pre>
   *
   * <code>int32 switchCount = 2;</code>
   * @return The switchCount.
   */
  @java.lang.Override
  public int getSwitchCount() {
    return switchCount_;
  }

  public static final int DURATION_FIELD_NUMBER = 3;
  private long duration_;
  /**
   * <pre>
   * where time(nanoseconds) is spent waiting while blocked on I/O, locks, timers, paging/swapping, etc.
   * </pre>
   *
   * <code>int64 duration = 3;</code>
   * @return The duration.
   */
  @java.lang.Override
  public long getDuration() {
    return duration_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < stacks_.size(); i++) {
      output.writeMessage(1, stacks_.get(i));
    }
    if (switchCount_ != 0) {
      output.writeInt32(2, switchCount_);
    }
    if (duration_ != 0L) {
      output.writeInt64(3, duration_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < stacks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, stacks_.get(i));
    }
    if (switchCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, switchCount_);
    }
    if (duration_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, duration_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling)) {
      return super.equals(obj);
    }
    org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling other = (org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling) obj;

    if (!getStacksList()
        .equals(other.getStacksList())) return false;
    if (getSwitchCount()
        != other.getSwitchCount()) return false;
    if (getDuration()
        != other.getDuration()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getStacksCount() > 0) {
      hash = (37 * hash) + STACKS_FIELD_NUMBER;
      hash = (53 * hash) + getStacksList().hashCode();
    }
    hash = (37 * hash) + SWITCHCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getSwitchCount();
    hash = (37 * hash) + DURATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDuration());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code skywalking.v3.EBPFOffCPUProfiling}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:skywalking.v3.EBPFOffCPUProfiling)
      org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfilingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.apm.network.ebpf.profiling.v3.Profile.internal_static_skywalking_v3_EBPFOffCPUProfiling_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.apm.network.ebpf.profiling.v3.Profile.internal_static_skywalking_v3_EBPFOffCPUProfiling_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling.class, org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling.Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getStacksFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (stacksBuilder_ == null) {
        stacks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        stacksBuilder_.clear();
      }
      switchCount_ = 0;

      duration_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.apm.network.ebpf.profiling.v3.Profile.internal_static_skywalking_v3_EBPFOffCPUProfiling_descriptor;
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling getDefaultInstanceForType() {
      return org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling build() {
      org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling buildPartial() {
      org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling result = new org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling(this);
      int from_bitField0_ = bitField0_;
      if (stacksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          stacks_ = java.util.Collections.unmodifiableList(stacks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.stacks_ = stacks_;
      } else {
        result.stacks_ = stacksBuilder_.build();
      }
      result.switchCount_ = switchCount_;
      result.duration_ = duration_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling) {
        return mergeFrom((org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling other) {
      if (other == org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling.getDefaultInstance()) return this;
      if (stacksBuilder_ == null) {
        if (!other.stacks_.isEmpty()) {
          if (stacks_.isEmpty()) {
            stacks_ = other.stacks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStacksIsMutable();
            stacks_.addAll(other.stacks_);
          }
          onChanged();
        }
      } else {
        if (!other.stacks_.isEmpty()) {
          if (stacksBuilder_.isEmpty()) {
            stacksBuilder_.dispose();
            stacksBuilder_ = null;
            stacks_ = other.stacks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            stacksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStacksFieldBuilder() : null;
          } else {
            stacksBuilder_.addAllMessages(other.stacks_);
          }
        }
      }
      if (other.getSwitchCount() != 0) {
        setSwitchCount(other.getSwitchCount());
      }
      if (other.getDuration() != 0L) {
        setDuration(other.getDuration());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata> stacks_ =
      java.util.Collections.emptyList();
    private void ensureStacksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        stacks_ = new java.util.ArrayList<org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata>(stacks_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata, org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata.Builder, org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadataOrBuilder> stacksBuilder_;

    /**
     * <pre>
     * stack data in one task(thread)
     * </pre>
     *
     * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
     */
    public java.util.List<org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata> getStacksList() {
      if (stacksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(stacks_);
      } else {
        return stacksBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * stack data in one task(thread)
     * </pre>
     *
     * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
     */
    public int getStacksCount() {
      if (stacksBuilder_ == null) {
        return stacks_.size();
      } else {
        return stacksBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * stack data in one task(thread)
     * </pre>
     *
     * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
     */
    public org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata getStacks(int index) {
      if (stacksBuilder_ == null) {
        return stacks_.get(index);
      } else {
        return stacksBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * stack data in one task(thread)
     * </pre>
     *
     * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
     */
    public Builder setStacks(
        int index, org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata value) {
      if (stacksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStacksIsMutable();
        stacks_.set(index, value);
        onChanged();
      } else {
        stacksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * stack data in one task(thread)
     * </pre>
     *
     * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
     */
    public Builder setStacks(
        int index, org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata.Builder builderForValue) {
      if (stacksBuilder_ == null) {
        ensureStacksIsMutable();
        stacks_.set(index, builderForValue.build());
        onChanged();
      } else {
        stacksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * stack data in one task(thread)
     * </pre>
     *
     * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
     */
    public Builder addStacks(org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata value) {
      if (stacksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStacksIsMutable();
        stacks_.add(value);
        onChanged();
      } else {
        stacksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * stack data in one task(thread)
     * </pre>
     *
     * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
     */
    public Builder addStacks(
        int index, org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata value) {
      if (stacksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStacksIsMutable();
        stacks_.add(index, value);
        onChanged();
      } else {
        stacksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * stack data in one task(thread)
     * </pre>
     *
     * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
     */
    public Builder addStacks(
        org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata.Builder builderForValue) {
      if (stacksBuilder_ == null) {
        ensureStacksIsMutable();
        stacks_.add(builderForValue.build());
        onChanged();
      } else {
        stacksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * stack data in one task(thread)
     * </pre>
     *
     * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
     */
    public Builder addStacks(
        int index, org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata.Builder builderForValue) {
      if (stacksBuilder_ == null) {
        ensureStacksIsMutable();
        stacks_.add(index, builderForValue.build());
        onChanged();
      } else {
        stacksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * stack data in one task(thread)
     * </pre>
     *
     * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
     */
    public Builder addAllStacks(
        java.lang.Iterable<? extends org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata> values) {
      if (stacksBuilder_ == null) {
        ensureStacksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, stacks_);
        onChanged();
      } else {
        stacksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * stack data in one task(thread)
     * </pre>
     *
     * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
     */
    public Builder clearStacks() {
      if (stacksBuilder_ == null) {
        stacks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        stacksBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * stack data in one task(thread)
     * </pre>
     *
     * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
     */
    public Builder removeStacks(int index) {
      if (stacksBuilder_ == null) {
        ensureStacksIsMutable();
        stacks_.remove(index);
        onChanged();
      } else {
        stacksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * stack data in one task(thread)
     * </pre>
     *
     * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
     */
    public org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata.Builder getStacksBuilder(
        int index) {
      return getStacksFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * stack data in one task(thread)
     * </pre>
     *
     * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
     */
    public org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadataOrBuilder getStacksOrBuilder(
        int index) {
      if (stacksBuilder_ == null) {
        return stacks_.get(index);  } else {
        return stacksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * stack data in one task(thread)
     * </pre>
     *
     * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
     */
    public java.util.List<? extends org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadataOrBuilder> 
         getStacksOrBuilderList() {
      if (stacksBuilder_ != null) {
        return stacksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(stacks_);
      }
    }
    /**
     * <pre>
     * stack data in one task(thread)
     * </pre>
     *
     * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
     */
    public org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata.Builder addStacksBuilder() {
      return getStacksFieldBuilder().addBuilder(
          org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata.getDefaultInstance());
    }
    /**
     * <pre>
     * stack data in one task(thread)
     * </pre>
     *
     * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
     */
    public org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata.Builder addStacksBuilder(
        int index) {
      return getStacksFieldBuilder().addBuilder(
          index, org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata.getDefaultInstance());
    }
    /**
     * <pre>
     * stack data in one task(thread)
     * </pre>
     *
     * <code>repeated .skywalking.v3.EBPFProfilingStackMetadata stacks = 1;</code>
     */
    public java.util.List<org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata.Builder> 
         getStacksBuilderList() {
      return getStacksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata, org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata.Builder, org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadataOrBuilder> 
        getStacksFieldBuilder() {
      if (stacksBuilder_ == null) {
        stacksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata, org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadata.Builder, org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingStackMetadataOrBuilder>(
                stacks_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        stacks_ = null;
      }
      return stacksBuilder_;
    }

    private int switchCount_ ;
    /**
     * <pre>
     * total count of the process is switched to off cpu by the scheduler.
     * </pre>
     *
     * <code>int32 switchCount = 2;</code>
     * @return The switchCount.
     */
    @java.lang.Override
    public int getSwitchCount() {
      return switchCount_;
    }
    /**
     * <pre>
     * total count of the process is switched to off cpu by the scheduler.
     * </pre>
     *
     * <code>int32 switchCount = 2;</code>
     * @param value The switchCount to set.
     * @return This builder for chaining.
     */
    public Builder setSwitchCount(int value) {
      
      switchCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * total count of the process is switched to off cpu by the scheduler.
     * </pre>
     *
     * <code>int32 switchCount = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSwitchCount() {
      
      switchCount_ = 0;
      onChanged();
      return this;
    }

    private long duration_ ;
    /**
     * <pre>
     * where time(nanoseconds) is spent waiting while blocked on I/O, locks, timers, paging/swapping, etc.
     * </pre>
     *
     * <code>int64 duration = 3;</code>
     * @return The duration.
     */
    @java.lang.Override
    public long getDuration() {
      return duration_;
    }
    /**
     * <pre>
     * where time(nanoseconds) is spent waiting while blocked on I/O, locks, timers, paging/swapping, etc.
     * </pre>
     *
     * <code>int64 duration = 3;</code>
     * @param value The duration to set.
     * @return This builder for chaining.
     */
    public Builder setDuration(long value) {
      
      duration_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * where time(nanoseconds) is spent waiting while blocked on I/O, locks, timers, paging/swapping, etc.
     * </pre>
     *
     * <code>int64 duration = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDuration() {
      
      duration_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:skywalking.v3.EBPFOffCPUProfiling)
  }

  // @@protoc_insertion_point(class_scope:skywalking.v3.EBPFOffCPUProfiling)
  private static final org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling();
  }

  public static org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EBPFOffCPUProfiling>
      PARSER = new com.google.protobuf.AbstractParser<EBPFOffCPUProfiling>() {
    @java.lang.Override
    public EBPFOffCPUProfiling parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EBPFOffCPUProfiling(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EBPFOffCPUProfiling> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EBPFOffCPUProfiling> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOffCPUProfiling getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

