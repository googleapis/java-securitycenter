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
// source: google/cloud/securitycenter/v1/process.proto

package com.google.cloud.securitycenter.v1;

public final class ProcessProto {
  private ProcessProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Process_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Process_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_EnvironmentVariable_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_EnvironmentVariable_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/securitycenter/v1/process"
          + ".proto\022\036google.cloud.securitycenter.v1\032)"
          + "google/cloud/securitycenter/v1/file.prot"
          + "o\"\365\002\n\007Process\022\014\n\004name\030\014 \001(\t\0224\n\006binary\030\003 "
          + "\001(\0132$.google.cloud.securitycenter.v1.Fil"
          + "e\0227\n\tlibraries\030\004 \003(\0132$.google.cloud.secu"
          + "ritycenter.v1.File\0224\n\006script\030\005 \001(\0132$.goo"
          + "gle.cloud.securitycenter.v1.File\022\014\n\004args"
          + "\030\006 \003(\t\022\033\n\023arguments_truncated\030\007 \001(\010\022J\n\re"
          + "nv_variables\030\010 \003(\01323.google.cloud.securi"
          + "tycenter.v1.EnvironmentVariable\022\037\n\027env_v"
          + "ariables_truncated\030\t \001(\010\022\013\n\003pid\030\n \001(\003\022\022\n"
          + "\nparent_pid\030\013 \001(\003\"0\n\023EnvironmentVariable"
          + "\022\014\n\004name\030\001 \001(\t\022\013\n\003val\030\002 \001(\tB\350\001\n\"com.goog"
          + "le.cloud.securitycenter.v1B\014ProcessProto"
          + "P\001ZLgoogle.golang.org/genproto/googleapi"
          + "s/cloud/securitycenter/v1;securitycenter"
          + "\252\002\036Google.Cloud.SecurityCenter.V1\312\002\036Goog"
          + "le\\Cloud\\SecurityCenter\\V1\352\002!Google::Clo"
          + "ud::SecurityCenter::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.securitycenter.v1.FileProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1_Process_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_Process_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Process_descriptor,
            new java.lang.String[] {
              "Name",
              "Binary",
              "Libraries",
              "Script",
              "Args",
              "ArgumentsTruncated",
              "EnvVariables",
              "EnvVariablesTruncated",
              "Pid",
              "ParentPid",
            });
    internal_static_google_cloud_securitycenter_v1_EnvironmentVariable_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_securitycenter_v1_EnvironmentVariable_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_EnvironmentVariable_descriptor,
            new java.lang.String[] {
              "Name", "Val",
            });
    com.google.cloud.securitycenter.v1.FileProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
