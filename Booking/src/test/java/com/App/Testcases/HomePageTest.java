package com.App.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.App.PageObjects.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTest {
	 WebDriver driver;
	 HomePage homePage = new HomePage(driver);
	@Given("I am on the Booking.com home page")
	public void i_am_on_the_Booking_com_home_page() {
	   System.out.println("Home Page");
	   driver = new ChromeDriver();
	   driver.get("https://www.booking.com/index.en-gb.html?aid=2336991&label=en-in-booking-desktop-85ChbC6BoxWCPoWhZY2zgAS652735320688%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-98299850%3Alp9300377%3Ali%3Adec%3Adm&gclid=EAIaIQobChMIqZmhmZyXiAMVY6tmAh0vmQ1KEAAYAiAAEgIIwPD_BwE&auth_success=1");
	}
	@When("I search for {string} with check-in date {string} and check-out date {string} and {int} guests")
	public void i_search_for_with_check_in_date_and_check_out_date_and_guests(String destination, String checkIn, String checkOut, Integer guests) {
		  homePage.enterSearchCriteria(destination, checkIn, checkOut, guests);
	}
	@Then("I should see search results for {string}")
	public void i_should_see_search_results_for(String destination) {
		 Assert.assertTrue(driver.getCurrentUrl().contains(destination));
	}
	@Then("the promotional banners should be visible")
	public void the_promotional_banners_should_be_visible() {
		   Assert.assertTrue(homePage.isPromotionalBannersVisible());
	}
}
