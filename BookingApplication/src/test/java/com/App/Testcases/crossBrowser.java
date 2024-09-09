 package com.App.Testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.App.Utilities.ReportGenerator;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class crossBrowser extends ReportGenerator {
	WebDriver driver;
	@Given("I am on the Booking.com homepage using {string}")
	public void i_am_on_the_Booking_com_homepage_using(String string) {
		
		startTest("BrowserTest");
		 switch (string) {
         case "Chrome":
        	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
             driver = new ChromeDriver();
             break;
         case "Edge":
        	 System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
             driver = new EdgeDriver();
             break;
         default:
             throw new RuntimeException("Unsupported browser: " + string);
     }
     driver.get("https://www.booking.com/");
     try {
	   	 WebElement close = driver.findElement(By.xpath("//button[@aria-label='Dismiss sign in information.']"));
	   	  close.click();
	  }
	   	 catch(Exception e) {
	   		 e.printStackTrace();
	   	 }
	}
	@Then("the title should contain Booking for {string}")
	public void the_title_should_contain_Booking_for(String string) {
		String expValue = "Booking.com | Official site | The best hotels, flights, car rentals & accommodations";
		String actValue=driver.getTitle();
		assertEquals(expValue,actValue);
		endTest();
		driver.quit();
	}
}
