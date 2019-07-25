package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.drivers.DriverUtility;

public class GooglePage {

	@Test
	public void ClickLink() {
		WebDriver driver = DriverUtility.supplyDriver("firefox");
		driver.get("https://google.com/");
		driver.findElement(By.xpath("//div[@id='SIvCob']//a[5]")).click();
		
	}
}
