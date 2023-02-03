// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/connection.proto

package com.google.cloud.securitycenter.v1;

public final class ConnectionProto {
  private ConnectionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1_Connection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Connection_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/securitycenter/v1/connect" +
      "ion.proto\022\036google.cloud.securitycenter.v" +
      "1\"\201\002\n\nConnection\022\026\n\016destination_ip\030\001 \001(\t" +
      "\022\030\n\020destination_port\030\002 \001(\005\022\021\n\tsource_ip\030" +
      "\003 \001(\t\022\023\n\013source_port\030\004 \001(\005\022E\n\010protocol\030\005" +
      " \001(\01623.google.cloud.securitycenter.v1.Co" +
      "nnection.Protocol\"R\n\010Protocol\022\030\n\024PROTOCO" +
      "L_UNSPECIFIED\020\000\022\010\n\004ICMP\020\001\022\007\n\003TCP\020\006\022\007\n\003UD" +
      "P\020\021\022\007\n\003GRE\020/\022\007\n\003ESP\0202B\351\001\n\"com.google.clo" +
      "ud.securitycenter.v1B\017ConnectionProtoP\001Z" +
      "Jcloud.google.com/go/securitycenter/apiv" +
      "1/securitycenterpb;securitycenterpb\252\002\036Go" +
      "ogle.Cloud.SecurityCenter.V1\312\002\036Google\\Cl" +
      "oud\\SecurityCenter\\V1\352\002!Google::Cloud::S" +
      "ecurityCenter::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_securitycenter_v1_Connection_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_Connection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1_Connection_descriptor,
        new java.lang.String[] { "DestinationIp", "DestinationPort", "SourceIp", "SourcePort", "Protocol", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
