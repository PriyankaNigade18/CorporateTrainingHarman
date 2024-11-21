package com.TestNG.ParallelExecution;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestClass1 
{
	@Test
	  public void edgeTest() 
	  {
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://www.facebook.com");
	  }
}
