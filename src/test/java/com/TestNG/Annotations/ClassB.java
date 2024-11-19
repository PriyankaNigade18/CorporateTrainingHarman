package com.TestNG.Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassB 
{
	@Test
	  public void testCase1() 
	  {
		  System.out.println("ClassB test case1");
	  }
	  
	  @Test
	  public void testCase2() 
	  {
		  System.out.println("ClassB test case2");
	  }
	  
	  @BeforeTest
	  public void btest()
	  {
		  System.out.println("Before Test will run before first class in Test");
	  }
	  
	  @AfterTest
	  public void atest()
	  {
		  System.out.println("After Test will run after last class in Test");
	  }
	  
	  @BeforeSuite
	  public void bsuite()
	  {
		  System.out.println("Before suite will run before FirstTest");
	  }
	  
	  
	  @AfterSuite
	  public void asuite()
	  {
		  System.out.println("After suite will run afterlastTest");
	  }
}
