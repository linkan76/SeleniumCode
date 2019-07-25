package com.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest3 {
	
	@Test
	public void openChrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_B8C.02.24\\Desktop\\New folder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		//String title=driver.getTitle();
		driver.findElement(By.cssSelector("input[value='roundtrip']")).click();
		WebElement count= driver.findElement(By.name("passCount"));
		WebElement city= driver.findElement(By.name("fromPort"));
		
		Select sel = new Select(city);
		
		//sel.selectByIndex(0);
		//sel.selectByValue(value);
		
		List<WebElement> cityList =sel.getOptions();
		
		Assert.assertEquals(cityList.size(), 10);
		for(WebElement e:cityList) {
			System.out.println(e.getText());
		}
		
	}

}
