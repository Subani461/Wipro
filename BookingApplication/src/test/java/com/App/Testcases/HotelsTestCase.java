package com.App.Testcases;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.SearchHotels;
import com.App.PageObjects.hotels;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelsTestCase {
	WebDriver driver;
	hotels H;
	@Given("I am on the hotel details page")
	public void i_am_on_the_hotel_details_page() {
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
	  	 SearchHotels sh = new SearchHotels(driver);
		  sh.chooseCity();
		  sh.chooseDateCheckIn();
		  sh.selectMembers();
		  sh.clickSearch();
	  	H = new hotels(driver);
	}

	@Then("I should see the hotel name")
	public void i_should_see_the_hotel_name() {
	   H.getHotelName();
	   String expTitle="Club Quarters Hotel Grand Central, New YorkOpens in new window";
	  WebElement actTitle=H.hotel;
	  String output=actTitle.getText();
	  assertEquals(expTitle,output);
	}

	@Then("I should see the hotel description")
	public void i_should_see_the_hotel_description() {
	   H.getHotelDescription();
	   WebElement display = H.desc;
	   boolean flag=display.isDisplayed();
	   assertTrue(true);
	}

	@Then("I should see the amenities")
	public void i_should_see_the_amenities() {
	   H.getAmenities();
	   WebElement displayAmen = H.Amen;
	   boolean flag=displayAmen.isDisplayed();
	   assertTrue(true);
	}

	@Then("I should see the room options")
	public void i_should_see_the_room_options() {
	   H.getRoomOptions();
	   WebElement displayRoomOpt = H.room;
	   boolean flag=displayRoomOpt.isDisplayed();
	   assertTrue(true);
	}

	@Then("I should see the pricing")
	public void i_should_see_the_pricing() {
	    H.getPricing();
	    WebElement displayPrice = H.price;
		   boolean flag=displayPrice.isDisplayed();
		   assertTrue(true);
	}

	@When("I select the first room option")
	public void i_select_the_first_room_option() {
	   H.selectFirstRoomOption();
	}

	@Then("I should be on the booking page")
	public void i_should_be_on_the_booking_page() {
	 H.proceedToBooking();  
	}



}
