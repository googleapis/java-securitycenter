/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/securitycenter/v1/iam_binding.proto

package com.google.cloud.securitycenter.v1;

public final class IamBindingProto {
  private IamBindingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_IamBinding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_IamBinding_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/securitycenter/v1/iam_bin"
          + "ding.proto\022\036google.cloud.securitycenter."
          + "v1\"\244\001\n\nIamBinding\022A\n\006action\030\001 \001(\01621.goog"
          + "le.cloud.securitycenter.v1.IamBinding.Ac"
          + "tion\022\014\n\004role\030\002 \001(\t\022\016\n\006member\030\003 \001(\t\"5\n\006Ac"
          + "tion\022\026\n\022ACTION_UNSPECIFIED\020\000\022\007\n\003ADD\020\001\022\n\n"
          + "\006REMOVE\020\002B\351\001\n\"com.google.cloud.securityc"
          + "enter.v1B\017IamBindingProtoP\001ZJcloud.googl"
          + "e.com/go/securitycenter/apiv1/securityce"
          + "nterpb;securitycenterpb\252\002\036Google.Cloud.S"
          + "ecurityCenter.V1\312\002\036Google\\Cloud\\Security"
          + "Center\\V1\352\002!Google::Cloud::SecurityCente"
          + "r::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_securitycenter_v1_IamBinding_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_IamBinding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_IamBinding_descriptor,
            new java.lang.String[] {
              "Action", "Role", "Member",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
