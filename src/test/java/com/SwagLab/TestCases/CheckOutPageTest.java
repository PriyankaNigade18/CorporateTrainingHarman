package com.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckOutPageTest extends BaseClass

{
	//precondition
		@BeforeClass
		public void pageSetup()
		{
			ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
			ip.addProductToCart(prop.getData("pname1"));
			cp=ip.getCartPage();
			addWait();
			ch=cp.doClickOnCheckOut();
		}
	
	
  @Test
  public void validateCheckOutFetaure() 
  {
	  ch.doCheckout(prop.getData("fn"),prop.getData("ln"),prop.getData("zp"));
  }
}
