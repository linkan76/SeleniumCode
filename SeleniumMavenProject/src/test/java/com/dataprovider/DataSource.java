package com.dataprovider;

import org.testng.annotations.DataProvider;

public  class  DataSource {

	  @DataProvider(name="dp1")
	  public static Object[][] getData() {
		
		  Object[][] obj= {
				  {"pradh.lin@gmail.com","123456"},
				  {"pradh.link@gmail.com","123456"},
				  {"test1@gmail.com","linkan"}
		  };
		  return obj;
		  
	  }
	
	
}
