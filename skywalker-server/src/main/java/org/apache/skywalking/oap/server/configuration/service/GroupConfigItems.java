// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: configuration-service.proto

package org.apache.skywalking.oap.server.configuration.service;

/**
 * Protobuf type {@code GroupConfigItems}
 */
public final class GroupConfigItems extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GroupConfigItems)
    GroupConfigItemsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GroupConfigItems.newBuilder() to construct.
  private GroupConfigItems(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GroupConfigItems() {
    groupName_ = "";
    items_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GroupConfigItems();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GroupConfigItems(
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
            java.lang.String s = input.readStringRequireUtf8();

            groupName_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              items_ = new java.util.ArrayList<org.apache.skywalking.oap.server.configuration.service.Config>();
              mutable_bitField0_ |= 0x00000001;
            }
            items_.add(
                input.readMessage(org.apache.skywalking.oap.server.configuration.service.Config.parser(), extensionRegistry));
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
        items_ = java.util.Collections.unmodifiableList(items_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.skywalking.oap.server.configuration.service.ConfigurationServiceOuterClass.internal_static_GroupConfigItems_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.oap.server.configuration.service.ConfigurationServiceOuterClass.internal_static_GroupConfigItems_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.oap.server.configuration.service.GroupConfigItems.class, org.apache.skywalking.oap.server.configuration.service.GroupConfigItems.Builder.class);
  }

  public static final int GROUPNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object groupName_;
  /**
   * <pre>
   * The name is composed by "module name"."provider name"."groupName".
   * </pre>
   *
   * <code>string groupName = 1;</code>
   * @return The groupName.
   */
  @java.lang.Override
  public java.lang.String getGroupName() {
    java.lang.Object ref = groupName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      groupName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name is composed by "module name"."provider name"."groupName".
   * </pre>
   *
   * <code>string groupName = 1;</code>
   * @return The bytes for groupName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGroupNameBytes() {
    java.lang.Object ref = groupName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      groupName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ITEMS_FIELD_NUMBER = 2;
  private java.util.List<org.apache.skywalking.oap.server.configuration.service.Config> items_;
  /**
   * <code>repeated .Config items = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.apache.skywalking.oap.server.configuration.service.Config> getItemsList() {
    return items_;
  }
  /**
   * <code>repeated .Config items = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.apache.skywalking.oap.server.configuration.service.ConfigOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <code>repeated .Config items = 2;</code>
   */
  @java.lang.Override
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <code>repeated .Config items = 2;</code>
   */
  @java.lang.Override
  public org.apache.skywalking.oap.server.configuration.service.Config getItems(int index) {
    return items_.get(index);
  }
  /**
   * <code>repeated .Config items = 2;</code>
   */
  @java.lang.Override
  public org.apache.skywalking.oap.server.configuration.service.ConfigOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(groupName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupName_);
    }
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(2, items_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(groupName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupName_);
    }
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, items_.get(i));
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
    if (!(obj instanceof org.apache.skywalking.oap.server.configuration.service.GroupConfigItems)) {
      return super.equals(obj);
    }
    org.apache.skywalking.oap.server.configuration.service.GroupConfigItems other = (org.apache.skywalking.oap.server.configuration.service.GroupConfigItems) obj;

    if (!getGroupName()
        .equals(other.getGroupName())) return false;
    if (!getItemsList()
        .equals(other.getItemsList())) return false;
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
    hash = (37 * hash) + GROUPNAME_FIELD_NUMBER;
    hash = (53 * hash) + getGroupName().hashCode();
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.oap.server.configuration.service.GroupConfigItems parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.oap.server.configuration.service.GroupConfigItems parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.oap.server.configuration.service.GroupConfigItems parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.oap.server.configuration.service.GroupConfigItems parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.oap.server.configuration.service.GroupConfigItems parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.oap.server.configuration.service.GroupConfigItems parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.oap.server.configuration.service.GroupConfigItems parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.oap.server.configuration.service.GroupConfigItems parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.oap.server.configuration.service.GroupConfigItems parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.oap.server.configuration.service.GroupConfigItems parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.oap.server.configuration.service.GroupConfigItems parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.oap.server.configuration.service.GroupConfigItems parseFrom(
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
  public static Builder newBuilder(org.apache.skywalking.oap.server.configuration.service.GroupConfigItems prototype) {
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
   * Protobuf type {@code GroupConfigItems}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GroupConfigItems)
      org.apache.skywalking.oap.server.configuration.service.GroupConfigItemsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.oap.server.configuration.service.ConfigurationServiceOuterClass.internal_static_GroupConfigItems_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.oap.server.configuration.service.ConfigurationServiceOuterClass.internal_static_GroupConfigItems_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.oap.server.configuration.service.GroupConfigItems.class, org.apache.skywalking.oap.server.configuration.service.GroupConfigItems.Builder.class);
    }

    // Construct using org.apache.skywalking.oap.server.configuration.service.GroupConfigItems.newBuilder()
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
        getItemsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      groupName_ = "";

      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.oap.server.configuration.service.ConfigurationServiceOuterClass.internal_static_GroupConfigItems_descriptor;
    }

    @java.lang.Override
    public org.apache.skywalking.oap.server.configuration.service.GroupConfigItems getDefaultInstanceForType() {
      return org.apache.skywalking.oap.server.configuration.service.GroupConfigItems.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.skywalking.oap.server.configuration.service.GroupConfigItems build() {
      org.apache.skywalking.oap.server.configuration.service.GroupConfigItems result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.skywalking.oap.server.configuration.service.GroupConfigItems buildPartial() {
      org.apache.skywalking.oap.server.configuration.service.GroupConfigItems result = new org.apache.skywalking.oap.server.configuration.service.GroupConfigItems(this);
      int from_bitField0_ = bitField0_;
      result.groupName_ = groupName_;
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
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
      if (other instanceof org.apache.skywalking.oap.server.configuration.service.GroupConfigItems) {
        return mergeFrom((org.apache.skywalking.oap.server.configuration.service.GroupConfigItems)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.oap.server.configuration.service.GroupConfigItems other) {
      if (other == org.apache.skywalking.oap.server.configuration.service.GroupConfigItems.getDefaultInstance()) return this;
      if (!other.getGroupName().isEmpty()) {
        groupName_ = other.groupName_;
        onChanged();
      }
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
            itemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemsFieldBuilder() : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
          }
        }
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
      org.apache.skywalking.oap.server.configuration.service.GroupConfigItems parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.skywalking.oap.server.configuration.service.GroupConfigItems) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object groupName_ = "";
    /**
     * <pre>
     * The name is composed by "module name"."provider name"."groupName".
     * </pre>
     *
     * <code>string groupName = 1;</code>
     * @return The groupName.
     */
    public java.lang.String getGroupName() {
      java.lang.Object ref = groupName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        groupName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name is composed by "module name"."provider name"."groupName".
     * </pre>
     *
     * <code>string groupName = 1;</code>
     * @return The bytes for groupName.
     */
    public com.google.protobuf.ByteString
        getGroupNameBytes() {
      java.lang.Object ref = groupName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name is composed by "module name"."provider name"."groupName".
     * </pre>
     *
     * <code>string groupName = 1;</code>
     * @param value The groupName to set.
     * @return This builder for chaining.
     */
    public Builder setGroupName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      groupName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name is composed by "module name"."provider name"."groupName".
     * </pre>
     *
     * <code>string groupName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupName() {
      
      groupName_ = getDefaultInstance().getGroupName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name is composed by "module name"."provider name"."groupName".
     * </pre>
     *
     * <code>string groupName = 1;</code>
     * @param value The bytes for groupName to set.
     * @return This builder for chaining.
     */
    public Builder setGroupNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      groupName_ = value;
      onChanged();
      return this;
    }

    private java.util.List<org.apache.skywalking.oap.server.configuration.service.Config> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        items_ = new java.util.ArrayList<org.apache.skywalking.oap.server.configuration.service.Config>(items_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.skywalking.oap.server.configuration.service.Config, org.apache.skywalking.oap.server.configuration.service.Config.Builder, org.apache.skywalking.oap.server.configuration.service.ConfigOrBuilder> itemsBuilder_;

    /**
     * <code>repeated .Config items = 2;</code>
     */
    public java.util.List<org.apache.skywalking.oap.server.configuration.service.Config> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Config items = 2;</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Config items = 2;</code>
     */
    public org.apache.skywalking.oap.server.configuration.service.Config getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Config items = 2;</code>
     */
    public Builder setItems(
        int index, org.apache.skywalking.oap.server.configuration.service.Config value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Config items = 2;</code>
     */
    public Builder setItems(
        int index, org.apache.skywalking.oap.server.configuration.service.Config.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Config items = 2;</code>
     */
    public Builder addItems(org.apache.skywalking.oap.server.configuration.service.Config value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Config items = 2;</code>
     */
    public Builder addItems(
        int index, org.apache.skywalking.oap.server.configuration.service.Config value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Config items = 2;</code>
     */
    public Builder addItems(
        org.apache.skywalking.oap.server.configuration.service.Config.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Config items = 2;</code>
     */
    public Builder addItems(
        int index, org.apache.skywalking.oap.server.configuration.service.Config.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Config items = 2;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends org.apache.skywalking.oap.server.configuration.service.Config> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Config items = 2;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Config items = 2;</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Config items = 2;</code>
     */
    public org.apache.skywalking.oap.server.configuration.service.Config.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Config items = 2;</code>
     */
    public org.apache.skywalking.oap.server.configuration.service.ConfigOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Config items = 2;</code>
     */
    public java.util.List<? extends org.apache.skywalking.oap.server.configuration.service.ConfigOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <code>repeated .Config items = 2;</code>
     */
    public org.apache.skywalking.oap.server.configuration.service.Config.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          org.apache.skywalking.oap.server.configuration.service.Config.getDefaultInstance());
    }
    /**
     * <code>repeated .Config items = 2;</code>
     */
    public org.apache.skywalking.oap.server.configuration.service.Config.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, org.apache.skywalking.oap.server.configuration.service.Config.getDefaultInstance());
    }
    /**
     * <code>repeated .Config items = 2;</code>
     */
    public java.util.List<org.apache.skywalking.oap.server.configuration.service.Config.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.skywalking.oap.server.configuration.service.Config, org.apache.skywalking.oap.server.configuration.service.Config.Builder, org.apache.skywalking.oap.server.configuration.service.ConfigOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.apache.skywalking.oap.server.configuration.service.Config, org.apache.skywalking.oap.server.configuration.service.Config.Builder, org.apache.skywalking.oap.server.configuration.service.ConfigOrBuilder>(
                items_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:GroupConfigItems)
  }

  // @@protoc_insertion_point(class_scope:GroupConfigItems)
  private static final org.apache.skywalking.oap.server.configuration.service.GroupConfigItems DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.oap.server.configuration.service.GroupConfigItems();
  }

  public static org.apache.skywalking.oap.server.configuration.service.GroupConfigItems getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroupConfigItems>
      PARSER = new com.google.protobuf.AbstractParser<GroupConfigItems>() {
    @java.lang.Override
    public GroupConfigItems parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GroupConfigItems(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GroupConfigItems> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroupConfigItems> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.skywalking.oap.server.configuration.service.GroupConfigItems getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

