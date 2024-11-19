package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedbusDropdownscenario {
  @Test
  public void testDropdown() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in/");
	  
	  //from
	  WebElement ddele=driver.findElement(By.id("src"));
	  ddele.click();
	  ddele.sendKeys("pune");
	  
	  
	  //options
	  
	
	  //List<WebElement> allOptions=driver.findElements(By.xpath("//ul[contains(@class,'dZhbJF')]//li//text[@class='placeHolderMainText']"));
	  List<WebElement> allOptions=driver.findElements(By.xpath("//ul[contains(@class,'dZhbJF')]//li//text"));//subtext+main text
	  System.out.println("Total Options are: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Kharadi"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
