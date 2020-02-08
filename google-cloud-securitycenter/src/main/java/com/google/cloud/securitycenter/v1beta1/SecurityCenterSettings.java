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
package com.google.cloud.securitycenter.v1beta1;

import static com.google.cloud.securitycenter.v1beta1.SecurityCenterClient.GroupAssetsPagedResponse;
import static com.google.cloud.securitycenter.v1beta1.SecurityCenterClient.GroupFindingsPagedResponse;
import static com.google.cloud.securitycenter.v1beta1.SecurityCenterClient.ListAssetsPagedResponse;
import static com.google.cloud.securitycenter.v1beta1.SecurityCenterClient.ListFindingsPagedResponse;
import static com.google.cloud.securitycenter.v1beta1.SecurityCenterClient.ListSourcesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.securitycenter.v1beta1.stub.SecurityCenterStubSettings;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link SecurityCenterClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (securitycenter.googleapis.com) and default port (443) are
 *       used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of createSource to 30 seconds:
 *
 * <pre>
 * <code>
 * SecurityCenterSettings.Builder securityCenterSettingsBuilder =
 *     SecurityCenterSettings.newBuilder();
 * securityCenterSettingsBuilder
 *     .createSourceSettings()
 *     .setRetrySettings(
 *         securityCenterSettingsBuilder.createSourceSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * SecurityCenterSettings securityCenterSettings = securityCenterSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class SecurityCenterSettings extends ClientSettings<SecurityCenterSettings> {
  /** Returns the object with the settings used for calls to createSource. */
  public UnaryCallSettings<CreateSourceRequest, Source> createSourceSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).createSourceSettings();
  }

  /** Returns the object with the settings used for calls to createFinding. */
  public UnaryCallSettings<CreateFindingRequest, Finding> createFindingSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).createFindingSettings();
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).getIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to getOrganizationSettings. */
  public UnaryCallSettings<GetOrganizationSettingsRequest, OrganizationSettings>
      getOrganizationSettingsSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).getOrganizationSettingsSettings();
  }

  /** Returns the object with the settings used for calls to getSource. */
  public UnaryCallSettings<GetSourceRequest, Source> getSourceSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).getSourceSettings();
  }

  /** Returns the object with the settings used for calls to groupAssets. */
  public PagedCallSettings<GroupAssetsRequest, GroupAssetsResponse, GroupAssetsPagedResponse>
      groupAssetsSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).groupAssetsSettings();
  }

  /** Returns the object with the settings used for calls to groupFindings. */
  public PagedCallSettings<GroupFindingsRequest, GroupFindingsResponse, GroupFindingsPagedResponse>
      groupFindingsSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).groupFindingsSettings();
  }

  /** Returns the object with the settings used for calls to listAssets. */
  public PagedCallSettings<ListAssetsRequest, ListAssetsResponse, ListAssetsPagedResponse>
      listAssetsSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).listAssetsSettings();
  }

  /** Returns the object with the settings used for calls to listFindings. */
  public PagedCallSettings<ListFindingsRequest, ListFindingsResponse, ListFindingsPagedResponse>
      listFindingsSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).listFindingsSettings();
  }

  /** Returns the object with the settings used for calls to listSources. */
  public PagedCallSettings<ListSourcesRequest, ListSourcesResponse, ListSourcesPagedResponse>
      listSourcesSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).listSourcesSettings();
  }

  /** Returns the object with the settings used for calls to runAssetDiscovery. */
  public UnaryCallSettings<RunAssetDiscoveryRequest, Operation> runAssetDiscoverySettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).runAssetDiscoverySettings();
  }

  /** Returns the object with the settings used for calls to runAssetDiscovery. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<RunAssetDiscoveryRequest, Empty, Empty>
      runAssetDiscoveryOperationSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).runAssetDiscoveryOperationSettings();
  }

  /** Returns the object with the settings used for calls to setFindingState. */
  public UnaryCallSettings<SetFindingStateRequest, Finding> setFindingStateSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).setFindingStateSettings();
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).setIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).testIamPermissionsSettings();
  }

  /** Returns the object with the settings used for calls to updateFinding. */
  public UnaryCallSettings<UpdateFindingRequest, Finding> updateFindingSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).updateFindingSettings();
  }

  /** Returns the object with the settings used for calls to updateOrganizationSettings. */
  public UnaryCallSettings<UpdateOrganizationSettingsRequest, OrganizationSettings>
      updateOrganizationSettingsSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).updateOrganizationSettingsSettings();
  }

  /** Returns the object with the settings used for calls to updateSource. */
  public UnaryCallSettings<UpdateSourceRequest, Source> updateSourceSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).updateSourceSettings();
  }

  /** Returns the object with the settings used for calls to updateSecurityMarks. */
  public UnaryCallSettings<UpdateSecurityMarksRequest, SecurityMarks>
      updateSecurityMarksSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).updateSecurityMarksSettings();
  }

  public static final SecurityCenterSettings create(SecurityCenterStubSettings stub)
      throws IOException {
    return new SecurityCenterSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return SecurityCenterStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return SecurityCenterStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return SecurityCenterStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return SecurityCenterStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return SecurityCenterStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return SecurityCenterStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return SecurityCenterStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected SecurityCenterSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for SecurityCenterSettings. */
  public static class Builder extends ClientSettings.Builder<SecurityCenterSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(SecurityCenterStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(SecurityCenterStubSettings.newBuilder());
    }

    protected Builder(SecurityCenterSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(SecurityCenterStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public SecurityCenterStubSettings.Builder getStubSettingsBuilder() {
      return ((SecurityCenterStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to createSource. */
    public UnaryCallSettings.Builder<CreateSourceRequest, Source> createSourceSettings() {
      return getStubSettingsBuilder().createSourceSettings();
    }

    /** Returns the builder for the settings used for calls to createFinding. */
    public UnaryCallSettings.Builder<CreateFindingRequest, Finding> createFindingSettings() {
      return getStubSettingsBuilder().createFindingSettings();
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getStubSettingsBuilder().getIamPolicySettings();
    }

    /** Returns the builder for the settings used for calls to getOrganizationSettings. */
    public UnaryCallSettings.Builder<GetOrganizationSettingsRequest, OrganizationSettings>
        getOrganizationSettingsSettings() {
      return getStubSettingsBuilder().getOrganizationSettingsSettings();
    }

    /** Returns the builder for the settings used for calls to getSource. */
    public UnaryCallSettings.Builder<GetSourceRequest, Source> getSourceSettings() {
      return getStubSettingsBuilder().getSourceSettings();
    }

    /** Returns the builder for the settings used for calls to groupAssets. */
    public PagedCallSettings.Builder<
            GroupAssetsRequest, GroupAssetsResponse, GroupAssetsPagedResponse>
        groupAssetsSettings() {
      return getStubSettingsBuilder().groupAssetsSettings();
    }

    /** Returns the builder for the settings used for calls to groupFindings. */
    public PagedCallSettings.Builder<
            GroupFindingsRequest, GroupFindingsResponse, GroupFindingsPagedResponse>
        groupFindingsSettings() {
      return getStubSettingsBuilder().groupFindingsSettings();
    }

    /** Returns the builder for the settings used for calls to listAssets. */
    public PagedCallSettings.Builder<ListAssetsRequest, ListAssetsResponse, ListAssetsPagedResponse>
        listAssetsSettings() {
      return getStubSettingsBuilder().listAssetsSettings();
    }

    /** Returns the builder for the settings used for calls to listFindings. */
    public PagedCallSettings.Builder<
            ListFindingsRequest, ListFindingsResponse, ListFindingsPagedResponse>
        listFindingsSettings() {
      return getStubSettingsBuilder().listFindingsSettings();
    }

    /** Returns the builder for the settings used for calls to listSources. */
    public PagedCallSettings.Builder<
            ListSourcesRequest, ListSourcesResponse, ListSourcesPagedResponse>
        listSourcesSettings() {
      return getStubSettingsBuilder().listSourcesSettings();
    }

    /** Returns the builder for the settings used for calls to runAssetDiscovery. */
    public UnaryCallSettings.Builder<RunAssetDiscoveryRequest, Operation>
        runAssetDiscoverySettings() {
      return getStubSettingsBuilder().runAssetDiscoverySettings();
    }

    /** Returns the builder for the settings used for calls to runAssetDiscovery. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<RunAssetDiscoveryRequest, Empty, Empty>
        runAssetDiscoveryOperationSettings() {
      return getStubSettingsBuilder().runAssetDiscoveryOperationSettings();
    }

    /** Returns the builder for the settings used for calls to setFindingState. */
    public UnaryCallSettings.Builder<SetFindingStateRequest, Finding> setFindingStateSettings() {
      return getStubSettingsBuilder().setFindingStateSettings();
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return getStubSettingsBuilder().setIamPolicySettings();
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return getStubSettingsBuilder().testIamPermissionsSettings();
    }

    /** Returns the builder for the settings used for calls to updateFinding. */
    public UnaryCallSettings.Builder<UpdateFindingRequest, Finding> updateFindingSettings() {
      return getStubSettingsBuilder().updateFindingSettings();
    }

    /** Returns the builder for the settings used for calls to updateOrganizationSettings. */
    public UnaryCallSettings.Builder<UpdateOrganizationSettingsRequest, OrganizationSettings>
        updateOrganizationSettingsSettings() {
      return getStubSettingsBuilder().updateOrganizationSettingsSettings();
    }

    /** Returns the builder for the settings used for calls to updateSource. */
    public UnaryCallSettings.Builder<UpdateSourceRequest, Source> updateSourceSettings() {
      return getStubSettingsBuilder().updateSourceSettings();
    }

    /** Returns the builder for the settings used for calls to updateSecurityMarks. */
    public UnaryCallSettings.Builder<UpdateSecurityMarksRequest, SecurityMarks>
        updateSecurityMarksSettings() {
      return getStubSettingsBuilder().updateSecurityMarksSettings();
    }

    @Override
    public SecurityCenterSettings build() throws IOException {
      return new SecurityCenterSettings(this);
    }
  }
}
