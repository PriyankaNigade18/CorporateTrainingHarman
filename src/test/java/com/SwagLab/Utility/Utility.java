package com.SwagLab.Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	
	public static void getScreenshot(WebDriver driver,String name)
	{
		 TakesScreenshot ts=(TakesScreenshot) driver;
		  File temp=ts.getScreenshotAs(OutputType.FILE);
		  File dest=new File(System.getProperty("user.dir")+"//Screenshots//"+name+System.currentTimeMillis()+".png");
		  
		  try {
			FileHandler.copy(temp,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	//wait
	public static WebElement waitForElementPresent(WebDriver driver,By loc)
	{
	WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
	 return wait1.until(ExpectedConditions.presenceOfElementLocated(loc));
	}
	public static WebElement waitForElementVisibility(WebDriver driver,By loc)
	{
	WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
	 return wait1.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	
	public static WebElement waitForElementToClick(WebDriver driver,By loc)
	{
	WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
	 return wait1.until(ExpectedConditions.elementToBeClickable(loc));
	}
	
	
	//javascript-scroll
	
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	
	
	public static void scrollUpToElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",ele);

	}
	
	
	//dropdown
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
	
	
}
