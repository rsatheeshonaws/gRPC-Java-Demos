// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transfer-service.proto

package org.example.proto1.models;

/**
 * Protobuf type {@code service.TransferResponse}
 */
public final class TransferResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service.TransferResponse)
    TransferResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransferResponse.newBuilder() to construct.
  private TransferResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransferResponse() {
    status_ = 0;
    accounts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TransferResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TransferResponse(
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
          case 8: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              accounts_ = new java.util.ArrayList<org.example.proto1.models.Account>();
              mutable_bitField0_ |= 0x00000001;
            }
            accounts_.add(
                input.readMessage(org.example.proto1.models.Account.parser(), extensionRegistry));
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        accounts_ = java.util.Collections.unmodifiableList(accounts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.proto1.models.TransferServiceOuterClass.internal_static_service_TransferResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.proto1.models.TransferServiceOuterClass.internal_static_service_TransferResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.proto1.models.TransferResponse.class, org.example.proto1.models.TransferResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.service.TransferStatus status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.service.TransferStatus status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public org.example.proto1.models.TransferStatus getStatus() {
    @SuppressWarnings("deprecation")
    org.example.proto1.models.TransferStatus result = org.example.proto1.models.TransferStatus.valueOf(status_);
    return result == null ? org.example.proto1.models.TransferStatus.UNRECOGNIZED : result;
  }

  public static final int ACCOUNTS_FIELD_NUMBER = 2;
  private java.util.List<org.example.proto1.models.Account> accounts_;
  /**
   * <code>repeated .service.Account accounts = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.example.proto1.models.Account> getAccountsList() {
    return accounts_;
  }
  /**
   * <code>repeated .service.Account accounts = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.example.proto1.models.AccountOrBuilder> 
      getAccountsOrBuilderList() {
    return accounts_;
  }
  /**
   * <code>repeated .service.Account accounts = 2;</code>
   */
  @java.lang.Override
  public int getAccountsCount() {
    return accounts_.size();
  }
  /**
   * <code>repeated .service.Account accounts = 2;</code>
   */
  @java.lang.Override
  public org.example.proto1.models.Account getAccounts(int index) {
    return accounts_.get(index);
  }
  /**
   * <code>repeated .service.Account accounts = 2;</code>
   */
  @java.lang.Override
  public org.example.proto1.models.AccountOrBuilder getAccountsOrBuilder(
      int index) {
    return accounts_.get(index);
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
    if (status_ != org.example.proto1.models.TransferStatus.FAILED.getNumber()) {
      output.writeEnum(1, status_);
    }
    for (int i = 0; i < accounts_.size(); i++) {
      output.writeMessage(2, accounts_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != org.example.proto1.models.TransferStatus.FAILED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    for (int i = 0; i < accounts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, accounts_.get(i));
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
    if (!(obj instanceof org.example.proto1.models.TransferResponse)) {
      return super.equals(obj);
    }
    org.example.proto1.models.TransferResponse other = (org.example.proto1.models.TransferResponse) obj;

    if (status_ != other.status_) return false;
    if (!getAccountsList()
        .equals(other.getAccountsList())) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (getAccountsCount() > 0) {
      hash = (37 * hash) + ACCOUNTS_FIELD_NUMBER;
      hash = (53 * hash) + getAccountsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.proto1.models.TransferResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.proto1.models.TransferResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.proto1.models.TransferResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.proto1.models.TransferResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.proto1.models.TransferResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.proto1.models.TransferResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.proto1.models.TransferResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.proto1.models.TransferResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.proto1.models.TransferResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.example.proto1.models.TransferResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.proto1.models.TransferResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.proto1.models.TransferResponse parseFrom(
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
  public static Builder newBuilder(org.example.proto1.models.TransferResponse prototype) {
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
   * Protobuf type {@code service.TransferResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service.TransferResponse)
      org.example.proto1.models.TransferResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.proto1.models.TransferServiceOuterClass.internal_static_service_TransferResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.proto1.models.TransferServiceOuterClass.internal_static_service_TransferResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.proto1.models.TransferResponse.class, org.example.proto1.models.TransferResponse.Builder.class);
    }

    // Construct using org.example.proto1.models.TransferResponse.newBuilder()
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
        getAccountsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0;

      if (accountsBuilder_ == null) {
        accounts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        accountsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.proto1.models.TransferServiceOuterClass.internal_static_service_TransferResponse_descriptor;
    }

    @java.lang.Override
    public org.example.proto1.models.TransferResponse getDefaultInstanceForType() {
      return org.example.proto1.models.TransferResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.proto1.models.TransferResponse build() {
      org.example.proto1.models.TransferResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.proto1.models.TransferResponse buildPartial() {
      org.example.proto1.models.TransferResponse result = new org.example.proto1.models.TransferResponse(this);
      int from_bitField0_ = bitField0_;
      result.status_ = status_;
      if (accountsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          accounts_ = java.util.Collections.unmodifiableList(accounts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.accounts_ = accounts_;
      } else {
        result.accounts_ = accountsBuilder_.build();
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
      if (other instanceof org.example.proto1.models.TransferResponse) {
        return mergeFrom((org.example.proto1.models.TransferResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.proto1.models.TransferResponse other) {
      if (other == org.example.proto1.models.TransferResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (accountsBuilder_ == null) {
        if (!other.accounts_.isEmpty()) {
          if (accounts_.isEmpty()) {
            accounts_ = other.accounts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAccountsIsMutable();
            accounts_.addAll(other.accounts_);
          }
          onChanged();
        }
      } else {
        if (!other.accounts_.isEmpty()) {
          if (accountsBuilder_.isEmpty()) {
            accountsBuilder_.dispose();
            accountsBuilder_ = null;
            accounts_ = other.accounts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            accountsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAccountsFieldBuilder() : null;
          } else {
            accountsBuilder_.addAllMessages(other.accounts_);
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
      org.example.proto1.models.TransferResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.example.proto1.models.TransferResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int status_ = 0;
    /**
     * <code>.service.TransferStatus status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.service.TransferStatus status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.service.TransferStatus status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public org.example.proto1.models.TransferStatus getStatus() {
      @SuppressWarnings("deprecation")
      org.example.proto1.models.TransferStatus result = org.example.proto1.models.TransferStatus.valueOf(status_);
      return result == null ? org.example.proto1.models.TransferStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.service.TransferStatus status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(org.example.proto1.models.TransferStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.service.TransferStatus status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<org.example.proto1.models.Account> accounts_ =
      java.util.Collections.emptyList();
    private void ensureAccountsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        accounts_ = new java.util.ArrayList<org.example.proto1.models.Account>(accounts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.example.proto1.models.Account, org.example.proto1.models.Account.Builder, org.example.proto1.models.AccountOrBuilder> accountsBuilder_;

    /**
     * <code>repeated .service.Account accounts = 2;</code>
     */
    public java.util.List<org.example.proto1.models.Account> getAccountsList() {
      if (accountsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(accounts_);
      } else {
        return accountsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .service.Account accounts = 2;</code>
     */
    public int getAccountsCount() {
      if (accountsBuilder_ == null) {
        return accounts_.size();
      } else {
        return accountsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .service.Account accounts = 2;</code>
     */
    public org.example.proto1.models.Account getAccounts(int index) {
      if (accountsBuilder_ == null) {
        return accounts_.get(index);
      } else {
        return accountsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .service.Account accounts = 2;</code>
     */
    public Builder setAccounts(
        int index, org.example.proto1.models.Account value) {
      if (accountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountsIsMutable();
        accounts_.set(index, value);
        onChanged();
      } else {
        accountsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .service.Account accounts = 2;</code>
     */
    public Builder setAccounts(
        int index, org.example.proto1.models.Account.Builder builderForValue) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.set(index, builderForValue.build());
        onChanged();
      } else {
        accountsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .service.Account accounts = 2;</code>
     */
    public Builder addAccounts(org.example.proto1.models.Account value) {
      if (accountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountsIsMutable();
        accounts_.add(value);
        onChanged();
      } else {
        accountsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .service.Account accounts = 2;</code>
     */
    public Builder addAccounts(
        int index, org.example.proto1.models.Account value) {
      if (accountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountsIsMutable();
        accounts_.add(index, value);
        onChanged();
      } else {
        accountsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .service.Account accounts = 2;</code>
     */
    public Builder addAccounts(
        org.example.proto1.models.Account.Builder builderForValue) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.add(builderForValue.build());
        onChanged();
      } else {
        accountsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .service.Account accounts = 2;</code>
     */
    public Builder addAccounts(
        int index, org.example.proto1.models.Account.Builder builderForValue) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.add(index, builderForValue.build());
        onChanged();
      } else {
        accountsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .service.Account accounts = 2;</code>
     */
    public Builder addAllAccounts(
        java.lang.Iterable<? extends org.example.proto1.models.Account> values) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, accounts_);
        onChanged();
      } else {
        accountsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .service.Account accounts = 2;</code>
     */
    public Builder clearAccounts() {
      if (accountsBuilder_ == null) {
        accounts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        accountsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .service.Account accounts = 2;</code>
     */
    public Builder removeAccounts(int index) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.remove(index);
        onChanged();
      } else {
        accountsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .service.Account accounts = 2;</code>
     */
    public org.example.proto1.models.Account.Builder getAccountsBuilder(
        int index) {
      return getAccountsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .service.Account accounts = 2;</code>
     */
    public org.example.proto1.models.AccountOrBuilder getAccountsOrBuilder(
        int index) {
      if (accountsBuilder_ == null) {
        return accounts_.get(index);  } else {
        return accountsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .service.Account accounts = 2;</code>
     */
    public java.util.List<? extends org.example.proto1.models.AccountOrBuilder> 
         getAccountsOrBuilderList() {
      if (accountsBuilder_ != null) {
        return accountsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(accounts_);
      }
    }
    /**
     * <code>repeated .service.Account accounts = 2;</code>
     */
    public org.example.proto1.models.Account.Builder addAccountsBuilder() {
      return getAccountsFieldBuilder().addBuilder(
          org.example.proto1.models.Account.getDefaultInstance());
    }
    /**
     * <code>repeated .service.Account accounts = 2;</code>
     */
    public org.example.proto1.models.Account.Builder addAccountsBuilder(
        int index) {
      return getAccountsFieldBuilder().addBuilder(
          index, org.example.proto1.models.Account.getDefaultInstance());
    }
    /**
     * <code>repeated .service.Account accounts = 2;</code>
     */
    public java.util.List<org.example.proto1.models.Account.Builder> 
         getAccountsBuilderList() {
      return getAccountsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.example.proto1.models.Account, org.example.proto1.models.Account.Builder, org.example.proto1.models.AccountOrBuilder> 
        getAccountsFieldBuilder() {
      if (accountsBuilder_ == null) {
        accountsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.example.proto1.models.Account, org.example.proto1.models.Account.Builder, org.example.proto1.models.AccountOrBuilder>(
                accounts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        accounts_ = null;
      }
      return accountsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:service.TransferResponse)
  }

  // @@protoc_insertion_point(class_scope:service.TransferResponse)
  private static final org.example.proto1.models.TransferResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.proto1.models.TransferResponse();
  }

  public static org.example.proto1.models.TransferResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransferResponse>
      PARSER = new com.google.protobuf.AbstractParser<TransferResponse>() {
    @java.lang.Override
    public TransferResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TransferResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TransferResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransferResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.proto1.models.TransferResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

