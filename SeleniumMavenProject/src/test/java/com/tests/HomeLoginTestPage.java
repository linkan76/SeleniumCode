package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.drivers.DriverUtility;
import com.pages.HomePage;
import com.pages.LoginPage;

public class HomeLoginTestPage {

	
	WebDriver driver;
	LoginPage login;
	HomePage homepage;
	
	@BeforeTest
	public void beforeTest() {
	  driver=DriverUtility.supplyDriver("chrome");
	  login = PageFactory.initElements(driver, LoginPage.class); // by using init elements its going to create object  
	  homepage= PageFactory.initElements(driver, HomePage.class);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://demowebshop.tricentis.com");
	}
	
	@AfterTest
	public void afterTest() {
	 driver.close();
	 login =null;
	 homepage = null;
	}
	
	@Test(priority=1)
	void test1() {
		
		String t1= homepage.Login();
		Assert.assertTrue(t1.contains("Login"));
	}
	
	@Test(priority=2)
	void test2() {
		String t2 = login.clickLogin();
		Assert.assertEquals(t2, "Demo Web Shop");
	}
}
