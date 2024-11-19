package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookDropdownScenario 
{
	
	public static void selectBasedDropDown(WebElement ele,String value)
	{
		Select ddele=new Select(ele);
		  
		  System.out.println("Is dropdown supported multiple selection?: "+ddele.isMultiple());
		  
		  List<WebElement> allOptions=ddele.getOptions();
		  System.out.println("Total options are: "+allOptions.size());
		  
		  for(WebElement i:allOptions)
		  {
			  System.out.println(i.getText());
			  if(i.getText().contains(value))
			  {
				  i.click();
				  break;
			  }
		  }
		  
	}
	
	
	
	
  @Test
  public void testDropDown()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.facebook.com/");
	  
	  //create an account
	  driver.findElement(By.linkText("Create new account")).click();
	  
	  //dropdown
	  WebElement dayele=driver.findElement(By.id("day"));
	  
	  selectBasedDropDown(dayele,"27");
	  
	  
		 //month
		  WebElement monthele=driver.findElement(By.id("month"));
		  
		  selectBasedDropDown(monthele,"Dec");
		  
		  //year
		  WebElement yearele=driver.findElement(By.id("year"));
		  selectBasedDropDown(yearele,"2010");
		  
		  
		  
		  
//	  Select daydd=new Select(dayele);
//	  
//	  System.out.println("Is dropdown supported multiple selection?: "+daydd.isMultiple());
//	  
//	  List<WebElement> allOptions=daydd.getOptions();
//	  System.out.println("Total options are: "+allOptions.size());
//	  
//	  for(WebElement i:allOptions)
//	  {
//		  System.out.println(i.getText());
//		  if(i.getText().contains("27"))
//		  {
//			  i.click();
//			  break;
//		  }
//	  }
//	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
