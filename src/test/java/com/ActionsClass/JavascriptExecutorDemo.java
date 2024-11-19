package com.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generics.Utility;

public class JavascriptExecutorDemo {
  @Test
  public void testJavascriptInterface() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  //get the title
	  String title=js.executeScript("return document.title").toString();
	  System.out.println(title);
	  
	  //refresh the page
	  js.executeScript("history.go(0)");
	  
	  
	  //click on cart page
	  WebElement cartele=driver.findElement(By.xpath("//span[normalize-space()='Cart']"));
	  
	  js.executeScript("arguments[0].click();",cartele);
	  
	  
	  
	  
	  /*
	  Utility.scrollDown(driver);
	  
	  Thread.sleep(2000);
	  
	  Utility.scrollUp(driver);
	  
	  WebElement ele=driver.findElement(By.xpath("//span[text()='Best Sellers in Sports, Fitness & Outdoors']"));

	  Utility.scrollUpToElement(driver,ele);
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  /*
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  //js.executeScript("window.scrollTo(0,3000)");
	  
	  //scrolldown
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  //js.executeScript("window.alert('Hello I am an Alert!')");
	  
	  Thread.sleep(2000);
	  
	  //scrollUp
	  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	  
	  //scroll upto element-scrollIntoView()
	  WebElement ele=driver.findElement(By.xpath("//span[text()='Best Sellers in Sports, Fitness & Outdoors']"));
	  
	  js.executeScript("arguments[0].scrollIntoView(true);",ele);
	  
	  */
	  
	  
	  
  }
}
