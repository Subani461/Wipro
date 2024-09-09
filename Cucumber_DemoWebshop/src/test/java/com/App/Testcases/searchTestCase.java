package com.App.Testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.search;
import com.App.Utilities.ReportGenerator;
import com.App.Utilities.screenShot;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchTestCase extends ReportGenerator {
	static WebDriver driver;
	boolean flg=false;
	@Given("User on the Home Page")
	public void user_on_the_Home_Page() {
		//startReport();
		startTest("searchTest");
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://demowebshop.tricentis.com/");
	}
	@When("user enters the product name")
	public void user_enters_the_product_name() throws IOException {
	 search S = new search(driver);
	 S.searchProduct();
	 S.clickSearch();
	WebElement message=driver.findElement(By.xpath("//div[@class='product-selectors']"));
	boolean flag= message.isDisplayed();
	System.out.println(flag);
	assertTrue(flag);
	 endTest();
	}
	@Then("items listed to product search")
	public void items_listed_to_product_search() throws InterruptedException {
	  Thread.sleep(2000);
	  endTest();
	  endReport();
	  driver.quit();
	}

}
