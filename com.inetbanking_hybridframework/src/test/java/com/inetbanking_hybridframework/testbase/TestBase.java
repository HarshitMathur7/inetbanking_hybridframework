package com.inetbanking_hybridframework.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.inetbanking_hybridframework.pageobjects.HomePage;
import com.inetbanking_hybridframework.pageobjects.LoginPage;
import com.inetbanking_hybridframework.utility.ConfigDataProvider;

public class TestBase {
	public static LoginPage lp;
	public static HomePage hm;

	public static WebDriver driver;

	public static ConfigDataProvider configdatapr;

	@BeforeSuite
	public void init() {
		configdatapr = new ConfigDataProvider("config");
	}
	
	@BeforeClass
	public void initialisePageObjects()
	{
		lp= new LoginPage(driver);
		
		lp.setUserName(configdatapr.getUserName());
		lp.setpassword(configdatapr.getPassword());
		
	    hm = lp.clickonLoginBtn();
	    
	}

	@BeforeTest
	@Parameters("browserName")

	public void setUp(@Optional("Chrome") String browserName) {
		if (browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("Firefox"))

		{
			driver = new FirefoxDriver();

		} else if (browserName.equals("Edge")) {
			driver = new EdgeDriver();

		}
		driver.get(configdatapr.getAppURL());
		driver.manage().window().maximize();

		// driver.get("https://demo.guru99.com/v4/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void teardown() {

		driver.quit();
	}

}
