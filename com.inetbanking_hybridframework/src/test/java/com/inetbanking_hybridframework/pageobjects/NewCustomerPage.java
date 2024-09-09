package com.inetbanking_hybridframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {
	WebDriver driver;
	
	public NewCustomerPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")
	@CacheLookup  //stores xpath in cache memory,so that every time we don't have to find it in browser
	WebElement newCustomerPageHeading;
	
	public String fetchnewCustomerPageHeading()
	{
		return newCustomerPageHeading.getText();
		
	}
	
	
	
}
