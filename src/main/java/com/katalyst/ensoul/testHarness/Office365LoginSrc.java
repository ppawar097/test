package com.katalyst.ensoul.testHarness;
import org.openqa.selenium.support.PageFactory;
import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.LoginPage;
import com.katalyst.ensoul.page.Office365LoginPage;
import com.katalyst.ensoul.page.WorkEmailLoginPage;
import com.katalyst.util.PropertyManager;
import com.katalyst.util.Reports;

public class Office365LoginSrc extends TestBase {
	public static String suite = PropertyManager.getInstance().getSuite();
	
	public void LoginToApplication365(String Office365[]) throws Exception {
		PageFactory.initElements(driver, Office365LoginPage.class);
		String userName = null;
		String password = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) {
			userName = Office365[0];
			password = Office365[1];
		} else {
			userName = Office365[2];
			password = Office365[3];
		}
		
		click(Office365LoginPage.getImgOffice365(), "Clicked on Office 365 image");		
		waitForElement(Office365LoginPage.getTxtEmailId(), 100);
		sendKeys(Office365LoginPage.getTxtEmailId(), userName, "Entered username");		
		click(Office365LoginPage.getBtnNext(), "Clicked on Next button");		
		waitForElement(Office365LoginPage.getTxtPassword(), 100);
		sendKeys(Office365LoginPage.getTxtPassword(), password, "Entered password");		
		click(Office365LoginPage.getBtnSignIn(), "Clicked on Sign In button");
		
		if(driver.getPageSource().contains("Sorry, but we’re having trouble signing you in.")||
				driver.getPageSource().contains("Enter a valid email address, phone number, or Skype name.")||
				driver.getPageSource().contains("There was an issue looking up your account. Tap Next to try again."))
		{			
				Reports.failTest("Invalid Office 356 Id");	
		}
		else 
		{
			waitForElement(Office365LoginPage.getChkDontShow(), 20);
			click(Office365LoginPage.getChkDontShow(), "Clicked on Dont Show Chechbox");			
			click(Office365LoginPage.getBtnYes(), "Clicked on Yes button");			
			waitForElement(Office365LoginPage.getBtnlogOut(), 50);
			click(Office365LoginPage.getBtnAvatar(), "Clicked on Avatar");
			click(Office365LoginPage.getBtnlogOut(), "Clicked on Logout button");
		}

	}


}
