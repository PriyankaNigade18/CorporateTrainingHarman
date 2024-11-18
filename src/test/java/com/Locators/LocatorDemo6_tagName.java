package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo6_tagName {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//number of Input boxes
		List<WebElement> inputBoxes=driver.findElements(By.tagName("input"));
		System.out.println("Total Input boxes are: "+inputBoxes.size());
		
		//total images:
		int images=driver.findElements(By.tagName("img")).size();
		System.out.println("Total images are: "+images);
		
		//total links
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+allLinks.size());
		
		
		String exp="https://www.youtube.com/c/OrangeHRMInc";
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getAttribute("href"));
			System.out.println(i.getText());
			if(i.getAttribute("href").contains(exp))
			{
				i.click();
				System.out.println("Link Found!");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
