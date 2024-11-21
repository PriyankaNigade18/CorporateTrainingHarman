package com.TestNG.TestListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 

{
	
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		Reporter.log("Driver session created",true);
		 driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
	}
	
	@BeforeMethod
	  public void getAppTitle()
	  {
		Reporter.log("Title is captured",true);
		  System.out.println("Title is: "+driver.getTitle());
	  }
	  
	  @AfterMethod
	  public void getAppUrl()
	  {
		  System.out.println("Url is: "+driver.getCurrentUrl());
	  }
	  
	  @AfterClass
	  public void tearDown()
	  {
		  driver.quit();
	  }

}
