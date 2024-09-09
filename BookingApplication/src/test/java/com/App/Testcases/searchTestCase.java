package com.App.Testcases;

import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.App.PageObjects.SearchHotels;
import com.App.PageObjects.register;
import com.App.Utilities.ReportGenerator;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchTestCase  extends ReportGenerator  {
	WebDriver driver;
	boolean flag=false;
	 SearchHotels S;
	 @Test(priority=3)
	@Given("I am on the Booking.com home page")
	public void i_am_on_the_Booking_com_home_page() throws InterruptedException {
		
		startTest("SearchTest");
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
   	  driver = new ChromeDriver();
   	  driver.get("https://www.booking.com/");
   	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
  	try {
	   	 WebElement close = driver.findElement(By.xpath("//button[@aria-label='Dismiss sign in information.']"));
	   	  close.click();
	   	  }
	   	 catch(Exception e) {
	   		 e.printStackTrace();
	   	 }
       S = new SearchHotels(driver);
	}
	@When("I search for New York in my Feasable dates  with family")
	public void i_search_for_New_York_in_my_Feasable_dates_with_family() throws InterruptedException {
	   S.chooseCity();
	   S.chooseDateCheckIn();
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   S.selectMembers();
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   S.clickSearch();
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@Then("I should see search results for \"New York")
	public void i_should_see_search_results_for_New_York() {
		// (//div[@class='caa83e2398'])[1]
	   WebElement box = driver.findElement(By.xpath("(//div[@class='af5895d4b2'])[1]"));
	  flag= box.isDisplayed();
	  assertTrue(flag);
	}
	@Then("the promotional banners should be visible")
	public void the_promotional_banners_should_be_visible() {
		endTest();
		endReport();
	   driver.quit();
	}
}
