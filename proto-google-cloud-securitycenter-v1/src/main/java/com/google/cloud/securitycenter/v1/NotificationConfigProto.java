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
// source: google/cloud/securitycenter/v1/notification_config.proto

package com.google.cloud.securitycenter.v1;

public final class NotificationConfigProto {
  private NotificationConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_NotificationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_NotificationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_NotificationConfig_StreamingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_NotificationConfig_StreamingConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/securitycenter/v1/notific"
          + "ation_config.proto\022\036google.cloud.securit"
          + "ycenter.v1\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\"\240\003\n\022Notif"
          + "icationConfig\022\014\n\004name\030\001 \001(\t\022\023\n\013descripti"
          + "on\030\002 \001(\t\0226\n\014pubsub_topic\030\003 \001(\tB \372A\035\n\033pub"
          + "sub.googleapis.com/Topic\022\034\n\017service_acco"
          + "unt\030\004 \001(\tB\003\340A\003\022^\n\020streaming_config\030\005 \001(\013"
          + "2B.google.cloud.securitycenter.v1.Notifi"
          + "cationConfig.StreamingConfigH\000\032!\n\017Stream"
          + "ingConfig\022\016\n\006filter\030\001 \001(\t:}\352Az\n0security"
          + "center.googleapis.com/NotificationConfig"
          + "\022Forganizations/{organization}/notificat"
          + "ionConfigs/{notification_config}B\017\n\rnoti"
          + "fy_configB\266\002\n\"com.google.cloud.securityc"
          + "enter.v1B\027NotificationConfigProtoP\001ZLgoo"
          + "gle.golang.org/genproto/googleapis/cloud"
          + "/securitycenter/v1;securitycenter\252\002\036Goog"
          + "le.Cloud.SecurityCenter.V1\312\002\036Google\\Clou"
          + "d\\SecurityCenter\\V1\352\002!Google::Cloud::Sec"
          + "urityCenter::V1\352A@\n\033pubsub.googleapis.co"
          + "m/Topic\022!projects/{project}/topics/{topi"
          + "c}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1_NotificationConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_NotificationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_NotificationConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "PubsubTopic",
              "ServiceAccount",
              "StreamingConfig",
              "NotifyConfig",
            });
    internal_static_google_cloud_securitycenter_v1_NotificationConfig_StreamingConfig_descriptor =
        internal_static_google_cloud_securitycenter_v1_NotificationConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v1_NotificationConfig_StreamingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_NotificationConfig_StreamingConfig_descriptor,
            new java.lang.String[] {
              "Filter",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
