// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1beta1/run_asset_discovery_response.proto

package com.google.cloud.securitycenter.v1beta1;

public final class RunAssetDiscoveryResponseOuterClass {
  private RunAssetDiscoveryResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1beta1_RunAssetDiscoveryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1beta1_RunAssetDiscoveryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFgoogle/cloud/securitycenter/v1beta1/ru" +
      "n_asset_discovery_response.proto\022#google" +
      ".cloud.securitycenter.v1beta1\032\036google/pr" +
      "otobuf/duration.proto\032\034google/api/annota" +
      "tions.proto\"\354\001\n\031RunAssetDiscoveryRespons" +
      "e\022S\n\005state\030\001 \001(\0162D.google.cloud.security" +
      "center.v1beta1.RunAssetDiscoveryResponse" +
      ".State\022+\n\010duration\030\002 \001(\0132\031.google.protob" +
      "uf.Duration\"M\n\005State\022\025\n\021STATE_UNSPECIFIE" +
      "D\020\000\022\r\n\tCOMPLETED\020\001\022\016\n\nSUPERSEDED\020\002\022\016\n\nTE" +
      "RMINATED\020\003B~\n\'com.google.cloud.securityc" +
      "enter.v1beta1P\001ZQgoogle.golang.org/genpr" +
      "oto/googleapis/cloud/securitycenter/v1be" +
      "ta1;securitycenterb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_securitycenter_v1beta1_RunAssetDiscoveryResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1beta1_RunAssetDiscoveryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1beta1_RunAssetDiscoveryResponse_descriptor,
        new java.lang.String[] { "State", "Duration", });
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
