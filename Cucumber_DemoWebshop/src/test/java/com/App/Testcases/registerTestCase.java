package com.App.Testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.register;
import com.App.Utilities.ReportGenerator;
import com.App.Utilities.screenShot;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerTestCase extends ReportGenerator{
	static WebDriver driver;
	@Given("user is in the Home Page to enter details")
	public void user_is_in_the_Home_Page_to_enter_details()  {
		  startTest("RegisterTest");
	      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://demowebshop.tricentis.com/");
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
	@When("user enters the valid details")
	public void user_enters_the_valid_details() {
	   register r = new register(driver);
	   r.clickRegister();
	   r.registerDetails();
	   r.submit();
	   String expURL = "https://demowebshop.tricentis.com/register";
	   String actURL = driver.getCurrentUrl();
	   System.out.println(actURL);
	   assertEquals(expURL,actURL);
	}
	@Then("user succesfully registererd")
	public void user_succesfully_registererd() {
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    endTest();
	    driver.quit();
	}
}
