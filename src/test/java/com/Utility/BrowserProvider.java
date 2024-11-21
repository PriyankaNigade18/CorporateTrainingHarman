package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserProvider 
{
	
	public static WebDriver driver;
	
	//created same driver object
	static ThreadLocal<WebDriver> tdriver=new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver()
	{
		return tdriver.get();
	}
	
	public static WebDriver setDriver(String bname)
	{
		if(bname.equals("chrome"))
		{
			driver=new ChromeDriver();
			tdriver.set(driver);
			
		}else if(bname.equals("edge"))
		{
			driver=new EdgeDriver();
			tdriver.set(driver);
		}
		
		return getDriver();
	}
	
	

}
