package com.SwagLab.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InventoryPageTest extends BaseClass
{
	@BeforeClass
	public void pageSetup()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
	}
	
	
  @Test(priority=1)
  public void validateTotalProducts()
  {
	  int count=ip.getProductCount();
	  AssertJUnit.assertEquals(count,6);
	  System.out.println("Product count matched,Total Products are:"+count);
	  
  }
  
  @Test(priority=2)
  public void validateProducts()
  {
	  ip.getProductNames();
  }
  
  
  @Test(priority=3)
  public void validateAddToCart()
  {
	  ip.addProductToCart(prop.getData("pname1"));
  }
  
  @Test(priority=4)
  public void validateCartPage()
  {
	  ip.getCartPage();
  }
}
