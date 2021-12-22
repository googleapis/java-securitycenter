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

// [START securitycenter_get_mute_config]

import com.google.cloud.securitycenter.v1.MuteConfig;
import com.google.cloud.securitycenter.v1.MuteConfigName;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;
import java.io.IOException;

public class GetMuteRule {

  public static void main(String[] args) throws IOException {
    // Name of the mute config to retrieve.
    // Its format is:
    // organizations/{organization}/muteConfigs/{config_id} or
    // folders/{folder}/muteConfigs/{config_id} or
    // projects/{project}/muteConfigs/{config_id}
    // TODO: Replace the variables within {}
    String muteConfigName = "{any-one-of-the-above-formats}";
    getMuteRule(muteConfigName);
  }

  // Retrieves mute configuration given its resource name.
  public static void getMuteRule(String muteConfigName) throws IOException {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {

      MuteConfig muteConfig = client.getMuteConfig(MuteConfigName.newBuilder()
          .setMuteConfig(muteConfigName).build());

      System.out.println("Retrieved the mute config: " + muteConfig);
    }
  }

}
// [END securitycenter_get_mute_config]