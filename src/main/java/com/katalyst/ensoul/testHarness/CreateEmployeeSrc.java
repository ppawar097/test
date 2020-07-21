package com.katalyst.ensoul.testHarness;

import org.openqa.selenium.support.PageFactory;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.CreateEmployeePage;
import com.katalyst.ensoul.page.LoginPage;
import com.katalyst.util.PropertyManager;
import com.katalyst.util.Reports;

public class CreateEmployeeSrc extends TestBase {
	public static String suite = PropertyManager.getInstance().getSuite();
	
	public void CreateEmployee(String employeeData[]) throws Exception {
		PageFactory.initElements(driver, CreateEmployeePage.class);			
		
		String password = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) {			
			password = employeeData[1];
		} else {			
			password = employeeData[3];
		}
		
		waitForElement(CreateEmployeePage.getMenuUser(), 30);
		click(CreateEmployeePage.getMenuUser(), "Clicked on Users menu");
		click(CreateEmployeePage.getMenuNewUser(), "Clicked on create new User");
		
		if (driver.getPageSource().contains("User Management")) {
			Reports.passTest("Successfully redirected to Users Management.");
		} else {
			Reports.failTest("Unable to redirected - Users Management");
		}	
		click(CreateEmployeePage.getChoEmployee(), "Select Create Employee");
		waitForElement(CreateEmployeePage.getDdlEmployer(), 20);
		click(CreateEmployeePage.getDdlEmployer(),"Select Employer");
		waitForElement(CreateEmployeePage.getDdlEmployee(), 20);
		click(CreateEmployeePage.getDdlEmployee(),"Select Employee");
		click(CreateEmployeePage.getTxtPassword(),"Clicked in Password Textbox");
		sendKeys(CreateEmployeePage.getTxtPassword(), password, "Password entered");
		click(CreateEmployeePage.getTxtConfirmPassword(),"Clicked in Confirm Password Textbox");
		sendKeys(CreateEmployeePage.getTxtConfirmPassword(), password, "Confirm Password entered");
		click(CreateEmployeePage.getChoYes(),"Clicked on Employer Function - Yes");
		click(CreateEmployeePage.getOptRole(),"Role is selected");
		click(CreateEmployeePage.getBtnFillRole(),"Role is added");
		click(CreateEmployeePage.getChkSendMail(),"Send email selected");
		click(CreateEmployeePage.getBtnSubmit(),"Click on submit button");
		
		
		if(driver.getPageSource().contains("Required fields cannot be empty.")
			||driver.getPageSource().contains("This field is required.")||
			driver.getPageSource().contains("Employee is required.")||
			driver.getPageSource().contains("The Email field is required.")||
			driver.getPageSource().contains("The Password field is required.")||
			driver.getPageSource().contains("This field is required.")||
			driver.getPageSource().contains("Role list is required."))
				{
			String msg = CreateEmployeePage.getLblErrorMsg().getText();
			Reports.failTest(msg);	
			
				}	
	}
}
