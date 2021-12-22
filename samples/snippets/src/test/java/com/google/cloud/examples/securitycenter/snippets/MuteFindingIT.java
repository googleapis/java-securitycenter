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

package com.google.cloud.examples.securitycenter.snippets;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

import com.google.cloud.examples.securitycenter.snippets.muteconfig.BulkMuteFindings;
import com.google.cloud.examples.securitycenter.snippets.muteconfig.CreateMuteRule;
import com.google.cloud.examples.securitycenter.snippets.muteconfig.DeleteMuteRule;
import com.google.cloud.examples.securitycenter.snippets.muteconfig.GetMuteRule;
import com.google.cloud.examples.securitycenter.snippets.muteconfig.ListMuteRules;
import com.google.cloud.examples.securitycenter.snippets.muteconfig.SetMuteUnmuteFinding;
import com.google.cloud.examples.securitycenter.snippets.muteconfig.UpdateMuteRule;
import com.google.cloud.securitycenter.v1.CreateSourceRequest;
import com.google.cloud.securitycenter.v1.Finding;
import com.google.cloud.securitycenter.v1.Finding.FindingClass;
import com.google.cloud.securitycenter.v1.Finding.Mute;
import com.google.cloud.securitycenter.v1.Finding.Severity;
import com.google.cloud.securitycenter.v1.Finding.State;
import com.google.cloud.securitycenter.v1.ListFindingsRequest;
import com.google.cloud.securitycenter.v1.ListFindingsResponse.ListFindingsResult;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;
import com.google.cloud.securitycenter.v1.SecurityCenterClient.ListFindingsPagedResponse;
import com.google.cloud.securitycenter.v1.Source;
import com.google.cloud.securitycenter.v1.SourceName;
import com.google.protobuf.Timestamp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.time.Instant;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MuteFindingIT {

  private static final String PROJECT_ID = System.getenv("GOOGLE_CLOUD_PROJECT");
  private static final String ORGANIZATION_ID = System.getenv("GCLOUD_ORGANIZATION");
  private static final String MUTE_RULE_CREATE = "random-mute-id-" + UUID.randomUUID();
  private static final String MUTE_RULE_UPDATE = "random-mute-id-" + UUID.randomUUID();
  private static Source SOURCE;
  private static Finding FINDING_1;
  private static Finding FINDING_2;
  private static Finding FINDING_3;

  private ByteArrayOutputStream stdOut;

  // Check if the required environment variables are set.
  public static void requireEnvVar(String envVarName) {
    assertWithMessage(String.format("Missing environment variable '%s' ", envVarName))
        .that(System.getenv(envVarName)).isNotEmpty();
  }

  @BeforeClass
  public static void setUp() throws IOException {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("GOOGLE_CLOUD_PROJECT");
    requireEnvVar("GCLOUD_ORGANIZATION");

    // Create Mute Rules.
    CreateMuteRule.createMuteRule(String.format("projects/%s", PROJECT_ID), MUTE_RULE_CREATE);
    CreateMuteRule.createMuteRule(String.format("projects/%s", PROJECT_ID), MUTE_RULE_UPDATE);
    // Create Source.
    SOURCE = createSource(ORGANIZATION_ID);
    SourceName sourceName = SourceName.of(ORGANIZATION_ID, SOURCE.getName());
    // Create Findings within the source.
    FINDING_1 = createFinding(sourceName, UUID.randomUUID().toString());
    FINDING_2 = createFinding(sourceName, UUID.randomUUID().toString());
    FINDING_3 = createFinding(sourceName, UUID.randomUUID().toString());
  }

  @AfterClass
  public static void cleanUp() throws IOException {
    DeleteMuteRule.deleteMuteRule(
        String.format("projects/%s/muteConfigs/%s", PROJECT_ID, MUTE_RULE_CREATE));
    DeleteMuteRule.deleteMuteRule(
        String.format("projects/%s/muteConfigs/%s", PROJECT_ID, MUTE_RULE_UPDATE));
  }

  public static Source createSource(String organizationId) throws IOException {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {

      Source source = Source.newBuilder()
          .setDisplayName("Custom display name")
          .setDescription("A source that does X").build();

      CreateSourceRequest createSourceRequest = CreateSourceRequest.newBuilder()
          .setParent(String.format("organizations/%s", organizationId))
          .setSource(source).build();

      return client.createSource(createSourceRequest);
    }
  }

  public static Finding createFinding(SourceName sourceName, String findingId) throws IOException {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {

      Instant eventTime = Instant.now();

      // The resource this finding applies to.  The Cloud Security Command Center UI can link
      // the findings for a resource to the corresponding Asset of a resource
      // if there are matches.
      // TODO(Developer): Replace the below sample resource name
      String resourceName = "//cloudresourcemanager.googleapis.com/organizations/00001";

      // Start setting up a request to create a finding in a source.
      Finding finding =
          Finding.newBuilder()
              .setParent(sourceName.toString())
              .setState(State.ACTIVE)
              .setSeverity(Severity.LOW)
              .setMute(Mute.UNMUTED)
              .setFindingClass(FindingClass.OBSERVATION)
              .setResourceName(resourceName)
              .setEventTime(
                  Timestamp.newBuilder()
                      .setSeconds(eventTime.getEpochSecond())
                      .setNanos(eventTime.getNano()))
              .setCategory("LOW_RISK_ONE")
              .build();

      Finding response = client.createFinding(sourceName, findingId, finding);

      System.out.println("Created Finding: " + response);
      return response;
    }
  }

  public static ListFindingsPagedResponse getAllFindings(SourceName sourceName) throws IOException {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {

      ListFindingsRequest request = ListFindingsRequest.newBuilder()
          .setParent(sourceName.toString()).build();

      return client.listFindings(request);
    }
  }

  @Before
  public void beforeEach() {
    stdOut = new ByteArrayOutputStream();
    System.setOut(new PrintStream(stdOut));
  }

  @After
  public void afterEach() {
    stdOut = null;
    System.setOut(null);
  }

  @Test
  public void testGetMuteRule() throws IOException {
    GetMuteRule.getMuteRule(
        String.format("projects/%s/muteConfigs/%s", PROJECT_ID, MUTE_RULE_CREATE));
    assertThat(stdOut.toString()).contains("Retrieved the mute config: ");
    assertThat(stdOut.toString()).contains(MUTE_RULE_CREATE);
  }

  @Test
  public void testListMuteRules() throws IOException {
    ListMuteRules.listMuteRules(String.format("projects/%s", PROJECT_ID));
    assertThat(stdOut.toString()).contains(MUTE_RULE_CREATE);
    assertThat(stdOut.toString()).contains(MUTE_RULE_UPDATE);
  }

  @Test
  public void testUpdateMuteRules() throws IOException {
    UpdateMuteRule.updateMuteRule(
        String.format("projects/%s/muteConfigs/%s", PROJECT_ID, MUTE_RULE_UPDATE));
    GetMuteRule.getMuteRule(
        String.format("projects/%s/muteConfigs/%s", PROJECT_ID, MUTE_RULE_UPDATE));
    assertThat(stdOut.toString()).contains("Updated mute config description");
  }

  @Test
  public void testSetMuteFinding() throws IOException {
    SetMuteUnmuteFinding.setMute(
        String.format("projects/%s/sources/%s/finding/%s", PROJECT_ID, SOURCE.getName(),
            FINDING_1.getName()));
    assertThat(stdOut.toString()).contains("Mute value for the finding: MUTED");
  }

  @Test
  public void testBulkMuteFindings() throws IOException, ExecutionException, InterruptedException {
    // Mute findings that belong to this project.
    BulkMuteFindings.bulkMute(String.format("projects/%s", PROJECT_ID),
        String.format("resource.project_display_name=%s", PROJECT_ID));
    // Get all findings in the source to check if they are muted.
    ListFindingsPagedResponse response = getAllFindings(
        SourceName.of(PROJECT_ID, SOURCE.getName()));
    for (ListFindingsResult finding : response.iterateAll()) {
      Assert.assertEquals(finding.getFinding().getMute(), Mute.MUTED);
    }
  }

}
