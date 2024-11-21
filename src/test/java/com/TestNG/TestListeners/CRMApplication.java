package com.TestNG.TestListeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;


//@Listeners(com.TestNG.TestListeners.TestListeners.class)
public class CRMApplication extends BaseClass
{
//	WebDriver driver;
//	@BeforeClass
//	public void setUp()
//	{
//		 driver=new ChromeDriver();
//		driver.get("https://automationplayground.com/crm/");
//		
//	}
	
	
  @Test(priority=1)
  public void validateSignInLink()
  {
	  Reporter.log("SignInValidation in process",true);
	driver.findElement(By.linkText("Sign In")).click();
	Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Test Fail: Link is not working");
	System.out.println("Sign In Link is working");
  }
  
  
  @Test(priority=2)
  public void validateSignIn()
  {
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("submit-id")).click();
	  
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail");
	  System.out.println("Login completed1");
  }
  
  @Test(priority=3)
  public void validateSignOut()
  {
	  driver.findElement(By.linkText("Sign Out")).click();
  }
  
  
//  @BeforeMethod
//  public void getAppTitle()
//  {
//	  System.out.println("Title is: "+driver.getTitle());
//  }
//  
//  @AfterMethod
//  public void getAppUrl()
//  {
//	  System.out.println("Url is: "+driver.getCurrentUrl());
//  }
//  
//  @AfterClass
//  public void tearDown()
//  {
//	  driver.quit();
//  }
}
