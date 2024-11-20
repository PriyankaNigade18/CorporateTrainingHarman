package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage
{
	WebDriver driver;
	
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locators
	@FindBy(id="first-name")
	WebElement firstname;
	
	@FindBy(id="last-name")
	WebElement lastname;
	
	@FindBy(id="postal-code")
	WebElement zipcode;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	
	
	public OverviewPage doCheckout(String fn,String ln,String zp)
	{
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		zipcode.sendKeys(zp);
		System.out.println("Your data is:");
		System.out.println("firstname: "+fn+" "+"Lastname: "+ln+" "+"zipcode:"+zp);
		
		continueBtn.click();
		//state change--->Overview page
		return new OverviewPage(driver);
	}
	

}
