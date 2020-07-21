package com.katalyst.ensoul.testHarness;

import org.openqa.selenium.support.PageFactory;
import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.ForgotPasswordEmailPage;
import com.katalyst.util.PropertyManager;
import com.katalyst.util.Reports;


public class ForgotPasswordEmailSrc extends TestBase {
	public static String suite = PropertyManager.getInstance().getSuite();
	
	public void ForgotPasswordEmail(String Email[]) throws Exception {
		PageFactory.initElements(driver, ForgotPasswordEmailPage.class);
		
		String email = null;
		
		if (suite.equalsIgnoreCase("SmokeTest") == true) {
			email = Email[0];
		} else {
			email = Email[1];			
		}
		
		waitForElement(ForgotPasswordEmailPage.getLnk_ForgotPassword(), 20);
		click(ForgotPasswordEmailPage.getLnk_ForgotPassword(), "Clicked on Reset Password link");
		
		waitForElement(ForgotPasswordEmailPage.getTxt_EmailId(), 20);
		sendKeys(ForgotPasswordEmailPage.getTxt_EmailId(), email, "Email Id entered");
		
		waitForElement(ForgotPasswordEmailPage.getBtn_Submit(), 20);
		click(ForgotPasswordEmailPage.getBtn_Submit(), "Clicked on Send Reset Link button");	
		
		if(driver.getPageSource().contains("Not a Valid User.")||
				driver.getPageSource().contains("Email Id was incorrect. Please correct the errors and try again."))
		{			
				Reports.failTest("Please enter correct details to reset your Password");	
		}
		else 
		{		
		waitForElement(ForgotPasswordEmailPage.getLnk_LoginPage(), 20);
		click(ForgotPasswordEmailPage.getLnk_LoginPage(), "Clicked on goto Login Page");
		}
	}
}
