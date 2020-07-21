package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.dataProvider.StaticDataProvider;
import com.katalyst.ensoul.testHarness.PolicySrc;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;

public class PolicyTest extends TestBase {

	// Class objects
	PolicySrc prof = new PolicySrc();

		@Test(priority = 1, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void PolicyCreation(String PolicyData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Policy - New Policy Creation");
			try {
				prof.PolicyCreate(PolicyData);
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of creating Policy" + e.getMessage());
			}
		}
		
		@Test(priority = 2, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void PolicyCreationDuplicate(String PolicyData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Policy - New Policy Creation with Duplicate Entry");
			try {
				prof.CreateDuplicatePolicy(PolicyData);
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of creating Policy" + e.getMessage());
			}
		}	
		
		@Test(priority = 3, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void SamePolicyDiffEmployer(String PolicyData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Policy - Same Policy name with different Employer");
			try {
				prof.PolicyCreateDiffEmp(PolicyData);
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of creating Policy" + e.getMessage());
			}
		}
		
		@Test(priority = 4, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void PolicyUpdate(String PolicyData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Policy - Update existing Policy");
			try {
				prof.PolicyUpdate(PolicyData);
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of creating Policy" + e.getMessage());
			}
		}

		@Test(priority = 5, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void PolicyDelete(String PolicyData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Policy - Delete Policy");
			try {
				prof.PolicyDelete(PolicyData);
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of creating Policy" + e.getMessage());
			}
		}

		@Test(priority = 6, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void PolicySplChar(String PolicyData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Policy - Create new Policy with Special Characters");
			try {
				prof.PolicyCreateSplChar(PolicyData);
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of creating Policy" + e.getMessage());
			}
		}

}
