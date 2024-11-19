package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupingInTestNG {
  @Test(groups="Smoke")
  public void testcase1() 
  {
	  System.out.println("This is testcase1");
  }
  
  @Test(groups="Functional")
  public void testcase2() 
  {
	  System.out.println("This is testcase2");
  }
  @Test(groups="Functional")
  public void testcase3() 
  {
	  System.out.println("This is testcase3");
  }
  @Test(groups="Regression")
  public void testcase4() 
  {
	  System.out.println("This is testcase4");
  }
  
  @Test(groups="Regression")
  public void testcase5() 
  {
	  System.out.println("This is testcase5");
  }
}
