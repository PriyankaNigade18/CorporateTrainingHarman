package com.stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleSteps
{
	WebDriver driver;
	String actTitle;
	@Given("Open Google application")
	public void open_google_application()
	{
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://www.google.com");
	}

	@When("I get the current page title")
	public void i_get_the_current_page_title()
	{
	    actTitle=driver.getTitle();
	}

	@Then("title should match to Google")
	public void title_should_match_to_google() 
	{
	    Assert.assertEquals(actTitle,"Google","Title not matched...Test Fail");
	    System.out.println("Title matched...Test pass");
	    
		
	}

	@When("I enter {string} in google search")
	
	public void i_enter_in_google_search(String keyword)
	{
	    driver.findElement(By.id("APjFqb")).sendKeys(keyword);
	}

	@Then("I should get valid search result")
	public void i_should_get_valid_search_result()
	{
		List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	    System.out.println("Total Options are: "+list.size());
	    
	    for(WebElement i:list)
	    {
	    	System.out.println(i.getText());
	    }
	}


}
