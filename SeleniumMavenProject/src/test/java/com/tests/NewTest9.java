package com.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest9 {
	
	
    @BeforeTest
	public void beforeMethod() {
		System.out.println("Open browser");
		System.out.println("open Aut");
	}
	
	
  @Test(priority=1)
  public void testRegistration() {
	  System.out.println("Selenium test Registration code");
  }
  
  @Test(priority=2)
  public void testLogin() {
	  System.out.println("Selenium test Login code");
	  Assert.assertEquals(10, 10);
  }
  
  @Test(priority=3,dependsOnMethods="testLogin")
  public void testLogout() {
	  System.out.println("Selenium test Logout code");
	 
  }
  
  @AfterTest
  public void afterMethod() {
	 System.out.println("close browser");
	 System.out.println("close Aut");
	}
}
