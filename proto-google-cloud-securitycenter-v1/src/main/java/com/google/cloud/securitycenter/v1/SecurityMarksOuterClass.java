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
// source: google/cloud/securitycenter/v1/security_marks.proto

package com.google.cloud.securitycenter.v1;

public final class SecurityMarksOuterClass {
  private SecurityMarksOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_SecurityMarks_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_SecurityMarks_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_SecurityMarks_MarksEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_SecurityMarks_MarksEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "3google/cloud/securitycenter/v1/security_marks.proto\022\036google.cloud.securitycenter.v1\032\031google/api/resource.proto\032\034google/api/annotations.proto\"\325\004\n\r"
          + "SecurityMarks\022\014\n"
          + "\004name\030\001 \001(\t\022G\n"
          + "\005marks\030\002"
          + " \003(\01328.google.cloud.securitycenter.v1.SecurityMarks.MarksEntry\022\026\n"
          + "\016canonical_name\030\003 \001(\t\032,\n\n"
          + "MarksEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001:\246\003\352A\242\003\n"
          + "+securitycenter.googleapis.com/SecurityMarks\0229organizations/{organization}/"
          + "assets/{asset}/securityMarks\022Norganizations/{organization}/sources/{source}/findings/{finding}/securityMarks\022-folders/{folder}/assets/{asset}/securityMarks\022/projects/{project}/assets/{asset}/securityMarks\022Bfolders/{folder}/sources/{source}/findings/{finding}/securityMarks\022Dprojects/{project}/sources/{source}/findings/{finding}/securityMarksB\332\001\n"
          + "\"com.google.cloud.securitycenter.v1P\001ZLgoogle.golang.o"
          + "rg/genproto/googleapis/cloud/securitycen"
          + "ter/v1;securitycenter\252\002\036Google.Cloud.Sec"
          + "urityCenter.V1\312\002\036Google\\Cloud\\SecurityCe"
          + "nter\\V1\352\002!Google::Cloud::SecurityCenter::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1_SecurityMarks_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_SecurityMarks_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_SecurityMarks_descriptor,
            new java.lang.String[] {
              "Name", "Marks", "CanonicalName",
            });
    internal_static_google_cloud_securitycenter_v1_SecurityMarks_MarksEntry_descriptor =
        internal_static_google_cloud_securitycenter_v1_SecurityMarks_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v1_SecurityMarks_MarksEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_SecurityMarks_MarksEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
