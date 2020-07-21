package com.katalyst.ensoul.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//This class basically have all the locators of login page and getter methods using Office 365 credentials 
public class Office365LoginPage {

	@FindBy(xpath="//img[contains(@alt, 'Office 365 Login')]")
	private static WebElement imgOffice365;
	
	@FindBy(xpath = "//input[@id='Input_Email']")
	private static WebElement txtEmailId;
	
	@FindBy(xpath = "//input[@value='Next']")
	private static WebElement btnNext;
	
	@FindBy(xpath = "//input[@id='Input_Password']")
	private static WebElement txtPassword;	

	@FindBy(xpath="//button[contains(text(),'Login')]")
	private static WebElement btnSignIn;
	
	@FindBy(xpath = "//input[@value='Yes']")
	private static WebElement btnYes;
	
	@FindBy(xpath = "//input[@id='KmsiCheckboxField']")
	private static WebElement chkDontShow;
	
	@FindBy(xpath ="//img[@class='avatar-user']")
	private static WebElement btnAvatar;
	
	@FindBy(xpath ="//a[contains(text(),'Logout')]")
	private static WebElement btnlogOut;
	
	//Un-successful login
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private static WebElement altFailed;

	public static WebElement getImgOffice365() {
		return imgOffice365;
	}

	public static WebElement getTxtEmailId() {
		return txtEmailId;
	}

	public static WebElement getBtnNext() {
		return btnNext;
	}

	public static WebElement getTxtPassword() {
		return txtPassword;
	}

	public static WebElement getBtnSignIn() {
		return btnSignIn;
	}

	public static WebElement getBtnYes() {
		return btnYes;
	}

	public static WebElement getChkDontShow() {
		return chkDontShow;
	}

	public static WebElement getBtnAvatar() {
		return btnAvatar;
	}

	public static WebElement getBtnlogOut() {
		return btnlogOut;
	}

	public static WebElement getAltFailed() {
		return altFailed;
	}
			
	
}
