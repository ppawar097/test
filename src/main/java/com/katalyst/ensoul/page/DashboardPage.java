package com.katalyst.ensoul.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
	
	@FindBy(xpath = "//div[@class='profile_info']//h2")
	private static WebElement leftUserName;
	
	@FindBy(xpath = "//a[@class='user-profile dropdown-toggle']")
	private static WebElement rightUsername;
	
	@FindBy(xpath="//a[@id='menu_toggle']")
	private static WebElement menu;
	
	@FindBy(xpath="//i[@class='fa fa-envelope-o']")
	private static WebElement notification;
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-cog']")
	private static WebElement btnSettings;
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-fullscreen']")
	private static WebElement btnFullScreen;
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-eye-close']")
	private static WebElement btnLock;
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-off']")
	private static WebElement btnLogOff;

	public static WebElement getBtnSettings() {
		return btnSettings;
	}

	public static WebElement getBtnFullScreen() {
		return btnFullScreen;
	}

	public static WebElement getBtnLock() {
		return btnLock;
	}

	public static WebElement getBtnLogOff() {
		return btnLogOff;
	}

	public static WebElement getMenu() {
		return menu;
	}

	public static WebElement getNotification() {
		return notification;
	}

	public static WebElement getLeftUserName() {
		return leftUserName;
	}

	public static WebElement getRightUsername() {
		return rightUsername;
	}
	
	
	
}
