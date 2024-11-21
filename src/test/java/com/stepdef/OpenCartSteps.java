package com.stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenCartSteps 
{

	WebDriver driver;
@Given("Open opencart register page")
public void open_opencart_register_page() {
   driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
}

@When("User enters required credentials")
public void user_enters_required_credentials(DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    
	List<Map<String,String>> data=dataTable.asMaps();
	driver.findElement(By.id("input-firstname")).sendKeys(data.get(0).get("fname"));
	driver.findElement(By.id("input-lastname")).sendKeys(data.get(0).get("lname"));
	driver.findElement(By.id("input-email")).sendKeys(data.get(0).get("email"));
	driver.findElement(By.id("input-telephone")).sendKeys(data.get(0).get("telephone"));
	driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
	driver.findElement(By.id("input-confirm")).sendKeys(data.get(0).get("cpassword"));
}

@When("User click on yes radio button")
public void user_click_on_yes_radio_button()
{
	driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
	
}

@When("user click privacy policy")
public void user_click_privacy_policy()
{
   driver.findElement(By.name("agree")).click();
}

@When("user click on continue button")
public void user_click_on_continue_button() {
    driver.findElement(By.xpath("//input[@value='Continue']")).click();
}

@Then("User should navigate to account page with success message")
public void user_should_navigate_to_account_page_with_success_message() {

	Assert.assertTrue(driver.getCurrentUrl().contains("success"));
	System.out.println("User registration process is completed!");
}

@Given("Open Opercart login page")
public void open_opercart_login_page() {
    driver=new ChromeDriver();
    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
}

@When("User enter valid credientials")
public void user_enter_valid_credientials(DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.

	List<List<String>> data=dataTable.cells();
	driver.findElement(By.id("input-email")).sendKeys(data.get(0).get(0));
	driver.findElement(By.id("input-password")).sendKeys(data.get(0).get(1));
	
}

@When("user click on cart login button")
public void user_click_on_cart_login_button() {
    driver.findElement(By.xpath("//input[@value='Login']")).click();
}

@Then("User should be navigated to account page")
public void user_should_be_navigated_to_account_page() {
    
	System.out.println(driver.getCurrentUrl());
}




}
