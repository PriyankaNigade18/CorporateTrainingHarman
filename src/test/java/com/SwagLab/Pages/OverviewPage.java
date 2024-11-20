package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage
{

	WebDriver driver;
	
	public OverviewPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class='summary_info']")
	WebElement summary;
	
	@FindBy(id="finish")
	WebElement finishBtn;
	
	@FindBy(tagName="h2")
	WebElement msg;
	
	
	public String getSummary()
	{
		return summary.getText();
	}
	
	public void doFinish()
	{
		finishBtn.click();
		System.out.println(msg.getText());
	}
	
}
