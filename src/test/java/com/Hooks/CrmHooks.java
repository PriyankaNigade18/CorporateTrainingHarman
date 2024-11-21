package com.Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.BrowserProvider;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CrmHooks
{

	public WebDriver driver;
	@Before
	public void setUp()
	{
		System.out.println("Driver session started!.....");
		//driver=new ChromeDriver();
		driver=BrowserProvider.setDriver("chrome");
		
	}
	
	@After
	public void teardown()
	{
		System.out.println("Driver session closed!");
		driver.quit();
	}
}
