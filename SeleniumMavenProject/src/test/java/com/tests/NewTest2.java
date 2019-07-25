package com.tests;

import org.testng.annotations.Test;

public class NewTest2 {

	//SignUp
	//Login
	//Logout
	
	@Test(priority=1)
	public void testSignUp() {
		System.out.println("Selenium code for SignUp");
		
	}
	
	@Test(priority=2)
	public void testLogin() {
		
		System.out.println("Selenium code for LogIn");
	}
	
	@Test(priority=3)
	public void testLogout() {
		
		System.out.println("Selenium code for Logout");
		
	}
	
	
}
