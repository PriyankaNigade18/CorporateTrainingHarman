package com.WebElementHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTab_Window {
  @Test
  public void testNewTab() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  
	  WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
	  
	  newTab.get("https://www.facebook.com");
	  System.out.println(newTab.getWindowHandle());
	  
	  
	  WebDriver newWin=driver.switchTo().newWindow(WindowType.WINDOW);
	  
	  newWin.get("https://www.amazon.in");
	  
	  
	  
  }
}
