package com.App.Testcases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.addTocart;
import com.App.Utilities.ReportGenerator;
import com.App.Utilities.screenShot;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addToCartTestCase extends ReportGenerator{
	static WebDriver driver;
	WebElement msg;
	boolean flag=false;
	@Given("user on the Home Page")
	public void user_on_the_Home_Page() {
		 startReport();
		  startTest("Add to cartTest");
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
	@When("searches for a product")
	public void searches_for_a_product() {
	   addTocart add = new addTocart(driver);
	   add.searchProducts();
	   add.scrollDown();
	   add.addToCart();
	   msg=driver.findElement(By.xpath("//div[@id='bar-notification']"));
	   flag =msg.isDisplayed();
	   System.out.println(flag);
	   assertFalse(flag);
	}
	@Then("user adds the product to the cart")
	public void user_adds_the_product_to_the_cart() {
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
