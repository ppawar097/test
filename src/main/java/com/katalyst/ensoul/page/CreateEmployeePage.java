package com.katalyst.ensoul.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateEmployeePage {
	
	@FindBy(xpath ="(//a[contains(text(),'Users')])[1]")
	private static WebElement menuUser;
	
	@FindBy(xpath ="//a[contains(text(),'Create New User')]")
	private static WebElement menuNewUser;
	
	@FindBy(xpath = "//li[2]/label[contains(text(),'Employee')]")
	private static WebElement choEmployee;
	
	@FindBy(xpath="//select[@id='EmployerList']/option[contains(text(),'Katalyst Software')]")
	private static WebElement ddlEmployer;
	
	@FindBy(xpath="//select[@id='EmployeeList']/option[contains(text(),'Ant P')]")
	private static WebElement ddlEmployee;
	
	@FindBy(xpath="//input[@id='Input_Password']")
	private static WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='Input_ConfirmPassword']")
	private static WebElement txtConfirmPassword;
	
	@FindBy(xpath="//label[contains(text(),'Yes')]")
	private static WebElement choYes;
	
	@FindBy(xpath="//option[contains(text(),'HR')]")
	private static WebElement optRole;
	
	@FindBy(xpath="//button[@id='fillRole']//img")
	private static WebElement btnFillRole;
	
	@FindBy(xpath="//input[@id='SendEmail']")
	private static WebElement chkSendMail;
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	private static WebElement btnCancel;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private static WebElement btnSubmit;
	
	@FindBy(xpath = "//div[@class='text-danger validation-summary-errors']")
	private static WebElement lblErrorMsg;

	public static WebElement getLblErrorMsg() {
		return lblErrorMsg;
	}

	public static WebElement getMenuUser() {
		return menuUser;
	}

	public static WebElement getMenuNewUser() {
		return menuNewUser;
	}

	public static WebElement getChoEmployee() {
		return choEmployee;
	}

	public static WebElement getDdlEmployer() {
		return ddlEmployer;
	}

	public static WebElement getDdlEmployee() {
		return ddlEmployee;
	}

	public static WebElement getTxtPassword() {
		return txtPassword;
	}

	public static WebElement getTxtConfirmPassword() {
		return txtConfirmPassword;
	}

	public static WebElement getChoYes() {
		return choYes;
	}

	public static WebElement getOptRole() {
		return optRole;
	}

	public static WebElement getBtnFillRole() {
		return btnFillRole;
	}

	public static WebElement getChkSendMail() {
		return chkSendMail;
	}

	public static WebElement getBtnCancel() {
		return btnCancel;
	}

	public static WebElement getBtnSubmit() {
		return btnSubmit;
	}

}
