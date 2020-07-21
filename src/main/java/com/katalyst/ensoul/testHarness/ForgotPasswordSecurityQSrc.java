package com.katalyst.ensoul.testHarness;

import org.openqa.selenium.support.PageFactory;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.ForgotPasswordSecurityQPage;
import com.katalyst.util.PropertyManager;
import com.katalyst.util.Reports;

public class ForgotPasswordSecurityQSrc extends TestBase {
	public static String suite = PropertyManager.getInstance().getSuite();
	
	public void ForgotPasswordSec(String EmailData[]) throws Exception {
		PageFactory.initElements(driver, ForgotPasswordSecurityQPage.class);
		
		String email = null;
		String answer = null;
		
		if (suite.equalsIgnoreCase("SmokeTest") == true) {
			email = EmailData[0];
			answer = EmailData[1];
			
		} else {
			email = EmailData[2];	
			answer = EmailData[3];
		}
		
		waitForElement(ForgotPasswordSecurityQPage.getLnk_ForgotPassword(), 20);
		click(ForgotPasswordSecurityQPage.getLnk_ForgotPassword(), "Clicked on Reset Password link");
		
		waitForElement(ForgotPasswordSecurityQPage.getTxt_EmailId(), 20);
		sendKeys(ForgotPasswordSecurityQPage.getTxt_EmailId(), email, "Email Id entered");
		
		waitForElement(ForgotPasswordSecurityQPage.getBtn_SecurityQuestion(), 20);
		click(ForgotPasswordSecurityQPage.getBtn_SecurityQuestion(), "Clicked on use Security Question");
		
		if(driver.getPageSource().contains("Not a Valid User.")||
				driver.getPageSource().contains("Email Id was incorrect. Please correct the errors and try again."))
		{			
				Reports.failTest("Please enter correct details to reset your Password");	
		}
		else 
		{		
		
		waitForElement(ForgotPasswordSecurityQPage.getTxt_SecurityAnswer(), 20);
		sendKeys(ForgotPasswordSecurityQPage.getTxt_SecurityAnswer(), answer, "Enter given answer");
		
		waitForElement(ForgotPasswordSecurityQPage.getBtn_Submit(), 20);
		click(ForgotPasswordSecurityQPage.getBtn_Submit(), "Clicked on Send Reset Link button");	
		
		if(driver.getPageSource().contains("Incorrect Answer")||driver.getPageSource().contains("Answer is required"))
		{			
				Reports.failTest("Reset password was unsuccessful.");	
		}
		else {
		waitForElement(ForgotPasswordSecurityQPage.getLnk_LoginPage(), 20);
		click(ForgotPasswordSecurityQPage.getLnk_LoginPage(), "Clicked on goto Login Page");
			}
		}
	}
}
