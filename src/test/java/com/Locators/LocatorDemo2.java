package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
		
		//email-NoSuchElementException
		driver.findElement(By.name("email-name")).sendKeys("test@gmail.com");
		
		//pass
		driver.findElement(By.id("password")).sendKeys("test123");
		
		//checkbox
		
		driver.findElement(By.id("remember")).click();
		
		//button
		driver.findElement(By.id("submit-id")).click();
		

	}

}
