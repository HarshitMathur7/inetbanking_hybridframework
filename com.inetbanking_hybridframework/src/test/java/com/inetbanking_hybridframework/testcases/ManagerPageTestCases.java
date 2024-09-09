package com.inetbanking_hybridframework.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

//import com.inetbanking_hybridframework.pageobjects.HomePage;
//import com.inetbanking_hybridframework.pageobjects.LoginPage;
import com.inetbanking_hybridframework.pageobjects.ManagerPage;
import com.inetbanking_hybridframework.testbase.TestBase;

public class ManagerPageTestCases extends TestBase
{
	ManagerPage manPage;
	
	
	@Test
	public void validateManagerLoginWelcomeMessage()
	{
		String expcText = "Welcome To Manager's Page of Guru99 Bank";
		
//		LoginPage lp = new LoginPage(driver);
//		lp.setUserName(configdatapr.getUserName());
//		lp.setpassword(configdatapr.getPassword());
//		HomePage hm = lp.clickonLoginBtn();
		
		manPage = hm.clickonManagerLink();
		
		String actText = manPage.fetchManagerWelcomeTextMsg();
		
		Assert.assertEquals(actText, expcText);
		
		
		
	}
	
	@Test(dependsOnMethods ="validateManagerLoginWelcomeMessage()")
	public void validateManagerLoggedInID()
	
	{
		String actID= manPage.fetchManagerID();
		System.out.println(actID);
		
		System.out.println(configdatapr.getUserName());
		
		if(actID.contains(configdatapr.getUserName()))
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	
	
	

}
