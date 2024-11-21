package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSteps 
{

	WebDriver driver;
	String title;
@Given("Open amazon appliication")
public void open_amazon_appliication() {
    
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
}

@When("User get the title of home page")
public void user_get_the_title_of_home_page() {
   title=driver.getTitle();
}

@Then("title should match to homepage")
public void title_should_match_to_homepage() {
   Assert.assertTrue(title.contains("India"));
   System.out.println("Title matched!");
}

@When("user open Sell page")
public void user_open_sell_page() {
    driver.findElement(By.linkText("Sell")).click();
    
}

@When("user get the title of sell page")
public void user_get_the_title_of_sell_page() {

title=driver.getTitle();
}

@Then("title of sell page should match")
public void title_of_sell_page_should_match() {
	Assert.assertTrue(title.contains("Categories"));
	   System.out.println("Title matched!");
}

@When("user open Mobile page")
public void user_open_mobile_page() {
   driver.findElement(By.linkText("Mobiles")).click();
}

@When("user get the title of Mobile page")
public void user_get_the_title_of_mobile_page() {
    title=driver.getTitle();}

@Then("title of Mobile page should match")
public void title_of_mobile_page_should_match() {
	Assert.assertTrue(title.contains("Phones"));
	   System.out.println("Title matched!");
}


}
