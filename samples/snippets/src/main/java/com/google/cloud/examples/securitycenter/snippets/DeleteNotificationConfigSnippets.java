/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.examples.securitycenter.snippets;

// [START securitycenter_delete_notification_config]
import com.google.cloud.securitycenter.v1.NotificationConfigName;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;
import java.io.IOException;

public class DeleteNotificationConfigSnippets {

  public static void main(String[] args) throws IOException {
    // parentId: must be in one of the following formats:
    //    "organizations/{organization_id}"
    //    "projects/{project_id}"
    //    "folders/{folder_id}"
    String parentId = String.format("organizations/%s", "ORG_ID");

    String notificationConfigId = "{config-id}";

    deleteNotificationConfig(parentId, notificationConfigId);
  }

  // Delete a notification config.
  public static boolean deleteNotificationConfig(String parentId, String notificationConfigId)
      throws IOException {
    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (SecurityCenterClient client = SecurityCenterClient.create()) {

      NotificationConfigName notificationConfigName =
          NotificationConfigName.newBuilder()
              .setOrganization(parentId)
              .setNotificationConfig(notificationConfigId)
              .build();

      client.deleteNotificationConfig(notificationConfigName);

      System.out.printf("Deleted Notification config: %s%n", notificationConfigName);
    }
    return true;
  }
}
// [END securitycenter_delete_notification_config]
