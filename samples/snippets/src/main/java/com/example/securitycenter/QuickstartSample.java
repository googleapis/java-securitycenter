/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.securitycenter;

import com.google.cloud.securitycenter.v1.ListAssetsRequest;
import com.google.cloud.securitycenter.v1.ListAssetsResponse.ListAssetsResult;
import com.google.cloud.securitycenter.v1.OrganizationName;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;
import com.google.cloud.securitycenter.v1.SecurityCenterClient.ListAssetsPagedResponse;
import com.google.common.collect.ImmutableList;
import java.io.IOException;

public class QuickstartSample {

  public static void main(String organizationId) throws IOException {
    // [START securitycenter_quickstart]
    try (SecurityCenterClient client = SecurityCenterClient.create()) {
      // String organizationId = "12341234";

      // Start setting up a request for to search for all assets in an organization.
      OrganizationName organizationName = OrganizationName.of(organizationId);
      ListAssetsRequest.Builder request =
          ListAssetsRequest.newBuilder().setParent(organizationName.toString());

      // Call the API.
      ListAssetsPagedResponse response = client.listAssets(request.build());

      // This creates one list for all assets.  If your organization has a large number of assets
      // this can cause out of memory issues.  You can process them incrementally by returning
      // the Iterable returned response.iterateAll() directly.
      ImmutableList<ListAssetsResult> results = ImmutableList.copyOf(response.iterateAll());
      System.out.println("All assets:");
      System.out.println(results);
    }
    // [END securitycenter_quickstart]
  }
}