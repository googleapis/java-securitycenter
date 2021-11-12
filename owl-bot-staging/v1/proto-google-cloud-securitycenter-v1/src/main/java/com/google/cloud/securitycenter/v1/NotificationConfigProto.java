// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/notification_config.proto

package com.google.cloud.securitycenter.v1;

public final class NotificationConfigProto {
  private NotificationConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1_NotificationConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_NotificationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1_NotificationConfig_StreamingConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_NotificationConfig_StreamingConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/securitycenter/v1/notific" +
      "ation_config.proto\022\036google.cloud.securit" +
      "ycenter.v1\032\037google/api/field_behavior.pr" +
      "oto\032\031google/api/resource.proto\032\034google/a" +
      "pi/annotations.proto\"\240\003\n\022NotificationCon" +
      "fig\022\014\n\004name\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\0226" +
      "\n\014pubsub_topic\030\003 \001(\tB \372A\035\n\033pubsub.google" +
      "apis.com/Topic\022\034\n\017service_account\030\004 \001(\tB" +
      "\003\340A\003\022^\n\020streaming_config\030\005 \001(\0132B.google." +
      "cloud.securitycenter.v1.NotificationConf" +
      "ig.StreamingConfigH\000\032!\n\017StreamingConfig\022" +
      "\016\n\006filter\030\001 \001(\t:}\352Az\n0securitycenter.goo" +
      "gleapis.com/NotificationConfig\022Forganiza" +
      "tions/{organization}/notificationConfigs" +
      "/{notification_config}B\017\n\rnotify_configB" +
      "\266\002\n\"com.google.cloud.securitycenter.v1B\027" +
      "NotificationConfigProtoP\001ZLgoogle.golang" +
      ".org/genproto/googleapis/cloud/securityc" +
      "enter/v1;securitycenter\252\002\036Google.Cloud.S" +
      "ecurityCenter.V1\312\002\036Google\\Cloud\\Security" +
      "Center\\V1\352\002!Google::Cloud::SecurityCente" +
      "r::V1\352A@\n\033pubsub.googleapis.com/Topic\022!p" +
      "rojects/{project}/topics/{topic}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_securitycenter_v1_NotificationConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_NotificationConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1_NotificationConfig_descriptor,
        new java.lang.String[] { "Name", "Description", "PubsubTopic", "ServiceAccount", "StreamingConfig", "NotifyConfig", });
    internal_static_google_cloud_securitycenter_v1_NotificationConfig_StreamingConfig_descriptor =
      internal_static_google_cloud_securitycenter_v1_NotificationConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_NotificationConfig_StreamingConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1_NotificationConfig_StreamingConfig_descriptor,
        new java.lang.String[] { "Filter", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
