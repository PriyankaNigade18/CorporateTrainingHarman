package com.TestNG.Annotations;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationDemo {
  @Test
  public void testCase1()
  {
	  System.out.println("This is testcase1 ");
  }
  
  @Test
  public void testCase2()
  {
	  System.out.println("This is testcase2 ");
  }
  
  @Test
  public void testCase3()
  {
	  System.out.println("This is testcase3 ");
  }
  
  
  //rules
  @BeforeMethod
  public void bmethod()
  {
	  System.out.println("BeforeMethod will run before every test case!");
  }
  
  @AfterMethod
  public void amethod()
  {
	  System.out.println("AfterMethod will run after every test case!");
  }
  
  @BeforeClass
  public void bclass()
  {
	  System.out.println("BeforeClass will run before fisrt test case");
  }
  
  @AfterClass
  public void aclass()
  {
	  System.out.println("AfterClass will run After last test case");
  }
}
