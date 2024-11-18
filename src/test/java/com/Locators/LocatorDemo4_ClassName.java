package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo4_ClassName {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");

		//email
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.name("password-name")).sendKeys("test123");
		
		
		//submit-className-InvalidSelectorException: Compound class names not permitted
		//driver.findElement(By.className("btn btn-default btn-primary")).click();
		
		driver.findElement(By.className("btn-primary")).click();
		
		
		
	}

}
