// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/mute_config.proto

package com.google.cloud.securitycenter.v1;

public final class MuteConfigProto {
  private MuteConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1_MuteConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_MuteConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/securitycenter/v1/mute_co" +
      "nfig.proto\022\036google.cloud.securitycenter." +
      "v1\032\037google/api/field_behavior.proto\032\031goo" +
      "gle/api/resource.proto\032\037google/protobuf/" +
      "timestamp.proto\"\256\003\n\nMuteConfig\022\014\n\004name\030\001" +
      " \001(\t\022\030\n\014display_name\030\002 \001(\tB\002\030\001\022\023\n\013descri" +
      "ption\030\003 \001(\t\022\023\n\006filter\030\004 \001(\tB\003\340A\002\0224\n\013crea" +
      "te_time\030\005 \001(\0132\032.google.protobuf.Timestam" +
      "pB\003\340A\003\0224\n\013update_time\030\006 \001(\0132\032.google.pro" +
      "tobuf.TimestampB\003\340A\003\022\037\n\022most_recent_edit" +
      "or\030\007 \001(\tB\003\340A\003:\300\001\352A\274\001\n(securitycenter.goo" +
      "gleapis.com/MuteConfig\0226organizations/{o" +
      "rganization}/muteConfigs/{mute_config}\022*" +
      "folders/{folder}/muteConfigs/{mute_confi" +
      "g}\022,projects/{project}/muteConfigs/{mute" +
      "_config}B\351\001\n\"com.google.cloud.securityce" +
      "nter.v1B\017MuteConfigProtoP\001ZJcloud.google" +
      ".com/go/securitycenter/apiv1/securitycen" +
      "terpb;securitycenterpb\252\002\036Google.Cloud.Se" +
      "curityCenter.V1\312\002\036Google\\Cloud\\SecurityC" +
      "enter\\V1\352\002!Google::Cloud::SecurityCenter" +
      "::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_securitycenter_v1_MuteConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_MuteConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1_MuteConfig_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "Filter", "CreateTime", "UpdateTime", "MostRecentEditor", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
