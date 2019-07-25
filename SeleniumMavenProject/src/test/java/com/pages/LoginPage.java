package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
   
	WebDriver driver;
	@FindBy(how=How.ID,using="Email")
	WebElement email;
	@FindBy(how=How.ID,using="Password")
	WebElement password;
	@FindBy(how=How.XPATH,using="//input[@value=\"Log in\"]")
	WebElement Login;
	
	public String clickLogin() {
		email.sendKeys("pradh.lin@gmail.com");
		password.sendKeys("123456");
		Login.click();
		return driver.getTitle();
	}
	

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
}
