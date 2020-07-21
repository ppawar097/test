package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.dataProvider.StaticDataProvider;
import com.katalyst.ensoul.testHarness.Office365LoginSrc;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;

public class Office365LoginTest extends TestBase {

	// Class objects
	Office365LoginSrc login = new Office365LoginSrc();

	
	  @Test(priority = 2, dataProviderClass = StaticDataProvider.class, dataProvider = "d_office365", retryAnalyzer = Retry.class)
	 
	public void Login365(String LoginData[]) throws Exception {
		Reports.test = Reports.extent.createTest("Login To Application using Office 365");
		try {
			login.LoginToApplication365(LoginData);
		} catch (Exception e) {
			Reports.failTest("Error in the login to the application" + e.getMessage());
		}
	}  

}


