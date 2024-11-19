package com.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderTEst {
  @Test
  public void testAction()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/slider/");
	  
	  //frame
	  driver.switchTo().frame(0);
	  
	  WebElement ele=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
	  
	  
	  Actions act=new Actions(driver);
	  act.clickAndHold(ele).moveToElement(ele,100,0).build().perform();
	  
	  
	  
	  
	  
  }
}
