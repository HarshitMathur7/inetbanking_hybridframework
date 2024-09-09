package com.inetbanking_hybridframework.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking_hybridframework.pageobjects.HomePage;
import com.inetbanking_hybridframework.pageobjects.LoginPage;
import com.inetbanking_hybridframework.testbase.TestBase;
import com.inetbanking_hybridframework.utility.Helper;

public class HomePageTestCases extends TestBase 
{
	@Test
	public void logoutFunctionality()
	{
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(configdatapr.getUserName());
		lp.setpassword(configdatapr.getPassword());

		HomePage hm = lp.clickonLoginBtn();
		
		Helper.HandleAlert(driver);
		
		Assert.assertEquals(driver.getTitle(), configdatapr.searchKey("hmTitle"));
		
		hm.clickOnLogoutlink();
		
		Helper.HandleAlert(driver);
		
		System.out.println(driver.getTitle());
		
		
	}
	

}
