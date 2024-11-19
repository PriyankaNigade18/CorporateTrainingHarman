package com.WaitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class ExplicitWaitUsingFluentWaitClass {
  @Test
  public void f() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  //By locator
	  
	  By email=By.id("input-email");
	  By password=By.name("password");
	  By loginbtn=By.xpath("//input[@value='Login']");
	  
	  
	  Wait<WebDriver> wait1 =new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(2))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(ElementNotInteractableException.class);
	  
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("test@gmail.com");
	  
	  
	  
  }
}
