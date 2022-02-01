/*
 * Copyright 2022 Google LLC
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

// [START securitycenter_update_mute_config]

import com.google.cloud.securitycenter.v1.MuteConfig;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;
import com.google.cloud.securitycenter.v1.UpdateMuteConfigRequest;
import com.google.protobuf.FieldMask;
import java.io.IOException;

public class UpdateMuteRule {

  public static void main(String[] args) throws IOException {
    // Specify the name of the mute config to delete.
    // Its format is:
    // organizations/{organization}/muteConfigs/{config_id} or
    // folders/{folder}/muteConfigs/{config_id} or
    // projects/{project}/muteConfigs/{config_id}
    // TODO: Replace the variables within {}
    String muteConfigName = "{any-one-of-the-above-formats}";
    updateMuteRule(muteConfigName);
  }

  // Updates an existing mute configuration.
  // The following can be updated in a mute config: description, and filter/ mute rule.
  public static void updateMuteRule(String muteConfigName) throws IOException {
    try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {

      MuteConfig updateMuteConfig =
          MuteConfig.newBuilder()
              .setName(muteConfigName)
              .setDescription("Updated mute config description")
              .build();

      UpdateMuteConfigRequest updateMuteConfigRequest =
          UpdateMuteConfigRequest.newBuilder()
              .setMuteConfig(updateMuteConfig)
              // Set the update mask to specify which properties of the Mute Config should be
              // updated.
              // If empty all mutable fields will be updated.
              // Make sure that the mask fields match the properties changed in 'updateMuteConfig'.
              // For more info on constructing update mask path, see the proto or:
              // https://cloud.google.com/security-command-center/docs/reference/rest/v1/folders.muteConfigs/patch?hl=en#query-parameters
              .setUpdateMask(FieldMask.newBuilder().addPaths("description").build())
              .build();

      MuteConfig response = securityCenterClient.updateMuteConfig(updateMuteConfigRequest);
      System.out.println(response);
    }
  }
}
// [END securitycenter_update_mute_config]
