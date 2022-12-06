// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/finding.proto

package com.google.cloud.securitycenter.v1;

public final class FindingOuterClass {
  private FindingOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1_Finding_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Finding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1_Finding_ExternalSystemsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Finding_ExternalSystemsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1_Finding_ContactsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Finding_ContactsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/securitycenter/v1/finding" +
      ".proto\022\036google.cloud.securitycenter.v1\032\037" +
      "google/api/field_behavior.proto\032\031google/" +
      "api/resource.proto\032+google/cloud/securit" +
      "ycenter/v1/access.proto\032/google/cloud/se" +
      "curitycenter/v1/compliance.proto\032/google" +
      "/cloud/securitycenter/v1/connection.prot" +
      "o\0324google/cloud/securitycenter/v1/contac" +
      "t_details.proto\032.google/cloud/securityce" +
      "nter/v1/container.proto\032-google/cloud/se" +
      "curitycenter/v1/database.proto\0321google/c" +
      "loud/securitycenter/v1/exfiltration.prot" +
      "o\0324google/cloud/securitycenter/v1/extern" +
      "al_system.proto\032)google/cloud/securityce" +
      "nter/v1/file.proto\0320google/cloud/securit" +
      "ycenter/v1/iam_binding.proto\032.google/clo" +
      "ud/securitycenter/v1/indicator.proto\032/go" +
      "ogle/cloud/securitycenter/v1/kubernetes." +
      "proto\0321google/cloud/securitycenter/v1/mi" +
      "tre_attack.proto\032,google/cloud/securityc" +
      "enter/v1/process.proto\0323google/cloud/sec" +
      "uritycenter/v1/security_marks.proto\0322goo" +
      "gle/cloud/securitycenter/v1/vulnerabilit" +
      "y.proto\032\034google/protobuf/struct.proto\032\037g" +
      "oogle/protobuf/timestamp.proto\"\333\024\n\007Findi" +
      "ng\022\014\n\004name\030\001 \001(\t\022\016\n\006parent\030\002 \001(\t\022\025\n\rreso" +
      "urce_name\030\003 \001(\t\022<\n\005state\030\004 \001(\0162-.google." +
      "cloud.securitycenter.v1.Finding.State\022\020\n" +
      "\010category\030\005 \001(\t\022\024\n\014external_uri\030\006 \001(\t\022X\n" +
      "\021source_properties\030\007 \003(\0132=.google.cloud." +
      "securitycenter.v1.Finding.SourceProperti" +
      "esEntry\022J\n\016security_marks\030\010 \001(\0132-.google" +
      ".cloud.securitycenter.v1.SecurityMarksB\003" +
      "\340A\003\022.\n\nevent_time\030\t \001(\0132\032.google.protobu" +
      "f.Timestamp\022/\n\013create_time\030\n \001(\0132\032.googl" +
      "e.protobuf.Timestamp\022B\n\010severity\030\014 \001(\01620" +
      ".google.cloud.securitycenter.v1.Finding." +
      "Severity\022\026\n\016canonical_name\030\016 \001(\t\022:\n\004mute" +
      "\030\017 \001(\0162,.google.cloud.securitycenter.v1." +
      "Finding.Mute\022K\n\rfinding_class\030\021 \001(\01624.go" +
      "ogle.cloud.securitycenter.v1.Finding.Fin" +
      "dingClass\022<\n\tindicator\030\022 \001(\0132).google.cl" +
      "oud.securitycenter.v1.Indicator\022D\n\rvulne" +
      "rability\030\024 \001(\0132-.google.cloud.securityce" +
      "nter.v1.Vulnerability\0229\n\020mute_update_tim" +
      "e\030\025 \001(\0132\032.google.protobuf.TimestampB\003\340A\003" +
      "\022[\n\020external_systems\030\026 \003(\0132<.google.clou" +
      "d.securitycenter.v1.Finding.ExternalSyst" +
      "emsEntryB\003\340A\003\022A\n\014mitre_attack\030\031 \001(\0132+.go" +
      "ogle.cloud.securitycenter.v1.MitreAttack" +
      "\0226\n\006access\030\032 \001(\0132&.google.cloud.security" +
      "center.v1.Access\022?\n\013connections\030\037 \003(\0132*." +
      "google.cloud.securitycenter.v1.Connectio" +
      "n\022\026\n\016mute_initiator\030\034 \001(\t\022:\n\tprocesses\030\036" +
      " \003(\0132\'.google.cloud.securitycenter.v1.Pr" +
      "ocess\022L\n\010contacts\030! \003(\01325.google.cloud.s" +
      "ecuritycenter.v1.Finding.ContactsEntryB\003" +
      "\340A\003\022?\n\013compliances\030\" \003(\0132*.google.cloud." +
      "securitycenter.v1.Compliance\022 \n\023parent_d" +
      "isplay_name\030$ \001(\tB\003\340A\003\022\023\n\013description\030% " +
      "\001(\t\022B\n\014exfiltration\030& \001(\0132,.google.cloud" +
      ".securitycenter.v1.Exfiltration\022@\n\014iam_b" +
      "indings\030\' \003(\0132*.google.cloud.securitycen" +
      "ter.v1.IamBinding\022\022\n\nnext_steps\030( \001(\t\022=\n" +
      "\ncontainers\030* \003(\0132).google.cloud.securit" +
      "ycenter.v1.Container\022>\n\nkubernetes\030+ \001(\013" +
      "2*.google.cloud.securitycenter.v1.Kubern" +
      "etes\022:\n\010database\030, \001(\0132(.google.cloud.se" +
      "curitycenter.v1.Database\0223\n\005files\030. \003(\0132" +
      "$.google.cloud.securitycenter.v1.File\032O\n" +
      "\025SourcePropertiesEntry\022\013\n\003key\030\001 \001(\t\022%\n\005v" +
      "alue\030\002 \001(\0132\026.google.protobuf.Value:\0028\001\032f" +
      "\n\024ExternalSystemsEntry\022\013\n\003key\030\001 \001(\t\022=\n\005v" +
      "alue\030\002 \001(\0132..google.cloud.securitycenter" +
      ".v1.ExternalSystem:\0028\001\032_\n\rContactsEntry\022" +
      "\013\n\003key\030\001 \001(\t\022=\n\005value\030\002 \001(\0132..google.clo" +
      "ud.securitycenter.v1.ContactDetails:\0028\001\"" +
      "8\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\n\n\006ACTIV" +
      "E\020\001\022\014\n\010INACTIVE\020\002\"Q\n\010Severity\022\030\n\024SEVERIT" +
      "Y_UNSPECIFIED\020\000\022\014\n\010CRITICAL\020\001\022\010\n\004HIGH\020\002\022" +
      "\n\n\006MEDIUM\020\003\022\007\n\003LOW\020\004\"C\n\004Mute\022\024\n\020MUTE_UNS" +
      "PECIFIED\020\000\022\t\n\005MUTED\020\001\022\013\n\007UNMUTED\020\002\022\r\n\tUN" +
      "DEFINED\020\004\"\202\001\n\014FindingClass\022\035\n\031FINDING_CL" +
      "ASS_UNSPECIFIED\020\000\022\n\n\006THREAT\020\001\022\021\n\rVULNERA" +
      "BILITY\020\002\022\024\n\020MISCONFIGURATION\020\003\022\017\n\013OBSERV" +
      "ATION\020\004\022\r\n\tSCC_ERROR\020\005:\333\001\352A\327\001\n%securityc" +
      "enter.googleapis.com/Finding\022@organizati" +
      "ons/{organization}/sources/{source}/find" +
      "ings/{finding}\0224folders/{folder}/sources" +
      "/{source}/findings/{finding}\0226projects/{" +
      "project}/sources/{source}/findings/{find" +
      "ing}B\332\001\n\"com.google.cloud.securitycenter" +
      ".v1P\001ZLgoogle.golang.org/genproto/google" +
      "apis/cloud/securitycenter/v1;securitycen" +
      "ter\252\002\036Google.Cloud.SecurityCenter.V1\312\002\036G" +
      "oogle\\Cloud\\SecurityCenter\\V1\352\002!Google::" +
      "Cloud::SecurityCenter::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.AccessProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.ComplianceProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.ConnectionProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.ContactDetailsProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.ContainerProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.DatabaseProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.ExfiltrationProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.ExternalSystemProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.FileProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.IamBindingProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.IndicatorProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.KubernetesProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.MitreAttackProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.ProcessProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.SecurityMarksOuterClass.getDescriptor(),
          com.google.cloud.securitycenter.v1.VulnerabilityProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_securitycenter_v1_Finding_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_Finding_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1_Finding_descriptor,
        new java.lang.String[] { "Name", "Parent", "ResourceName", "State", "Category", "ExternalUri", "SourceProperties", "SecurityMarks", "EventTime", "CreateTime", "Severity", "CanonicalName", "Mute", "FindingClass", "Indicator", "Vulnerability", "MuteUpdateTime", "ExternalSystems", "MitreAttack", "Access", "Connections", "MuteInitiator", "Processes", "Contacts", "Compliances", "ParentDisplayName", "Description", "Exfiltration", "IamBindings", "NextSteps", "Containers", "Kubernetes", "Database", "Files", });
    internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_descriptor =
      internal_static_google_cloud_securitycenter_v1_Finding_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_securitycenter_v1_Finding_ExternalSystemsEntry_descriptor =
      internal_static_google_cloud_securitycenter_v1_Finding_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_securitycenter_v1_Finding_ExternalSystemsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1_Finding_ExternalSystemsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_securitycenter_v1_Finding_ContactsEntry_descriptor =
      internal_static_google_cloud_securitycenter_v1_Finding_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_securitycenter_v1_Finding_ContactsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1_Finding_ContactsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.securitycenter.v1.AccessProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ComplianceProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ConnectionProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ContactDetailsProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ContainerProto.getDescriptor();
    com.google.cloud.securitycenter.v1.DatabaseProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ExfiltrationProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ExternalSystemProto.getDescriptor();
    com.google.cloud.securitycenter.v1.FileProto.getDescriptor();
    com.google.cloud.securitycenter.v1.IamBindingProto.getDescriptor();
    com.google.cloud.securitycenter.v1.IndicatorProto.getDescriptor();
    com.google.cloud.securitycenter.v1.KubernetesProto.getDescriptor();
    com.google.cloud.securitycenter.v1.MitreAttackProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ProcessProto.getDescriptor();
    com.google.cloud.securitycenter.v1.SecurityMarksOuterClass.getDescriptor();
    com.google.cloud.securitycenter.v1.VulnerabilityProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
