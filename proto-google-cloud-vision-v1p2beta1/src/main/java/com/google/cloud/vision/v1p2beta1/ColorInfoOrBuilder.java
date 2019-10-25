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

public interface ColorInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p2beta1.ColorInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * RGB components of the color.
   * </pre>
   *
   * <code>.google.type.Color color = 1;</code>
   */
  boolean hasColor();
  /**
   *
   *
   * <pre>
   * RGB components of the color.
   * </pre>
   *
   * <code>.google.type.Color color = 1;</code>
   */
  com.google.type.Color getColor();
  /**
   *
   *
   * <pre>
   * RGB components of the color.
   * </pre>
   *
   * <code>.google.type.Color color = 1;</code>
   */
  com.google.type.ColorOrBuilder getColorOrBuilder();

  /**
   *
   *
   * <pre>
   * Image-specific score for this color. Value in range [0, 1].
   * </pre>
   *
   * <code>float score = 2;</code>
   */
  float getScore();

  /**
   *
   *
   * <pre>
   * The fraction of pixels the color occupies in the image.
   * Value in range [0, 1].
   * </pre>
   *
   * <code>float pixel_fraction = 3;</code>
   */
  float getPixelFraction();
}
