/*
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.security_and_compliance_center.configuration_governance.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.security_and_compliance_center.configuration_governance.v1.model.ListRuleAttachmentsOptions;
import com.ibm.cloud.security_and_compliance_center.configuration_governance.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListRuleAttachmentsOptions model.
 */
public class ListRuleAttachmentsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListRuleAttachmentsOptions() throws Throwable {
    ListRuleAttachmentsOptions listRuleAttachmentsOptionsModel = new ListRuleAttachmentsOptions.Builder()
      .ruleId("testString")
      .transactionId("testString")
      .limit(Long.valueOf("1000"))
      .offset(Long.valueOf("26"))
      .build();
    assertEquals(listRuleAttachmentsOptionsModel.ruleId(), "testString");
    assertEquals(listRuleAttachmentsOptionsModel.transactionId(), "testString");
    assertEquals(listRuleAttachmentsOptionsModel.limit(), Long.valueOf("1000"));
    assertEquals(listRuleAttachmentsOptionsModel.offset(), Long.valueOf("26"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListRuleAttachmentsOptionsError() throws Throwable {
    new ListRuleAttachmentsOptions.Builder().build();
  }

}