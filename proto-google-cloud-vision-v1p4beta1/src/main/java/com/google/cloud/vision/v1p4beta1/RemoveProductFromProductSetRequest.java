/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/product_search_service.proto

package com.google.cloud.vision.v1p4beta1;

/**
 *
 *
 * <pre>
 * Request message for the `RemoveProductFromProductSet` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest}
 */
public final class RemoveProductFromProductSetRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest)
    RemoveProductFromProductSetRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RemoveProductFromProductSetRequest.newBuilder() to construct.
  private RemoveProductFromProductSetRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RemoveProductFromProductSetRequest() {
    name_ = "";
    product_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RemoveProductFromProductSetRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              product_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1p4beta1.ProductSearchServiceProto
        .internal_static_google_cloud_vision_v1p4beta1_RemoveProductFromProductSetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p4beta1.ProductSearchServiceProto
        .internal_static_google_cloud_vision_v1p4beta1_RemoveProductFromProductSetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest.class,
            com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * The resource name for the ProductSet to modify.
   * Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The resource name for the ProductSet to modify.
   * Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRODUCT_FIELD_NUMBER = 2;
  private volatile java.lang.Object product_;
  /**
   *
   *
   * <pre>
   * The resource name for the Product to be removed from this ProductSet.
   * Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`
   * </pre>
   *
   * <code>string product = 2;</code>
   */
  public java.lang.String getProduct() {
    java.lang.Object ref = product_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      product_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The resource name for the Product to be removed from this ProductSet.
   * Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`
   * </pre>
   *
   * <code>string product = 2;</code>
   */
  public com.google.protobuf.ByteString getProductBytes() {
    java.lang.Object ref = product_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      product_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getProductBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, product_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getProductBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, product_);
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
    if (!(obj instanceof com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest other =
        (com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getProduct().equals(other.getProduct())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
    hash = (53 * hash) + getProduct().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for the `RemoveProductFromProductSet` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest)
      com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p4beta1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1p4beta1_RemoveProductFromProductSetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p4beta1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1p4beta1_RemoveProductFromProductSetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest.class,
              com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      product_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p4beta1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1p4beta1_RemoveProductFromProductSetRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest
        getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest build() {
      com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest buildPartial() {
      com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest result =
          new com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest(this);
      result.name_ = name_;
      result.product_ = product_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest) {
        return mergeFrom(
            (com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest other) {
      if (other
          == com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest
              .getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getProduct().isEmpty()) {
        product_ = other.product_;
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
      com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The resource name for the ProductSet to modify.
     * Format is:
     * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name for the ProductSet to modify.
     * Format is:
     * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name for the ProductSet to modify.
     * Format is:
     * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name for the ProductSet to modify.
     * Format is:
     * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name for the ProductSet to modify.
     * Format is:
     * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object product_ = "";
    /**
     *
     *
     * <pre>
     * The resource name for the Product to be removed from this ProductSet.
     * Format is:
     * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`
     * </pre>
     *
     * <code>string product = 2;</code>
     */
    public java.lang.String getProduct() {
      java.lang.Object ref = product_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        product_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name for the Product to be removed from this ProductSet.
     * Format is:
     * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`
     * </pre>
     *
     * <code>string product = 2;</code>
     */
    public com.google.protobuf.ByteString getProductBytes() {
      java.lang.Object ref = product_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        product_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name for the Product to be removed from this ProductSet.
     * Format is:
     * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`
     * </pre>
     *
     * <code>string product = 2;</code>
     */
    public Builder setProduct(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      product_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name for the Product to be removed from this ProductSet.
     * Format is:
     * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`
     * </pre>
     *
     * <code>string product = 2;</code>
     */
    public Builder clearProduct() {

      product_ = getDefaultInstance().getProduct();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name for the Product to be removed from this ProductSet.
     * Format is:
     * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`
     * </pre>
     *
     * <code>string product = 2;</code>
     */
    public Builder setProductBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      product_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest)
  private static final com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest();
  }

  public static com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveProductFromProductSetRequest> PARSER =
      new com.google.protobuf.AbstractParser<RemoveProductFromProductSetRequest>() {
        @java.lang.Override
        public RemoveProductFromProductSetRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RemoveProductFromProductSetRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RemoveProductFromProductSetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveProductFromProductSetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
