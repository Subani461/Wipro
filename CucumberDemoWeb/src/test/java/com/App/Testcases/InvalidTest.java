package com.App.Testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.invalid;
import com.App.Utilities.screenshort;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidTest extends screenshort{
	WebDriver driver;
	@When("he enters the in valid details")
	public void he_enters_the_in_valid_details() throws InterruptedException, IOException {
		startTest();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://demowebshop.tricentis.com/");
		  driver.findElement(By.linkText("Log in")).click();
		  Thread.sleep(2000);  
	     invalid B = new invalid(driver);
	     B.inValidLogin();
	     String expURL = "https://demowebshop.tricentis.com/";
		  String actURL = driver.getCurrentUrl();
		  assertEquals(expURL,actURL);
	}
	@Then("he reaches the Error Page")
	public void he_reaches_the_Error_Page() throws InterruptedException, IOException {
	    Thread.sleep(1000);
	    endTest();
	    endReport();
	    driver.quit();
	}
}
