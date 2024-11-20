package com.SwagLab.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLab.Pages.*;
import com.SwagLab.Utility.PropertiesUtil;

public class BaseClass
{
	public WebDriver driver;
	public PropertiesUtil prop;
	public LoginPage lp;
	public InventoryPage ip;
	public CartPage cp;
	public CheckOutPage ch;
	public OverviewPage op;
	
	
	@BeforeTest
	public void setUP()
	{
		prop=new PropertiesUtil();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getData("url"));
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		cp=new CartPage(driver);
		ch=new CheckOutPage(driver);
		op=new OverviewPage(driver);
		
	}

//	@BeforeClass
//	public void pageSetup()
//	{
//		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
//		addWait();
//		ip.addProductToCart(prop.getData("pname1"));
//		addWait();
//		cp=ip.getCartPage();
//		addWait();
//	}
	
	public void addWait()
	{
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
