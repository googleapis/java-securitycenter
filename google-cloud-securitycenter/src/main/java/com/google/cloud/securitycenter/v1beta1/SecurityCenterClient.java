/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.securitycenter.v1beta1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.resourcenames.ResourceName;
import com.google.cloud.securitycenter.v1beta1.stub.SecurityCenterStub;
import com.google.cloud.securitycenter.v1beta1.stub.SecurityCenterStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import com.google.protobuf.Empty;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: V1 Beta APIs for Security Center service.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the SecurityCenterClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of SecurityCenterSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * SecurityCenterSettings securityCenterSettings =
 *     SecurityCenterSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SecurityCenterClient securityCenterClient = SecurityCenterClient.create(securityCenterSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * SecurityCenterSettings securityCenterSettings =
 *     SecurityCenterSettings.newBuilder().setEndpoint(myEndpoint).build();
 * SecurityCenterClient securityCenterClient = SecurityCenterClient.create(securityCenterSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator")
public class SecurityCenterClient implements BackgroundResource {
  private final SecurityCenterSettings settings;
  private final SecurityCenterStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of SecurityCenterClient with default settings. */
  public static final SecurityCenterClient create() throws IOException {
    return create(SecurityCenterSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SecurityCenterClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final SecurityCenterClient create(SecurityCenterSettings settings)
      throws IOException {
    return new SecurityCenterClient(settings);
  }

  /**
   * Constructs an instance of SecurityCenterClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(SecurityCenterSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final SecurityCenterClient create(SecurityCenterStub stub) {
    return new SecurityCenterClient(stub);
  }

  /**
   * Constructs an instance of SecurityCenterClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected SecurityCenterClient(SecurityCenterSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((SecurityCenterStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected SecurityCenterClient(SecurityCenterStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final SecurityCenterSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public SecurityCenterStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a source.
   *
   * @param parent Required. Resource name of the new source's parent. Its format should be
   *     "organizations/[organization_id]".
   * @param source Required. The Source being created, only the display_name and description will be
   *     used. All other fields will be ignored.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Source createSource(OrganizationName parent, Source source) {
    CreateSourceRequest request =
        CreateSourceRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setSource(source)
            .build();
    return createSource(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a source.
   *
   * @param parent Required. Resource name of the new source's parent. Its format should be
   *     "organizations/[organization_id]".
   * @param source Required. The Source being created, only the display_name and description will be
   *     used. All other fields will be ignored.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Source createSource(String parent, Source source) {
    CreateSourceRequest request =
        CreateSourceRequest.newBuilder().setParent(parent).setSource(source).build();
    return createSource(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a source.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Source createSource(CreateSourceRequest request) {
    return createSourceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a source.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<CreateSourceRequest, Source> createSourceCallable() {
    return stub.createSourceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a finding. The corresponding source must exist for finding creation to succeed.
   *
   * @param parent Required. Resource name of the new finding's parent. Its format should be
   *     "organizations/[organization_id]/sources/[source_id]".
   * @param finding_id Required. Unique identifier provided by the client within the parent scope.
   *     It must be alphanumeric and less than or equal to 32 characters and greater than 0
   *     characters in length.
   * @param finding Required. The Finding being created. The name and security_marks will be ignored
   *     as they are both output only fields on this resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding createFinding(SourceName parent, String findingId, Finding finding) {
    CreateFindingRequest request =
        CreateFindingRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setFindingId(findingId)
            .setFinding(finding)
            .build();
    return createFinding(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a finding. The corresponding source must exist for finding creation to succeed.
   *
   * @param parent Required. Resource name of the new finding's parent. Its format should be
   *     "organizations/[organization_id]/sources/[source_id]".
   * @param finding_id Required. Unique identifier provided by the client within the parent scope.
   *     It must be alphanumeric and less than or equal to 32 characters and greater than 0
   *     characters in length.
   * @param finding Required. The Finding being created. The name and security_marks will be ignored
   *     as they are both output only fields on this resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding createFinding(String parent, String findingId, Finding finding) {
    CreateFindingRequest request =
        CreateFindingRequest.newBuilder()
            .setParent(parent)
            .setFindingId(findingId)
            .setFinding(finding)
            .build();
    return createFinding(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a finding. The corresponding source must exist for finding creation to succeed.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding createFinding(CreateFindingRequest request) {
    return createFindingCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a finding. The corresponding source must exist for finding creation to succeed.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<CreateFindingRequest, Finding> createFindingCallable() {
    return stub.createFindingCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy on the specified Source.
   *
   * @param resource REQUIRED: The resource for which the policy is being requested. See the
   *     operation documentation for the appropriate value for this field.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(ResourceName resource) {
    GetIamPolicyRequest request =
        GetIamPolicyRequest.newBuilder()
            .setResource(resource == null ? null : resource.toString())
            .build();
    return getIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy on the specified Source.
   *
   * @param resource REQUIRED: The resource for which the policy is being requested. See the
   *     operation documentation for the appropriate value for this field.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(String resource) {
    GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder().setResource(resource).build();
    return getIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy on the specified Source.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(GetIamPolicyRequest request) {
    return getIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy on the specified Source.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    return stub.getIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the settings for an organization.
   *
   * @param name Required. Name of the organization to get organization settings for. Its format is
   *     "organizations/[organization_id]/organizationSettings".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OrganizationSettings getOrganizationSettings(OrganizationSettingsName name) {
    GetOrganizationSettingsRequest request =
        GetOrganizationSettingsRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getOrganizationSettings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the settings for an organization.
   *
   * @param name Required. Name of the organization to get organization settings for. Its format is
   *     "organizations/[organization_id]/organizationSettings".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OrganizationSettings getOrganizationSettings(String name) {
    GetOrganizationSettingsRequest request =
        GetOrganizationSettingsRequest.newBuilder().setName(name).build();
    return getOrganizationSettings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the settings for an organization.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OrganizationSettings getOrganizationSettings(
      GetOrganizationSettingsRequest request) {
    return getOrganizationSettingsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the settings for an organization.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetOrganizationSettingsRequest, OrganizationSettings>
      getOrganizationSettingsCallable() {
    return stub.getOrganizationSettingsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a source.
   *
   * @param name Required. Relative resource name of the source. Its format is
   *     "organizations/[organization_id]/source/[source_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Source getSource(SourceName name) {
    GetSourceRequest request =
        GetSourceRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getSource(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a source.
   *
   * @param name Required. Relative resource name of the source. Its format is
   *     "organizations/[organization_id]/source/[source_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Source getSource(String name) {
    GetSourceRequest request = GetSourceRequest.newBuilder().setName(name).build();
    return getSource(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a source.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Source getSource(GetSourceRequest request) {
    return getSourceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a source.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetSourceRequest, Source> getSourceCallable() {
    return stub.getSourceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Filters an organization's assets and groups them by their specified properties.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GroupAssetsPagedResponse groupAssets(GroupAssetsRequest request) {
    return groupAssetsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Filters an organization's assets and groups them by their specified properties.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GroupAssetsRequest, GroupAssetsPagedResponse>
      groupAssetsPagedCallable() {
    return stub.groupAssetsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Filters an organization's assets and groups them by their specified properties.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GroupAssetsRequest, GroupAssetsResponse> groupAssetsCallable() {
    return stub.groupAssetsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Filters an organization or source's findings and groups them by their specified properties.
   *
   * <p>To group across all sources provide a `-` as the source id. Example:
   * /v1beta1/organizations/{organization_id}/sources/-/findings
   *
   * @param parent Required. Name of the source to groupBy. Its format is
   *     "organizations/[organization_id]/sources/[source_id]". To groupBy across all sources
   *     provide a source_id of `-`. For example: organizations/{organization_id}/sources/-
   * @param group_by Required. Expression that defines what assets fields to use for grouping
   *     (including `state`). The string value should follow SQL syntax: comma separated list of
   *     fields. For example: "parent,resource_name".
   *     <p>The following fields are supported:
   *     <ul>
   *       <li>resource_name
   *       <li>category
   *       <li>state
   *       <li>parent
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GroupFindingsPagedResponse groupFindings(SourceName parent, String groupBy) {
    GroupFindingsRequest request =
        GroupFindingsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setGroupBy(groupBy)
            .build();
    return groupFindings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Filters an organization or source's findings and groups them by their specified properties.
   *
   * <p>To group across all sources provide a `-` as the source id. Example:
   * /v1beta1/organizations/{organization_id}/sources/-/findings
   *
   * @param parent Required. Name of the source to groupBy. Its format is
   *     "organizations/[organization_id]/sources/[source_id]". To groupBy across all sources
   *     provide a source_id of `-`. For example: organizations/{organization_id}/sources/-
   * @param group_by Required. Expression that defines what assets fields to use for grouping
   *     (including `state`). The string value should follow SQL syntax: comma separated list of
   *     fields. For example: "parent,resource_name".
   *     <p>The following fields are supported:
   *     <ul>
   *       <li>resource_name
   *       <li>category
   *       <li>state
   *       <li>parent
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GroupFindingsPagedResponse groupFindings(String parent, String groupBy) {
    GroupFindingsRequest request =
        GroupFindingsRequest.newBuilder().setParent(parent).setGroupBy(groupBy).build();
    return groupFindings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Filters an organization or source's findings and groups them by their specified properties.
   *
   * <p>To group across all sources provide a `-` as the source id. Example:
   * /v1beta1/organizations/{organization_id}/sources/-/findings
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GroupFindingsPagedResponse groupFindings(GroupFindingsRequest request) {
    return groupFindingsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Filters an organization or source's findings and groups them by their specified properties.
   *
   * <p>To group across all sources provide a `-` as the source id. Example:
   * /v1beta1/organizations/{organization_id}/sources/-/findings
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GroupFindingsRequest, GroupFindingsPagedResponse>
      groupFindingsPagedCallable() {
    return stub.groupFindingsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Filters an organization or source's findings and groups them by their specified properties.
   *
   * <p>To group across all sources provide a `-` as the source id. Example:
   * /v1beta1/organizations/{organization_id}/sources/-/findings
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GroupFindingsRequest, GroupFindingsResponse> groupFindingsCallable() {
    return stub.groupFindingsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists an organization's assets.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAssetsPagedResponse listAssets(ListAssetsRequest request) {
    return listAssetsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists an organization's assets.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListAssetsRequest, ListAssetsPagedResponse> listAssetsPagedCallable() {
    return stub.listAssetsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists an organization's assets.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListAssetsRequest, ListAssetsResponse> listAssetsCallable() {
    return stub.listAssetsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists an organization or source's findings.
   *
   * <p>To list across all sources provide a `-` as the source id. Example:
   * /v1beta1/organizations/{organization_id}/sources/-/findings
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFindingsPagedResponse listFindings(ListFindingsRequest request) {
    return listFindingsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists an organization or source's findings.
   *
   * <p>To list across all sources provide a `-` as the source id. Example:
   * /v1beta1/organizations/{organization_id}/sources/-/findings
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListFindingsRequest, ListFindingsPagedResponse>
      listFindingsPagedCallable() {
    return stub.listFindingsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists an organization or source's findings.
   *
   * <p>To list across all sources provide a `-` as the source id. Example:
   * /v1beta1/organizations/{organization_id}/sources/-/findings
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListFindingsRequest, ListFindingsResponse> listFindingsCallable() {
    return stub.listFindingsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all sources belonging to an organization.
   *
   * @param parent Required. Resource name of the parent of sources to list. Its format should be
   *     "organizations/[organization_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSourcesPagedResponse listSources(OrganizationName parent) {
    ListSourcesRequest request =
        ListSourcesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listSources(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all sources belonging to an organization.
   *
   * @param parent Required. Resource name of the parent of sources to list. Its format should be
   *     "organizations/[organization_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSourcesPagedResponse listSources(String parent) {
    ListSourcesRequest request = ListSourcesRequest.newBuilder().setParent(parent).build();
    return listSources(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all sources belonging to an organization.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSourcesPagedResponse listSources(ListSourcesRequest request) {
    return listSourcesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all sources belonging to an organization.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListSourcesRequest, ListSourcesPagedResponse>
      listSourcesPagedCallable() {
    return stub.listSourcesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all sources belonging to an organization.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListSourcesRequest, ListSourcesResponse> listSourcesCallable() {
    return stub.listSourcesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Runs asset discovery. The discovery is tracked with a long-running operation.
   *
   * <p>This API can only be called with limited frequency for an organization. If it is called too
   * frequently the caller will receive a TOO_MANY_REQUESTS error.
   *
   * @param parent Required. Name of the organization to run asset discovery for. Its format is
   *     "organizations/[organization_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, Empty> runAssetDiscoveryAsync(OrganizationName parent) {
    RunAssetDiscoveryRequest request =
        RunAssetDiscoveryRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return runAssetDiscoveryAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Runs asset discovery. The discovery is tracked with a long-running operation.
   *
   * <p>This API can only be called with limited frequency for an organization. If it is called too
   * frequently the caller will receive a TOO_MANY_REQUESTS error.
   *
   * @param parent Required. Name of the organization to run asset discovery for. Its format is
   *     "organizations/[organization_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, Empty> runAssetDiscoveryAsync(String parent) {
    RunAssetDiscoveryRequest request =
        RunAssetDiscoveryRequest.newBuilder().setParent(parent).build();
    return runAssetDiscoveryAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Runs asset discovery. The discovery is tracked with a long-running operation.
   *
   * <p>This API can only be called with limited frequency for an organization. If it is called too
   * frequently the caller will receive a TOO_MANY_REQUESTS error.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, Empty> runAssetDiscoveryAsync(
      RunAssetDiscoveryRequest request) {
    return runAssetDiscoveryOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Runs asset discovery. The discovery is tracked with a long-running operation.
   *
   * <p>This API can only be called with limited frequency for an organization. If it is called too
   * frequently the caller will receive a TOO_MANY_REQUESTS error.
   *
   * <p>Sample code:
   */
  public final OperationCallable<RunAssetDiscoveryRequest, Empty, Empty>
      runAssetDiscoveryOperationCallable() {
    return stub.runAssetDiscoveryOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Runs asset discovery. The discovery is tracked with a long-running operation.
   *
   * <p>This API can only be called with limited frequency for an organization. If it is called too
   * frequently the caller will receive a TOO_MANY_REQUESTS error.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<RunAssetDiscoveryRequest, Operation> runAssetDiscoveryCallable() {
    return stub.runAssetDiscoveryCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the state of a finding.
   *
   * @param name Required. The relative resource name of the finding. See:
   *     https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   *     "organizations/{organization_id}/sources/{source_id}/finding/{finding_id}".
   * @param state Required. The desired State of the finding.
   * @param start_time Required. The time at which the updated state takes effect.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding setFindingState(FindingName name, Finding.State state, Timestamp startTime) {
    SetFindingStateRequest request =
        SetFindingStateRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setState(state)
            .setStartTime(startTime)
            .build();
    return setFindingState(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the state of a finding.
   *
   * @param name Required. The relative resource name of the finding. See:
   *     https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   *     "organizations/{organization_id}/sources/{source_id}/finding/{finding_id}".
   * @param state Required. The desired State of the finding.
   * @param start_time Required. The time at which the updated state takes effect.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding setFindingState(String name, Finding.State state, Timestamp startTime) {
    SetFindingStateRequest request =
        SetFindingStateRequest.newBuilder()
            .setName(name)
            .setState(state)
            .setStartTime(startTime)
            .build();
    return setFindingState(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the state of a finding.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding setFindingState(SetFindingStateRequest request) {
    return setFindingStateCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the state of a finding.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<SetFindingStateRequest, Finding> setFindingStateCallable() {
    return stub.setFindingStateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified Source.
   *
   * @param resource REQUIRED: The resource for which the policy is being specified. See the
   *     operation documentation for the appropriate value for this field.
   * @param policy REQUIRED: The complete policy to be applied to the `resource`. The size of the
   *     policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud
   *     Platform services (such as Projects) might reject them.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(ResourceName resource, Policy policy) {
    SetIamPolicyRequest request =
        SetIamPolicyRequest.newBuilder()
            .setResource(resource == null ? null : resource.toString())
            .setPolicy(policy)
            .build();
    return setIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified Source.
   *
   * @param resource REQUIRED: The resource for which the policy is being specified. See the
   *     operation documentation for the appropriate value for this field.
   * @param policy REQUIRED: The complete policy to be applied to the `resource`. The size of the
   *     policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud
   *     Platform services (such as Projects) might reject them.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(String resource, Policy policy) {
    SetIamPolicyRequest request =
        SetIamPolicyRequest.newBuilder().setResource(resource).setPolicy(policy).build();
    return setIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified Source.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(SetIamPolicyRequest request) {
    return setIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified Source.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    return stub.setIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the permissions that a caller has on the specified source.
   *
   * @param resource REQUIRED: The resource for which the policy detail is being requested. See the
   *     operation documentation for the appropriate value for this field.
   * @param permissions The set of permissions to check for the `resource`. Permissions with
   *     wildcards (such as '&#42;' or 'storage.&#42;') are not allowed. For more information see
   *     [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestIamPermissionsResponse testIamPermissions(
      ResourceName resource, List<String> permissions) {
    TestIamPermissionsRequest request =
        TestIamPermissionsRequest.newBuilder()
            .setResource(resource == null ? null : resource.toString())
            .addAllPermissions(permissions)
            .build();
    return testIamPermissions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the permissions that a caller has on the specified source.
   *
   * @param resource REQUIRED: The resource for which the policy detail is being requested. See the
   *     operation documentation for the appropriate value for this field.
   * @param permissions The set of permissions to check for the `resource`. Permissions with
   *     wildcards (such as '&#42;' or 'storage.&#42;') are not allowed. For more information see
   *     [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestIamPermissionsResponse testIamPermissions(
      String resource, List<String> permissions) {
    TestIamPermissionsRequest request =
        TestIamPermissionsRequest.newBuilder()
            .setResource(resource)
            .addAllPermissions(permissions)
            .build();
    return testIamPermissions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the permissions that a caller has on the specified source.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestIamPermissionsResponse testIamPermissions(TestIamPermissionsRequest request) {
    return testIamPermissionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the permissions that a caller has on the specified source.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return stub.testIamPermissionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates a finding. The corresponding source must exist for a finding creation to
   * succeed.
   *
   * @param finding Required. The finding resource to update or create if it does not already exist.
   *     parent, security_marks, and update_time will be ignored.
   *     <p>In the case of creation, the finding id portion of the name must alphanumeric and less
   *     than or equal to 32 characters and greater than 0 characters in length.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding updateFinding(Finding finding) {
    UpdateFindingRequest request = UpdateFindingRequest.newBuilder().setFinding(finding).build();
    return updateFinding(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates a finding. The corresponding source must exist for a finding creation to
   * succeed.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding updateFinding(UpdateFindingRequest request) {
    return updateFindingCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates a finding. The corresponding source must exist for a finding creation to
   * succeed.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<UpdateFindingRequest, Finding> updateFindingCallable() {
    return stub.updateFindingCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an organization's settings.
   *
   * @param organization_settings Required. The organization settings resource to update.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OrganizationSettings updateOrganizationSettings(
      OrganizationSettings organizationSettings) {
    UpdateOrganizationSettingsRequest request =
        UpdateOrganizationSettingsRequest.newBuilder()
            .setOrganizationSettings(organizationSettings)
            .build();
    return updateOrganizationSettings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an organization's settings.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OrganizationSettings updateOrganizationSettings(
      UpdateOrganizationSettingsRequest request) {
    return updateOrganizationSettingsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an organization's settings.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<UpdateOrganizationSettingsRequest, OrganizationSettings>
      updateOrganizationSettingsCallable() {
    return stub.updateOrganizationSettingsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a source.
   *
   * @param source Required. The source resource to update.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Source updateSource(Source source) {
    UpdateSourceRequest request = UpdateSourceRequest.newBuilder().setSource(source).build();
    return updateSource(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a source.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Source updateSource(UpdateSourceRequest request) {
    return updateSourceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a source.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<UpdateSourceRequest, Source> updateSourceCallable() {
    return stub.updateSourceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates security marks.
   *
   * @param security_marks Required. The security marks resource to update.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SecurityMarks updateSecurityMarks(SecurityMarks securityMarks) {
    UpdateSecurityMarksRequest request =
        UpdateSecurityMarksRequest.newBuilder().setSecurityMarks(securityMarks).build();
    return updateSecurityMarks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates security marks.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SecurityMarks updateSecurityMarks(UpdateSecurityMarksRequest request) {
    return updateSecurityMarksCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates security marks.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<UpdateSecurityMarksRequest, SecurityMarks>
      updateSecurityMarksCallable() {
    return stub.updateSecurityMarksCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class GroupAssetsPagedResponse
      extends AbstractPagedListResponse<
          GroupAssetsRequest,
          GroupAssetsResponse,
          GroupResult,
          GroupAssetsPage,
          GroupAssetsFixedSizeCollection> {

    public static ApiFuture<GroupAssetsPagedResponse> createAsync(
        PageContext<GroupAssetsRequest, GroupAssetsResponse, GroupResult> context,
        ApiFuture<GroupAssetsResponse> futureResponse) {
      ApiFuture<GroupAssetsPage> futurePage =
          GroupAssetsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<GroupAssetsPage, GroupAssetsPagedResponse>() {
            @Override
            public GroupAssetsPagedResponse apply(GroupAssetsPage input) {
              return new GroupAssetsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private GroupAssetsPagedResponse(GroupAssetsPage page) {
      super(page, GroupAssetsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class GroupAssetsPage
      extends AbstractPage<GroupAssetsRequest, GroupAssetsResponse, GroupResult, GroupAssetsPage> {

    private GroupAssetsPage(
        PageContext<GroupAssetsRequest, GroupAssetsResponse, GroupResult> context,
        GroupAssetsResponse response) {
      super(context, response);
    }

    private static GroupAssetsPage createEmptyPage() {
      return new GroupAssetsPage(null, null);
    }

    @Override
    protected GroupAssetsPage createPage(
        PageContext<GroupAssetsRequest, GroupAssetsResponse, GroupResult> context,
        GroupAssetsResponse response) {
      return new GroupAssetsPage(context, response);
    }

    @Override
    public ApiFuture<GroupAssetsPage> createPageAsync(
        PageContext<GroupAssetsRequest, GroupAssetsResponse, GroupResult> context,
        ApiFuture<GroupAssetsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class GroupAssetsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          GroupAssetsRequest,
          GroupAssetsResponse,
          GroupResult,
          GroupAssetsPage,
          GroupAssetsFixedSizeCollection> {

    private GroupAssetsFixedSizeCollection(List<GroupAssetsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static GroupAssetsFixedSizeCollection createEmptyCollection() {
      return new GroupAssetsFixedSizeCollection(null, 0);
    }

    @Override
    protected GroupAssetsFixedSizeCollection createCollection(
        List<GroupAssetsPage> pages, int collectionSize) {
      return new GroupAssetsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class GroupFindingsPagedResponse
      extends AbstractPagedListResponse<
          GroupFindingsRequest,
          GroupFindingsResponse,
          GroupResult,
          GroupFindingsPage,
          GroupFindingsFixedSizeCollection> {

    public static ApiFuture<GroupFindingsPagedResponse> createAsync(
        PageContext<GroupFindingsRequest, GroupFindingsResponse, GroupResult> context,
        ApiFuture<GroupFindingsResponse> futureResponse) {
      ApiFuture<GroupFindingsPage> futurePage =
          GroupFindingsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<GroupFindingsPage, GroupFindingsPagedResponse>() {
            @Override
            public GroupFindingsPagedResponse apply(GroupFindingsPage input) {
              return new GroupFindingsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private GroupFindingsPagedResponse(GroupFindingsPage page) {
      super(page, GroupFindingsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class GroupFindingsPage
      extends AbstractPage<
          GroupFindingsRequest, GroupFindingsResponse, GroupResult, GroupFindingsPage> {

    private GroupFindingsPage(
        PageContext<GroupFindingsRequest, GroupFindingsResponse, GroupResult> context,
        GroupFindingsResponse response) {
      super(context, response);
    }

    private static GroupFindingsPage createEmptyPage() {
      return new GroupFindingsPage(null, null);
    }

    @Override
    protected GroupFindingsPage createPage(
        PageContext<GroupFindingsRequest, GroupFindingsResponse, GroupResult> context,
        GroupFindingsResponse response) {
      return new GroupFindingsPage(context, response);
    }

    @Override
    public ApiFuture<GroupFindingsPage> createPageAsync(
        PageContext<GroupFindingsRequest, GroupFindingsResponse, GroupResult> context,
        ApiFuture<GroupFindingsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class GroupFindingsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          GroupFindingsRequest,
          GroupFindingsResponse,
          GroupResult,
          GroupFindingsPage,
          GroupFindingsFixedSizeCollection> {

    private GroupFindingsFixedSizeCollection(List<GroupFindingsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static GroupFindingsFixedSizeCollection createEmptyCollection() {
      return new GroupFindingsFixedSizeCollection(null, 0);
    }

    @Override
    protected GroupFindingsFixedSizeCollection createCollection(
        List<GroupFindingsPage> pages, int collectionSize) {
      return new GroupFindingsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListAssetsPagedResponse
      extends AbstractPagedListResponse<
          ListAssetsRequest,
          ListAssetsResponse,
          ListAssetsResponse.ListAssetsResult,
          ListAssetsPage,
          ListAssetsFixedSizeCollection> {

    public static ApiFuture<ListAssetsPagedResponse> createAsync(
        PageContext<ListAssetsRequest, ListAssetsResponse, ListAssetsResponse.ListAssetsResult>
            context,
        ApiFuture<ListAssetsResponse> futureResponse) {
      ApiFuture<ListAssetsPage> futurePage =
          ListAssetsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListAssetsPage, ListAssetsPagedResponse>() {
            @Override
            public ListAssetsPagedResponse apply(ListAssetsPage input) {
              return new ListAssetsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListAssetsPagedResponse(ListAssetsPage page) {
      super(page, ListAssetsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListAssetsPage
      extends AbstractPage<
          ListAssetsRequest,
          ListAssetsResponse,
          ListAssetsResponse.ListAssetsResult,
          ListAssetsPage> {

    private ListAssetsPage(
        PageContext<ListAssetsRequest, ListAssetsResponse, ListAssetsResponse.ListAssetsResult>
            context,
        ListAssetsResponse response) {
      super(context, response);
    }

    private static ListAssetsPage createEmptyPage() {
      return new ListAssetsPage(null, null);
    }

    @Override
    protected ListAssetsPage createPage(
        PageContext<ListAssetsRequest, ListAssetsResponse, ListAssetsResponse.ListAssetsResult>
            context,
        ListAssetsResponse response) {
      return new ListAssetsPage(context, response);
    }

    @Override
    public ApiFuture<ListAssetsPage> createPageAsync(
        PageContext<ListAssetsRequest, ListAssetsResponse, ListAssetsResponse.ListAssetsResult>
            context,
        ApiFuture<ListAssetsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListAssetsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListAssetsRequest,
          ListAssetsResponse,
          ListAssetsResponse.ListAssetsResult,
          ListAssetsPage,
          ListAssetsFixedSizeCollection> {

    private ListAssetsFixedSizeCollection(List<ListAssetsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListAssetsFixedSizeCollection createEmptyCollection() {
      return new ListAssetsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListAssetsFixedSizeCollection createCollection(
        List<ListAssetsPage> pages, int collectionSize) {
      return new ListAssetsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListFindingsPagedResponse
      extends AbstractPagedListResponse<
          ListFindingsRequest,
          ListFindingsResponse,
          Finding,
          ListFindingsPage,
          ListFindingsFixedSizeCollection> {

    public static ApiFuture<ListFindingsPagedResponse> createAsync(
        PageContext<ListFindingsRequest, ListFindingsResponse, Finding> context,
        ApiFuture<ListFindingsResponse> futureResponse) {
      ApiFuture<ListFindingsPage> futurePage =
          ListFindingsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListFindingsPage, ListFindingsPagedResponse>() {
            @Override
            public ListFindingsPagedResponse apply(ListFindingsPage input) {
              return new ListFindingsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListFindingsPagedResponse(ListFindingsPage page) {
      super(page, ListFindingsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListFindingsPage
      extends AbstractPage<ListFindingsRequest, ListFindingsResponse, Finding, ListFindingsPage> {

    private ListFindingsPage(
        PageContext<ListFindingsRequest, ListFindingsResponse, Finding> context,
        ListFindingsResponse response) {
      super(context, response);
    }

    private static ListFindingsPage createEmptyPage() {
      return new ListFindingsPage(null, null);
    }

    @Override
    protected ListFindingsPage createPage(
        PageContext<ListFindingsRequest, ListFindingsResponse, Finding> context,
        ListFindingsResponse response) {
      return new ListFindingsPage(context, response);
    }

    @Override
    public ApiFuture<ListFindingsPage> createPageAsync(
        PageContext<ListFindingsRequest, ListFindingsResponse, Finding> context,
        ApiFuture<ListFindingsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFindingsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListFindingsRequest,
          ListFindingsResponse,
          Finding,
          ListFindingsPage,
          ListFindingsFixedSizeCollection> {

    private ListFindingsFixedSizeCollection(List<ListFindingsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFindingsFixedSizeCollection createEmptyCollection() {
      return new ListFindingsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFindingsFixedSizeCollection createCollection(
        List<ListFindingsPage> pages, int collectionSize) {
      return new ListFindingsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListSourcesPagedResponse
      extends AbstractPagedListResponse<
          ListSourcesRequest,
          ListSourcesResponse,
          Source,
          ListSourcesPage,
          ListSourcesFixedSizeCollection> {

    public static ApiFuture<ListSourcesPagedResponse> createAsync(
        PageContext<ListSourcesRequest, ListSourcesResponse, Source> context,
        ApiFuture<ListSourcesResponse> futureResponse) {
      ApiFuture<ListSourcesPage> futurePage =
          ListSourcesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListSourcesPage, ListSourcesPagedResponse>() {
            @Override
            public ListSourcesPagedResponse apply(ListSourcesPage input) {
              return new ListSourcesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListSourcesPagedResponse(ListSourcesPage page) {
      super(page, ListSourcesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListSourcesPage
      extends AbstractPage<ListSourcesRequest, ListSourcesResponse, Source, ListSourcesPage> {

    private ListSourcesPage(
        PageContext<ListSourcesRequest, ListSourcesResponse, Source> context,
        ListSourcesResponse response) {
      super(context, response);
    }

    private static ListSourcesPage createEmptyPage() {
      return new ListSourcesPage(null, null);
    }

    @Override
    protected ListSourcesPage createPage(
        PageContext<ListSourcesRequest, ListSourcesResponse, Source> context,
        ListSourcesResponse response) {
      return new ListSourcesPage(context, response);
    }

    @Override
    public ApiFuture<ListSourcesPage> createPageAsync(
        PageContext<ListSourcesRequest, ListSourcesResponse, Source> context,
        ApiFuture<ListSourcesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListSourcesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListSourcesRequest,
          ListSourcesResponse,
          Source,
          ListSourcesPage,
          ListSourcesFixedSizeCollection> {

    private ListSourcesFixedSizeCollection(List<ListSourcesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListSourcesFixedSizeCollection createEmptyCollection() {
      return new ListSourcesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListSourcesFixedSizeCollection createCollection(
        List<ListSourcesPage> pages, int collectionSize) {
      return new ListSourcesFixedSizeCollection(pages, collectionSize);
    }
  }
}
