package com.TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
  @Test
  public void HardAssertionTest()
  {
	  int a=100,b=100;
	  /*
	   * AssertionError from java
	   */
//	  Assert.assertEquals(a,b,"Test Fail: As numbers are not equal!");
//	  
//	  System.out.println("Test Pass: As numbers are equal!");
	  
	  Assert.assertTrue(a==b,"Test Fail: As numbers are not equal!");
	  System.out.println("Test Pass: As numbers are equal!");

	  }
  
  @Test
  public void softAssertDEmo()
  {
	  int a=100,b=200;
	  
	  SoftAssert sf=new SoftAssert();
	  sf.assertEquals(a,b,"Test Fail: As number are not equal!");
	  System.out.println("Test Pass: As numbers are equal!");
	  sf.assertAll();
	  
	  
	  
  }
}
