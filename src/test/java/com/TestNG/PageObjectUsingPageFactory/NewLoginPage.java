package com.TestNG.PageObjectUsingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewLoginPage 
{
	private WebDriver driver;
	
	public NewLoginPage(WebDriver driver)//base class
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//identification
	@FindBy(name="username")
	private WebElement usern;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btn;
	
	//actions
	public void doLogin(String un,String psw)
	{
		usern.sendKeys(un);
		pass.sendKeys(psw);
		btn.click();
	}
	
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	
	
	
	
	
	
	
	

}
