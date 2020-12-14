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
// source: google/cloud/securitycenter/v1/finding.proto

package com.google.cloud.securitycenter.v1;

public interface FindingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.Finding)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The relative resource name of this finding. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}"
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The relative resource name of this finding. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}"
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The relative resource name of the source the finding belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * This field is immutable after creation time.
   * For example:
   * "organizations/{organization_id}/sources/{source_id}"
   * </pre>
   *
   * <code>string parent = 2;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The relative resource name of the source the finding belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * This field is immutable after creation time.
   * For example:
   * "organizations/{organization_id}/sources/{source_id}"
   * </pre>
   *
   * <code>string parent = 2;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * For findings on Google Cloud resources, the full resource
   * name of the Google Cloud resource this finding is for. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * When the finding is for a non-Google Cloud resource, the resourceName can
   * be a customer or partner defined string. This field is immutable after
   * creation time.
   * </pre>
   *
   * <code>string resource_name = 3;</code>
   *
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   *
   *
   * <pre>
   * For findings on Google Cloud resources, the full resource
   * name of the Google Cloud resource this finding is for. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * When the finding is for a non-Google Cloud resource, the resourceName can
   * be a customer or partner defined string. This field is immutable after
   * creation time.
   * </pre>
   *
   * <code>string resource_name = 3;</code>
   *
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString getResourceNameBytes();

  /**
   *
   *
   * <pre>
   * The state of the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding.State state = 4;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The state of the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding.State state = 4;</code>
   *
   * @return The state.
   */
  com.google.cloud.securitycenter.v1.Finding.State getState();

  /**
   *
   *
   * <pre>
   * The additional taxonomy group within findings from a given source.
   * This field is immutable after creation time.
   * Example: "XSS_FLASH_INJECTION"
   * </pre>
   *
   * <code>string category = 5;</code>
   *
   * @return The category.
   */
  java.lang.String getCategory();
  /**
   *
   *
   * <pre>
   * The additional taxonomy group within findings from a given source.
   * This field is immutable after creation time.
   * Example: "XSS_FLASH_INJECTION"
   * </pre>
   *
   * <code>string category = 5;</code>
   *
   * @return The bytes for category.
   */
  com.google.protobuf.ByteString getCategoryBytes();

  /**
   *
   *
   * <pre>
   * The URI that, if available, points to a web page outside of Security
   * Command Center where additional information about the finding can be found.
   * This field is guaranteed to be either empty or a well formed URL.
   * </pre>
   *
   * <code>string external_uri = 6;</code>
   *
   * @return The externalUri.
   */
  java.lang.String getExternalUri();
  /**
   *
   *
   * <pre>
   * The URI that, if available, points to a web page outside of Security
   * Command Center where additional information about the finding can be found.
   * This field is guaranteed to be either empty or a well formed URL.
   * </pre>
   *
   * <code>string external_uri = 6;</code>
   *
   * @return The bytes for externalUri.
   */
  com.google.protobuf.ByteString getExternalUriBytes();

  /**
   *
   *
   * <pre>
   * Source specific properties. These properties are managed by the source
   * that writes the finding. The key names in the source_properties map must be
   * between 1 and 255 characters, and must start with a letter and contain
   * alphanumeric characters or underscores only.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; source_properties = 7;</code>
   */
  int getSourcePropertiesCount();
  /**
   *
   *
   * <pre>
   * Source specific properties. These properties are managed by the source
   * that writes the finding. The key names in the source_properties map must be
   * between 1 and 255 characters, and must start with a letter and contain
   * alphanumeric characters or underscores only.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; source_properties = 7;</code>
   */
  boolean containsSourceProperties(java.lang.String key);
  /** Use {@link #getSourcePropertiesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value> getSourceProperties();
  /**
   *
   *
   * <pre>
   * Source specific properties. These properties are managed by the source
   * that writes the finding. The key names in the source_properties map must be
   * between 1 and 255 characters, and must start with a letter and contain
   * alphanumeric characters or underscores only.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; source_properties = 7;</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value> getSourcePropertiesMap();
  /**
   *
   *
   * <pre>
   * Source specific properties. These properties are managed by the source
   * that writes the finding. The key names in the source_properties map must be
   * between 1 and 255 characters, and must start with a letter and contain
   * alphanumeric characters or underscores only.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; source_properties = 7;</code>
   */
  com.google.protobuf.Value getSourcePropertiesOrDefault(
      java.lang.String key, com.google.protobuf.Value defaultValue);
  /**
   *
   *
   * <pre>
   * Source specific properties. These properties are managed by the source
   * that writes the finding. The key names in the source_properties map must be
   * between 1 and 255 characters, and must start with a letter and contain
   * alphanumeric characters or underscores only.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; source_properties = 7;</code>
   */
  com.google.protobuf.Value getSourcePropertiesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. User specified security marks. These marks are entirely
   * managed by the user and come from the SecurityMarks resource that belongs
   * to the finding.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.SecurityMarks security_marks = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the securityMarks field is set.
   */
  boolean hasSecurityMarks();
  /**
   *
   *
   * <pre>
   * Output only. User specified security marks. These marks are entirely
   * managed by the user and come from the SecurityMarks resource that belongs
   * to the finding.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.SecurityMarks security_marks = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The securityMarks.
   */
  com.google.cloud.securitycenter.v1.SecurityMarks getSecurityMarks();
  /**
   *
   *
   * <pre>
   * Output only. User specified security marks. These marks are entirely
   * managed by the user and come from the SecurityMarks resource that belongs
   * to the finding.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.SecurityMarks security_marks = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.securitycenter.v1.SecurityMarksOrBuilder getSecurityMarksOrBuilder();

  /**
   *
   *
   * <pre>
   * The time at which the event took place, or when an update to the finding
   * occurred. For example, if the finding represents an open firewall it would
   * capture the time the detector believes the firewall became open. The
   * accuracy is determined by the detector. If the finding were to be resolved
   * afterward, this time would reflect when the finding was resolved.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 9;</code>
   *
   * @return Whether the eventTime field is set.
   */
  boolean hasEventTime();
  /**
   *
   *
   * <pre>
   * The time at which the event took place, or when an update to the finding
   * occurred. For example, if the finding represents an open firewall it would
   * capture the time the detector believes the firewall became open. The
   * accuracy is determined by the detector. If the finding were to be resolved
   * afterward, this time would reflect when the finding was resolved.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 9;</code>
   *
   * @return The eventTime.
   */
  com.google.protobuf.Timestamp getEventTime();
  /**
   *
   *
   * <pre>
   * The time at which the event took place, or when an update to the finding
   * occurred. For example, if the finding represents an open firewall it would
   * capture the time the detector believes the firewall became open. The
   * accuracy is determined by the detector. If the finding were to be resolved
   * afterward, this time would reflect when the finding was resolved.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time at which the finding was created in Security Command Center.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The time at which the finding was created in Security Command Center.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The time at which the finding was created in Security Command Center.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The severity of the finding. This field is managed by the source that
   * writes the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding.Severity severity = 12;</code>
   *
   * @return The enum numeric value on the wire for severity.
   */
  int getSeverityValue();
  /**
   *
   *
   * <pre>
   * The severity of the finding. This field is managed by the source that
   * writes the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding.Severity severity = 12;</code>
   *
   * @return The severity.
   */
  com.google.cloud.securitycenter.v1.Finding.Severity getSeverity();
}
