package com.katalyst.ensoul.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RolePage {	
	
	@FindBy(xpath ="//a[contains(text(),'Role')]")
	private static WebElement lnkRole;

	@FindBy(xpath ="//h3[contains(text(),'Roles Management')]")
	private static WebElement lblRole;
	
	@FindBy(xpath ="//input[@id='Role_RoleName']")
	private static WebElement txtRoleName;
	
	@FindBy(xpath ="//textarea[@id='Role_Description']")
	private static WebElement txtDesc;
	
	@FindBy(xpath ="//option[contains(text(),'policy_abcdf1')]")
	private static WebElement optPolicy;
	
	@FindBy(xpath ="//button[contains(text(),'Submit')]")
	private static WebElement btnSubmit;
	
	@FindBy(xpath = "//thead[@class='tableFloatingHeaderOriginal']//th[1]//input[1]")
	private static WebElement txtRoleFilter;
	
	@FindBy(xpath = "//thead[@class='tableFloatingHeaderOriginal']//th[2]//input[1]")
	private static WebElement txtDescFilter;
	
	@FindBy(xpath = "//tr[1]//td[3]//a[1]")
	private static WebElement btnEdit;
	
	@FindBy(xpath = "//tr[1]//td[3]//a[1]")
	private static WebElement btnPolicy;
	
	@FindBy(xpath = "//a[contains(text(),'Create New Policy')]")
	private static WebElement lnkCreatePolicy;
		
	@FindBy(xpath = "//button[contains(text(),'Update')]")
	private static WebElement btnUpdate;
	
	@FindBy(xpath="//select[@id='PolicyDetails']")
	private static WebElement ddlPolicy;
	
	@FindBy(xpath = "//button[2][contains(text(),'Delete')]")
	private static WebElement btnDelete;
	
	@FindBy(xpath="//div[@id='devDeleteConfirmation']//div//div//div//button[contains(text(),'Delete')]")
	private static WebElement btnPopupDelete;
	
	public static WebElement getBtnPopupDelete() {
		return btnPopupDelete;
	}

	public static WebElement getBtnDelete() {
		return btnDelete;
	}

	public static WebElement getLnkRole() {
		return lnkRole;
	}

	public static WebElement getDdlPolicy() {
		return ddlPolicy;
	}

	public static WebElement getBtnUpdate() {
		return btnUpdate;
	}

	public static WebElement getLnkPrrofile() {
		return lnkRole;
	}

	public static WebElement getLblRole() {
		return lblRole;
	}

	public static WebElement getTxtRoleName() {
		return txtRoleName;
	}

	public static WebElement getTxtDesc() {
		return txtDesc;
	}

	public static WebElement getOptPolicy() {
		return optPolicy;
	}

	public static WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public static WebElement getTxtRoleFilter() {
		return txtRoleFilter;
	}

	public static WebElement getTxtDescFilter() {
		return txtDescFilter;
	}

	public static WebElement getBtnEdit() {
		return btnEdit;
	}

	public static WebElement getBtnPolicy() {
		return btnPolicy;
	}

	public static WebElement getLnkCreatePolicy() {
		return lnkCreatePolicy;
	}
	
}
