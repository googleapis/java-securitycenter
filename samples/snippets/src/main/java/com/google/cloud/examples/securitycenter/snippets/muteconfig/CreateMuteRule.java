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
import java.util.UUID;

public class CreateMuteRule {

  public static void main(String[] args) throws IOException {
    // parentPath: use any one of the following three options,
    //    organizations/{organization} or
    //    folders/{folder} or
    //    projects/{project}
    // TODO: Replace the variables within {}
    String parentPath = "{parent_path}";
    String muteConfigId = "random-mute-id-" + UUID.randomUUID();
    createMuteRule(parentPath, muteConfigId);
  }

  // Creates a mute configuration under a given scope that will mute
  // all new finding which match the filter/ mute rule.
  // Existing findings will NOT BE muted.
  public static void createMuteRule(String parentPath, String muteConfigId) throws IOException {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {

      MuteConfig muteConfig =
          MuteConfig.newBuilder()
              .setDescription("Mute low-medium IAM grants excluding 'compute' ")
              // Set mute rule(s).
              // To construct mute rules and for supported properties, see:
              // https://cloud.google.com/security-command-center/docs/how-to-mute-findings#console_3
              .setFilter(
                  "severity=\"LOW\" OR severity=\"MEDIUM\" AND "
                      + "category=\"Persistence: IAM Anomalous Grant\" AND "
                      + "-resource.type:\"compute\"")
              .build();

      CreateMuteConfigRequest request =
          CreateMuteConfigRequest.newBuilder()
              .setParent(parentPath)
              // Set a random id; max of 63 chars.
              .setMuteConfigId(muteConfigId)
              .setMuteConfig(muteConfig)
              .build();

      MuteConfig response = client.createMuteConfig(request);
      System.out.println("Mute Config Rule created successfully: " + response.getName());
    }
  }
}
// [END securitycenter_create_mute_config]
