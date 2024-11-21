package com.TestNG.DataDriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatadrivenUSingArray
{
//   @DataProvider(name="arraydata")
//	public Object[][] testData()
//	{
//		Object data[][]={ {"Admin","admin123"},{"Sumit","test123"},{"Admin","admin123"},{"Riya","test13"}};
//		
//		return data;
//	}
	
	
	
	
	@Test(dataProvider = "arraydata",dataProviderClass=CustomData.class)
  public void loginTest(String un,String psw)
	{
		System.out.println("UserName is: "+un);
		System.out.println("Password is: "+psw);
		
	}
}
