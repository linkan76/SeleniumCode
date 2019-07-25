package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	@Test(priority=1)
	public void openChrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_B8C.02.24\\Desktop\\New folder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("http://demowebshop.tricentis.com/");
		
		
	}
	
	@Test(priority=3)
	public void openFireFox() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training_B8C.02.24\\Desktop\\New folder\\geckodriver.exe");
		FirefoxDriver driver1 = new FirefoxDriver();
	}
	
	@Test(priority=2)
	public void openIE()
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Training_B8C.02.24\\Desktop\\New folder\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		//driver.get("http://demowebshop.tricentis.com/");
		
		
	}
}
