package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.drivers.DriverUtility;

public class NewTest5 {

	@Test
	public void testDemoWebShipLogin() {
	
		WebDriver driver= DriverUtility.supplyDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("pradh.lin@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		String userId=driver.findElement(By.className("account")).getText();
		if(userId.equals("pradh.lin@gmail.com"))
		{
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
	
}
