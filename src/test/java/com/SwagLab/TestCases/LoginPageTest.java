package com.SwagLab.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void validateUrl()
  {
	  String actUrl=lp.getAppUrl();
	  AssertJUnit.assertTrue(actUrl.contains(prop.getData("expUrl")));
	  System.out.println("Url is matching!");
  }
  
  @Test(priority=2)
  public void validateLogin()
  {
	  lp.doLogin(prop.getData("un"),prop.getData("psw"));
	  AssertJUnit.assertTrue(lp.getAppUrl().contains(prop.getData("explp")));
	  System.out.println("Login Success!");
  }
}
