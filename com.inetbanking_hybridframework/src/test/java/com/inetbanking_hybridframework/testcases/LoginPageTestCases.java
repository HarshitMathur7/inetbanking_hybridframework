package com.inetbanking_hybridframework.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking_hybridframework.pageobjects.LoginPage;
import com.inetbanking_hybridframework.testbase.TestBase;
import com.inetbanking_hybridframework.utility.Helper;

public class LoginPageTestCases extends TestBase {

	@Test(priority = 1)
	public void validateLoginPageTitle() {
		// String exp_Title= "Guru99 Bank Home Page";
		// String act_Title= driver.getTitle();

		Assert.assertEquals(driver.getTitle(), configdatapr.searchKey("lpTitle"));

	}

	@Test(priority = 2)
	public void validateLoginFunctionality() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);

		// lp.setUserName("mngr587631");
		// lp.setpassword("dEmugEs");

		lp.setUserName(configdatapr.getUserName());
		lp.setpassword(configdatapr.getPassword());

		lp.clickonLoginBtn();
		
		Helper.HandleAlert(driver);

		// String exptitle= "Guru99 Bank Manager HomePage";
		// String acttitle= driver.getTitle();

		Assert.assertEquals(driver.getTitle(), configdatapr.searchKey("hmTitle"));
		Thread.sleep(3000);
	}

}
