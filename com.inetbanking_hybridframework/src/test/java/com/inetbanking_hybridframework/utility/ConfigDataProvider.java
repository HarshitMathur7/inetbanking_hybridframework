package com.inetbanking_hybridframework.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	public static Properties prop;

	public ConfigDataProvider(String fname) {
		try {
			FileInputStream fis = new FileInputStream("./Config/" + fname + ".properties");
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public String getUserName() {
		return prop.getProperty("uName");
	}

	public String getPassword() {
		return prop.getProperty("uPass");
	}

	public String getAppURL() {
		return prop.getProperty("appURL");
	}

	public String searchKey(String Key) {
		return prop.getProperty(Key);

	}

	public static void main(String[] args) {
		ConfigDataProvider configdatapr = new ConfigDataProvider("config");
		System.out.println(configdatapr.getUserName());
		System.out.println(configdatapr.getPassword());
		System.out.println(configdatapr.getAppURL());
		System.out.println(configdatapr.searchKey("lpTitle"));

	}

}
