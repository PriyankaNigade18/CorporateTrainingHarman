package com.WebElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Generics.Utility;

public class AmazonDropdownDemo
{
  @Test
  public void validateTitle() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  	driver.get("https://www.amazon.in");
	  	
	  	
	  	//dropdown-select tag
	  
	  	WebElement dropdownele=driver.findElement(By.id("searchDropdownBox"));
	  	
	  	Utility.selectBasedDropDown(dropdownele,"Video Games");
	  	
	  	
	  	
	  	
	  	/*
	  	//select class object
	  	Select dd=new Select(dropdownele);
	  	
	  	System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
	  	
	  	//single selection
	  	dd.selectByIndex(3);
	  	
	  	Thread.sleep(2000);
	  	
	  	dd.selectByValue("search-alias=gift-cards");
	  	
	  	Thread.sleep(2000);
	  	
	  	dd.selectByVisibleText("Office Products");
	  	
	  	System.out.println("Test for All options");
	  	
	  	List<WebElement> allOptions=dd.getOptions();
	  	System.out.println("Total Options are: "+allOptions.size());
	  	
	  	
	  	String exp="Video Games";
	  	for(WebElement i:allOptions)
	  	{
	  		System.out.println(i.getText());
	  		if(i.getText().contains(exp))
	  		{
	  		i.click();
	  		System.out.println("Option found!...Test match");
	  		break;
	  		}
	  	}
	  	
	  	*/
	  	
	  	
  }
  
  

  
  
}
