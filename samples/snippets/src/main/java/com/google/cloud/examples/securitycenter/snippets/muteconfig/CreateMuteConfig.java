/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.examples.securitycenter.snippets.muteconfig;

// [START securitycenter_create_mute_config]

import com.google.cloud.securitycenter.v1.CreateMuteConfigRequest;
import com.google.cloud.securitycenter.v1.MuteConfig;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;
import java.io.IOException;

public class CreateMuteConfig {

  public static void main(String[] args) throws IOException {
    // Use any one of the following three options as a parent to create mute config:
    // organizations/{organization}/muteConfigs/{config_id} or
    // folders/{folder}/muteConfigs/{config_id} or
    // projects/{project}/muteConfigs/{config_id}
    // TODO: Replace the variables within {}
    String parentPath = "{parent_path}";
    String projectId = "projects/{project_id}";
    createMuteConfig(parentPath, projectId);
  }

  // Creates a mute configuration under a given scope that will mute
  // all new finding creates/updates which match the filter.
  // Existing findings will NOT BE muted.
  public static void createMuteConfig(String parentPath, String projectId) throws IOException {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {

      CreateMuteConfigRequest request = CreateMuteConfigRequest.newBuilder()
          .setParent(parentPath)
          .setMuteConfig(MuteConfig.newBuilder()
              .setDescription("Mute low-medium IAM grants excluding 'compute' ")
              // Set SQL config rule.
              // For all supported properties for mute rules, see:
              // https://cloud.google.com/security-command-center/docs/how-to-mute-findings?hl=en#supported_properties
              .setFilter(String.format(
                  "severity=\"LOW\" OR severity=\"MEDIUM\" AND "
                      + "category=\"Persistence: IAM Anomalous Grant\" AND "
                      + "resource.project_display_name=\"%s\" AND "
                      + "-resource.type:\"compute\"",
                  projectId))
              .build()).build();

      MuteConfig response = client.createMuteConfig(request);
      System.out.println("Mute Config Rule created successfully: " + response.getName());
    }
  }

}
// [END securitycenter_create_mute_config]