package com.App.Testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.homePage;
import com.App.Utilities.screenShort;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homeTest extends screenShort{
	WebDriver driver;
	@Given("user is in the Home Page")
	public void user_is_in_the_Home_Page() throws InterruptedException, IOException {
		  startReport();
		  startTest();
	      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://petstore.octoperf.com/");
		  takeScreenshot(driver);
		  Thread.sleep(2000);  
	}
	@When("user clicks on the Enter the store link")
	public void user_clicks_on_the_Enter_the_store_link() throws IOException {
	  homePage home = new homePage(driver);
	  home.enterTheStore();
	  takeScreenshot(driver);
	  // Verifying the store link navigating to the expected pare or not
	  String expURL="https://petstore.octoperf.com/actions/Catalog.action";
	  String actURL=driver.getCurrentUrl();
	  System.out.println(actURL);
	  assertEquals(expURL,actURL);
	  endTest();
	}
	@Then("user reaches the Main Page")
	public void user_reaches_the_Main_Page() throws InterruptedException {
		Thread.sleep(3000);
		endReport();
	    driver.quit();
	}

}
