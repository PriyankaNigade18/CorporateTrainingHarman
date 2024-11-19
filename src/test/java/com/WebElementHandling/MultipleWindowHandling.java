package com.WebElementHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowHandling {
  @Test
  public void testMultipleWindow()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  //parent window
	  String parentId=driver.getWindowHandle();
	  System.out.println(parentId);
	  
	  
	  //link
	  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  //childWindow
	  
	  Set<String> allWindows=driver.getWindowHandles();
	  System.out.println(allWindows);
	  
	  for(String childId:allWindows)
	  {
		  //to switch to child window
		  if(!parentId.equals(childId))////parent id should not equal to child id
		  {
			  driver.switchTo().window(childId);
			//email
			 driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
			  
			driver.close();
			
			
			
		  }
		  
		  
	  }
	  
	  //parent window
	  
	  driver.switchTo().window(parentId);
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
