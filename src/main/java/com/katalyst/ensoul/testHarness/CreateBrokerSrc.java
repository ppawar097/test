package com.katalyst.ensoul.testHarness;

import org.openqa.selenium.support.PageFactory;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.CreateBrokerPage;
import com.katalyst.ensoul.page.CreateEmployeePage;
import com.katalyst.util.PropertyManager;
import com.katalyst.util.Reports;

public class CreateBrokerSrc extends TestBase {
	public static String suite = PropertyManager.getInstance().getSuite();
	
	public void BrokerCreation(String brokerData[]) throws Exception {
		PageFactory.initElements(driver, CreateBrokerPage.class);
		
		String userName = null;
		String password = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) {
			userName = brokerData[0];
			password = brokerData[1];
		} else {
			userName = brokerData[2];
			password = brokerData[3];
		}
		
		waitForElement(CreateBrokerPage.getMenuUser(), 30);
		click(CreateBrokerPage.getMenuUser(), "Clicked on Users menu");
		click(CreateBrokerPage.getMenuNewUser(), "Clicked on create new User");
		
		if (driver.getPageSource().contains("User Management")) {
			Reports.passTest("Successfully redirected to Users Management.");
		} else {
			Reports.failTest("Unable to redirected - Users Management");
		}	
		click(CreateBrokerPage.getOptBroker(), "Broker selected");
		
		sendKeys(CreateBrokerPage.getTxtUsername(), userName, "User name entered");		
		sendKeys(CreateBrokerPage.getTxtPassword(), password, "Password entered");
		sendKeys(CreateBrokerPage.getTxtConfirmPassword(), password, "Confirm Password entered");			
		click(CreateBrokerPage.getBtnSubmit(), "Click on submit");
		if (driver.getPageSource().contains("User created successfully.")) {
			Reports.passTest("User created successfully.");
		} else {
			Reports.failTest("There is an error creating User. Either it is already exist or wrong input. Please try after sometime.");
		}	
		
		if(driver.getPageSource().contains("The Password field is required.")
			||driver.getPageSource().contains("This field is required.")||
			driver.getPageSource().contains("The Email field is required.")||
			driver.getPageSource().contains("There is an error creating User. Please try after sometime.")||
			driver.getPageSource().contains("There is an error creating User. Either it is already exist or wrong input. Please try after sometime."))
					{
				String msg = CreateEmployeePage.getLblErrorMsg().getText();
				Reports.failTest(msg);	
				
					}	
		
	}
}
