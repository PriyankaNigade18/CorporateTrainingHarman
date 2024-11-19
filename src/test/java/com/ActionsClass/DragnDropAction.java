package com.ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragnDropAction {
  @Test
  public void testAction() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://jqueryui.com/droppable/#default");
	  
	  //frame
	  driver.switchTo().frame(0);
	  
	  WebElement src=driver.findElement(By.id("draggable"));
	  
	  WebElement target=driver.findElement(By.id("droppable"));
	  
			 
	  Actions act=new Actions(driver);
	  act.dragAndDrop(src,target).perform();
	  
	  
	  
	  
	  
	  
	  
  }
}
