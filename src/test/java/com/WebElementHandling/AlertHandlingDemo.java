package com.WebElementHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandlingDemo {
  @Test
  public void testRediffmailAlert() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  
	  driver.findElement(By.id("login1")).sendKeys("Priyanka");
	  driver.findElement(By.name("proceed")).click();
	  //alert will appear
	  //UnhandledAlertException: unexpected alert open: {Alert text : Please enter your password}
	  Thread.sleep(1500);
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Alert Text is: "+alt.getText());
	  
	  //Ok
	  alt.accept();
	  
	  //password
	  driver.findElement(By.id("password")).sendKeys("test123");
  }
  
  
  @Test
  public void javascriptAlerts()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  WebElement resultEle=driver.findElement(By.id("result"));
	  
	  //alert1
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  
	  //alert 
	 Alert alt=driver.switchTo().alert();
	 System.out.println("Alert1 Text is: "+alt.getText());
	 alt.accept();
	 
	 
	 System.out.println("Result of Alert1 is: "+resultEle.getText());
	 
	 //alert2
	 driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	 
	 Alert alt2=driver.switchTo().alert();
	 System.out.println("Alert2 Text is: "+alt2.getText());
	 alt2.dismiss();
	 System.out.println("Result of Alert2 is: "+resultEle.getText());
	 
	 //alert3
	 
	 driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	 
	 Alert alt3=driver.switchTo().alert();
	 System.out.println("Alert3 Text is: "+alt3.getText());
	 alt3.sendKeys("Hello All");
	 alt3.accept();
	 System.out.println("Result of Alert3 is: "+resultEle.getText());
	 
	
	  
	  
  }
  
  
  @Test
  public void basicAuthenticationPopup()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  
	  String msg=driver.findElement(By.tagName("p")).getText();
	  System.out.println(msg);
	  
	  
	  	
  }
  
  
  
  
}

