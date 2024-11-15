package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException 
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//navigate to Facebook 
		driver.navigate().to("https://www.facebook.com");
		
		//static wait-Java
		Thread.sleep(2000);
		
		//navigate to back()
		driver.navigate().back();
		
		//static wait-Java
		Thread.sleep(2000);
		
		//navigate to forward()
		
		driver.navigate().forward();
		
		//static wait-Java
		Thread.sleep(2000);
		
		//refresh the page
		driver.navigate().refresh();

	}

}
