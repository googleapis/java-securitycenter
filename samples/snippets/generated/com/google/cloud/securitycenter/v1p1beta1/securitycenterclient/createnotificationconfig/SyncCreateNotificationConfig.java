/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.securitycenter.v1p1beta1.samples;

// [START securitycenter_v1p1beta1_generated_securitycenterclient_createnotificationconfig_sync]
import com.google.cloud.securitycenter.v1p1beta1.CreateNotificationConfigRequest;
import com.google.cloud.securitycenter.v1p1beta1.NotificationConfig;
import com.google.cloud.securitycenter.v1p1beta1.OrganizationName;
import com.google.cloud.securitycenter.v1p1beta1.SecurityCenterClient;

public class SyncCreateNotificationConfig {

  public static void main(String[] args) throws Exception {
    syncCreateNotificationConfig();
  }

  public static void syncCreateNotificationConfig() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
      CreateNotificationConfigRequest request =
          CreateNotificationConfigRequest.newBuilder()
              .setParent(OrganizationName.of("[ORGANIZATION]").toString())
              .setConfigId("configId-580140035")
              .setNotificationConfig(NotificationConfig.newBuilder().build())
              .build();
      NotificationConfig response = securityCenterClient.createNotificationConfig(request);
    }
  }
}
// [END securitycenter_v1p1beta1_generated_securitycenterclient_createnotificationconfig_sync]
