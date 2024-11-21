package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.Hooks.CrmHooks;
import com.Utility.BrowserProvider;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CrmSteps //extends CrmHooks
{

	WebDriver driver=BrowserProvider.getDriver();
	
//	@Before
//	public void setUp()
//	{
//		System.out.println("Driver session started!.....");
//		driver=new ChromeDriver();
//		
//	}
//	@After
//	public void teardown()
//	{
//		System.out.println("Driver session closed!");
//		driver.quit();
//	}
@Given("open crm application using {string}")
public void open_crm_application_using(String string) {
    
	//driver=new ChromeDriver();
	driver.get("https://automationplayground.com/crm/");
}

@When("User click on SignIn link")
public void user_click_on_sign_in_link() {
    driver.findElement(By.linkText("Sign In")).click();
    
}

@Then("User should navigate to login page")
public void user_should_navigate_to_login_page() {
    Assert.assertTrue(driver.getCurrentUrl().contains("login"));
    System.out.println("Login page open!");
}

@When("user enter valid email and password")
public void user_enter_valid_email_and_password() {
	 driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	driver.findElement(By.id("password")).sendKeys("test123");
}

@When("user click on submit button")
public void user_click_on_submit_button() {
    driver.findElement(By.id("submit-id")).click();
}

@Then("user should navigate to customers page")
public void user_should_navigate_to_customers_page() {
	Assert.assertTrue(driver.getCurrentUrl().contains("customers"));
    System.out.println("Login Success!");
}


}
