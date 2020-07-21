package com.katalyst.ensoul.testHarness;

import org.openqa.selenium.support.PageFactory;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.PolicyPage;
import com.katalyst.util.PropertyManager;
import com.katalyst.util.Reports;

public class PolicySrc extends TestBase {
	public static String suite = PropertyManager.getInstance().getSuite();

	String createText =  "Create New Policy";
	String updateText = "Update Policy";

	public void PolicyCreate(String PolicyData[]) throws Exception {
		PageFactory.initElements(driver, PolicyPage.class);

		String policy = "A Test Policy";
		String description = "Created for Testing Purpose";
		
		waitForElement(PolicyPage.getMenuPolicy(), 30);
		click(PolicyPage.getMenuPolicy(), "Clicked on Policy Menu");

		if (driver.getPageSource().contains("Account / Policy")) {
			Reports.passTest("Successfully redirected to Policy Management.");
		} else {
			Reports.failTest("Unable to redirected - Policy Management");
		}
		
		if(PolicyPage.getLblformText().getText().contentEquals(createText))
		{
			Reports.passTest("Create Policy Text found");
		}
		else
		{
			Reports.failTest("Create Policy Text found");
		}

		click(PolicyPage.getDdlEmployer(), "Employer selected");
		click(PolicyPage.getTxtPolicyName(), "Clicked in Policy name text box");
		sendKeys(PolicyPage.getTxtPolicyName(), policy, "Policy name entered");
		click(PolicyPage.getTxtDescription(), "Clicked in Policy description text box");
		sendKeys(PolicyPage.getTxtDescription(), description, "Description entered");
		click(PolicyPage.getBtnCreate(), "Clicked on Submit Button");

		if (driver.getPageSource().contains("Policy already exists under same employer.")
				|| driver.getPageSource().contains("There is an error creating Policy. Please try after sometime.")) {
			Reports.failTest("Unable to create Policy");
		} else {
			Reports.passTest("Policy created successfully.");
		}

	}
	
	public void CreateDuplicatePolicy(String PolicyData[]) throws Exception {
		PageFactory.initElements(driver, PolicyPage.class);

		String policy = "A Test Policy";
		String description = "Created for Testing Purpose";

		waitForElement(PolicyPage.getMenuPolicy(), 30);
		click(PolicyPage.getMenuPolicy(), "Clicked on Policy Menu");

		if (driver.getPageSource().contains("Account / Policy")) {
			Reports.passTest("Successfully redirected to Policy Management.");
		} else {
			Reports.failTest("Unable to redirected - Policy Management");
		}
		
		if(PolicyPage.getLblformText().getText().contentEquals(createText))
		{
			Reports.passTest("Create Policy Text found");
		}
		else
		{
			Reports.failTest("Create Policy Text found");
		}


		click(PolicyPage.getDdlEmployer(), "Employer selected");
		click(PolicyPage.getTxtPolicyName(), "Clicked in Policy name text box");
		sendKeys(PolicyPage.getTxtPolicyName(), policy, "Policy name entered");
		click(PolicyPage.getTxtDescription(), "Clicked in Policy description text box");
		sendKeys(PolicyPage.getTxtDescription(), description, "Description entered");
		click(PolicyPage.getBtnCreate(), "Clicked on Submit Button");

		if (driver.getPageSource().contains("Policy already exists under same employer.")
				|| driver.getPageSource().contains("There is an error creating Policy. Please try after sometime.")) {
			Reports.passTest("Unable to create Duplicate Policy");
		} else {
			Reports.failTest("Duplicate Policy created successfully.");
		}

	}
	
	public void PolicyCreateDiffEmp(String PolicyData[]) throws Exception {
		PageFactory.initElements(driver, PolicyPage.class);

		String policy = "A Test Policy";
		String description = "Created for Testing Purpose";

		waitForElement(PolicyPage.getMenuPolicy(), 30);
		click(PolicyPage.getMenuPolicy(), "Clicked on Policy Menu");

		if (driver.getPageSource().contains("Account / Policy")) {
			Reports.passTest("Successfully redirected to Policy Management.");
		} else {
			Reports.failTest("Unable to edirected - Policy Management");
		}
		
		if(PolicyPage.getLblformText().getText().contentEquals(createText))
		{
			Reports.passTest("Create Policy Text found");
		}
		else
		{
			Reports.failTest("Create Policy Text found");
		}

		click(PolicyPage.getDdlDiffEmployer(), "Employer selected");
		click(PolicyPage.getTxtPolicyName(), "Clicked in Policy name text box");
		sendKeys(PolicyPage.getTxtPolicyName(), policy, "Policy name entered");
		click(PolicyPage.getTxtDescription(), "Clicked in Policy description text box");
		sendKeys(PolicyPage.getTxtDescription(), description, "Description entered");
		click(PolicyPage.getBtnCreate(), "Clicked on Submit Button");

		if (driver.getPageSource().contains("Policy already exists under same employer.")
				|| driver.getPageSource().contains("There is an error creating Policy. Please try after sometime.")) {
			Reports.failTest("Unable to create Policy");
		} else {
			Reports.passTest("Policy created successfully.");
		}
	}

	public void PolicyUpdate(String PolicyData[]) throws Exception {
		PageFactory.initElements(driver, PolicyPage.class);

		String policy = "A Test Policy";
		String newPolicy = "A Test Policy 1";
		String newDesc = "Updated content created for Testing Purpose";

		waitForElement(PolicyPage.getMenuPolicy(), 30);
		click(PolicyPage.getMenuPolicy(), "Clicked on Policy Menu");

		if (driver.getPageSource().contains("Account / Policy")) {
			Reports.passTest("Successfully redirected to Policy Management.");
		} else {
			Reports.failTest("Unable to redirected - Policy Management");
		}
		
		if(PolicyPage.getLblformText().getText().contentEquals(updateText))
		{
			Reports.passTest("Update Policy Text found");
		}
		else
		{
			Reports.failTest("Update Policy Text found");
		}


		waitForElement(PolicyPage.getTxtSearchBox(), 10);
		click(PolicyPage.getTxtSearchBox(), "Clicked in search box");
		sendKeys(PolicyPage.getTxtSearchBox(), policy, "Policy name entered in search box");
		click(PolicyPage.getIocSearch(), "Clicked on search button");
		click(PolicyPage.getSelectUpdateRecord(), "Clicked on Update record");
		
		if (driver.getPageSource().contains("Update Policy")) {
			Reports.failTest("Update Policy text is not present");
		}
		
		click(PolicyPage.getDdlDiffEmployer(), "Employer selected");
		click(PolicyPage.getTxtPolicyName(), "Clicked in Policy name text box");
		sendKeys(PolicyPage.getTxtPolicyName(), newPolicy, "New Policy name entered");
		click(PolicyPage.getTxtDescription(), "Clicked in Policy description text box");
		sendKeys(PolicyPage.getTxtDescription(), newDesc, "Updated Description entered");
		click(PolicyPage.getBtnUpdate(), "Clicked on Update Button");

		if (driver.getPageSource().contains("Policy already exists under same employer.")
				|| driver.getPageSource().contains("There is an error creating Policy. Please try after sometime.")) {
			Reports.failTest("Unable to create Policy");
		} else

		{
			Reports.passTest("Policy updated successfully.");
		}
	}

	public void PolicyDelete(String PolicyData[]) throws

	Exception {
		PageFactory.initElements(driver, PolicyPage.class);

		String newPolicy = "A Test Policy 1";

		waitForElement(PolicyPage.getMenuPolicy(), 30);
		click(PolicyPage.getMenuPolicy(), "Clicked on Policy Menu");

		if (driver.getPageSource().contains("Account / Policy")) {
			Reports.passTest("Successfully redirected to Policy Management.");
		} else

		{
			Reports.failTest("Unable to redirected - Policy Management");
		}

		waitForElement(PolicyPage.getTxtSearchBox(), 10);
		click(PolicyPage.getTxtSearchBox(), "Clicked in search box");
		sendKeys(PolicyPage.getTxtSearchBox(), newPolicy, "Policy name entered in search box");
		click(PolicyPage.getIocSearch(), "Clicked on search button");
		click(PolicyPage.getSelectUpdateRecord(), "Clicked on Update record");
		click(PolicyPage.getBtnDelete(), "Clicked on Delete Button");
		waitForElement(PolicyPage.getBtnDelConfirm(), 10);
		click(PolicyPage.getBtnDelConfirm(), "Clicked on Confirm Delete Button");

		if (driver.getPageSource().contains("Policy already exists under same employer.")
				|| driver.getPageSource().contains("There is an error creating Policy. Please try after sometime.")) {
			Reports.failTest("Unable to create Policy");
		} else

		{
			Reports.passTest("Policy deleted successfully.");
		}
	}

	public void PolicyCreateSplChar(String PolicyData[]) throws Exception {
		PageFactory.initElements(driver,PolicyPage.class);

		String policy = "@@@@@";
		String description = ".......................";

		waitForElement(PolicyPage.getMenuPolicy(), 30);
		click(PolicyPage.getMenuPolicy(), "Clicked on Policy Menu");

		if (driver.getPageSource().contains("Account / Policy")) {
			Reports.passTest("Successfully redirected to Policy Management.");
		} else

		{
			Reports.failTest("Unable to redirected - Policy Management");
		}
		
		if(PolicyPage.getLblformText().getText().contentEquals(createText))
		{
			Reports.passTest("Create Policy Text found");
		}
		else
		{
			Reports.failTest("Create Policy Text found");
		}


		click(PolicyPage.getDdlEmployer(), "Employer selected");
		click(PolicyPage.getTxtPolicyName(), "Clicked in Policy name text box");
		sendKeys(PolicyPage.getTxtPolicyName(), policy, "Policy name entered");
		click(PolicyPage.getTxtDescription(), "Clicked in Policy description text box");
		sendKeys(PolicyPage.getTxtDescription(), description, "Description entered");
		click(PolicyPage.getBtnCreate(), "Clicked on Submit Button");

		if (driver.getPageSource().contains("Policy already exists under same employer.")
				|| driver.getPageSource().contains("There is an error creating Policy. Please try after sometime.")
				|| driver.getPageSource().contains("Policy created successfully.")) {
			Reports.failTest("Policy with special characters is created successfully.");
		} else {
			Reports.passTest("Unable to create Policy");
		}
	}

}
