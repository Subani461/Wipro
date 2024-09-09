package com.App.Testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.login;
import com.App.PageObjects.logout;
import com.App.Utilities.ReportGenerator;
import com.App.Utilities.screenShot;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logoutTestCase extends ReportGenerator{
	static WebDriver driver;
	@Given("user is in the Home Page")
	public void user_is_in_the_Home_Page() {
		
		startTest("Logout Test");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://demowebshop.tricentis.com/");
	}
	@When("user clicks on the logout button")
	public void user_clicks_on_the_logout_button() {
	  logout log = new logout(driver);
	 log.clickLogIn();
	 log.validLogin();
	 log.clickSubmit();
	 log.clickLogOut();
	 String expURL="https://demowebshop.tricentis.com/";
	 String actURL=driver.getCurrentUrl();
	 System.out.println(actURL);
	 assertEquals(expURL,actURL);
	}
	@Then("user succesfully logged out from the page")
	public void user_succesfully_logged_out_from_the_page() throws InterruptedException {
	  Thread.sleep(2000);
	  endTest();
	  driver.quit();
	}

}
