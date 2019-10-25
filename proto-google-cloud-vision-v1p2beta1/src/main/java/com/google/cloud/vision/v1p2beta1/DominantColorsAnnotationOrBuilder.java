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
// source: google/cloud/vision/v1p2beta1/image_annotator.proto

package com.google.cloud.vision.v1p2beta1;

public interface DominantColorsAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p2beta1.DominantColorsAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * RGB color values with their score and pixel fraction.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.ColorInfo colors = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1p2beta1.ColorInfo> getColorsList();
  /**
   *
   *
   * <pre>
   * RGB color values with their score and pixel fraction.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.ColorInfo colors = 1;</code>
   */
  com.google.cloud.vision.v1p2beta1.ColorInfo getColors(int index);
  /**
   *
   *
   * <pre>
   * RGB color values with their score and pixel fraction.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.ColorInfo colors = 1;</code>
   */
  int getColorsCount();
  /**
   *
   *
   * <pre>
   * RGB color values with their score and pixel fraction.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.ColorInfo colors = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p2beta1.ColorInfoOrBuilder>
      getColorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * RGB color values with their score and pixel fraction.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.ColorInfo colors = 1;</code>
   */
  com.google.cloud.vision.v1p2beta1.ColorInfoOrBuilder getColorsOrBuilder(int index);
}
