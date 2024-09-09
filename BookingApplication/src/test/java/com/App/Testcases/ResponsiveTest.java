package com.App.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.App.Utilities.ReportGenerator;
import com.App.Utilities.screenshots;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ResponsiveTest extends ReportGenerator{
	WebDriver driver;
	boolean flag=false;
	@Given("I am on the Booking.com Home Page")
	public void i_am_on_the_Booking_com_Home_Page() {
		startTest("ResponseTest");
		 
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    	  driver = new ChromeDriver();
	}
	@When("I resize the browser to different sizes")
	public void i_resize_the_browser_to_different_sizes() {
		 int[][] viewports = {
		            {360, 640},   // Mobile screen size
		            {768, 1024},  // Tablet screen size
		            {1024, 768},  // Small desktop screen size
		            {1920, 1080}  // Large desktop screen size
		        };

		        // URL of the application to test
		        String url = "https://www.booking.com/";
		        try {
		   	   	 WebElement close = driver.findElement(By.xpath("//button[@aria-label='Dismiss sign in information.']"));
		   	   	  close.click();
		   	  }
		   	   	 catch(Exception e) {
		   	   		 e.printStackTrace();
		   	   	 }
		for (int[] viewport : viewports) {
            int width = viewport[0];
            int height = viewport[1];
            
            try {
                // Resize the browser window
                driver.manage().window().setSize(new Dimension(width, height));
                WebDriverWait wait = new WebDriverWait(driver,15);
                driver.get(url);
                //Assertions
                WebElement search=driver.findElement(By.xpath("//input[@aria-label='Where are you going?']"));
                flag=search.isDisplayed();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
		System.out.println(flag);
		assertTrue(flag);
	}
	@Then("layout should be as expected")
	public void layout_should_be_as_expected() {
		endTest();
		
	   driver.quit();
	}
}
