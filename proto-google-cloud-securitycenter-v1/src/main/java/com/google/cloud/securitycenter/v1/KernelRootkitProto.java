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
// source: google/cloud/securitycenter/v1/kernel_rootkit.proto

package com.google.cloud.securitycenter.v1;

public final class KernelRootkitProto {
  private KernelRootkitProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_KernelRootkit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_KernelRootkit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/securitycenter/v1/kernel_"
          + "rootkit.proto\022\036google.cloud.securitycent"
          + "er.v1\"\327\002\n\rKernelRootkit\022\014\n\004name\030\001 \001(\t\022$\n"
          + "\034unexpected_code_modification\030\002 \001(\010\022.\n&u"
          + "nexpected_read_only_data_modification\030\003 "
          + "\001(\010\022!\n\031unexpected_ftrace_handler\030\004 \001(\010\022!"
          + "\n\031unexpected_kprobe_handler\030\005 \001(\010\022$\n\034une"
          + "xpected_kernel_code_pages\030\006 \001(\010\022&\n\036unexp"
          + "ected_system_call_handler\030\007 \001(\010\022$\n\034unexp"
          + "ected_interrupt_handler\030\010 \001(\010\022(\n unexpec"
          + "ted_processes_in_runqueue\030\t \001(\010B\356\001\n\"com."
          + "google.cloud.securitycenter.v1B\022KernelRo"
          + "otkitProtoP\001ZLgoogle.golang.org/genproto"
          + "/googleapis/cloud/securitycenter/v1;secu"
          + "ritycenter\252\002\036Google.Cloud.SecurityCenter"
          + ".V1\312\002\036Google\\Cloud\\SecurityCenter\\V1\352\002!G"
          + "oogle::Cloud::SecurityCenter::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_securitycenter_v1_KernelRootkit_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_KernelRootkit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_KernelRootkit_descriptor,
            new java.lang.String[] {
              "Name",
              "UnexpectedCodeModification",
              "UnexpectedReadOnlyDataModification",
              "UnexpectedFtraceHandler",
              "UnexpectedKprobeHandler",
              "UnexpectedKernelCodePages",
              "UnexpectedSystemCallHandler",
              "UnexpectedInterruptHandler",
              "UnexpectedProcessesInRunqueue",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
