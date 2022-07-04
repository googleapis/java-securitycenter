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
      "t_details.proto\0321google/cloud/securityce" +
      "nter/v1/exfiltration.proto\0324google/cloud" +
      "/securitycenter/v1/external_system.proto" +
      "\0320google/cloud/securitycenter/v1/iam_bin" +
      "ding.proto\032.google/cloud/securitycenter/" +
      "v1/indicator.proto\0321google/cloud/securit" +
      "ycenter/v1/mitre_attack.proto\032,google/cl" +
      "oud/securitycenter/v1/process.proto\0323goo" +
      "gle/cloud/securitycenter/v1/security_mar" +
      "ks.proto\0322google/cloud/securitycenter/v1" +
      "/vulnerability.proto\032\034google/protobuf/st" +
      "ruct.proto\032\037google/protobuf/timestamp.pr" +
      "oto\"\311\022\n\007Finding\022\014\n\004name\030\001 \001(\t\022\016\n\006parent\030" +
      "\002 \001(\t\022\025\n\rresource_name\030\003 \001(\t\022<\n\005state\030\004 " +
      "\001(\0162-.google.cloud.securitycenter.v1.Fin" +
      "ding.State\022\020\n\010category\030\005 \001(\t\022\024\n\014external" +
      "_uri\030\006 \001(\t\022X\n\021source_properties\030\007 \003(\0132=." +
      "google.cloud.securitycenter.v1.Finding.S" +
      "ourcePropertiesEntry\022J\n\016security_marks\030\010" +
      " \001(\0132-.google.cloud.securitycenter.v1.Se" +
      "curityMarksB\003\340A\003\022.\n\nevent_time\030\t \001(\0132\032.g" +
      "oogle.protobuf.Timestamp\022/\n\013create_time\030" +
      "\n \001(\0132\032.google.protobuf.Timestamp\022B\n\010sev" +
      "erity\030\014 \001(\01620.google.cloud.securitycente" +
      "r.v1.Finding.Severity\022\026\n\016canonical_name\030" +
      "\016 \001(\t\022:\n\004mute\030\017 \001(\0162,.google.cloud.secur" +
      "itycenter.v1.Finding.Mute\022K\n\rfinding_cla" +
      "ss\030\021 \001(\01624.google.cloud.securitycenter.v" +
      "1.Finding.FindingClass\022<\n\tindicator\030\022 \001(" +
      "\0132).google.cloud.securitycenter.v1.Indic" +
      "ator\022D\n\rvulnerability\030\024 \001(\0132-.google.clo" +
      "ud.securitycenter.v1.Vulnerability\0229\n\020mu" +
      "te_update_time\030\025 \001(\0132\032.google.protobuf.T" +
      "imestampB\003\340A\003\022[\n\020external_systems\030\026 \003(\0132" +
      "<.google.cloud.securitycenter.v1.Finding" +
      ".ExternalSystemsEntryB\003\340A\003\022A\n\014mitre_atta" +
      "ck\030\031 \001(\0132+.google.cloud.securitycenter.v" +
      "1.MitreAttack\0226\n\006access\030\032 \001(\0132&.google.c" +
      "loud.securitycenter.v1.Access\022?\n\013connect" +
      "ions\030\037 \003(\0132*.google.cloud.securitycenter" +
      ".v1.Connection\022\026\n\016mute_initiator\030\034 \001(\t\022:" +
      "\n\tprocesses\030\036 \003(\0132\'.google.cloud.securit" +
      "ycenter.v1.Process\022L\n\010contacts\030! \003(\01325.g" +
      "oogle.cloud.securitycenter.v1.Finding.Co" +
      "ntactsEntryB\003\340A\003\022?\n\013compliances\030\" \003(\0132*." +
      "google.cloud.securitycenter.v1.Complianc" +
      "e\022\023\n\013description\030% \001(\t\022B\n\014exfiltration\030&" +
      " \001(\0132,.google.cloud.securitycenter.v1.Ex" +
      "filtration\022@\n\014iam_bindings\030\' \003(\0132*.googl" +
      "e.cloud.securitycenter.v1.IamBinding\022\022\n\n" +
      "next_steps\030( \001(\t\032O\n\025SourcePropertiesEntr" +
      "y\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026.google.p" +
      "rotobuf.Value:\0028\001\032f\n\024ExternalSystemsEntr" +
      "y\022\013\n\003key\030\001 \001(\t\022=\n\005value\030\002 \001(\0132..google.c" +
      "loud.securitycenter.v1.ExternalSystem:\0028" +
      "\001\032_\n\rContactsEntry\022\013\n\003key\030\001 \001(\t\022=\n\005value" +
      "\030\002 \001(\0132..google.cloud.securitycenter.v1." +
      "ContactDetails:\0028\001\"8\n\005State\022\025\n\021STATE_UNS" +
      "PECIFIED\020\000\022\n\n\006ACTIVE\020\001\022\014\n\010INACTIVE\020\002\"Q\n\010" +
      "Severity\022\030\n\024SEVERITY_UNSPECIFIED\020\000\022\014\n\010CR" +
      "ITICAL\020\001\022\010\n\004HIGH\020\002\022\n\n\006MEDIUM\020\003\022\007\n\003LOW\020\004\"" +
      "C\n\004Mute\022\024\n\020MUTE_UNSPECIFIED\020\000\022\t\n\005MUTED\020\001" +
      "\022\013\n\007UNMUTED\020\002\022\r\n\tUNDEFINED\020\004\"\202\001\n\014Finding" +
      "Class\022\035\n\031FINDING_CLASS_UNSPECIFIED\020\000\022\n\n\006" +
      "THREAT\020\001\022\021\n\rVULNERABILITY\020\002\022\024\n\020MISCONFIG" +
      "URATION\020\003\022\017\n\013OBSERVATION\020\004\022\r\n\tSCC_ERROR\020" +
      "\005:\333\001\352A\327\001\n%securitycenter.googleapis.com/" +
      "Finding\022@organizations/{organization}/so" +
      "urces/{source}/findings/{finding}\0224folde" +
      "rs/{folder}/sources/{source}/findings/{f" +
      "inding}\0226projects/{project}/sources/{sou" +
      "rce}/findings/{finding}B\332\001\n\"com.google.c" +
      "loud.securitycenter.v1P\001ZLgoogle.golang." +
      "org/genproto/googleapis/cloud/securityce" +
      "nter/v1;securitycenter\252\002\036Google.Cloud.Se" +
      "curityCenter.V1\312\002\036Google\\Cloud\\SecurityC" +
      "enter\\V1\352\002!Google::Cloud::SecurityCenter" +
      "::V1b\006proto3"
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
          com.google.cloud.securitycenter.v1.ExfiltrationProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.ExternalSystemProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.IamBindingProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.IndicatorProto.getDescriptor(),
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
        new java.lang.String[] { "Name", "Parent", "ResourceName", "State", "Category", "ExternalUri", "SourceProperties", "SecurityMarks", "EventTime", "CreateTime", "Severity", "CanonicalName", "Mute", "FindingClass", "Indicator", "Vulnerability", "MuteUpdateTime", "ExternalSystems", "MitreAttack", "Access", "Connections", "MuteInitiator", "Processes", "Contacts", "Compliances", "Description", "Exfiltration", "IamBindings", "NextSteps", });
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
    com.google.cloud.securitycenter.v1.ExfiltrationProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ExternalSystemProto.getDescriptor();
    com.google.cloud.securitycenter.v1.IamBindingProto.getDescriptor();
    com.google.cloud.securitycenter.v1.IndicatorProto.getDescriptor();
    com.google.cloud.securitycenter.v1.MitreAttackProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ProcessProto.getDescriptor();
    com.google.cloud.securitycenter.v1.SecurityMarksOuterClass.getDescriptor();
    com.google.cloud.securitycenter.v1.VulnerabilityProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
