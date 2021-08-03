// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/indicator.proto

package com.google.cloud.securitycenter.v1;

/**
 * <pre>
 * Represents what's commonly known as an Indicator of compromise (IoC) in
 * computer forensics. This is an artifact observed on a network or in an
 * operating system that, with high confidence, indicates a computer intrusion.
 * Reference: https://en.wikipedia.org/wiki/Indicator_of_compromise
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.Indicator}
 */
public final class Indicator extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.Indicator)
    IndicatorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Indicator.newBuilder() to construct.
  private Indicator(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Indicator() {
    ipAddresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    domains_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Indicator();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Indicator(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              ipAddresses_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            ipAddresses_.add(s);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              domains_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            domains_.add(s);
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
        ipAddresses_ = ipAddresses_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        domains_ = domains_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.securitycenter.v1.IndicatorProto.internal_static_google_cloud_securitycenter_v1_Indicator_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.IndicatorProto.internal_static_google_cloud_securitycenter_v1_Indicator_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.Indicator.class, com.google.cloud.securitycenter.v1.Indicator.Builder.class);
  }

  public static final int IP_ADDRESSES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList ipAddresses_;
  /**
   * <pre>
   * List of ip addresses associated to the Finding.
   * </pre>
   *
   * <code>repeated string ip_addresses = 1;</code>
   * @return A list containing the ipAddresses.
   */
  public com.google.protobuf.ProtocolStringList
      getIpAddressesList() {
    return ipAddresses_;
  }
  /**
   * <pre>
   * List of ip addresses associated to the Finding.
   * </pre>
   *
   * <code>repeated string ip_addresses = 1;</code>
   * @return The count of ipAddresses.
   */
  public int getIpAddressesCount() {
    return ipAddresses_.size();
  }
  /**
   * <pre>
   * List of ip addresses associated to the Finding.
   * </pre>
   *
   * <code>repeated string ip_addresses = 1;</code>
   * @param index The index of the element to return.
   * @return The ipAddresses at the given index.
   */
  public java.lang.String getIpAddresses(int index) {
    return ipAddresses_.get(index);
  }
  /**
   * <pre>
   * List of ip addresses associated to the Finding.
   * </pre>
   *
   * <code>repeated string ip_addresses = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the ipAddresses at the given index.
   */
  public com.google.protobuf.ByteString
      getIpAddressesBytes(int index) {
    return ipAddresses_.getByteString(index);
  }

  public static final int DOMAINS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList domains_;
  /**
   * <pre>
   * List of domains associated to the Finding.
   * </pre>
   *
   * <code>repeated string domains = 2;</code>
   * @return A list containing the domains.
   */
  public com.google.protobuf.ProtocolStringList
      getDomainsList() {
    return domains_;
  }
  /**
   * <pre>
   * List of domains associated to the Finding.
   * </pre>
   *
   * <code>repeated string domains = 2;</code>
   * @return The count of domains.
   */
  public int getDomainsCount() {
    return domains_.size();
  }
  /**
   * <pre>
   * List of domains associated to the Finding.
   * </pre>
   *
   * <code>repeated string domains = 2;</code>
   * @param index The index of the element to return.
   * @return The domains at the given index.
   */
  public java.lang.String getDomains(int index) {
    return domains_.get(index);
  }
  /**
   * <pre>
   * List of domains associated to the Finding.
   * </pre>
   *
   * <code>repeated string domains = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the domains at the given index.
   */
  public com.google.protobuf.ByteString
      getDomainsBytes(int index) {
    return domains_.getByteString(index);
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
    for (int i = 0; i < ipAddresses_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ipAddresses_.getRaw(i));
    }
    for (int i = 0; i < domains_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, domains_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < ipAddresses_.size(); i++) {
        dataSize += computeStringSizeNoTag(ipAddresses_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getIpAddressesList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < domains_.size(); i++) {
        dataSize += computeStringSizeNoTag(domains_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDomainsList().size();
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.Indicator)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.Indicator other = (com.google.cloud.securitycenter.v1.Indicator) obj;

    if (!getIpAddressesList()
        .equals(other.getIpAddressesList())) return false;
    if (!getDomainsList()
        .equals(other.getDomainsList())) return false;
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
    if (getIpAddressesCount() > 0) {
      hash = (37 * hash) + IP_ADDRESSES_FIELD_NUMBER;
      hash = (53 * hash) + getIpAddressesList().hashCode();
    }
    if (getDomainsCount() > 0) {
      hash = (37 * hash) + DOMAINS_FIELD_NUMBER;
      hash = (53 * hash) + getDomainsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.Indicator parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1.Indicator parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.Indicator parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1.Indicator parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.Indicator parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1.Indicator parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.Indicator parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1.Indicator parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.Indicator parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1.Indicator parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.Indicator parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1.Indicator parseFrom(
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
  public static Builder newBuilder(com.google.cloud.securitycenter.v1.Indicator prototype) {
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
   * Represents what's commonly known as an Indicator of compromise (IoC) in
   * computer forensics. This is an artifact observed on a network or in an
   * operating system that, with high confidence, indicates a computer intrusion.
   * Reference: https://en.wikipedia.org/wiki/Indicator_of_compromise
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.Indicator}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.Indicator)
      com.google.cloud.securitycenter.v1.IndicatorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.securitycenter.v1.IndicatorProto.internal_static_google_cloud_securitycenter_v1_Indicator_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.IndicatorProto.internal_static_google_cloud_securitycenter_v1_Indicator_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.Indicator.class, com.google.cloud.securitycenter.v1.Indicator.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1.Indicator.newBuilder()
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
      ipAddresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      domains_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.IndicatorProto.internal_static_google_cloud_securitycenter_v1_Indicator_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.Indicator getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.Indicator.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.Indicator build() {
      com.google.cloud.securitycenter.v1.Indicator result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.Indicator buildPartial() {
      com.google.cloud.securitycenter.v1.Indicator result = new com.google.cloud.securitycenter.v1.Indicator(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        ipAddresses_ = ipAddresses_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ipAddresses_ = ipAddresses_;
      if (((bitField0_ & 0x00000002) != 0)) {
        domains_ = domains_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.domains_ = domains_;
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
      if (other instanceof com.google.cloud.securitycenter.v1.Indicator) {
        return mergeFrom((com.google.cloud.securitycenter.v1.Indicator)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1.Indicator other) {
      if (other == com.google.cloud.securitycenter.v1.Indicator.getDefaultInstance()) return this;
      if (!other.ipAddresses_.isEmpty()) {
        if (ipAddresses_.isEmpty()) {
          ipAddresses_ = other.ipAddresses_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIpAddressesIsMutable();
          ipAddresses_.addAll(other.ipAddresses_);
        }
        onChanged();
      }
      if (!other.domains_.isEmpty()) {
        if (domains_.isEmpty()) {
          domains_ = other.domains_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureDomainsIsMutable();
          domains_.addAll(other.domains_);
        }
        onChanged();
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
      com.google.cloud.securitycenter.v1.Indicator parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.securitycenter.v1.Indicator) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList ipAddresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureIpAddressesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ipAddresses_ = new com.google.protobuf.LazyStringArrayList(ipAddresses_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * List of ip addresses associated to the Finding.
     * </pre>
     *
     * <code>repeated string ip_addresses = 1;</code>
     * @return A list containing the ipAddresses.
     */
    public com.google.protobuf.ProtocolStringList
        getIpAddressesList() {
      return ipAddresses_.getUnmodifiableView();
    }
    /**
     * <pre>
     * List of ip addresses associated to the Finding.
     * </pre>
     *
     * <code>repeated string ip_addresses = 1;</code>
     * @return The count of ipAddresses.
     */
    public int getIpAddressesCount() {
      return ipAddresses_.size();
    }
    /**
     * <pre>
     * List of ip addresses associated to the Finding.
     * </pre>
     *
     * <code>repeated string ip_addresses = 1;</code>
     * @param index The index of the element to return.
     * @return The ipAddresses at the given index.
     */
    public java.lang.String getIpAddresses(int index) {
      return ipAddresses_.get(index);
    }
    /**
     * <pre>
     * List of ip addresses associated to the Finding.
     * </pre>
     *
     * <code>repeated string ip_addresses = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the ipAddresses at the given index.
     */
    public com.google.protobuf.ByteString
        getIpAddressesBytes(int index) {
      return ipAddresses_.getByteString(index);
    }
    /**
     * <pre>
     * List of ip addresses associated to the Finding.
     * </pre>
     *
     * <code>repeated string ip_addresses = 1;</code>
     * @param index The index to set the value at.
     * @param value The ipAddresses to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddresses(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureIpAddressesIsMutable();
      ipAddresses_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of ip addresses associated to the Finding.
     * </pre>
     *
     * <code>repeated string ip_addresses = 1;</code>
     * @param value The ipAddresses to add.
     * @return This builder for chaining.
     */
    public Builder addIpAddresses(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureIpAddressesIsMutable();
      ipAddresses_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of ip addresses associated to the Finding.
     * </pre>
     *
     * <code>repeated string ip_addresses = 1;</code>
     * @param values The ipAddresses to add.
     * @return This builder for chaining.
     */
    public Builder addAllIpAddresses(
        java.lang.Iterable<java.lang.String> values) {
      ensureIpAddressesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ipAddresses_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of ip addresses associated to the Finding.
     * </pre>
     *
     * <code>repeated string ip_addresses = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIpAddresses() {
      ipAddresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of ip addresses associated to the Finding.
     * </pre>
     *
     * <code>repeated string ip_addresses = 1;</code>
     * @param value The bytes of the ipAddresses to add.
     * @return This builder for chaining.
     */
    public Builder addIpAddressesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureIpAddressesIsMutable();
      ipAddresses_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList domains_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDomainsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        domains_ = new com.google.protobuf.LazyStringArrayList(domains_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * List of domains associated to the Finding.
     * </pre>
     *
     * <code>repeated string domains = 2;</code>
     * @return A list containing the domains.
     */
    public com.google.protobuf.ProtocolStringList
        getDomainsList() {
      return domains_.getUnmodifiableView();
    }
    /**
     * <pre>
     * List of domains associated to the Finding.
     * </pre>
     *
     * <code>repeated string domains = 2;</code>
     * @return The count of domains.
     */
    public int getDomainsCount() {
      return domains_.size();
    }
    /**
     * <pre>
     * List of domains associated to the Finding.
     * </pre>
     *
     * <code>repeated string domains = 2;</code>
     * @param index The index of the element to return.
     * @return The domains at the given index.
     */
    public java.lang.String getDomains(int index) {
      return domains_.get(index);
    }
    /**
     * <pre>
     * List of domains associated to the Finding.
     * </pre>
     *
     * <code>repeated string domains = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the domains at the given index.
     */
    public com.google.protobuf.ByteString
        getDomainsBytes(int index) {
      return domains_.getByteString(index);
    }
    /**
     * <pre>
     * List of domains associated to the Finding.
     * </pre>
     *
     * <code>repeated string domains = 2;</code>
     * @param index The index to set the value at.
     * @param value The domains to set.
     * @return This builder for chaining.
     */
    public Builder setDomains(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDomainsIsMutable();
      domains_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of domains associated to the Finding.
     * </pre>
     *
     * <code>repeated string domains = 2;</code>
     * @param value The domains to add.
     * @return This builder for chaining.
     */
    public Builder addDomains(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDomainsIsMutable();
      domains_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of domains associated to the Finding.
     * </pre>
     *
     * <code>repeated string domains = 2;</code>
     * @param values The domains to add.
     * @return This builder for chaining.
     */
    public Builder addAllDomains(
        java.lang.Iterable<java.lang.String> values) {
      ensureDomainsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, domains_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of domains associated to the Finding.
     * </pre>
     *
     * <code>repeated string domains = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDomains() {
      domains_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of domains associated to the Finding.
     * </pre>
     *
     * <code>repeated string domains = 2;</code>
     * @param value The bytes of the domains to add.
     * @return This builder for chaining.
     */
    public Builder addDomainsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureDomainsIsMutable();
      domains_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.Indicator)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.Indicator)
  private static final com.google.cloud.securitycenter.v1.Indicator DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.Indicator();
  }

  public static com.google.cloud.securitycenter.v1.Indicator getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Indicator>
      PARSER = new com.google.protobuf.AbstractParser<Indicator>() {
    @java.lang.Override
    public Indicator parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Indicator(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Indicator> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Indicator> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.Indicator getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

