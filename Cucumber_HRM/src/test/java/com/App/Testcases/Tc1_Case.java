package com.App.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.tc1_background;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tc1_Case {
	WebDriver driver;
	@Given("the user in the Login page")
	public void the_user_in_the_Login_page() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://demowebshop.tricentis.com/");
		  Thread.sleep(2000);  
	}
	@When("he enters the valid details")
	public void he_enters_the_valid_details() {
		tc1_background b = new tc1_background(driver);
		b.clickLogIn();
		b.validLogin();
	}
	@Then("he reaches the Welcome Page")
	public void he_reaches_the_Welcome_Page() throws InterruptedException {
		Thread.sleep(3000);
	    driver.quit();
	}
}
