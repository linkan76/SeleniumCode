package com.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest6 {

	@Test
	public void demoWebShop() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_B8C.02.24\\Desktop\\New folder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		//List<WebElement> we=driver.findElements(By.tagName("li"));
		//System.out.println("Total number of li tags: "+we.size());
		WebElement myAccount= driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]"));
		List<WebElement> we= myAccount.findElements(By.tagName("li"));
		System.out.println("Total number of li tags: "+we.size());
		for(WebElement e:we) {
			System.out.println(e.getText());
		}
		
		
	
	}
	
	
}
