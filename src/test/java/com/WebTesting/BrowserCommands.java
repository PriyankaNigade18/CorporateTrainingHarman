package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) 
	{
		// Create a driver session
		
		WebDriver driver=new ChromeDriver();
		
		//get()
		driver.get("https://automationplayground.com/crm/");
		
		//getTitle()
		System.out.println("Title is: "+driver.getTitle());
		
		//getCurrentUrl()
		System.out.println("Current url is: "+driver.getCurrentUrl());
		
		//getPageSource()
		System.out.println(driver.getPageSource());
		
		//close the browser
		driver.quit();
		
		
		

	}

}
