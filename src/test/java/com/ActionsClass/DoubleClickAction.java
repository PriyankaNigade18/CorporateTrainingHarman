package com.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClickAction {
  @Test
  public void testDoubleClick()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  WebElement ele=driver.findElement(By.tagName("button"));
	  
	  Actions act=new Actions(driver);
	  act.doubleClick(ele).perform();
	  
	  driver.switchTo().alert().accept();
	  
	  
	  
  }
}
