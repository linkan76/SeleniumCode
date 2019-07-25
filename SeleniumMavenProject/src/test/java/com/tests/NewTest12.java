package com.tests;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.drivers.DriverUtility;

public class NewTest12 {
	WebDriver driver;
	
	@Test
	public void OpenHdfcNetBanking() throws InterruptedException {
		driver = DriverUtility.supplyDriver("chrome");
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //implicit wait
		
		driver.manage().window().maximize();
		driver.get("https://hdfcbank.com/assets/popuppages/netbanking.htm");
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click();
		//Thread.sleep(5000); // java wait
		driver.switchTo().frame(0);
		//driver.switchTo().frame("login_page");
		driver.findElement(By.cssSelector("input[class='input_password']")).sendKeys("1234567");
		driver.findElement(By.xpath("//a[@onclick=\"return fLogon();\"]")).click();
		
		driver.switchTo().parentFrame(); // it will move from child frame to parent frame
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Privacy Policy")).click();
		
		
		//driver.getWindowHandle(); // return the current window address
		Set<String> allWindowAddr =  driver.getWindowHandles();// return the list of window opened by driver
		//driver is focusing 1st window
		for(String a:allWindowAddr) {
			driver.switchTo().window(a);
		}
		//driver is focusing 2nd window
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Personal")).click();
		
		driver.quit();// closes all window
		//driver.close();// close current window
		
		
		
		// for Alert message
		
		
		Alert a = driver.switchTo().alert();  //used to open the alert
		a.getText(); // for getting the text
		a.accept(); //for accept the alert
		
	}

}
