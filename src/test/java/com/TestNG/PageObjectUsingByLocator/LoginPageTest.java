package com.TestNG.PageObjectUsingByLocator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
	
  @Test(priority=1)
  public void validateUrl()
  {
	  //LoginPage lp=new LoginPage();
	  String actUrl=lp.getAppUrl();
	  String exp="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  Assert.assertEquals(actUrl,exp,"URl is not matching!");
	  System.out.println("Url is matching!");
	  
  }
  
  @Test(priority=2)
  public void validateTitle() 
  {
	  String actTitle=lp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("HRM"),"Title not matched!");
	  System.out.println("Title matched");
	  
  }
  
  
  @Test(priority=3)
  public void validateLogin() 
  {
	  lp.doLogin("Admin","admin123");
	  Assert.assertTrue(lp.getAppUrl().contains("dashboard"),"Login Fail");
	  System.out.println("Login completed");
  }
}
