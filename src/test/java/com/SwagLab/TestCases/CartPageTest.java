package com.SwagLab.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CartPageTest extends BaseClass
{
	//precondition
	@BeforeClass
	public void pageSetup()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
		ip.addProductToCart(prop.getData("pname1"));
		cp=ip.getCartPage();
	}
	
	
  @Test(priority=1)
  public void verifyProduct() 
  {
	  System.out.println(cp.getDetails());
  }
  
  @Test(priority=2)
  public void vaidateRemove() 
  {
	  cp.doRemove();
  }
  
  
  @Test(priority=3)
  public void validateContinueShopping() 
  {
	  ip=cp.doContinueShopping();
	  ip.addProductToCart(prop.getData("pname2"));
	  ip.getCartPage();
  }
  
  @Test(priority=4)
  public void validateCheckOut() 
  {
	  cp.doClickOnCheckOut();
  }
}
