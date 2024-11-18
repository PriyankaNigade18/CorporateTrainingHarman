package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo10_xpathMathods {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		//sell- text()
		driver.findElement(By.xpath("//a[text()='Sell']")).click();
		
		//cart-  normalize-space()
		driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		
		//cart mesg'- normalize-space()
		
		String cartText=driver.findElement(By.xpath("//h3[normalize-space()='Your Amazon Cart is empty']")).getText();
		System.out.println("Cart status is: "+cartText);
		
		WebElement searchBox;
		//search box- contains()
		searchBox=driver.findElement(By.xpath("//input[contains(@id,'searchtext')]"));
		searchBox.click();
		searchBox.sendKeys("bag",Keys.ENTER);
		
		//starts-with()-prefix
		 searchBox=driver.findElement(By.xpath("//input[starts-with(@id,'two')]"));
		 searchBox.click();
		 searchBox.clear();
		 searchBox.sendKeys("watch",Keys.ENTER);
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
	}

}
