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
package com.google.cloud.securitycenter.v1.stub;

import static com.google.cloud.securitycenter.v1.SecurityCenterClient.GroupAssetsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.GroupFindingsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListAssetsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListFindingsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListNotificationConfigsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListSourcesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.securitycenter.v1.CreateFindingRequest;
import com.google.cloud.securitycenter.v1.CreateNotificationConfigRequest;
import com.google.cloud.securitycenter.v1.CreateSourceRequest;
import com.google.cloud.securitycenter.v1.DeleteNotificationConfigRequest;
import com.google.cloud.securitycenter.v1.Finding;
import com.google.cloud.securitycenter.v1.GetNotificationConfigRequest;
import com.google.cloud.securitycenter.v1.GetOrganizationSettingsRequest;
import com.google.cloud.securitycenter.v1.GetSourceRequest;
import com.google.cloud.securitycenter.v1.GroupAssetsRequest;
import com.google.cloud.securitycenter.v1.GroupAssetsResponse;
import com.google.cloud.securitycenter.v1.GroupFindingsRequest;
import com.google.cloud.securitycenter.v1.GroupFindingsResponse;
import com.google.cloud.securitycenter.v1.ListAssetsRequest;
import com.google.cloud.securitycenter.v1.ListAssetsResponse;
import com.google.cloud.securitycenter.v1.ListFindingsRequest;
import com.google.cloud.securitycenter.v1.ListFindingsResponse;
import com.google.cloud.securitycenter.v1.ListNotificationConfigsRequest;
import com.google.cloud.securitycenter.v1.ListNotificationConfigsResponse;
import com.google.cloud.securitycenter.v1.ListSourcesRequest;
import com.google.cloud.securitycenter.v1.ListSourcesResponse;
import com.google.cloud.securitycenter.v1.NotificationConfig;
import com.google.cloud.securitycenter.v1.OrganizationSettings;
import com.google.cloud.securitycenter.v1.RunAssetDiscoveryRequest;
import com.google.cloud.securitycenter.v1.RunAssetDiscoveryResponse;
import com.google.cloud.securitycenter.v1.SecurityMarks;
import com.google.cloud.securitycenter.v1.SetFindingStateRequest;
import com.google.cloud.securitycenter.v1.Source;
import com.google.cloud.securitycenter.v1.UpdateFindingRequest;
import com.google.cloud.securitycenter.v1.UpdateNotificationConfigRequest;
import com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest;
import com.google.cloud.securitycenter.v1.UpdateSecurityMarksRequest;
import com.google.cloud.securitycenter.v1.UpdateSourceRequest;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Cloud Security Command Center API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class SecurityCenterStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: getIamPolicyCallable()");
  }

  public UnaryCallable<GroupAssetsRequest, GroupAssetsPagedResponse> groupAssetsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: groupAssetsPagedCallable()");
  }

  public UnaryCallable<GroupAssetsRequest, GroupAssetsResponse> groupAssetsCallable() {
    throw new UnsupportedOperationException("Not implemented: groupAssetsCallable()");
  }

  public UnaryCallable<GroupFindingsRequest, GroupFindingsPagedResponse>
      groupFindingsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: groupFindingsPagedCallable()");
  }

  public UnaryCallable<GroupFindingsRequest, GroupFindingsResponse> groupFindingsCallable() {
    throw new UnsupportedOperationException("Not implemented: groupFindingsCallable()");
  }

  public UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    throw new UnsupportedOperationException("Not implemented: testIamPermissionsCallable()");
  }

  public UnaryCallable<CreateSourceRequest, Source> createSourceCallable() {
    throw new UnsupportedOperationException("Not implemented: createSourceCallable()");
  }

  public UnaryCallable<CreateFindingRequest, Finding> createFindingCallable() {
    throw new UnsupportedOperationException("Not implemented: createFindingCallable()");
  }

  public UnaryCallable<CreateNotificationConfigRequest, NotificationConfig>
      createNotificationConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: createNotificationConfigCallable()");
  }

  public UnaryCallable<DeleteNotificationConfigRequest, Empty> deleteNotificationConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteNotificationConfigCallable()");
  }

  public UnaryCallable<GetNotificationConfigRequest, NotificationConfig>
      getNotificationConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: getNotificationConfigCallable()");
  }

  public UnaryCallable<GetOrganizationSettingsRequest, OrganizationSettings>
      getOrganizationSettingsCallable() {
    throw new UnsupportedOperationException("Not implemented: getOrganizationSettingsCallable()");
  }

  public UnaryCallable<GetSourceRequest, Source> getSourceCallable() {
    throw new UnsupportedOperationException("Not implemented: getSourceCallable()");
  }

  public UnaryCallable<ListAssetsRequest, ListAssetsPagedResponse> listAssetsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listAssetsPagedCallable()");
  }

  public UnaryCallable<ListAssetsRequest, ListAssetsResponse> listAssetsCallable() {
    throw new UnsupportedOperationException("Not implemented: listAssetsCallable()");
  }

  public UnaryCallable<ListFindingsRequest, ListFindingsPagedResponse> listFindingsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listFindingsPagedCallable()");
  }

  public UnaryCallable<ListFindingsRequest, ListFindingsResponse> listFindingsCallable() {
    throw new UnsupportedOperationException("Not implemented: listFindingsCallable()");
  }

  public UnaryCallable<ListNotificationConfigsRequest, ListNotificationConfigsPagedResponse>
      listNotificationConfigsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listNotificationConfigsPagedCallable()");
  }

  public UnaryCallable<ListNotificationConfigsRequest, ListNotificationConfigsResponse>
      listNotificationConfigsCallable() {
    throw new UnsupportedOperationException("Not implemented: listNotificationConfigsCallable()");
  }

  public UnaryCallable<ListSourcesRequest, ListSourcesPagedResponse> listSourcesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listSourcesPagedCallable()");
  }

  public UnaryCallable<ListSourcesRequest, ListSourcesResponse> listSourcesCallable() {
    throw new UnsupportedOperationException("Not implemented: listSourcesCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<RunAssetDiscoveryRequest, RunAssetDiscoveryResponse, Empty>
      runAssetDiscoveryOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: runAssetDiscoveryOperationCallable()");
  }

  public UnaryCallable<RunAssetDiscoveryRequest, Operation> runAssetDiscoveryCallable() {
    throw new UnsupportedOperationException("Not implemented: runAssetDiscoveryCallable()");
  }

  public UnaryCallable<SetFindingStateRequest, Finding> setFindingStateCallable() {
    throw new UnsupportedOperationException("Not implemented: setFindingStateCallable()");
  }

  public UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: setIamPolicyCallable()");
  }

  public UnaryCallable<UpdateFindingRequest, Finding> updateFindingCallable() {
    throw new UnsupportedOperationException("Not implemented: updateFindingCallable()");
  }

  public UnaryCallable<UpdateNotificationConfigRequest, NotificationConfig>
      updateNotificationConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: updateNotificationConfigCallable()");
  }

  public UnaryCallable<UpdateOrganizationSettingsRequest, OrganizationSettings>
      updateOrganizationSettingsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateOrganizationSettingsCallable()");
  }

  public UnaryCallable<UpdateSourceRequest, Source> updateSourceCallable() {
    throw new UnsupportedOperationException("Not implemented: updateSourceCallable()");
  }

  public UnaryCallable<UpdateSecurityMarksRequest, SecurityMarks> updateSecurityMarksCallable() {
    throw new UnsupportedOperationException("Not implemented: updateSecurityMarksCallable()");
  }

  @Override
  public abstract void close();
}
