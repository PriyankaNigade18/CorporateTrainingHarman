package com.WaitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Generics.Utility;

public class ExplicitWaitusingWebDriverWaitClass {
  @Test
  public void testWait()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  //By locator
	  
	  By email=By.id("input-email");
	  By password=By.name("password");
	  By loginbtn=By.xpath("//input[@value='Login']");
	  
	  /*
	   * TimeoutException: Expected condition failed: 
	   * waiting for presence of element located by: 
	   * By.id: input-email### 
	   * (tried for 5 second(s) with 500 milliseconds interval)
	   * interval time =Polling time
	   * Selenium default timeout is 0.5sec/500ms
	   */
	  WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement emailele=wait1.until(ExpectedConditions.presenceOfElementLocated(email));
	  emailele.sendKeys("test@gmail.com");
	  
	  
	  WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
	  wait2.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("test123");
	  
	  Utility.waitForElementToClick(driver,loginbtn).click();
	  
	  
	  
	  
	  
	  
	  
			  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
