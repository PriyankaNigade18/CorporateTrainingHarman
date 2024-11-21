package com.TestNG.ParallelExecution;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClass2
{
	@Test
	  public void firefoxTest() 
	  {
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.amazon.com");
	  }
}
