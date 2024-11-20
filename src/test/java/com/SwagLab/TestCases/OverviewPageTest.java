package com.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OverviewPageTest extends BaseClass
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
				op=ch.doCheckout(prop.getData("fn"),prop.getData("ln"),prop.getData("zp"));
			}
	
	
	
  @Test(priority=1)
  public void validateSummary()
  {
	 System.out.println(op.getSummary());
  }
  
  @Test(priority=2)
  public void validateFinishProcess()
  {
	  op.doFinish();
  }
}
