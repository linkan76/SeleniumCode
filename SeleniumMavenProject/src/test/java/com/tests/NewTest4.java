package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest4 {

	@Test
	public void demoWebShop() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_B8C.02.24\\Desktop\\New folder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		String title= driver.getTitle();
		Assert.assertEquals(title, "Demo Web Shop");//checking the application
		driver.findElement(By.linkText("Register")).click();
		title=driver.getTitle();
		Assert.assertTrue(title.contains("Register"));
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Abinash");
		driver.findElement(By.id("LastName")).sendKeys("Pradhan");
		driver.findElement(By.id("Email")).sendKeys("pradh.lin@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
		driver.findElement(By.id("register-button")).click();
		
		
		
		
	}
	
	
}
