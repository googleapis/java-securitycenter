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

// [START securitycenter_delete_mute_config]

import com.google.cloud.securitycenter.v1.MuteConfigName;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;
import java.io.IOException;

public class DeleteMuteRule {

  public static void main(String[] args) throws IOException {
    // Specify the name of the mute config to delete.
    // Its format is:
    // organizations/{organization}/muteConfigs/{config_id} or
    // folders/{folder}/muteConfigs/{config_id} or
    // projects/{project}/muteConfigs/{config_id}
    // TODO: Replace the variables within {}
    String muteConfigName = "{any-one-of-the-above-formats}";

    deleteMuteRule(muteConfigName);
  }

  // Deletes a mute configuration given its resource name.
  // Note: Already muted findings are not affected when a mute config is deleted.
  public static void deleteMuteRule(String muteConfigName) throws IOException {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {

      client.deleteMuteConfig(MuteConfigName.newBuilder().setMuteConfig(muteConfigName).build());

      System.out.println("Mute Config Rule deleted successfully: " + muteConfigName);
    }
  }
}
// [END securitycenter_delete_mute_config]
