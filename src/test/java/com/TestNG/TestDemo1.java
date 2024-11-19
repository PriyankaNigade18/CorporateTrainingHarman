package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo1
{
  @Test(priority=1,description="testcase1")
  public void registerUser()
  {
	  System.out.println("User will register");
  }
  
  @Test(priority=2,invocationCount=3)
  public void loginUser()
  {
	  System.out.println("User will login");
  }
  
  
  @Test(priority=3)
  public void searchProduct()
  {
	  System.out.println("User will search product");
  }
  
  
  @Test(priority=4)
  public void addToCart()
  {
	  System.out.println("User will add product to cart");
  }
}
