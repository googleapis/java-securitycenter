// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1p1beta1/security_marks.proto

package com.google.cloud.securitycenter.v1p1beta1;

public final class SecurityMarksOuterClass {
  private SecurityMarksOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1p1beta1_SecurityMarks_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1p1beta1_SecurityMarks_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1p1beta1_SecurityMarks_MarksEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1p1beta1_SecurityMarks_MarksEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/securitycenter/v1p1beta1/" +
      "security_marks.proto\022%google.cloud.secur" +
      "itycenter.v1p1beta1\032\031google/api/resource" +
      ".proto\032\034google/api/annotations.proto\"\334\004\n" +
      "\rSecurityMarks\022\014\n\004name\030\001 \001(\t\022N\n\005marks\030\002 " +
      "\003(\0132?.google.cloud.securitycenter.v1p1be" +
      "ta1.SecurityMarks.MarksEntry\022\026\n\016canonica" +
      "l_name\030\003 \001(\t\032,\n\nMarksEntry\022\013\n\003key\030\001 \001(\t\022" +
      "\r\n\005value\030\002 \001(\t:\0028\001:\246\003\352A\242\003\n+securitycente" +
      "r.googleapis.com/SecurityMarks\0229organiza" +
      "tions/{organization}/assets/{asset}/secu" +
      "rityMarks\022Norganizations/{organization}/" +
      "sources/{source}/findings/{finding}/secu" +
      "rityMarks\022-folders/{folder}/assets/{asse" +
      "t}/securityMarks\022/projects/{project}/ass" +
      "ets/{asset}/securityMarks\022Bfolders/{fold" +
      "er}/sources/{source}/findings/{finding}/" +
      "securityMarks\022Dprojects/{project}/source" +
      "s/{source}/findings/{finding}/securityMa" +
      "rksB\375\001\n)com.google.cloud.securitycenter." +
      "v1p1beta1P\001ZSgoogle.golang.org/genproto/" +
      "googleapis/cloud/securitycenter/v1p1beta" +
      "1;securitycenter\252\002%Google.Cloud.Security" +
      "Center.V1P1Beta1\312\002%Google\\Cloud\\Security" +
      "Center\\V1p1beta1\352\002(Google::Cloud::Securi" +
      "tyCenter::V1p1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_securitycenter_v1p1beta1_SecurityMarks_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1p1beta1_SecurityMarks_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1p1beta1_SecurityMarks_descriptor,
        new java.lang.String[] { "Name", "Marks", "CanonicalName", });
    internal_static_google_cloud_securitycenter_v1p1beta1_SecurityMarks_MarksEntry_descriptor =
      internal_static_google_cloud_securitycenter_v1p1beta1_SecurityMarks_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_securitycenter_v1p1beta1_SecurityMarks_MarksEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1p1beta1_SecurityMarks_MarksEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
