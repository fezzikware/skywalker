// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/base.proto

package io.envoyproxy.envoy.config.core.v3;

/**
 * <pre>
 * Async data source which support async data fetch.
 * </pre>
 *
 * Protobuf type {@code envoy.config.core.v3.AsyncDataSource}
 */
public final class AsyncDataSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.core.v3.AsyncDataSource)
    AsyncDataSourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AsyncDataSource.newBuilder() to construct.
  private AsyncDataSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AsyncDataSource() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AsyncDataSource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AsyncDataSource(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            io.envoyproxy.envoy.config.core.v3.DataSource.Builder subBuilder = null;
            if (specifierCase_ == 1) {
              subBuilder = ((io.envoyproxy.envoy.config.core.v3.DataSource) specifier_).toBuilder();
            }
            specifier_ =
                input.readMessage(io.envoyproxy.envoy.config.core.v3.DataSource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.envoyproxy.envoy.config.core.v3.DataSource) specifier_);
              specifier_ = subBuilder.buildPartial();
            }
            specifierCase_ = 1;
            break;
          }
          case 18: {
            io.envoyproxy.envoy.config.core.v3.RemoteDataSource.Builder subBuilder = null;
            if (specifierCase_ == 2) {
              subBuilder = ((io.envoyproxy.envoy.config.core.v3.RemoteDataSource) specifier_).toBuilder();
            }
            specifier_ =
                input.readMessage(io.envoyproxy.envoy.config.core.v3.RemoteDataSource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.envoyproxy.envoy.config.core.v3.RemoteDataSource) specifier_);
              specifier_ = subBuilder.buildPartial();
            }
            specifierCase_ = 2;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_AsyncDataSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_AsyncDataSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.core.v3.AsyncDataSource.class, io.envoyproxy.envoy.config.core.v3.AsyncDataSource.Builder.class);
  }

  private int specifierCase_ = 0;
  private java.lang.Object specifier_;
  public enum SpecifierCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    LOCAL(1),
    REMOTE(2),
    SPECIFIER_NOT_SET(0);
    private final int value;
    private SpecifierCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SpecifierCase valueOf(int value) {
      return forNumber(value);
    }

    public static SpecifierCase forNumber(int value) {
      switch (value) {
        case 1: return LOCAL;
        case 2: return REMOTE;
        case 0: return SPECIFIER_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SpecifierCase
  getSpecifierCase() {
    return SpecifierCase.forNumber(
        specifierCase_);
  }

  public static final int LOCAL_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Local async data source.
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource local = 1;</code>
   * @return Whether the local field is set.
   */
  @java.lang.Override
  public boolean hasLocal() {
    return specifierCase_ == 1;
  }
  /**
   * <pre>
   * Local async data source.
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource local = 1;</code>
   * @return The local.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.DataSource getLocal() {
    if (specifierCase_ == 1) {
       return (io.envoyproxy.envoy.config.core.v3.DataSource) specifier_;
    }
    return io.envoyproxy.envoy.config.core.v3.DataSource.getDefaultInstance();
  }
  /**
   * <pre>
   * Local async data source.
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource local = 1;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.DataSourceOrBuilder getLocalOrBuilder() {
    if (specifierCase_ == 1) {
       return (io.envoyproxy.envoy.config.core.v3.DataSource) specifier_;
    }
    return io.envoyproxy.envoy.config.core.v3.DataSource.getDefaultInstance();
  }

  public static final int REMOTE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Remote async data source.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RemoteDataSource remote = 2;</code>
   * @return Whether the remote field is set.
   */
  @java.lang.Override
  public boolean hasRemote() {
    return specifierCase_ == 2;
  }
  /**
   * <pre>
   * Remote async data source.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RemoteDataSource remote = 2;</code>
   * @return The remote.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.RemoteDataSource getRemote() {
    if (specifierCase_ == 2) {
       return (io.envoyproxy.envoy.config.core.v3.RemoteDataSource) specifier_;
    }
    return io.envoyproxy.envoy.config.core.v3.RemoteDataSource.getDefaultInstance();
  }
  /**
   * <pre>
   * Remote async data source.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RemoteDataSource remote = 2;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.RemoteDataSourceOrBuilder getRemoteOrBuilder() {
    if (specifierCase_ == 2) {
       return (io.envoyproxy.envoy.config.core.v3.RemoteDataSource) specifier_;
    }
    return io.envoyproxy.envoy.config.core.v3.RemoteDataSource.getDefaultInstance();
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
    if (specifierCase_ == 1) {
      output.writeMessage(1, (io.envoyproxy.envoy.config.core.v3.DataSource) specifier_);
    }
    if (specifierCase_ == 2) {
      output.writeMessage(2, (io.envoyproxy.envoy.config.core.v3.RemoteDataSource) specifier_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (specifierCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (io.envoyproxy.envoy.config.core.v3.DataSource) specifier_);
    }
    if (specifierCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (io.envoyproxy.envoy.config.core.v3.RemoteDataSource) specifier_);
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
    if (!(obj instanceof io.envoyproxy.envoy.config.core.v3.AsyncDataSource)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.core.v3.AsyncDataSource other = (io.envoyproxy.envoy.config.core.v3.AsyncDataSource) obj;

    if (!getSpecifierCase().equals(other.getSpecifierCase())) return false;
    switch (specifierCase_) {
      case 1:
        if (!getLocal()
            .equals(other.getLocal())) return false;
        break;
      case 2:
        if (!getRemote()
            .equals(other.getRemote())) return false;
        break;
      case 0:
      default:
    }
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
    switch (specifierCase_) {
      case 1:
        hash = (37 * hash) + LOCAL_FIELD_NUMBER;
        hash = (53 * hash) + getLocal().hashCode();
        break;
      case 2:
        hash = (37 * hash) + REMOTE_FIELD_NUMBER;
        hash = (53 * hash) + getRemote().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.core.v3.AsyncDataSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.AsyncDataSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.AsyncDataSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.AsyncDataSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.AsyncDataSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.AsyncDataSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.AsyncDataSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.AsyncDataSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.AsyncDataSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.AsyncDataSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.AsyncDataSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.AsyncDataSource parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.core.v3.AsyncDataSource prototype) {
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
   * <pre>
   * Async data source which support async data fetch.
   * </pre>
   *
   * Protobuf type {@code envoy.config.core.v3.AsyncDataSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.core.v3.AsyncDataSource)
      io.envoyproxy.envoy.config.core.v3.AsyncDataSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_AsyncDataSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_AsyncDataSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.core.v3.AsyncDataSource.class, io.envoyproxy.envoy.config.core.v3.AsyncDataSource.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.core.v3.AsyncDataSource.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      specifierCase_ = 0;
      specifier_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_AsyncDataSource_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.AsyncDataSource getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.core.v3.AsyncDataSource.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.AsyncDataSource build() {
      io.envoyproxy.envoy.config.core.v3.AsyncDataSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.AsyncDataSource buildPartial() {
      io.envoyproxy.envoy.config.core.v3.AsyncDataSource result = new io.envoyproxy.envoy.config.core.v3.AsyncDataSource(this);
      if (specifierCase_ == 1) {
        if (localBuilder_ == null) {
          result.specifier_ = specifier_;
        } else {
          result.specifier_ = localBuilder_.build();
        }
      }
      if (specifierCase_ == 2) {
        if (remoteBuilder_ == null) {
          result.specifier_ = specifier_;
        } else {
          result.specifier_ = remoteBuilder_.build();
        }
      }
      result.specifierCase_ = specifierCase_;
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
      if (other instanceof io.envoyproxy.envoy.config.core.v3.AsyncDataSource) {
        return mergeFrom((io.envoyproxy.envoy.config.core.v3.AsyncDataSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.core.v3.AsyncDataSource other) {
      if (other == io.envoyproxy.envoy.config.core.v3.AsyncDataSource.getDefaultInstance()) return this;
      switch (other.getSpecifierCase()) {
        case LOCAL: {
          mergeLocal(other.getLocal());
          break;
        }
        case REMOTE: {
          mergeRemote(other.getRemote());
          break;
        }
        case SPECIFIER_NOT_SET: {
          break;
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
      io.envoyproxy.envoy.config.core.v3.AsyncDataSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.config.core.v3.AsyncDataSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int specifierCase_ = 0;
    private java.lang.Object specifier_;
    public SpecifierCase
        getSpecifierCase() {
      return SpecifierCase.forNumber(
          specifierCase_);
    }

    public Builder clearSpecifier() {
      specifierCase_ = 0;
      specifier_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.DataSource, io.envoyproxy.envoy.config.core.v3.DataSource.Builder, io.envoyproxy.envoy.config.core.v3.DataSourceOrBuilder> localBuilder_;
    /**
     * <pre>
     * Local async data source.
     * </pre>
     *
     * <code>.envoy.config.core.v3.DataSource local = 1;</code>
     * @return Whether the local field is set.
     */
    @java.lang.Override
    public boolean hasLocal() {
      return specifierCase_ == 1;
    }
    /**
     * <pre>
     * Local async data source.
     * </pre>
     *
     * <code>.envoy.config.core.v3.DataSource local = 1;</code>
     * @return The local.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.DataSource getLocal() {
      if (localBuilder_ == null) {
        if (specifierCase_ == 1) {
          return (io.envoyproxy.envoy.config.core.v3.DataSource) specifier_;
        }
        return io.envoyproxy.envoy.config.core.v3.DataSource.getDefaultInstance();
      } else {
        if (specifierCase_ == 1) {
          return localBuilder_.getMessage();
        }
        return io.envoyproxy.envoy.config.core.v3.DataSource.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Local async data source.
     * </pre>
     *
     * <code>.envoy.config.core.v3.DataSource local = 1;</code>
     */
    public Builder setLocal(io.envoyproxy.envoy.config.core.v3.DataSource value) {
      if (localBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        specifier_ = value;
        onChanged();
      } else {
        localBuilder_.setMessage(value);
      }
      specifierCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Local async data source.
     * </pre>
     *
     * <code>.envoy.config.core.v3.DataSource local = 1;</code>
     */
    public Builder setLocal(
        io.envoyproxy.envoy.config.core.v3.DataSource.Builder builderForValue) {
      if (localBuilder_ == null) {
        specifier_ = builderForValue.build();
        onChanged();
      } else {
        localBuilder_.setMessage(builderForValue.build());
      }
      specifierCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Local async data source.
     * </pre>
     *
     * <code>.envoy.config.core.v3.DataSource local = 1;</code>
     */
    public Builder mergeLocal(io.envoyproxy.envoy.config.core.v3.DataSource value) {
      if (localBuilder_ == null) {
        if (specifierCase_ == 1 &&
            specifier_ != io.envoyproxy.envoy.config.core.v3.DataSource.getDefaultInstance()) {
          specifier_ = io.envoyproxy.envoy.config.core.v3.DataSource.newBuilder((io.envoyproxy.envoy.config.core.v3.DataSource) specifier_)
              .mergeFrom(value).buildPartial();
        } else {
          specifier_ = value;
        }
        onChanged();
      } else {
        if (specifierCase_ == 1) {
          localBuilder_.mergeFrom(value);
        }
        localBuilder_.setMessage(value);
      }
      specifierCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Local async data source.
     * </pre>
     *
     * <code>.envoy.config.core.v3.DataSource local = 1;</code>
     */
    public Builder clearLocal() {
      if (localBuilder_ == null) {
        if (specifierCase_ == 1) {
          specifierCase_ = 0;
          specifier_ = null;
          onChanged();
        }
      } else {
        if (specifierCase_ == 1) {
          specifierCase_ = 0;
          specifier_ = null;
        }
        localBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Local async data source.
     * </pre>
     *
     * <code>.envoy.config.core.v3.DataSource local = 1;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.DataSource.Builder getLocalBuilder() {
      return getLocalFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Local async data source.
     * </pre>
     *
     * <code>.envoy.config.core.v3.DataSource local = 1;</code>
     */
    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.DataSourceOrBuilder getLocalOrBuilder() {
      if ((specifierCase_ == 1) && (localBuilder_ != null)) {
        return localBuilder_.getMessageOrBuilder();
      } else {
        if (specifierCase_ == 1) {
          return (io.envoyproxy.envoy.config.core.v3.DataSource) specifier_;
        }
        return io.envoyproxy.envoy.config.core.v3.DataSource.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Local async data source.
     * </pre>
     *
     * <code>.envoy.config.core.v3.DataSource local = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.DataSource, io.envoyproxy.envoy.config.core.v3.DataSource.Builder, io.envoyproxy.envoy.config.core.v3.DataSourceOrBuilder> 
        getLocalFieldBuilder() {
      if (localBuilder_ == null) {
        if (!(specifierCase_ == 1)) {
          specifier_ = io.envoyproxy.envoy.config.core.v3.DataSource.getDefaultInstance();
        }
        localBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.core.v3.DataSource, io.envoyproxy.envoy.config.core.v3.DataSource.Builder, io.envoyproxy.envoy.config.core.v3.DataSourceOrBuilder>(
                (io.envoyproxy.envoy.config.core.v3.DataSource) specifier_,
                getParentForChildren(),
                isClean());
        specifier_ = null;
      }
      specifierCase_ = 1;
      onChanged();;
      return localBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.RemoteDataSource, io.envoyproxy.envoy.config.core.v3.RemoteDataSource.Builder, io.envoyproxy.envoy.config.core.v3.RemoteDataSourceOrBuilder> remoteBuilder_;
    /**
     * <pre>
     * Remote async data source.
     * </pre>
     *
     * <code>.envoy.config.core.v3.RemoteDataSource remote = 2;</code>
     * @return Whether the remote field is set.
     */
    @java.lang.Override
    public boolean hasRemote() {
      return specifierCase_ == 2;
    }
    /**
     * <pre>
     * Remote async data source.
     * </pre>
     *
     * <code>.envoy.config.core.v3.RemoteDataSource remote = 2;</code>
     * @return The remote.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.RemoteDataSource getRemote() {
      if (remoteBuilder_ == null) {
        if (specifierCase_ == 2) {
          return (io.envoyproxy.envoy.config.core.v3.RemoteDataSource) specifier_;
        }
        return io.envoyproxy.envoy.config.core.v3.RemoteDataSource.getDefaultInstance();
      } else {
        if (specifierCase_ == 2) {
          return remoteBuilder_.getMessage();
        }
        return io.envoyproxy.envoy.config.core.v3.RemoteDataSource.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Remote async data source.
     * </pre>
     *
     * <code>.envoy.config.core.v3.RemoteDataSource remote = 2;</code>
     */
    public Builder setRemote(io.envoyproxy.envoy.config.core.v3.RemoteDataSource value) {
      if (remoteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        specifier_ = value;
        onChanged();
      } else {
        remoteBuilder_.setMessage(value);
      }
      specifierCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Remote async data source.
     * </pre>
     *
     * <code>.envoy.config.core.v3.RemoteDataSource remote = 2;</code>
     */
    public Builder setRemote(
        io.envoyproxy.envoy.config.core.v3.RemoteDataSource.Builder builderForValue) {
      if (remoteBuilder_ == null) {
        specifier_ = builderForValue.build();
        onChanged();
      } else {
        remoteBuilder_.setMessage(builderForValue.build());
      }
      specifierCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Remote async data source.
     * </pre>
     *
     * <code>.envoy.config.core.v3.RemoteDataSource remote = 2;</code>
     */
    public Builder mergeRemote(io.envoyproxy.envoy.config.core.v3.RemoteDataSource value) {
      if (remoteBuilder_ == null) {
        if (specifierCase_ == 2 &&
            specifier_ != io.envoyproxy.envoy.config.core.v3.RemoteDataSource.getDefaultInstance()) {
          specifier_ = io.envoyproxy.envoy.config.core.v3.RemoteDataSource.newBuilder((io.envoyproxy.envoy.config.core.v3.RemoteDataSource) specifier_)
              .mergeFrom(value).buildPartial();
        } else {
          specifier_ = value;
        }
        onChanged();
      } else {
        if (specifierCase_ == 2) {
          remoteBuilder_.mergeFrom(value);
        }
        remoteBuilder_.setMessage(value);
      }
      specifierCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Remote async data source.
     * </pre>
     *
     * <code>.envoy.config.core.v3.RemoteDataSource remote = 2;</code>
     */
    public Builder clearRemote() {
      if (remoteBuilder_ == null) {
        if (specifierCase_ == 2) {
          specifierCase_ = 0;
          specifier_ = null;
          onChanged();
        }
      } else {
        if (specifierCase_ == 2) {
          specifierCase_ = 0;
          specifier_ = null;
        }
        remoteBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Remote async data source.
     * </pre>
     *
     * <code>.envoy.config.core.v3.RemoteDataSource remote = 2;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.RemoteDataSource.Builder getRemoteBuilder() {
      return getRemoteFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Remote async data source.
     * </pre>
     *
     * <code>.envoy.config.core.v3.RemoteDataSource remote = 2;</code>
     */
    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.RemoteDataSourceOrBuilder getRemoteOrBuilder() {
      if ((specifierCase_ == 2) && (remoteBuilder_ != null)) {
        return remoteBuilder_.getMessageOrBuilder();
      } else {
        if (specifierCase_ == 2) {
          return (io.envoyproxy.envoy.config.core.v3.RemoteDataSource) specifier_;
        }
        return io.envoyproxy.envoy.config.core.v3.RemoteDataSource.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Remote async data source.
     * </pre>
     *
     * <code>.envoy.config.core.v3.RemoteDataSource remote = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.RemoteDataSource, io.envoyproxy.envoy.config.core.v3.RemoteDataSource.Builder, io.envoyproxy.envoy.config.core.v3.RemoteDataSourceOrBuilder> 
        getRemoteFieldBuilder() {
      if (remoteBuilder_ == null) {
        if (!(specifierCase_ == 2)) {
          specifier_ = io.envoyproxy.envoy.config.core.v3.RemoteDataSource.getDefaultInstance();
        }
        remoteBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.core.v3.RemoteDataSource, io.envoyproxy.envoy.config.core.v3.RemoteDataSource.Builder, io.envoyproxy.envoy.config.core.v3.RemoteDataSourceOrBuilder>(
                (io.envoyproxy.envoy.config.core.v3.RemoteDataSource) specifier_,
                getParentForChildren(),
                isClean());
        specifier_ = null;
      }
      specifierCase_ = 2;
      onChanged();;
      return remoteBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.core.v3.AsyncDataSource)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.core.v3.AsyncDataSource)
  private static final io.envoyproxy.envoy.config.core.v3.AsyncDataSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.core.v3.AsyncDataSource();
  }

  public static io.envoyproxy.envoy.config.core.v3.AsyncDataSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AsyncDataSource>
      PARSER = new com.google.protobuf.AbstractParser<AsyncDataSource>() {
    @java.lang.Override
    public AsyncDataSource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AsyncDataSource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AsyncDataSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AsyncDataSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.AsyncDataSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
