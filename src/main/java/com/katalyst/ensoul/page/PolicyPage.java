package com.katalyst.ensoul.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PolicyPage {
	
	@FindBy(xpath ="//a[contains(text(),'Policy')]")
	private static WebElement menuPolicy;
	
	@FindBy(xpath ="//select[@id='EmployerList']/option[contains(text(),'Katalyst Software Services Ltd.')]")
	private static WebElement ddlEmployer;
	
	@FindBy(xpath ="//input[@id='Policy_PolicyName']")
	private static WebElement txtPolicyName;
	
	@FindBy(xpath ="//textarea[@id='Policy_Description']")
	private static WebElement txtDescription;
	
	@FindBy(xpath ="//button[contains(text(),'Submit')]")
	private static WebElement btnCreate;
	
	@FindBy(xpath ="//button[contains(text(),'Update')]")
	private static WebElement btnUpdate;
	
	@FindBy(xpath ="//button[2][contains(text(),'Delete')]")
	private static WebElement btnDelete;
	
	@FindBy(xpath ="//tr[1]//td[3]//a[1]//i[1]")
	private static WebElement selectUpdateRecord;
	
	@FindBy(xpath ="//div[@id='devDeleteConfirmation']//div//div//div//button[contains(text(),'Delete')]")
	private static WebElement btnDelConfirm;
	
	@FindBy(xpath ="//button[contains(text(),'Cancel')]")
	private static WebElement btnCancelConfirm;
	
	@FindBy(xpath ="//button[contains(text(),'×')]")
	private static WebElement popUpClose;
	
	@FindBy(xpath ="//tr[td='A Test Policy']/td/following-sibling::td[2]")
	private static WebElement iocSearch;
	
	@FindBy(xpath ="//button[2]//i[1]")
	private static WebElement iocDelete;
	
	@FindBy(xpath ="//a[contains(text(),'Create New Policy')]")
	private static WebElement lnkPolicy;
	
	@FindBy(xpath ="//select[@id='EmployerList']/option[contains(text(),'N2N - BoardShare')]")
	private static WebElement ddlDiffEmployer;

	@FindBy(xpath ="//input[@placeholder='Search']")
	private static WebElement txtSearchBox;
	
	@FindBy(xpath = "//h4[contains(text(),'Create New Policy')]")
	private static WebElement lblformText;
	
	
	
	public static WebElement getLblformText() {
		return lblformText;
	}

	public static WebElement getTxtSearchBox() {
		return txtSearchBox;
	}

	public static WebElement getDdlDiffEmployer() {
		return ddlDiffEmployer;
	}

	public static WebElement getMenuPolicy() {
		return menuPolicy;
	}

	public static WebElement getDdlEmployer() {
		return ddlEmployer;
	}

	public static WebElement getTxtPolicyName() {
		return txtPolicyName;
	}

	public static WebElement getTxtDescription() {
		return txtDescription;
	}

	public static WebElement getBtnCreate() {
		return btnCreate;
	}

	public static WebElement getBtnUpdate() {
		return btnUpdate;
	}

	public static WebElement getBtnDelete() {
		return btnDelete;
	}

	public static WebElement getSelectUpdateRecord() {
		return selectUpdateRecord;
	}

	public static WebElement getBtnDelConfirm() {
		return btnDelConfirm;
	}

	public static WebElement getBtnCancelConfirm() {
		return btnCancelConfirm;
	}

	public static WebElement getPopUpClose() {
		return popUpClose;
	}

	public static WebElement getIocSearch() {
		return iocSearch;
	}

	public static WebElement getIocDelete() {
		return iocDelete;
	}

	public static WebElement getLnkPolicy() {
		return lnkPolicy;
	}
	

}
