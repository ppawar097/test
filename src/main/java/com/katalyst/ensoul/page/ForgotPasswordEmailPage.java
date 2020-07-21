package com.katalyst.ensoul.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordEmailPage {
	
	@FindBy(xpath = "//a[contains(text(),'Forgot Password')]")
	private static WebElement lnk_ForgotPassword;
	
	@FindBy(xpath = "//input[@id='UserName']")
	private static WebElement txt_EmailId;
	
	@FindBy(xpath = "//button[@id='btnSubmit']")
	private static WebElement btn_Submit;
	
	@FindBy(xpath = "//a[contains(text(),'« goto login page')]")
	private static WebElement lnk_LoginPage;
	
	@FindBy(xpath="//div[@class='alert alert-danger']")
	private static WebElement alertBox;
		
	public static WebElement getAlertBox() {
		return alertBox;
	}

	public static WebElement getLnk_ForgotPassword() {
		return lnk_ForgotPassword;
	}

	public static WebElement getTxt_EmailId() {
		return txt_EmailId;
	}

	public static WebElement getBtn_Submit() {
		return btn_Submit;
	}

	public static WebElement getLnk_LoginPage() {
		return lnk_LoginPage;
	}
	
	

}
