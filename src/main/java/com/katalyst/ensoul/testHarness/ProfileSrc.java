package com.katalyst.ensoul.testHarness;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.CreateEmployeePage;
import com.katalyst.ensoul.page.ProfilePage;
import com.katalyst.util.PropertyManager;
import com.katalyst.util.Reports;

public class ProfileSrc extends TestBase {
	public static String suite = PropertyManager.getInstance().getSuite();
	
	public void WhiteSpace() throws Exception {
		PageFactory.initElements(driver, ProfilePage.class);	
		
		String password = "        ";		
		
		waitForElement(ProfilePage.getMenuProfile(), 10);
		click(ProfilePage.getMenuProfile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Profile")) {
			Reports.passTest("Successfully redirected to Profile Management.");
		} else {
			Reports.failTest("Unable to redirected - Profile Management");
		}	
		
		click(ProfilePage.getTxtCurrentPassword(), "Clicked in Current Password entered");
		clear(ProfilePage.getTxtCurrentPassword(), "Current Password cleared");
		sendKeys(ProfilePage.getTxtCurrentPassword(), password, "Current Password entered");	
		click(ProfilePage.getTxtNewPassword(), "Clicked in New Password entered");
		clear(ProfilePage.getTxtNewPassword(), "New Password cleared");
		sendKeys(ProfilePage.getTxtNewPassword(), password, "New Password entered");
		click(ProfilePage.getTxtConfirmPassword(), "Clicked in Confirm new Password entered");
		clear(ProfilePage.getTxtConfirmPassword(), "Confirm new Password cleared");
		sendKeys(ProfilePage.getTxtConfirmPassword(), password, "Confirm new Password entered");
		click(ProfilePage.getBtnUpdate(), "Click on update button");
		
		
		waitForElement(ProfilePage.getBtnUpdate(), 10);
		
		if (driver.getPageSource().contains("Error in Password Reset")||
				driver.getPageSource().contains("Please fill out this field.")||
				driver.getPageSource().contains("An error occurred while processing your request.")) 
		{
			Reports.failTest("There is an Error in Password Reset. Please try after sometime.");
			
		} 
		else 
		{
			Reports.passTest("Password updated successfully.");
		}	
		
		
	
	}

	public void PasswordNull() throws Exception {
		PageFactory.initElements(driver, ProfilePage.class);	
		
		String password = null;
		
		waitForElement(ProfilePage.getMenuProfile(), 10);
		click(ProfilePage.getMenuProfile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Profile")) {
			Reports.passTest("Successfully redirected to Profile Management.");
		} else {
			Reports.failTest("Unable to redirected - Profile Management");
		}	
		
		click(ProfilePage.getTxtCurrentPassword(), "Clicked in Current Password entered");
		clear(ProfilePage.getTxtCurrentPassword(), "Current Password cleared");
		sendKeys(ProfilePage.getTxtCurrentPassword(), password, "Current Password entered");	
		click(ProfilePage.getTxtNewPassword(), "Clicked in New Password entered");
		clear(ProfilePage.getTxtNewPassword(), "New Password cleared");
		sendKeys(ProfilePage.getTxtNewPassword(), password, "New Password entered");
		click(ProfilePage.getTxtConfirmPassword(), "Clicked in Confirm new Password entered");
		clear(ProfilePage.getTxtConfirmPassword(), "Confirm new Password cleared");
		sendKeys(ProfilePage.getTxtConfirmPassword(), password, "Confirm new Password entered");
		click(ProfilePage.getBtnUpdate(), "Click on update button");
		
		
		waitForElement(ProfilePage.getBtnUpdate(), 10);
		
		if (driver.getPageSource().contains("Error in Password Reset")||
				driver.getPageSource().contains("Please fill out this field.")||
				driver.getPageSource().contains("An error occurred while processing your request.")) 
		{
			Reports.failTest("There is an Error in Password Reset. Please try after sometime.");
			
		} 
		else 
		{
			Reports.passTest("Password updated successfully.");
		}	
		
		
	
	}

	public void CharOnly(String profileData[]) throws Exception {
		PageFactory.initElements(driver, ProfilePage.class);	
		
		String password = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) {
			
			password = profileData[1];
		} else {
			
			password = profileData[3];
		}
		
		waitForElement(ProfilePage.getMenuProfile(), 10);
		click(ProfilePage.getMenuProfile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Profile")) {
			Reports.passTest("Successfully redirected to Profile Management.");
		} else {
			Reports.failTest("Unable to redirected - Profile Management");
		}	
		
		click(ProfilePage.getTxtCurrentPassword(), "Clicked in Current Password entered");
		clear(ProfilePage.getTxtCurrentPassword(), "Current Password cleared");
		sendKeys(ProfilePage.getTxtCurrentPassword(), password, "Current Password entered");	
		click(ProfilePage.getTxtNewPassword(), "Clicked in New Password entered");
		clear(ProfilePage.getTxtNewPassword(), "New Password cleared");
		sendKeys(ProfilePage.getTxtNewPassword(), password, "New Password entered");
		click(ProfilePage.getTxtConfirmPassword(), "Clicked in Confirm new Password entered");
		clear(ProfilePage.getTxtConfirmPassword(), "Confirm new Password cleared");
		sendKeys(ProfilePage.getTxtConfirmPassword(), password, "Confirm new Password entered");
		click(ProfilePage.getBtnUpdate(), "Click on update button");
		
		
		waitForElement(ProfilePage.getBtnUpdate(), 10);
		
		if (driver.getPageSource().contains("Error in Password Reset")||
				driver.getPageSource().contains("Please fill out this field.")||
				driver.getPageSource().contains("An error occurred while processing your request.")) 
		{
			Reports.failTest("There is an Error in Password Reset. Please try after sometime.");
			
		} 
		else 
		{
			Reports.passTest("Password updated successfully.");
		}	
		
		
	
	}

	public void AplhaNumeric(String profileData[]) throws Exception {
		PageFactory.initElements(driver, ProfilePage.class);	
		
		String password = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) {
			
			password = profileData[1];
		} else {
			
			password = profileData[3];
		}
		
		waitForElement(ProfilePage.getMenuProfile(), 10);
		click(ProfilePage.getMenuProfile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Profile")) {
			Reports.passTest("Successfully redirected to Profile Management.");
		} else {
			Reports.failTest("Unable to redirected - Profile Management");
		}	
		
		click(ProfilePage.getTxtCurrentPassword(), "Clicked in Current Password entered");
		clear(ProfilePage.getTxtCurrentPassword(), "Current Password cleared");
		sendKeys(ProfilePage.getTxtCurrentPassword(), password, "Current Password entered");	
		click(ProfilePage.getTxtNewPassword(), "Clicked in New Password entered");
		clear(ProfilePage.getTxtNewPassword(), "New Password cleared");
		sendKeys(ProfilePage.getTxtNewPassword(), password, "New Password entered");
		click(ProfilePage.getTxtConfirmPassword(), "Clicked in Confirm new Password entered");
		clear(ProfilePage.getTxtConfirmPassword(), "Confirm new Password cleared");
		sendKeys(ProfilePage.getTxtConfirmPassword(), password, "Confirm new Password entered");
		click(ProfilePage.getBtnUpdate(), "Click on update button");
		
		
		waitForElement(ProfilePage.getBtnUpdate(), 10);
		
		if (driver.getPageSource().contains("Error in Password Reset")||
				driver.getPageSource().contains("Please fill out this field.")||
				driver.getPageSource().contains("An error occurred while processing your request.")) 
		{
			Reports.failTest("There is an Error in Password Reset. Please try after sometime.");
			
		} 
		else 
		{
			Reports.passTest("Password updated successfully.");
		}	
		
		
	
	}

	public void SpecialChar(String profileData[]) throws Exception {
		PageFactory.initElements(driver, ProfilePage.class);	
		
		String password = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) {
			
			password = profileData[1];
		} else {
			
			password = profileData[3];
		}
		
		waitForElement(ProfilePage.getMenuProfile(), 10);
		click(ProfilePage.getMenuProfile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Profile")) {
			Reports.passTest("Successfully redirected to Profile Management.");
		} else {
			Reports.failTest("Unable to redirected - Profile Management");
		}	
		
		click(ProfilePage.getTxtCurrentPassword(), "Clicked in Current Password entered");
		clear(ProfilePage.getTxtCurrentPassword(), "Current Password cleared");
		sendKeys(ProfilePage.getTxtCurrentPassword(), password, "Current Password entered");	
		click(ProfilePage.getTxtNewPassword(), "Clicked in New Password entered");
		clear(ProfilePage.getTxtNewPassword(), "New Password cleared");
		sendKeys(ProfilePage.getTxtNewPassword(), password, "New Password entered");
		click(ProfilePage.getTxtConfirmPassword(), "Clicked in Confirm new Password entered");
		clear(ProfilePage.getTxtConfirmPassword(), "Confirm new Password cleared");
		sendKeys(ProfilePage.getTxtConfirmPassword(), password, "Confirm new Password entered");
		click(ProfilePage.getBtnUpdate(), "Click on update button");
		
		
		waitForElement(ProfilePage.getBtnUpdate(), 10);
		
		if (driver.getPageSource().contains("Error in Password Reset")||
				driver.getPageSource().contains("Please fill out this field.")||
				driver.getPageSource().contains("An error occurred while processing your request.")) 
		{
			Reports.failTest("There is an Error in Password Reset. Please try after sometime.");
			
		} 
		else 
		{
			Reports.passTest("Password updated successfully.");
		}	
		
		
	
	}

	public void NumbersOnly(String profileData[]) throws Exception {
		PageFactory.initElements(driver, ProfilePage.class);	
		
		String password = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) {
			
			password = profileData[1];
		} else {
			
			password = profileData[3];
		}
		
		waitForElement(ProfilePage.getMenuProfile(), 10);
		click(ProfilePage.getMenuProfile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Profile")) {
			Reports.passTest("Successfully redirected to Profile Management.");
		} else {
			Reports.failTest("Unable to redirected - Profile Management");
		}	
		
		click(ProfilePage.getTxtCurrentPassword(), "Clicked in Current Password entered");
		clear(ProfilePage.getTxtCurrentPassword(), "Current Password cleared");
		sendKeys(ProfilePage.getTxtCurrentPassword(), password, "Current Password entered");	
		click(ProfilePage.getTxtNewPassword(), "Clicked in New Password entered");
		clear(ProfilePage.getTxtNewPassword(), "New Password cleared");
		sendKeys(ProfilePage.getTxtNewPassword(), password, "New Password entered");
		click(ProfilePage.getTxtConfirmPassword(), "Clicked in Confirm new Password entered");
		clear(ProfilePage.getTxtConfirmPassword(), "Confirm new Password cleared");
		sendKeys(ProfilePage.getTxtConfirmPassword(), password, "Confirm new Password entered");
		click(ProfilePage.getBtnUpdate(), "Click on update button");
		
		
		waitForElement(ProfilePage.getBtnUpdate(), 10);
		
		if (driver.getPageSource().contains("Error in Password Reset")||
				driver.getPageSource().contains("Please fill out this field.")||
				driver.getPageSource().contains("An error occurred while processing your request.")) 
		{
			Reports.failTest("There is an Error in Password Reset. Please try after sometime.");
			
		} 
		else 
		{
			Reports.passTest("Password updated successfully.");
		}	
		
		
	
	}

	public void Combination(String profileData[]) throws Exception {
		PageFactory.initElements(driver, ProfilePage.class);	
		
		String password = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) {
			
			password = profileData[1];
		} else {
			
			password = profileData[3];
		}
		
		waitForElement(ProfilePage.getMenuProfile(), 10);
		click(ProfilePage.getMenuProfile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Profile")) {
			Reports.passTest("Successfully redirected to Profile Management.");
		} else {
			Reports.failTest("Unable to redirected - Profile Management");
		}	
		
		click(ProfilePage.getTxtCurrentPassword(), "Clicked in Current Password entered");
		clear(ProfilePage.getTxtCurrentPassword(), "Current Password cleared");
		sendKeys(ProfilePage.getTxtCurrentPassword(), password, "Current Password entered");	
		click(ProfilePage.getTxtNewPassword(), "Clicked in New Password entered");
		clear(ProfilePage.getTxtNewPassword(), "New Password cleared");
		sendKeys(ProfilePage.getTxtNewPassword(), password, "New Password entered");
		click(ProfilePage.getTxtConfirmPassword(), "Clicked in Confirm new Password entered");
		clear(ProfilePage.getTxtConfirmPassword(), "Confirm new Password cleared");
		sendKeys(ProfilePage.getTxtConfirmPassword(), password, "Confirm new Password entered");
		click(ProfilePage.getBtnUpdate(), "Click on update button");
		
		
		waitForElement(ProfilePage.getBtnUpdate(), 10);
		
		if (driver.getPageSource().contains("Error in Password Reset")||
				driver.getPageSource().contains("Please fill out this field.")||
				driver.getPageSource().contains("An error occurred while processing your request.")) 
		{
			Reports.failTest("There is an Error in Password Reset. Please try after sometime.");
			
		} 
		else 
		{
			Reports.passTest("Password updated successfully.");
		}	
		
		
	
	}

	public void ImgUploadJPG(String profileData[]) throws Exception {
		PageFactory.initElements(driver, ProfilePage.class);	
		
		String path = profileData[2];;	
		
		waitForElement(ProfilePage.getMenuProfile(), 10);
		click(ProfilePage.getMenuProfile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Profile")) {
			Reports.passTest("Successfully redirected to Profile Management.");
		} else {
			Reports.failTest("Unable to redirected - Profile Management");
		}	
		
		click(ProfilePage.getBtnChooseImage(), "Clicked in Upload Image button");
		clear(ProfilePage.getBtnChooseImage(), "Clear text");
		sendKeys(ProfilePage.getBtnChooseImage(), path, "Image path entered");	
		click(ProfilePage.getBtnUploadImage(), "Click on update button");
		
		waitForElement(ProfilePage.getBtnUpdate(), 10);
		
		if (driver.getPageSource().contains("Please select valid file format")) 
		{
			Reports.failTest("Please select valid file format");
			
		} 
		else 
		{
			Reports.passTest("Image Uploaded Sucessfully.");
		}	
		
		
	
	}

	public void ImgUploadPNG(String profileData[]) throws Exception {
		PageFactory.initElements(driver, ProfilePage.class);	
		
		String path = profileData[3];;	
		
		waitForElement(ProfilePage.getMenuProfile(), 10);
		click(ProfilePage.getMenuProfile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Profile")) {
			Reports.passTest("Successfully redirected to Profile Management.");
		} else {
			Reports.failTest("Unable to redirected - Profile Management");
		}	
		
		click(ProfilePage.getBtnChooseImage(), "Clicked in Upload Image button");
		clear(ProfilePage.getBtnChooseImage(), "Clear text");
		sendKeys(ProfilePage.getBtnChooseImage(), path, "Image path entered");	
		click(ProfilePage.getBtnUploadImage(), "Click on update button");
		
		waitForElement(ProfilePage.getBtnUpdate(), 10);
		
		if (driver.getPageSource().contains("Please select valid file format")) 
		{
			Reports.failTest("Please select valid file format");
			
		} 
		else 
		{
			Reports.passTest("Image Uploaded Sucessfully.");
		}	
		
		
	
	}

	public void ImgUploadGIF(String profileData[]) throws Exception {
		PageFactory.initElements(driver, ProfilePage.class);	
		
		String path = profileData[5];;	
		
		waitForElement(ProfilePage.getMenuProfile(), 10);
		click(ProfilePage.getMenuProfile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Profile")) {
			Reports.passTest("Successfully redirected to Profile Management.");
		} else {
			Reports.failTest("Unable to redirected - Profile Management");
		}	
		
		click(ProfilePage.getBtnChooseImage(), "Clicked in Upload Image button");
		clear(ProfilePage.getBtnChooseImage(), "Clear text");
		sendKeys(ProfilePage.getBtnChooseImage(), path, "Image path entered");	
		click(ProfilePage.getBtnUploadImage(), "Click on update button");
		
		waitForElement(ProfilePage.getBtnUpdate(), 10);
		
		if (driver.getPageSource().contains("Please select valid file format")) 
		{
			Reports.failTest("Please select valid file format");
			
		} 
		else 
		{
			Reports.passTest("Image Uploaded Sucessfully.");
		}	
		
		
	
	}

	public void ImgUploadBMP(String profileData[]) throws Exception {
		PageFactory.initElements(driver, ProfilePage.class);	
		
		String path = profileData[4];;	
		
		waitForElement(ProfilePage.getMenuProfile(), 10);
		click(ProfilePage.getMenuProfile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Profile")) {
			Reports.passTest("Successfully redirected to Profile Management.");
		} else {
			Reports.failTest("Unable to redirected - Profile Management");
		}	
		
		click(ProfilePage.getBtnChooseImage(), "Clicked in Upload Image button");
		clear(ProfilePage.getBtnChooseImage(), "Clear text");
		sendKeys(ProfilePage.getBtnChooseImage(), path, "Image path entered");	
		click(ProfilePage.getBtnUploadImage(), "Click on update button");
		
		waitForElement(ProfilePage.getBtnUpdate(), 10);
		
		if (driver.getPageSource().contains("Please select valid file format")) 
		{
			Reports.failTest("Please select valid file format");
			
		} 
		else 
		{
			Reports.passTest("Image Uploaded Sucessfully.");
		}	
		
		
	
	}

	public void ImgUploadTXT(String profileData[]) throws Exception {
		PageFactory.initElements(driver, ProfilePage.class);	
		
		String path = profileData[1];;	
		
		waitForElement(ProfilePage.getMenuProfile(), 10);
		click(ProfilePage.getMenuProfile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Profile")) {
			Reports.passTest("Successfully redirected to Profile Management.");
		} else {
			Reports.failTest("Unable to redirected - Profile Management");
		}	
		
		click(ProfilePage.getBtnChooseImage(), "Clicked in Upload Image button");
		clear(ProfilePage.getBtnChooseImage(), "Clear text");
		sendKeys(ProfilePage.getBtnChooseImage(), path, "Image path entered");	
		click(ProfilePage.getBtnUploadImage(), "Click on update button");
		
		waitForElement(ProfilePage.getBtnUpdate(), 10);
		
		if (driver.getPageSource().contains("Please select valid file format")) 
		{
			Reports.failTest("Please select valid file format");
			
		} 
		else 
		{
			Reports.passTest("Image Uploaded Sucessfully.");
		}	
		
		
	
	}

	public void ChkUnameEmail() throws Exception {
		PageFactory.initElements(driver, ProfilePage.class);	
		
		String Email = ProfilePage.getEmail().getText();
		String Username = ProfilePage.getUserName().getText();
		
		waitForElement(ProfilePage.getMenuProfile(), 10);
		click(ProfilePage.getMenuProfile(), "Clicked on Profile menu");
		
		if (driver.getPageSource().contains("Profile")) {
			Reports.passTest("Successfully redirected to Profile Management.");
		} else {
			Reports.failTest("Unable to redirected - Profile Management");
		}	
			
		
		if (Email.equals(Username)) 
		{
			Reports.passTest("UserName and Email Id are same");
			
		} 
		else 
		{
			Reports.failTest("UserName and Email Id are not same");
		}	
		
		
	
	}

	




}
