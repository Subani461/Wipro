package com.App.Testcases;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.App.PageObjects.SearchHotels;
import com.App.PageObjects.filter;
import com.App.PageObjects.filtersByTwo;
import com.App.Utilities.ReportGenerator;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class filtersByTwoTestcase extends ReportGenerator {
	WebDriver driver;
	boolean flag=false;
	filtersByTwo fb;
	@Given("I am on the Booking.com homepage to search")
	public void i_am_on_the_Booking_com_homepage_to_search() throws InterruptedException {
		startTest("Filters2Test");
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   	  driver = new ChromeDriver();
	   	  driver.get("https://www.booking.com/");
	   	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   	try {
	   	 WebElement close = driver.findElement(By.xpath("//button[@aria-label='Dismiss sign in information.']"));
	   	  close.click();
	   	  }
	   	 catch(Exception e) {
	   		 e.printStackTrace();
	   	 }
	     fb=new filtersByTwo(driver);
	}

	@When("I filter results by {string} and {string}")
	public void i_filter_results_by_and(String string, String string2) throws InterruptedException {
		SearchHotels sh = new SearchHotels(driver);
		  sh.chooseCity();
		  sh.chooseDateCheckIn();
		  sh.selectMembers();
		  sh.clickSearch();
		  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			try {
			   	 WebElement close = driver.findElement(By.xpath("//button[@aria-label='Dismiss sign in information.']"));
			   	  close.click();
			   	  }
			   	 catch(Exception e) {
			   		 e.printStackTrace();
			   	 }
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0, 1000);");
	      driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		  fb.setProperty(string,string2);
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  WebElement btn = driver.findElement(By.xpath("//label[@class='f202e3a5e2 ad5ce5024d b9f6310879']"));
			 flag= btn.isDisplayed();
			 System.out.println(flag);
			 assertTrue(flag);
	}

	@Then("I should see results sorted by depending upon properties")
	public void i_should_see_results_sorted_by_depending_upon_properties() {
		endTest();
	   driver.quit();
	}
}
