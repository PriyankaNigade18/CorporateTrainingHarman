package com.TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodTest {
  @Test(priority=1)
  public void register()
  {
	  System.out.println("This is register test");
  }
  
  @Test(priority=2,dependsOnMethods = "register")
  public void login()
  {
	  System.out.println("This is login test");
	 AssertJUnit.assertEquals(false,true);  
  }
  
  
  @Test(priority=3,dependsOnMethods = "login")
  public void logout()
  {
	  System.out.println("This is logout test");
  }
}
