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
// source: google/cloud/securitycenter/v1beta1/asset.proto

package com.google.cloud.securitycenter.v1beta1;

public final class AssetOuterClass {
  private AssetOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1beta1_Asset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1beta1_Asset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1beta1_Asset_SecurityCenterProperties_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1beta1_Asset_SecurityCenterProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1beta1_Asset_ResourcePropertiesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1beta1_Asset_ResourcePropertiesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/securitycenter/v1beta1/as"
          + "set.proto\022#google.cloud.securitycenter.v"
          + "1beta1\032\037google/api/field_behavior.proto\032"
          + "8google/cloud/securitycenter/v1beta1/sec"
          + "urity_marks.proto\032\034google/protobuf/struc"
          + "t.proto\032\037google/protobuf/timestamp.proto"
          + "\032\034google/api/annotations.proto\"\374\004\n\005Asset"
          + "\022\014\n\004name\030\001 \001(\t\022g\n\032security_center_proper"
          + "ties\030\002 \001(\0132C.google.cloud.securitycenter"
          + ".v1beta1.Asset.SecurityCenterProperties\022"
          + "_\n\023resource_properties\030\007 \003(\0132B.google.cl"
          + "oud.securitycenter.v1beta1.Asset.Resourc"
          + "ePropertiesEntry\022J\n\016security_marks\030\010 \001(\013"
          + "22.google.cloud.securitycenter.v1beta1.S"
          + "ecurityMarks\022/\n\013create_time\030\t \001(\0132\032.goog"
          + "le.protobuf.Timestamp\022/\n\013update_time\030\n \001"
          + "(\0132\032.google.protobuf.Timestamp\032\231\001\n\030Secur"
          + "ityCenterProperties\022\032\n\rresource_name\030\001 \001"
          + "(\tB\003\340A\005\022\025\n\rresource_type\030\002 \001(\t\022\027\n\017resour"
          + "ce_parent\030\003 \001(\t\022\030\n\020resource_project\030\004 \001("
          + "\t\022\027\n\017resource_owners\030\005 \003(\t\032Q\n\027ResourcePr"
          + "opertiesEntry\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001("
          + "\0132\026.google.protobuf.Value:\0028\001B~\n\'com.goo"
          + "gle.cloud.securitycenter.v1beta1P\001ZQgoog"
          + "le.golang.org/genproto/googleapis/cloud/"
          + "securitycenter/v1beta1;securitycenterb\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.securitycenter.v1beta1.SecurityMarksOuterClass.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1beta1_Asset_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1beta1_Asset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1beta1_Asset_descriptor,
            new java.lang.String[] {
              "Name",
              "SecurityCenterProperties",
              "ResourceProperties",
              "SecurityMarks",
              "CreateTime",
              "UpdateTime",
            });
    internal_static_google_cloud_securitycenter_v1beta1_Asset_SecurityCenterProperties_descriptor =
        internal_static_google_cloud_securitycenter_v1beta1_Asset_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v1beta1_Asset_SecurityCenterProperties_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1beta1_Asset_SecurityCenterProperties_descriptor,
            new java.lang.String[] {
              "ResourceName", "ResourceType", "ResourceParent", "ResourceProject", "ResourceOwners",
            });
    internal_static_google_cloud_securitycenter_v1beta1_Asset_ResourcePropertiesEntry_descriptor =
        internal_static_google_cloud_securitycenter_v1beta1_Asset_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_securitycenter_v1beta1_Asset_ResourcePropertiesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1beta1_Asset_ResourcePropertiesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.securitycenter.v1beta1.SecurityMarksOuterClass.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
