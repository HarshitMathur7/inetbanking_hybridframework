package com.inetbanking_hybridframework.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking_hybridframework.pageobjects.NewCustomerPage;
import com.inetbanking_hybridframework.testbase.TestBase;

public class NewCustomerPageTestCases extends TestBase {
	
	NewCustomerPage NCPage;
	
	@Test(priority =1)
	public void validateNewCustomerPageTitle()
	{
		 String expcTitle = "Guru99 Bank New Customer Entry Page" ;
		 
		 NCPage = hm.clickonNewCustomerLink();
		 
		 String actTitle = driver.getTitle();
		 
		 Assert.assertEquals(actTitle, expcTitle);
		
	}
	
	@Test(priority =2)
	
	public void validateNewCustomerPageHeader()
	{
		String expcText = "Add New Customer";
		System.out.println(expcText);
		
		String actText = NCPage.fetchnewCustomerPageHeading();
		System.out.println(actText);
		
		Assert.assertEquals(actText, expcText);
		
		
	}
		
	

}
