package com.katalyst.ensoul.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ForgotPasswordSecurityQPage {

	@FindBy(xpath = "//a[contains(text(),'Forgot Password')]")
	private static WebElement lnk_ForgotPassword;
	
	@FindBy(xpath = "//input[@id='UserName']")
	private static WebElement txt_EmailId;
	
	@FindBy(xpath = "//button[@id='Button1']")
	private static WebElement btn_SecurityQuestion;
	
	@FindBy(xpath = "//input[@id='SecurityAnswer']")
	private static WebElement txt_SecurityAnswer;
	
	@FindBy(xpath = "//button[@id='Login']")
	private static WebElement btn_Submit;
	
	@FindBy(xpath = "//a[contains(text(),'« goto login page')]")
	private static WebElement lnk_LoginPage;

	
	
	public static WebElement getLnk_ForgotPassword() {
		return lnk_ForgotPassword;
	}

	public static WebElement getTxt_EmailId() {
		return txt_EmailId;
	}

	public static WebElement getBtn_SecurityQuestion() {
		return btn_SecurityQuestion;
	}

	public static WebElement getTxt_SecurityAnswer() {
		return txt_SecurityAnswer;
	}

	public static WebElement getBtn_Submit() {
		return btn_Submit;
	}

	public static WebElement getLnk_LoginPage() {
		return lnk_LoginPage;
	}
	
	
}
