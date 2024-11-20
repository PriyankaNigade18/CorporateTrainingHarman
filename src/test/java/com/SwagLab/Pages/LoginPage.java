package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)//base class
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//locators
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public InventoryPage doLogin(String un,String psw)
	{
		username.sendKeys(un);
		password.sendKeys(psw);
		loginBtn.click();
		
		//state--->inventory page
		return new InventoryPage(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
