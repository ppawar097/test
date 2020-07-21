package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.dataProvider.StaticDataProvider;
import com.katalyst.ensoul.testHarness.WorkEmailLoginSrc;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;

public class WorkEmailLoginTest extends TestBase {

	// Class objects
	WorkEmailLoginSrc login = new WorkEmailLoginSrc();

		@Test(priority = 3, dataProviderClass = StaticDataProvider.class, dataProvider = "d_workEmail", retryAnalyzer = Retry.class)
		public void LoginToApplication(String LoginData[]) throws Exception {
			Reports.test = Reports.extent.createTest("login To Application using Work Email ID");
			try {
				login.WorkEmailLogin(LoginData);
			} 
			catch (Exception e) {
				Reports.failTest("Error in the login to the application" + e.getMessage());
			}
		}
}
