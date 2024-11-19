package com.TestNG.TestDataReading;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generics.PropertiesRead;

public class HrmDataPassingusingPropertiesfile {
  @Test
  public void f() 
  {
	  PropertiesRead p1=new PropertiesRead();
	  WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p1.getData("url"));

		//username
		driver.findElement(By.name("username")).sendKeys(p1.getData("un"));
		
		//password
		driver.findElement(By.name("password")).sendKeys(p1.getData("psw"));
		
		//login
		driver.findElement(By.className("oxd-button")).click();
		
		
  }
}
