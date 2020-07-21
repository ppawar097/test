package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.dataProvider.StaticDataProvider;
import com.katalyst.ensoul.testHarness.ForgotPasswordSecurityQSrc;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;

public class ForgotPasswordSecurityQTest extends TestBase {

	// Class objects
	ForgotPasswordSecurityQSrc resetPass = new ForgotPasswordSecurityQSrc();
	@Test(priority = 4, dataProviderClass = StaticDataProvider.class, dataProvider = "d_resetpasswordsecurityq", retryAnalyzer = Retry.class)
	public void ResetPassword(String Email[]) throws Exception {
		Reports.test = Reports.extent.createTest("Reset password using Security Question");
		try {
			resetPass.ForgotPasswordSec(Email);
		} catch (Exception e) {
			Reports.failTest("Error in Reset password" + e.getMessage());
		}
	}
	
}
