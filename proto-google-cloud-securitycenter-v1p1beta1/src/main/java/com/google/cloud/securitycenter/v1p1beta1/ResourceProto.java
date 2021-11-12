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
// source: google/cloud/securitycenter/v1p1beta1/resource.proto

package com.google.cloud.securitycenter.v1p1beta1;

public final class ResourceProto {
  private ResourceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1p1beta1_Resource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1p1beta1_Resource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/securitycenter/v1p1beta1/"
          + "resource.proto\022%google.cloud.securitycen"
          + "ter.v1p1beta1\032\037google/api/field_behavior"
          + ".proto\0322google/cloud/securitycenter/v1p1"
          + "beta1/folder.proto\032\034google/api/annotatio"
          + "ns.proto\"\271\001\n\010Resource\022\014\n\004name\030\001 \001(\t\022\017\n\007p"
          + "roject\030\002 \001(\t\022\034\n\024project_display_name\030\003 \001"
          + "(\t\022\016\n\006parent\030\004 \001(\t\022\033\n\023parent_display_nam"
          + "e\030\005 \001(\t\022C\n\007folders\030\007 \003(\0132-.google.cloud."
          + "securitycenter.v1p1beta1.FolderB\003\340A\003B\214\002\n"
          + ")com.google.cloud.securitycenter.v1p1bet"
          + "a1B\rResourceProtoP\001ZSgoogle.golang.org/g"
          + "enproto/googleapis/cloud/securitycenter/"
          + "v1p1beta1;securitycenter\252\002%Google.Cloud."
          + "SecurityCenter.V1P1Beta1\312\002%Google\\Cloud\\"
          + "SecurityCenter\\V1p1beta1\352\002(Google::Cloud"
          + "::SecurityCenter::V1p1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.securitycenter.v1p1beta1.FolderProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1p1beta1_Resource_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1p1beta1_Resource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1p1beta1_Resource_descriptor,
            new java.lang.String[] {
              "Name", "Project", "ProjectDisplayName", "Parent", "ParentDisplayName", "Folders",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.securitycenter.v1p1beta1.FolderProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
