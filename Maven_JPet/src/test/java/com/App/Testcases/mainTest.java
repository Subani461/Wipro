package com.App.Testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.homePage;
import com.App.PageObjects.mainPage;
import com.App.Utilities.screenShort;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainTest extends screenShort{
	WebDriver driver;
	@Given("user is in the Main Page")
	public void user_is_in_the_Main_Page() throws InterruptedException {
		startReport();
		startTest();
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://petstore.octoperf.com/");
		  Thread.sleep(2000);
	}
	@When("user clicks on the Fish Menu")
	public void user_clicks_on_the_Fish_Menu() throws IOException {
	//	test = extent.startTest("testcase2");
		homePage hp = new homePage(driver);
		hp.enterTheStore();
	    mainPage Main = new mainPage(driver);
	    Main.enterTheFishStore();
	    takeScreenshot(driver);
	    // clicking on the fish menu and proceeding to check out it should navigate to Orders Form.
		  String expURL="https://petstore.octoperf.com/actions/Order.action?newOrderForm=";
		  String actURL=driver.getCurrentUrl();
		  System.out.println(actURL);
		  assertEquals(expURL,actURL);
		  endTest();
	}
	@Then("user reaches the Fish Products Page")
	public void user_reaches_the_Fish_Products_Page() throws InterruptedException {
		Thread.sleep(3000);
		endReport();
	    driver.quit();
	}

}
