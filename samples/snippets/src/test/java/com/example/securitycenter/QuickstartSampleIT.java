/*
 * Copyright 2020 Google LLC
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

package com.example.securitycenter;

import static com.google.common.truth.Truth.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Tests for quickstart sample. */
@RunWith(JUnit4.class)
@SuppressWarnings("checkstyle:abbreviationaswordinname")
public class QuickstartSampleIT {
  private ByteArrayOutputStream bout;
  private PrintStream out;
  private static final String ORGANIZATION_ENV_NAME = "GOOGLE_CLOUD_ORGANIZATION";
  private String organizationId;

  @Before
  public void setUp() {
    organizationId = System.getProperty(ORGANIZATION_ENV_NAME, System.getenv(ORGANIZATION_ENV_NAME));
    assertThat(organizationId).isNotEmpty();
    bout = new ByteArrayOutputStream();
    out = new PrintStream(bout);
    System.setOut(out);
  }

  @After
  public void tearDown() {
    System.setOut(null);
  }

  @Test
  public void testQuickstart() throws Exception {
    // Act
    QuickstartSample.main(organizationId);

    // Assert
    String got = bout.toString();
    assertThat(got).contains("All assets:");
  }
}