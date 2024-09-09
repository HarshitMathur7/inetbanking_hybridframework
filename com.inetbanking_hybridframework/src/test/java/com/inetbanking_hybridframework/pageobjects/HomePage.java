package com.inetbanking_hybridframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[text()='Manager']")
	WebElement managerLink;
	
	@FindBy(xpath = "//a[text()='New Customer']")
	WebElement newCustomerLink;
	
	@FindBy(xpath = "//a[text()='Edit Customer']")
	WebElement editCustomerLink;
	
	@FindBy(xpath = "//a[text()='Delete Customer']")
	WebElement deleteCustomerLink;
	
	@FindBy(xpath = "//a[text()='New Account']")
	WebElement newAccountLink;
	
	@FindBy(xpath = "//a[text()='Edit Account']")
	WebElement editAccountLink;
	
	@FindBy(xpath = "//a[text()='Delete Account']")
	WebElement deleteAccountLink;
	
	@FindBy(xpath = "//a[text()='Log out']")
	WebElement logoutLink;
	
	public ManagerPage clickonManagerLink()
	{
		managerLink.click();
		return new ManagerPage(driver);
	}
	public NewCustomerPage clickonNewCustomerLink()
	{
		newCustomerLink.click();
		return new  NewCustomerPage(driver);
	}
	public EditCustomerPage clickonEditCustomerLink()
	{
		editCustomerLink.click();
		return new EditCustomerPage(driver);
	}
	public DeleteCustomerPage clickonDeleteCustomerLink()
	{
		deleteCustomerLink.click();
		return new DeleteCustomerPage(driver);
	}
	public NewAccountPage clickonnewAccountLink()
	{
		newAccountLink.click();
		return new NewAccountPage(driver);
	}
	public EditAccountPage clickoneditAccountLink()
	{
		editAccountLink.click();
		return new EditAccountPage(driver);
	}
	public DeleteAccountPage clickondeleteAccountLink()
	{
		deleteAccountLink.click();
		return new DeleteAccountPage(driver);
	}
	

	public void clickOnLogoutlink() {
		logoutLink.click();
	}
}

