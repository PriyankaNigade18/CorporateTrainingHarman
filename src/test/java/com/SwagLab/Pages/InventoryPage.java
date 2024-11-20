package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

	
	WebDriver driver;
	
	public InventoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locators
	
	@FindBy(xpath="//div[@class='inventory_list']//div[@class='inventory_item_name ']")
	List<WebElement> totalProduct;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement addBtn;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cartBtn;
	
	//methods
	public int getProductCount()
	{
		return totalProduct.size();
	}
	
	
	public void getProductNames()
	{
		System.out.println("Product details");
		for(WebElement i:totalProduct)
		{
			System.out.println(i.getText());
		}
	}
	
	public void addProductToCart(String pname)
	{
		for(WebElement i:totalProduct)
		{
			if(i.getText().contains(pname))
			{
				addBtn.click();
				break;
			}
		}
		
		System.out.println("Product added to cart: "+pname);
		
	}
	
	public CartPage getCartPage()
	{
		cartBtn.click();
		//state--->cart page
		return new CartPage(driver);
		
	}
	
	
	
	
	
	
}
