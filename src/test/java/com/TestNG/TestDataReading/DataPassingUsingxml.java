package com.TestNG.TestDataReading;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DataPassingUsingxml
{
	@Parameters({"un","psw"})
  @Test
  public void loginTest(String un,String psw) 
  {
	  System.out.println("User name is: "+un);
	  System.out.println("Password is: "+psw);
	  WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//username
		driver.findElement(By.name("username")).sendKeys(un);
		
		//password
		driver.findElement(By.name("password")).sendKeys(psw);
		
		//login
		driver.findElement(By.className("oxd-button")).click();
		
		
	  
  }
}
