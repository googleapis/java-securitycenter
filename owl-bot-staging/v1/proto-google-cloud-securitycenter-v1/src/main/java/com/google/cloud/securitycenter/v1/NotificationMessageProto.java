// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/notification_message.proto

package com.google.cloud.securitycenter.v1;

public final class NotificationMessageProto {
  private NotificationMessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1_NotificationMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_NotificationMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/securitycenter/v1/notific" +
      "ation_message.proto\022\036google.cloud.securi" +
      "tycenter.v1\032,google/cloud/securitycenter" +
      "/v1/finding.proto\032-google/cloud/security" +
      "center/v1/resource.proto\"\270\001\n\023Notificatio" +
      "nMessage\022 \n\030notification_config_name\030\001 \001" +
      "(\t\022:\n\007finding\030\002 \001(\0132\'.google.cloud.secur" +
      "itycenter.v1.FindingH\000\022:\n\010resource\030\003 \001(\013" +
      "2(.google.cloud.securitycenter.v1.Resour" +
      "ceB\007\n\005eventB\364\001\n\"com.google.cloud.securit" +
      "ycenter.v1B\030NotificationMessageProtoP\001ZL" +
      "google.golang.org/genproto/googleapis/cl" +
      "oud/securitycenter/v1;securitycenter\252\002\036G" +
      "oogle.Cloud.SecurityCenter.V1\312\002\036Google\\C" +
      "loud\\SecurityCenter\\V1\352\002!Google::Cloud::" +
      "SecurityCenter::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.securitycenter.v1.FindingOuterClass.getDescriptor(),
          com.google.cloud.securitycenter.v1.ResourceProto.getDescriptor(),
        });
    internal_static_google_cloud_securitycenter_v1_NotificationMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_NotificationMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1_NotificationMessage_descriptor,
        new java.lang.String[] { "NotificationConfigName", "Finding", "Resource", "Event", });
    com.google.cloud.securitycenter.v1.FindingOuterClass.getDescriptor();
    com.google.cloud.securitycenter.v1.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
