package com.inetbanking_hybridframework.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking_hybridframework.pageobjects.HomePage;
import com.inetbanking_hybridframework.pageobjects.LoginPage;
import com.inetbanking_hybridframework.testbase.TestBase;
import com.inetbanking_hybridframework.utility.Helper;

public class LoginDataDrivenTestCases extends TestBase {
	
	@DataProvider
	public String [][] createTestData()
	{
		String [][] data = {
				
				{"mngr587631","dEmugEs","Guru99 Bank Manager HomePage"},
				{"mngr587631","dEmugE&$","Guru99 Bank Home Page"},
				{"mngr587631$$","dEmugEs","Guru99 Bank Home Page"},
				{"mngr5876%$#","dEmugss%$","Guru99 Bank Home Page"}
				
		};
		return data;
		
	}
@Test(dataProvider = "createTestData")

public void validateLoginwithDataSet(String username,String password,String pgTitle)
{
	try {
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setpassword(password);
		
		HomePage  hm = lp.clickonLoginBtn();
		
		Helper.HandleAlert(driver);
		
		Assert.assertEquals(driver.getTitle(), pgTitle);
		
		hm.clickOnLogoutlink();
		
		Helper.HandleAlert(driver);
		
	
	}
	
	catch (Exception e)
	{
		e.printStackTrace();
		
	}
}
}
