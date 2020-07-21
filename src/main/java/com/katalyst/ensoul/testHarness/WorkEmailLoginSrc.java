package com.katalyst.ensoul.testHarness;

import org.openqa.selenium.support.PageFactory;
import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.WorkEmailLoginPage;
import com.katalyst.util.PropertyManager;
import com.katalyst.util.Reports;
import org.testng.Assert;

public class WorkEmailLoginSrc extends TestBase {
	public static String suite = PropertyManager.getInstance().getSuite();
	
	public void WorkEmailLogin(String WorkEmail[]) throws Exception {
		PageFactory.initElements(driver, WorkEmailLoginPage.class);
		String userName = null;
		String password = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) {
			userName = WorkEmail[0];
			password = WorkEmail[1];
		} else {
			userName = WorkEmail[2];
			password = WorkEmail[3];
		}
		waitForElement(WorkEmailLoginPage.getTxt_loginUserName(), 20);
		sendKeys(WorkEmailLoginPage.getTxt_loginUserName(), userName, "Entered username");
		waitForElement(WorkEmailLoginPage.getTxt_loginPassword(), 20);
		sendKeys(WorkEmailLoginPage.getTxt_loginPassword(), password, "Entered password");		
		waitForElement(WorkEmailLoginPage.getBtn_logIn(), 20);
		click(WorkEmailLoginPage.getBtn_logIn(), "Clicked on login button");
				
		if(driver.getPageSource().contains("Login was unsuccessful. Please check your login information and retry.")||
				driver.getPageSource().contains("You have been locked out due to number of failed password attempts."))
		{			
				Reports.failTest("Login was unsuccessful. Please check your login information and retry.");	
		}
		/*
		 * else { waitForElement(WorkEmailLoginPage.btn_logOut(), 20);
		 * 
		 * click(WorkEmailLoginPage.btn_logOut(), "Clicked on Logout button");
		 * 
		 * click(WorkEmailLoginPage.getLoginAgain(),"Clicked on Login Again"); }
		 */
	}
}

