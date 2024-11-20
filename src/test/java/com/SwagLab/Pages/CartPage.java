package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage
{

	WebDriver driver;
	
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//Locators
	@FindBy(xpath="//div[@class='inventory_item_name']")
	WebElement productName;
	
	@FindBy(xpath="//button[text()='Remove']")
	WebElement removeBtn;
	
	@FindBy(id="continue-shopping")
	WebElement continueBtn;
	
	@FindBy(id="checkout")
	WebElement checkBtn;
	
	
	public String getDetails()
	{
		return productName.getText();
	}
	
	public void doRemove()
	{
		String name=productName.getText();
		//System.out.println("Product is: "+name);
		removeBtn.click();
		System.out.println("Product removed from cart: "+name);
	}
	
	public InventoryPage doContinueShopping()
	{
		continueBtn.click();
		return new InventoryPage(driver);
	}
	
	
	public CheckOutPage doClickOnCheckOut()
	{
		checkBtn.click();
		//state change --->checkout
		return new CheckOutPage(driver);
	}
	
	
}


