package com.stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class HrmSteps {

	WebDriver driver;
	@Given("Open Hrm application")
	public void open_hrm_application() {
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("user enter {string} and enter {string}")
	public void user_enter_and_enter(String un, String psw) {
	
		//username
				driver.findElement(By.name("username")).sendKeys(un);
				
				//password
				driver.findElement(By.name("password")).sendKeys(psw);
	}

	@When("User click on hrm login button")
	public void user_click_on_hrm_login_button() {

		//login
		driver.findElement(By.className("oxd-button")).click();;
	}

	@Then("as per valid credentials user should be login")
	public void as_per_valid_credentials_user_should_be_login() {

		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail!");
		System.out.println("Login Success!");
	}


}
