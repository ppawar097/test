package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.dataProvider.StaticDataProvider;
import com.katalyst.ensoul.testHarness.DashboardSrc;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;

public class DashboardTest extends TestBase {
	
	DashboardSrc dash = new DashboardSrc();
	
	@Test(priority = 1, dataProviderClass = StaticDataProvider.class, dataProvider = "d_login", retryAnalyzer = Retry.class)
	public void DashboardCheck(String LoginData[]) throws Exception {
		Reports.test = Reports.extent.createTest("Checking dashboard element");
		try {
			dash.Dashboard(LoginData);;			
		} catch (Exception e) {
			Reports.failTest("Error in the login to the application" + e.getMessage());
		}
	}

}
