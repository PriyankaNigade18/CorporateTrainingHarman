package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3_linkText {

	public static void main(String[] args)
	{
		//Create a driver session
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/");
		
		//link 
		//driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.partialLinkText("In")).click();
		
		

	}

}
