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

// [START securitycenter_list_mute_configs]

import com.google.cloud.securitycenter.v1.ListMuteConfigsRequest;
import com.google.cloud.securitycenter.v1.MuteConfig;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;
import java.io.IOException;

public class ListMuteRules {

  public static void main(String[] args) throws IOException {
    // Use any one of the following three resource paths to list mute configurations.
    // "organizations/{organization_id}" or
    // "folders/{folder_id}" or
    // "projects/{project_id}"
    // TODO: Replace variables enclosed within {}
    String parent = "projects/{project_id}";
    listMuteRules(parent);
  }

  // Listing mute configs at organization level will give all the configs
  // at org, folder and project levels.
  // Similarly, listing configs at folder level will list all the configs
  // at folder + projects (within that folder) level.
  public static void listMuteRules(String parent) throws IOException {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {

      ListMuteConfigsRequest listMuteConfigsRequest = ListMuteConfigsRequest.newBuilder()
          .setParent(parent).build();

      // List all Mute Configs present in the resource.
      for (MuteConfig muteConfig : client.listMuteConfigs(listMuteConfigsRequest).iterateAll()) {
        System.out.println(muteConfig.getName());
      }
    }
  }
}
// [END securitycenter_list_mute_configs]