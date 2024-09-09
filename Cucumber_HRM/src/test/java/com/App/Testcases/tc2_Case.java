package com.App.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.tc2_Background;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc2_Case {
	WebDriver driver;
	@When("he enters the in valid details")
	public void he_enters_the_in_valid_details() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://demowebshop.tricentis.com/");
		  driver.findElement(By.linkText("Log in")).click();
		  Thread.sleep(2000);  
	     tc2_Background B = new tc2_Background(driver);
	     B.inValidLogin();
	}
	@Then("he reaches the Error Page")
	public void he_reaches_the_Error_Page() throws InterruptedException {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
