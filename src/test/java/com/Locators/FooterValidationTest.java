package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterValidationTest {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.freshworks.com/");
		
		//all footers
		List<WebElement> allFooters=driver.findElements(By.xpath("//nav[contains(@class,'fMAcTI')]//div[contains(@class,'eNMhGa')]"));
		
		int count=1;
		for(WebElement i:allFooters)//3
		{
			
			List<WebElement> list1=driver.findElements(By.xpath("(//ul[contains(@class,'kTjuIu')])["+count+"]//li//a//span"));	
			
			for(WebElement j: list1)
			{
				System.out.println(j.getText());
			}
			
			count++;
			
			
		}
		
		
		

		/*
		//footer list1
		List<WebElement> list1=driver.findElements(By.xpath("(//ul[contains(@class,'kTjuIu')])[1]//li//a//span"));	
	
		for(WebElement i: list1)
		{
			System.out.println(i.getText());
		}
	*/
	
	
	
	}

}
