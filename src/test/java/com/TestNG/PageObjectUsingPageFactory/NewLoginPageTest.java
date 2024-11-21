package com.TestNG.PageObjectUsingPageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewLoginPageTest extends NewBaseClass
{
  @Test(priority=1)
  public void validateTitle() 
  {
	  String actTitle=lp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("HRM"));
	  System.out.println("Title matched!");
  }
  
  
  @Test(priority=2)
  public void validateLogin()
  {
	  lp.doLogin("Admin","admin123");
  }
}
