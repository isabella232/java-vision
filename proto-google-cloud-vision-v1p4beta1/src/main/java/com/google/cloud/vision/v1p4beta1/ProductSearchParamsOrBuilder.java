// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/product_search.proto

package com.google.cloud.vision.v1p4beta1;

public interface ProductSearchParamsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.ProductSearchParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The bounding polygon around the area of interest in the image.
   * Optional. If it is not specified, system discretion will be applied.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.BoundingPoly bounding_poly = 9;</code>
   */
  boolean hasBoundingPoly();
  /**
   *
   *
   * <pre>
   * The bounding polygon around the area of interest in the image.
   * Optional. If it is not specified, system discretion will be applied.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.BoundingPoly bounding_poly = 9;</code>
   */
  com.google.cloud.vision.v1p4beta1.BoundingPoly getBoundingPoly();
  /**
   *
   *
   * <pre>
   * The bounding polygon around the area of interest in the image.
   * Optional. If it is not specified, system discretion will be applied.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.BoundingPoly bounding_poly = 9;</code>
   */
  com.google.cloud.vision.v1p4beta1.BoundingPolyOrBuilder getBoundingPolyOrBuilder();

  /**
   *
   *
   * <pre>
   * The resource name of a
   * [ProductSet][google.cloud.vision.v1p4beta1.ProductSet] to be searched for
   * similar images.
   * Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.
   * </pre>
   *
   * <code>string product_set = 6;</code>
   */
  java.lang.String getProductSet();
  /**
   *
   *
   * <pre>
   * The resource name of a
   * [ProductSet][google.cloud.vision.v1p4beta1.ProductSet] to be searched for
   * similar images.
   * Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.
   * </pre>
   *
   * <code>string product_set = 6;</code>
   */
  com.google.protobuf.ByteString getProductSetBytes();

  /**
   *
   *
   * <pre>
   * The list of product categories to search in. Currently, we only consider
   * the first category, and either "homegoods", "apparel", or "toys" should be
   * specified.
   * </pre>
   *
   * <code>repeated string product_categories = 7;</code>
   */
  java.util.List<java.lang.String> getProductCategoriesList();
  /**
   *
   *
   * <pre>
   * The list of product categories to search in. Currently, we only consider
   * the first category, and either "homegoods", "apparel", or "toys" should be
   * specified.
   * </pre>
   *
   * <code>repeated string product_categories = 7;</code>
   */
  int getProductCategoriesCount();
  /**
   *
   *
   * <pre>
   * The list of product categories to search in. Currently, we only consider
   * the first category, and either "homegoods", "apparel", or "toys" should be
   * specified.
   * </pre>
   *
   * <code>repeated string product_categories = 7;</code>
   */
  java.lang.String getProductCategories(int index);
  /**
   *
   *
   * <pre>
   * The list of product categories to search in. Currently, we only consider
   * the first category, and either "homegoods", "apparel", or "toys" should be
   * specified.
   * </pre>
   *
   * <code>repeated string product_categories = 7;</code>
   */
  com.google.protobuf.ByteString getProductCategoriesBytes(int index);

  /**
   *
   *
   * <pre>
   * The filtering expression. This can be used to restrict search results based
   * on Product labels. We currently support an AND of OR of key-value
   * expressions, where each expression within an OR must have the same key.
   * For example, "(color = red OR color = blue) AND brand = Google" is
   * acceptable, but not "(color = red OR brand = Google)" or "color: red".
   * </pre>
   *
   * <code>string filter = 8;</code>
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * The filtering expression. This can be used to restrict search results based
   * on Product labels. We currently support an AND of OR of key-value
   * expressions, where each expression within an OR must have the same key.
   * For example, "(color = red OR color = blue) AND brand = Google" is
   * acceptable, but not "(color = red OR brand = Google)" or "color: red".
   * </pre>
   *
   * <code>string filter = 8;</code>
   */
  com.google.protobuf.ByteString getFilterBytes();
}
