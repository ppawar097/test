package com.katalyst.ensoul.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {

	@FindBy(xpath ="//a[contains(text(),'Profile')])[1]")
	private static WebElement menuProfile;
	
	@FindBy(xpath ="//input[@id='imgupload']")
	private static WebElement btnChooseImage;
	
	@FindBy(xpath ="//button[@id='uploadImg']")
	private static WebElement btnUploadImage;
	
	@FindBy(xpath ="//input[@id='password']")
	private static WebElement txtCurrentPassword;
	
	@FindBy(xpath ="//input[@id='newPassword']")
	private static WebElement txtNewPassword;
	
	@FindBy(xpath ="//input[@id='confirmPwd']")
	private static WebElement txtConfirmPassword;
	
	@FindBy(xpath ="//button[@class='btn btn-success']")
	private static WebElement btnUpdate;
	
	@FindBy(xpath="//td[contains(text(),'Email')]")
	private static WebElement Email;
	
	@FindBy(xpath="//td[contains(text(),'User Name')]")
	private static WebElement UserName;

	public static WebElement getEmail() {
		return Email;
	}

	public static WebElement getUserName() {
		return UserName;
	}

	public static WebElement getMenuProfile() {
		return menuProfile;
	}

	public static WebElement getBtnChooseImage() {
		return btnChooseImage;
	}

	public static WebElement getBtnUploadImage() {
		return btnUploadImage;
	}

	public static WebElement getTxtCurrentPassword() {
		return txtCurrentPassword;
	}

	public static WebElement getTxtNewPassword() {
		return txtNewPassword;
	}

	public static WebElement getTxtConfirmPassword() {
		return txtConfirmPassword;
	}

	public static WebElement getBtnUpdate() {
		return btnUpdate;
	}
}
