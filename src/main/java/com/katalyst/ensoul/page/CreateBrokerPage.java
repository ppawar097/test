package com.katalyst.ensoul.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateBrokerPage {

	@FindBy(xpath ="(//a[contains(text(),'Users')])[1]")
	private static WebElement menuUser;
	
	@FindBy(xpath ="//a[contains(text(),'Create New User')]")
	private static WebElement menuNewUser;
	
	@FindBy(xpath ="//option[contains(text(),'Tejashri')]")
	private static WebElement optBroker;	
	
	@FindBy(xpath ="//input[@id='Input_Email']")
	private static WebElement txtUsername;
	
	@FindBy(xpath ="//input[@id='Input_Password']")
	private static WebElement txtPassword;
	
	@FindBy(xpath ="//input[@id='Input_ConfirmPassword']")
	private static WebElement txtConfirmPassword;
	
	@FindBy(xpath ="//input[@id='SendEmail']")
	private static WebElement chkSendMail;
	
	@FindBy(xpath ="//button[@class='btn btn-success']")
	private static WebElement btnSubmit;	
	
	@FindBy(xpath ="//button[contains(text(),'Cancel')]")
	private static WebElement btnCancel;
	
	@FindBy(xpath ="//button[contains(text(),'Auto Generate Password')]")
	private static WebElement btnAutoPassword;
	
	
	public static WebElement getMenuUser() {
		return menuUser;
	}

	public static WebElement getMenuNewUser() {
		return menuNewUser;
	}

	public static WebElement getOptBroker() {
		return optBroker;
	}

	public static WebElement getTxtUsername() {
		return txtUsername;
	}

	public static WebElement getTxtPassword() {
		return txtPassword;
	}

	public static WebElement getTxtConfirmPassword() {
		return txtConfirmPassword;
	}

	public static WebElement getChkSendMail() {
		return chkSendMail;
	}

	public static WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public static WebElement getBtnCancel() {
		return btnCancel;
	}

	public static WebElement getBtnAutoPassword() {
		return btnAutoPassword;
	}
	
}
