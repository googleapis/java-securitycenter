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

// [START securitycenter_bulk_mute]

import com.google.cloud.securitycenter.v1.BulkMuteFindingsRequest;
import com.google.cloud.securitycenter.v1.BulkMuteFindingsResponse;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class BulkMuteFindings {

  public static void main(String[] args)
      throws IOException, ExecutionException, InterruptedException {
    // parentPath: Use any one of the following options:
    //             - organizations/{organization_id}
    //             - folders/{folder_id}
    //             - projects/{project_id}
    // muteRule: Expression that identifies findings that should be updated.
    // eg: "resource.project_display_name=\"PROJECT_ID\""
    // TODO: Replace the variables within {}
    String parentPath = "{parent_path}";
    String muteRule = "{filter-condition}";
    bulkMute(parentPath, muteRule);
  }

  // Kicks off a long-running operation (LRO) to bulk mute findings for a parent based on a filter.
  // The parent can be either an organization, folder, or project. The findings
  // matched by the filter will be muted after the LRO is done.
  public static void bulkMute(String parentPath, String muteRule)
      throws IOException, ExecutionException, InterruptedException {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {

      BulkMuteFindingsRequest bulkMuteFindingsRequest =
          BulkMuteFindingsRequest.newBuilder()
              .setParent(parentPath)
              // To create mute rules, see:
              // https://cloud.google.com/security-command-center/docs/how-to-mute-findings#create_mute_rules
              .setFilter(muteRule)
              .build();

      // ExecutionException is thrown if the below call fails.
      BulkMuteFindingsResponse response =
          client.bulkMuteFindingsAsync(bulkMuteFindingsRequest).get();
      System.out.println("Bulk mute findings completed successfully! " + response);
    }
  }
}
// [END securitycenter_bulk_mute]
