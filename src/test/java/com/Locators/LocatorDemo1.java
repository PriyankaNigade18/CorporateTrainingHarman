package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1 {

	public static void main(String[] args)
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		//techique2: IdentifyElement+Perform action
		//driver.findElement(By.id("APjFqb")).sendKeys("Java");
		
		//technique3: identify+ validation +action
		WebElement ele=driver.findElement(By.id("APjFqb"));
		
		if(ele.isDisplayed() && ele.isEnabled())
		{
			ele.sendKeys("TestNG",Keys.ENTER);
		}
		
		
		/*
		
		//Technique1: By Locators
		
		//get the address of search- By is class
		By searchBox=By.id("APjFqb");
		
		//identify
		WebElement ele=driver.findElement(searchBox);
		
		//validate element
		System.out.println("Is Search box Displayed?: "+ele.isDisplayed());
		System.out.println("Is search box enabled?: "+ele.isEnabled());
		
		//perform action 
		ele.sendKeys("cucumber",Keys.ENTER);
		
		*/
		
		
		
		
		
		
		
		

	}

}
