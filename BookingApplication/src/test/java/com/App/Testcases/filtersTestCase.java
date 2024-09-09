package com.App.Testcases;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.App.PageObjects.SearchHotels;
import com.App.PageObjects.filter;
import com.App.Utilities.ReportGenerator;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class filtersTestCase {
	WebDriver driver;
	boolean flag=false;
	filter p ;
	@Given("I am on the Booking.com homepage")
	public void i_am_on_the_Booking_com_homepage() throws InterruptedException {
		/* extends ReportGenerator 
		startTest("FilterTest"); */
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
	     p=new filter(driver);
	}
	@When("I filter results by {string}")
	public void i_filter_results_by(String string) throws InterruptedException {
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
	      driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  p.setProperty(string);
		  driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		  WebElement btn = driver.findElement(By.xpath("//label[@class='faefc93c6f c21e900fd3 c737ebb2b7']"));
		 flag= btn.isDisplayed();
		 System.out.println(flag);
		 assertTrue(flag);
	}
	@Then("I should see results sorted by property")
	public void i_should_see_results_sorted_by_property() throws InterruptedException {
	//endTest();
	   driver.quit();
	}

}
