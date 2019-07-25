package com.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.drivers.DriverUtility;

public class NewTestNG7 {
  WebDriver driver;
  @BeforeMethod	
  public void beforeMethod() {
	  System.out.println("Before method");
	  driver = DriverUtility.supplyDriver("chrome");
	  driver.manage().window().maximize();
	  
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
	  driver.close();
  }
  
  @Test
  public void testGoogle() {
	  
	  driver.get("https://google.com");
	  System.out.println("selenium code for browser automation");
	  
 }
  
  @Test
  public void testDemoWebShp() {
	 
	  driver.get("http://demowebshop.tricentis.com/");
	  System.out.println("selenium code for browser automation for demowebshop");
	 
	  
  }
  
  
}
