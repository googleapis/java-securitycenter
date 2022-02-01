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

// [START securitycenter_set_mute_unmute]

import com.google.cloud.securitycenter.v1.Finding;
import com.google.cloud.securitycenter.v1.Finding.Mute;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;
import com.google.cloud.securitycenter.v1.SetMuteRequest;
import java.io.IOException;

public class SetMuteUnmuteFinding {

  public static void main(String[] args) throws IOException {
    // findingPath: The relative resource name of the finding. See:
    // https://cloud.google.com/apis/design/resource_names#relative_resource_name
    // Example:
    //  "organizations/{organization_id}/sources/{source_id}/finding/{finding_id}",
    //  "folders/{folder_id}/sources/{source_id}/finding/{finding_id}",
    //  "projects/{project_id}/sources/{source_id}/finding/{finding_id}".
    // TODO: Replace the variables within {}
    String findingPath = "{path-to-the-finding}";
    setMute(findingPath);
  }

  // Mute/unmute an individual finding.
  // If a finding is already muted, muting it again (or vice versa) is a no-op.
  // Various mute states are: MUTE_UNSPECIFIED/ MUTE/ UNMUTE.
  public static void setMute(String findingPath) throws IOException {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {

      SetMuteRequest setMuteRequest =
          SetMuteRequest.newBuilder().setName(findingPath).setMute(Mute.MUTED).build();

      Finding finding = client.setMute(setMuteRequest);
      System.out.println("Mute value for the finding: " + finding.getMute());
    }
  }
}
// [END securitycenter_set_mute_unmute]
