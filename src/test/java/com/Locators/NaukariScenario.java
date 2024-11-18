package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariScenario {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com/");
		
		
		List<WebElement> list=driver.findElements(By.tagName("a"));

		System.out.println("Total links are: "+list.size());
		
		
		for(WebElement i:list)
		{
			System.out.println(i.getAttribute("href"));
		}
		
		
		
	}
	
	
	

}
