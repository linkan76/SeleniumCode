package com.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtility {

	//input: Browser name
	//output: Browser instance
	public static WebDriver supplyDriver(String browser)
	{
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_B8C.02.24\\Desktop\\New folder\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Training_B8C.02.24\\Desktop\\New folder\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver","C:\\Users\\Training_B8C.02.24\\Desktop\\New folder\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else {
			return null;
		}
	}
}
