package com.App.Testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.login;
import com.App.Utilities.ReportGenerator;
import com.App.Utilities.screenShot;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginTestCase extends ReportGenerator{
	static WebDriver driver;
	@Given("the user is in the login page with multiple data")
	public void the_user_is_in_the_login_page_with_multiple_data() {
		 
		  startTest("Log In Test");
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://demowebshop.tricentis.com/");
	}
	@When("he enters {string} and {string}")
	public void he_enters_and(String Email, String Password) {
	   login L = new login(driver);
	   L.setUp();
	   L.setEmail(Email);
	   L.setPassword(Password);
	   L.clickSubmit();
	  String expURL = "https://demowebshop.tricentis.com/";
	  String actURL = driver.getCurrentUrl();
	  System.out.println(actURL);
	  assertEquals(expURL,actURL,"Login Failed");
	   endTest();
	}
	@Then("he reaches the HOME Page for every input")
	public void he_reaches_the_HOME_Page_for_every_input() throws InterruptedException {
	   Thread.sleep(2000);
	   endTest();
	   driver.quit();
	}
}
