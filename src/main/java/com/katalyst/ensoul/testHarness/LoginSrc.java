package com.katalyst.ensoul.testHarness;


import org.openqa.selenium.support.PageFactory;
import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.LoginPage;
import com.katalyst.util.PropertyManager;
import com.katalyst.util.Reports;

public class LoginSrc extends TestBase {
	public static String suite = PropertyManager.getInstance().getSuite();

	public void LoginToApplication(String loginData[]) throws Exception {
		PageFactory.initElements(driver, LoginPage.class);
		
		String userName = null;
		String password = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) {
			userName = loginData[0];
			password = loginData[1];
		} else {
			userName = loginData[2];
			password = loginData[3];
		}
		waitForElement(LoginPage.getTxt_loginUserName(), 20);
		sendKeys(LoginPage.getTxt_loginUserName(), userName, "Entered username");
		waitForElement(LoginPage.getTxt_loginPassword(), 20);
		sendKeys(LoginPage.getTxt_loginPassword(), password, "Entered password");
		// click(LoginPage.getChk_rememberme(), "clicked on the Remember me");
		waitForElement(LoginPage.getBtn_logIn(), 20);
		click(LoginPage.getBtn_logIn(), "Clicked on login button");	
		
		if(driver.getPageSource().contains("Login was unsuccessful. Please check your login information and retry.")||
				driver.getPageSource().contains("You have been locked out due to number of failed password attempts."))
		{			
				Reports.failTest("Login was unsuccessful. Please check your login information and retry.");	
		}
		else {
			waitForElement(LoginPage.btn_logOut(), 20);
			click(LoginPage.btn_Avatar(), "Clicked on Avatar");
			click(LoginPage.btn_logOut(), "Clicked on Logout button");
		}
		
	}

}
