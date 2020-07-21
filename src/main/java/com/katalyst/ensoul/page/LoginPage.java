package com.katalyst.ensoul.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//This class basically have all the locators of login page and getter methods
public class LoginPage {

	@FindBy(xpath = "//input[@id='UserName']")
	private static WebElement txt_loginUserName;

	@FindBy(xpath = "//input[@id='Password']")
	private static WebElement txt_loginPassword;

	@FindBy(xpath = "//button[@id='Login']")
	private static WebElement btn_logIn;

	@FindBy(xpath = "//input[@id='RememberMe']")
	private static WebElement chk_rememberme;

	@FindBy(xpath = "//div[@id='header-navbar-collapse']/div/div[2]/ul/li[3]/a")
	private static WebElement lnk_user_id;

	@FindBy(xpath = "//a[@href='/Account/LogOff']")
	private static WebElement lnk_logout;
	
	@FindBy(xpath="//img[contains(@alt, 'Office 365 Login')]")
	private static WebElement imgOffice365;
	
	@FindBy(xpath = "//input[@type='email']")
	private static WebElement txtEmailId;
	
	@FindBy(xpath = "//input[@value='Next']")
	private static WebElement btnNext;
	
	@FindBy(xpath = "//input[@type='password']")
	private static WebElement txtPassword;	

	@FindBy(xpath="//input[@value='Sign in']")
	private static WebElement btnSignIn;
	
	@FindBy(xpath ="//img[@class='avatar-user']")
	private static WebElement btnAvatar;
	
	@FindBy(xpath ="//a[contains(text(),'Logout')]")
	private static WebElement btnlogOut;
	
	//Un-successful login
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private static WebElement altFailed;
			
	public static WebElement getAltFailed() {
		return altFailed;
	}
		
	public static WebElement getBtnAvatar() {
		return btnAvatar;
	}

	public static WebElement getBtnlogOut() {
		return btnlogOut;
	}

	public static WebElement getBtnSignIn() {
		return btnSignIn;
	}

	public static WebElement getTxtEmailId() {
		return txtEmailId;
	}
	
	public static WebElement getTxtPassword() {
		return txtPassword;
	}

	public static WebElement getImgOffice365() {
		return imgOffice365;
	}
	
	public static WebElement getBtnNext() {
		return btnNext;
	}
	
	public static WebElement btnSignIn() {
		return btnSignIn;
	}
	
	public static WebElement btnNext() {
		return btnNext;
	}

	public static WebElement imgOffice365() {
		return imgOffice365;
	}
		
	
	public static WebElement getTxt_loginUserName() {
		return txt_loginUserName;
	}

	public static WebElement getTxt_loginPassword() {
		return txt_loginPassword;
	}

	public static WebElement getBtn_logIn() {
		return btn_logIn;
	}

	public static WebElement getChk_rememberme() {
		return chk_rememberme;
	}

	public static WebElement getLnk_user_id() {
		return lnk_user_id;
	}

	public static WebElement getLnk_logout() {
		return lnk_logout;
	}

	public static WebElement btn_logIn() {
		return btn_logIn;
	}
	
	public static WebElement btn_Avatar() {
		return btnAvatar;
	}
	
	public static WebElement btn_logOut() {
		return btnlogOut;
	}
	

}
