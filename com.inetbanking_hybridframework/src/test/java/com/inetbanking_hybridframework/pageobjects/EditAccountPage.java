package com.inetbanking_hybridframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EditAccountPage {
WebDriver driver;
	
	public EditAccountPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}


}
