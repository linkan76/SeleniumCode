package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.dataprovider.DataSource;
import com.drivers.DriverUtility;

public class NewTest11 {
  WebDriver driver;
  
  @BeforeTest
  @Parameters("browser")
  public void beforeMethod(String v1) {
	  driver=DriverUtility.supplyDriver(v1);
	  driver.manage().window().maximize();
	  driver.get("http://demowebshop.tricentis.com/login");
  }
  
  
  /*@BeforeTest
  public void beforeMethod() {
	  driver=DriverUtility.supplyDriver("chrome");
	  driver.manage().window().maximize();
	  driver.get("http://demowebshop.tricentis.com/login");
  }*/
  
  @AfterTest
  public void afterMethod() {
	  driver.close();
  }
  
  @Test(dataProvider="dp1",dataProviderClass=DataSource.class)
  public void testDemoWbShopLogin(String userName, String password) {
	  driver.findElement(By.id("Email")).sendKeys(userName);
	  driver.findElement(By.id("Password")).sendKeys(password);
	  driver.findElement(By.cssSelector("input[value='Log in']")).click();
	  String email=driver.findElement(By.className("account")).getText();
	  if(email.equals(userName)) {
		  Assert.assertTrue(true);
		  driver.findElement(By.linkText("Log out")).click();
		  
		  
	  }
	  else {
		  driver.findElement(By.id("Email")).clear();
		  driver.findElement(By.id("Password")).clear();
		  Assert.assertTrue(false);
		  
	  }
  }  
}
