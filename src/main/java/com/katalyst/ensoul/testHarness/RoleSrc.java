package com.katalyst.ensoul.testHarness;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.CreateEmployeePage;
import com.katalyst.ensoul.page.RolePage;
import com.katalyst.util.PropertyManager;
import com.katalyst.util.Reports;

public class RoleSrc extends TestBase {
	public static String suite = PropertyManager.getInstance().getSuite();
	
	public void RoleCreation(String role[]) throws Exception {
		PageFactory.initElements(driver, RolePage.class);
		
		String rolename = null;
		String description = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) 
		{
			rolename = role[0];
			description = role[1];
		} 
		else 
		{
			rolename = role[2];
			description = role[3];
		}
		waitForElement(RolePage.getLnkPrrofile(), 10);
		click(RolePage.getLnkPrrofile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Roles Management")) {
			Reports.passTest("Successfully redirected to Roles Management.");
		} else {
			Reports.failTest("Unable to redirected - Roles Management");
		}	
		
		waitForElement(RolePage.getTxtRoleName(), 10);
		sendKeys(RolePage.getTxtRoleName(), rolename, "Role name entered");		
		waitForElement(RolePage.getTxtDesc(), 10);
		sendKeys(RolePage.getTxtDesc(), description, "Description entered");	
		
		 WebElement mySelectElement = driver.findElement(By.name("PolicyDetails"));
		 Select dropdown= new Select(mySelectElement);		
		 dropdown.selectByIndex(2);		 
		 
		click(RolePage.getBtnSubmit(),"Clicked on Submit button");
		
		
		if (driver.getPageSource().contains("Role created successfully.")) {
			Reports.passTest("Role created successfully.");
		} else if(driver.getPageSource().contains("Role Name cannot be empty.")||
				driver.getPageSource().contains("An error occurred while processing your request.")||
				driver.getPageSource().contains("There is an error creating role. Either it is already exist or wrong input. Please try after sometime."))
		{
			Reports.failTest("Role not created.");
		}	

}

	public void NameAsPolicy(String role[]) throws Exception {
		PageFactory.initElements(driver, RolePage.class);
		
		String rolename = null;
		String description = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) 
		{
			rolename = role[4];
			description = role[1];
		} 
		else 
		{
			rolename = role[2];
			description = role[3];
		}
		waitForElement(RolePage.getLnkPrrofile(), 10);
		click(RolePage.getLnkPrrofile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Roles Management")) {
			Reports.passTest("Successfully redirected to Roles Management.");
		} else {
			Reports.failTest("Unable to redirected - Roles Management");
		}	
		
		waitForElement(RolePage.getTxtRoleName(), 10);
		sendKeys(RolePage.getTxtRoleName(), rolename, "Role name entered");		
		waitForElement(RolePage.getTxtDesc(), 10);
		sendKeys(RolePage.getTxtDesc(), description, "Description entered");	
		 WebElement mySelectElement = driver.findElement(By.name("PolicyDetails"));
		 Select dropdown= new Select(mySelectElement);		
		 dropdown.selectByIndex(2);
		click(RolePage.getBtnSubmit(),"Clicked on Submit button");			

		if (driver.getPageSource().contains("Role created successfully.")) {
			Reports.passTest("Role created same as Policy name successfully.");
		} else if(driver.getPageSource().contains("Role Name cannot be empty.")||
				driver.getPageSource().contains("An error occurred while processing your request.")||
				driver.getPageSource().contains("There is an error creating role. Either it is already exist or wrong input. Please try after sometime."))
		{
			Reports.failTest("Role not created.");
		}	

}
	
	public void AplhaNumeric(String role[]) throws Exception {
		PageFactory.initElements(driver, RolePage.class);
		
		String rolename = null;
		String description = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) 
		{
			rolename = role[5];
			description = role[1];
		} 
		else 
		{
			rolename = role[2];
			description = role[3];
		}
		waitForElement(RolePage.getLnkPrrofile(), 10);
		click(RolePage.getLnkPrrofile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Roles Management")) {
			Reports.passTest("Successfully redirected to Roles Management.");
		} else {
			Reports.failTest("Unable to redirected - Roles Management");
		}	
		
		waitForElement(RolePage.getTxtRoleName(), 10);
		sendKeys(RolePage.getTxtRoleName(), rolename, "Role name entered");		
		waitForElement(RolePage.getTxtDesc(), 10);
		sendKeys(RolePage.getTxtDesc(), description, "Description entered");	
		 WebElement mySelectElement = driver.findElement(By.name("PolicyDetails"));
		 Select dropdown= new Select(mySelectElement);		
		 dropdown.selectByIndex(2);
		click(RolePage.getBtnSubmit(),"Clicked on Submit button");		
	
		if (driver.getPageSource().contains("Role created successfully.")) {
			Reports.passTest("Role is created with Aplha Numeric values successfully.");
		} else if(driver.getPageSource().contains("Role Name cannot be empty.")||
				driver.getPageSource().contains("An error occurred while processing your request.")||
				driver.getPageSource().contains("There is an error creating role. Either it is already exist or wrong input. Please try after sometime."))
		{
			Reports.failTest("Role not created.");
		}	

}

	public void MultiplePolicies(String role[]) throws Exception {
		PageFactory.initElements(driver, RolePage.class);
		
		String rolename = null;
		String description = null;
		String FirstPolicyName = "EMployee - HR";
		String SecondPolicyName = "Employer";
		WebElement FirstPolicy = driver.findElement(By.xpath("//option[contains(text(),'" + FirstPolicyName + "')]"));
		WebElement SecondPolicy = driver.findElement(By.xpath("//option[contains(text(),'" + SecondPolicyName + "')]"));
		
		if (suite.equalsIgnoreCase("SmokeTest") == true) 
		{
			rolename = role[0];
			description = role[1];
		} 
		else 
		{
			rolename = role[2];
			description = role[3];
		}
		waitForElement(RolePage.getLnkPrrofile(), 10);
		click(RolePage.getLnkPrrofile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Roles Management")) {
			Reports.passTest("Successfully redirected to Roles Management.");
		} else {
			Reports.failTest("Unable to redirected - Roles Management");
		}	
		
		waitForElement(RolePage.getTxtRoleName(), 10);
		sendKeys(RolePage.getTxtRoleName(), rolename, "Role name entered");		
		waitForElement(RolePage.getTxtDesc(), 10);
		sendKeys(RolePage.getTxtDesc(), description, "Description entered");	
		
		 WebElement mySelectElement = driver.findElement(By.name("PolicyDetails"));
		 Select dropdown= new Select(mySelectElement);		
		 dropdown.selectByIndex(2);
		 dropdown.selectByIndex(3);
		   	
		click(RolePage.getBtnSubmit(),"Clicked on Submit button");
		

		if (driver.getPageSource().contains("Role created successfully.")) {
			Reports.passTest("Role created successfully with multiple Policy.");
		} else if(driver.getPageSource().contains("Role Name cannot be empty.")||
				driver.getPageSource().contains("An error occurred while processing your request.")||
				driver.getPageSource().contains("There is an error creating role. Either it is already exist or wrong input. Please try after sometime."))
		{
			Reports.failTest("Role not created.");
		}	

}

	public void Delete(String role[]) throws Exception {
		PageFactory.initElements(driver, RolePage.class);
		
		String rolename = null;
		String description = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) 
		{
			rolename = role[0];
			description = role[1];
		} 
		else 
		{
			rolename = role[2];
			description = role[3];
		}
		waitForElement(RolePage.getLnkPrrofile(), 10);
		click(RolePage.getLnkPrrofile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Roles Management")) {
			Reports.passTest("Successfully redirected to Roles Management.");
		} else {
			Reports.failTest("Unable to redirected - Roles Management");
		}	
		
		waitForElement(RolePage.getTxtRoleName(), 10);
		sendKeys(RolePage.getTxtRoleName(), rolename, "Role name entered");		
		waitForElement(RolePage.getTxtDesc(), 10);
		sendKeys(RolePage.getTxtDesc(), description, "Description entered");		
		click(RolePage.getBtnSubmit(),"Clicked on Submit button");
		
		WebElement CustomLnk = driver.findElement(By
				.xpath("//td[contains(text(),'" + rolename + "')]//following-sibling::td//a[contains(.,'Edit')]"));
		click(CustomLnk, "Click on Edit link for Role - "+rolename);
		waitForElement(RolePage.getTxtDesc(), 10);
		sendKeys(RolePage.getTxtDesc(), description, "Description entered");		
		click(RolePage.getBtnUpdate(),"Clicked on Update button");

		if (driver.getPageSource().contains("Role updated successfully.")) {
			Reports.passTest("Role updated successfully.");
		} else if(driver.getPageSource().contains("Role Name cannot be empty.")||
				driver.getPageSource().contains("An error occurred while processing your request."))
		{
			Reports.failTest("Role not updated.");
		}	

}

	public void SpecialChars(String role[]) throws Exception {
		PageFactory.initElements(driver, RolePage.class);
		
		String rolename = null;
		String description = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) 
		{
			rolename = role[0];
			description = role[1];
		} 
		else 
		{
			rolename = role[2];
			description = role[3];
		}
		waitForElement(RolePage.getLnkPrrofile(), 10);
		click(RolePage.getLnkPrrofile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Roles Management")) {
			Reports.passTest("Successfully redirected to Roles Management.");
		} else {
			Reports.failTest("Unable to redirected - Roles Management");
		}	
		
		waitForElement(RolePage.getTxtRoleName(), 10);
		sendKeys(RolePage.getTxtRoleName(), rolename, "Role name entered");		
		waitForElement(RolePage.getTxtDesc(), 10);
		sendKeys(RolePage.getTxtDesc(), description, "Description entered");		
		click(RolePage.getBtnSubmit(),"Clicked on Submit button");
		
		WebElement CustomLnk = driver.findElement(By
				.xpath("//td[contains(text(),'" + rolename + "')]//following-sibling::td//a[contains(.,'Edit')]"));
		click(CustomLnk, "Click on Edit link for Role - "+rolename);
		waitForElement(RolePage.getTxtDesc(), 10);
		sendKeys(RolePage.getTxtDesc(), description, "Description entered");		
		click(RolePage.getBtnUpdate(),"Clicked on Update button");

		if (driver.getPageSource().contains("Role updated successfully.")) {
			Reports.passTest("Role updated successfully.");
		} else if(driver.getPageSource().contains("Role Name cannot be empty.")||
				driver.getPageSource().contains("An error occurred while processing your request."))
		{
			Reports.failTest("Role not updated.");
		}	

}

	public void Edit(String role[]) throws Exception {
		PageFactory.initElements(driver, RolePage.class);
		
		String rolename = null;
		String description = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) 
		{
			rolename = role[0];
			description = role[1];
		} 
		else 
		{
			rolename = role[2];
			description = role[3];
		}
		waitForElement(RolePage.getLnkPrrofile(), 10);
		click(RolePage.getLnkPrrofile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Roles Management")) {
			Reports.passTest("Successfully redirected to Roles Management.");
		} else {
			Reports.failTest("Unable to redirected - Roles Management");
		}	
		
		waitForElement(RolePage.getTxtRoleName(), 10);
		sendKeys(RolePage.getTxtRoleName(), rolename, "Role name entered");		
		waitForElement(RolePage.getTxtDesc(), 10);
		sendKeys(RolePage.getTxtDesc(), description, "Description entered");		
		click(RolePage.getBtnSubmit(),"Clicked on Submit button");
		
		WebElement CustomLnk = driver.findElement(By
				.xpath("//td[contains(text(),'" + rolename + "')]//following-sibling::td//a[contains(.,'Edit')]"));
		click(CustomLnk, "Click on Edit link for Role - "+rolename);
		waitForElement(RolePage.getTxtDesc(), 10);
		sendKeys(RolePage.getTxtDesc(), description, "Description entered");		
		click(RolePage.getBtnUpdate(),"Clicked on Update button");

		if (driver.getPageSource().contains("Role updated successfully.")) {
			Reports.passTest("Role updated successfully.");
		} else if(driver.getPageSource().contains("Role Name cannot be empty.")||
				driver.getPageSource().contains("An error occurred while processing your request."))
		{
			Reports.failTest("Role not updated.");
		}	

}

	public void NotEmpty(String role[]) throws Exception {
		PageFactory.initElements(driver, RolePage.class);
		
		String rolename = null;
		String description = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) 
		{
			rolename = role[0];
			description = role[1];
		} 
		else 
		{
			rolename = role[2];
			description = role[3];
		}
		waitForElement(RolePage.getLnkPrrofile(), 10);
		click(RolePage.getLnkPrrofile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Roles Management")) {
			Reports.passTest("Successfully redirected to Roles Management.");
		} else {
			Reports.failTest("Unable to redirected - Roles Management");
		}	
		
		waitForElement(RolePage.getTxtRoleName(), 10);
		sendKeys(RolePage.getTxtRoleName(), rolename, "Role name entered");		
		waitForElement(RolePage.getTxtDesc(), 10);
		sendKeys(RolePage.getTxtDesc(), description, "Description entered");		
		click(RolePage.getBtnSubmit(),"Clicked on Submit button");
		
		WebElement CustomLnk = driver.findElement(By
				.xpath("//td[contains(text(),'" + rolename + "')]//following-sibling::td//a[contains(.,'Edit')]"));
		click(CustomLnk, "Click on Edit link for Role - "+rolename);
		waitForElement(RolePage.getTxtDesc(), 10);
		sendKeys(RolePage.getTxtDesc(), description, "Description entered");		
		click(RolePage.getBtnUpdate(),"Clicked on Update button");

		if (driver.getPageSource().contains("Role updated successfully.")) {
			Reports.passTest("Role updated successfully.");
		} else if(driver.getPageSource().contains("Role Name cannot be empty.")||
				driver.getPageSource().contains("An error occurred while processing your request."))
		{
			Reports.failTest("Role not updated.");
		}	

}
	
	public void SpecialChar(String role[]) throws Exception {
		PageFactory.initElements(driver, RolePage.class);
		
		String rolename = null;
		String description = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) 
		{
			rolename = role[6];
			description = role[1];
		} 
		else 
		{
			rolename = role[6];
			description = role[3];
		}
		waitForElement(RolePage.getLnkPrrofile(), 10);
		click(RolePage.getLnkPrrofile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Roles Management")) {
			Reports.passTest("Successfully redirected to Roles Management.");
		} else {
			Reports.failTest("Unable to redirected - Roles Management");
		}	
		
		waitForElement(RolePage.getTxtRoleName(), 10);
		sendKeys(RolePage.getTxtRoleName(), rolename, "Role name entered");		
		waitForElement(RolePage.getTxtDesc(), 10);
		sendKeys(RolePage.getTxtDesc(), description, "Description entered");	
		 WebElement mySelectElement = driver.findElement(By.name("PolicyDetails"));
		 Select dropdown= new Select(mySelectElement);		
		 dropdown.selectByIndex(2);
		click(RolePage.getBtnSubmit(),"Clicked on Submit button");
		
		if (driver.getPageSource().contains("Role created successfully.")) {
			Reports.passTest("Role is created successfully with Special characters.");
		} else if(driver.getPageSource().contains("Role Name cannot be empty.")||
				driver.getPageSource().contains("An error occurred while processing your request.")||
				driver.getPageSource().contains("There is an error creating role. Either it is already exist or wrong input. Please try after sometime."))
		{
			Reports.failTest("Role not created.");
		}	

}

	public void RoleEdit(String role[]) throws Exception {
		PageFactory.initElements(driver, RolePage.class);
		
		String rolename = null;
		String description = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) 
		{
			rolename = role[0];
			description = role[1];
		} 
		else 
		{
			rolename = role[2];
			description = role[3];
		}
		waitForElement(RolePage.getLnkPrrofile(), 10);
		click(RolePage.getLnkPrrofile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Roles Management")) {
			Reports.passTest("Successfully redirected to Roles Management.");
		} else {
			Reports.failTest("Unable to redirected - Roles Management");
		}	
				
		WebElement CustomLnk = driver.findElement(By
				.xpath("//td[contains(text(),'" + rolename + "')]//following-sibling::td//a[1]"));
		click(CustomLnk, "Click on Edit link for Role - "+rolename);
		waitForElement(RolePage.getTxtDesc(), 10);
		sendKeys(RolePage.getTxtDesc(), description, "Description entered");	
		 WebElement mySelectElement = driver.findElement(By.name("PolicyDetails"));
		 Select dropdown= new Select(mySelectElement);		
		 dropdown.selectByIndex(4);
		click(RolePage.getBtnUpdate(),"Clicked on Update button");

		if (driver.getPageSource().contains("Role updated successfully.")) {
			Reports.passTest("Role updated successfully.");
		} else if(driver.getPageSource().contains("Role Name cannot be empty.")||
				driver.getPageSource().contains("An error occurred while processing your request.")||
				driver.getPageSource().contains("There is an error creating role. Either it is already exist or wrong input. Please try after sometime."))
		{
			Reports.failTest("Role not updated.");
		}	

}

	public void RoleDelete(String role[]) throws Exception {
		PageFactory.initElements(driver, RolePage.class);
		
		String rolename = null;
		String description = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) 
		{
			rolename = role[0];
			description = role[1];
		} 
		else 
		{
			rolename = role[2];
			description = role[3];
		}
		waitForElement(RolePage.getLnkPrrofile(), 10);
		click(RolePage.getLnkPrrofile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Roles Management")) {
			Reports.passTest("Successfully redirected to Roles Management.");
		} else {
			Reports.failTest("Unable to redirected - Roles Management");
		}	
		
		WebElement CustomLnk = driver.findElement(By
				.xpath("//td[contains(text(),'" + rolename + "')]//following-sibling::td//a[1]"));
		click(CustomLnk, "Click on Edit link for Role - "+rolename);
		
		 WebElement mySelectElement = driver.findElement(By.name("PolicyDetails"));
		 Select dropdown= new Select(mySelectElement);		
		 dropdown.selectByIndex(4);
		click(RolePage.getBtnDelete(),"Clicked on Delete button");
		waitForElement(RolePage.getBtnPopupDelete(), 10);
		click(RolePage.getBtnPopupDelete(), "Clicked on confirm Delete button");



		if (driver.getPageSource().contains("Role deleted successfully.")) {
			Reports.passTest("Role deleted successfully.");
		} else if(driver.getPageSource().contains("Role Name cannot be empty.")||
				driver.getPageSource().contains("An error occurred while processing your request.")||
				driver.getPageSource().contains("There is an error creating role. Either it is already exist or wrong input. Please try after sometime."))
		{
			Reports.failTest("Role not created.");
		}	

}

	public void NotNull() throws Exception {
		PageFactory.initElements(driver, RolePage.class);
		
		waitForElement(RolePage.getLnkPrrofile(), 10);
		click(RolePage.getLnkPrrofile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Roles Management")) {
			Reports.passTest("Successfully redirected to Roles Management.");
		} else {
			Reports.failTest("Unable to redirected - Roles Management");
		}	
		
			
		 WebElement mySelectElement = driver.findElement(By.name("PolicyDetails"));
		 Select dropdown= new Select(mySelectElement);		
		 dropdown.selectByIndex(2);
		 click(RolePage.getBtnSubmit(),"Clicked on Submit button");
		 
		 if (RolePage.getTxtRoleName().getAttribute("value").equals("")) {
			 Reports.failTest("Role name is not empty.");
			}
		
		if (driver.getPageSource().contains("Role created successfully.")) {
			Reports.passTest("Role created successfully with null values.");
		} else if(driver.getPageSource().contains("Please fill out this field.")||
				driver.getPageSource().contains("An error occurred while processing your request.")||
				driver.getPageSource().contains("There is an error creating role. Either it is already exist or wrong input. Please try after sometime."))
		{
			Reports.failTest("Role not created.");
		}	

}
}
