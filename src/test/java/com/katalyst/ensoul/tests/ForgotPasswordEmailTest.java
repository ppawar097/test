package com.katalyst.ensoul.tests;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.testHarness.ForgotPasswordEmailSrc;
import org.testng.annotations.Test;
import com.katalyst.ensoul.dataProvider.StaticDataProvider;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;

public class ForgotPasswordEmailTest extends TestBase {

	// Class objects
	ForgotPasswordEmailSrc login = new ForgotPasswordEmailSrc();
	@Test(priority = 3, dataProviderClass = StaticDataProvider.class, dataProvider = "d_resetpasswordemail", retryAnalyzer = Retry.class)
	public void LoginToApplication(String Email[]) throws Exception {
		Reports.test = Reports.extent.createTest("Reset password using Email");
		try {
			login.ForgotPasswordEmail(Email);
		} catch (Exception e) {
			Reports.failTest("Error in Reset password" + e.getMessage());
		}
	}
	
}



