package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo9_XpathOperator_index {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

		//fname
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Ram");
		
		//lastname- and operator
		driver.findElement(By.xpath("//input[@name='lastname'  and @class='form-control']")).sendKeys("patil");
		
		//email-idexing
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("ram222@gmail.com");
		
		
		//telephone-indexing
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("87765544");
		
		//password- position()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("test123");
		
		//cpassword -position()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=6]")).sendKeys("test123");
		
		//yes radio button
		driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
		
		
		//checkbox
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		//btn
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
//		if(driver.getCurrentUrl().contains("success"))
//		{
//			System.out.println("User Registration is completed!");
//		}
//		else
//		{
//			System.out.println("User Registration is fail! ");
//		}
		
		String exp="Your Account Has Been Created!";
		String actSuccessMsg=driver.findElement(By.xpath("(//h1)[2]")).getText();
		if(actSuccessMsg.equals(exp))
		{
		System.out.println("User Registration is completed!");

		}
		else
			{
				System.out.println("User Registration is fail! ");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
