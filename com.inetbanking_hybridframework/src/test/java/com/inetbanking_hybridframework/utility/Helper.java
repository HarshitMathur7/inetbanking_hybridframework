package com.inetbanking_hybridframework.utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class Helper {
	public static void HandleAlert(WebDriver driver) {
		if (isAlertPresent(driver)) {
			Alert al = driver.switchTo().alert();
			System.out.println(al.getText());
			al.accept();
		} else {
			System.out.println("Alert is not present on Webpage");

		}
	}

	public static boolean isAlertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;

		} catch (NoAlertPresentException e) {
			e.printStackTrace();
			return false;

		}
	}

}
