package com.App.Testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.valid;
import com.App.Utilities.screenshort;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class validTest extends screenshort{
	WebDriver driver;
	@Given("the user in the Login page")
	public void the_user_in_the_Login_page() throws InterruptedException {
		startReport();
		startTest();
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://demowebshop.tricentis.com/");
		  Thread.sleep(2000);  
	}
	@When("he enters the valid details")
	public void he_enters_the_valid_details() throws IOException {
		valid b = new valid(driver);
		b.clickLogIn();
		b.validLogin();
		String expURL = "https://demowebshop.tricentis.com/";
		  String actURL = driver.getCurrentUrl();
		  assertEquals(expURL,actURL);
		  
	}
	@Then("he reaches the Welcome Page")
	public void he_reaches_the_Welcome_Page() throws InterruptedException, IOException {
		Thread.sleep(2000);
		endTest();
	    driver.quit();
	}
}
