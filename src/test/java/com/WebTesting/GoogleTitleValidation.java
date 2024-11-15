package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleValidation {

	public static void main(String[] args) 
	{
		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://www.google.com");
		
		//get title of current page-getTitle()
		String actTitle=driver.getTitle();
		System.out.println("Actual Title : "+actTitle);
		
		String expTitle="Google";
		
		//validate
		if(actTitle.equals(expTitle))
		{
			System.out.println("Title matched...Test Pass");
		}else
		{
			System.out.println("Title not matched...Test Fail");

		}
		
		//close the browser close() quit()
		//driver.close();
		
		driver.quit();
		

	}

}
