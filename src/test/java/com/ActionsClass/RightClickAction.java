package com.ActionsClass;

import java.util.List;

import javax.sound.midi.SysexMessage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Generics.Utility;

public class RightClickAction {
  @Test
  public void testRightClick()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  Utility.getScreenshot(driver,"Homepage");
	  WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  //right click
	  Actions act=new Actions(driver);
	  act.contextClick(ele).perform();
	  Utility.getScreenshot(driver,"clickAction");
	  
	  //all menu
	  List<WebElement> allOptions=driver.findElements(By.xpath("(//ul)[3]//li//span"));
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Paste"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  //alert handling
	  
	  driver.switchTo().alert().accept();
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
