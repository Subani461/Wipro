//Name: Bhagyasri
//Date: 04/09/2024
package com.airline.stepdefinitions;

import com.airline.pages.LoginPage;
import com.airline.pages.FlightSearchPage;
import com.airline.pages.BookingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class BookingSteps {

    WebDriver driver;
    LoginPage loginPage;
    FlightSearchPage searchPage;
    BookingPage bookingPage;
    private String bookingReference;

    @Given("User is logged in with username {string} and password {string}")
    public void user_is_logged_in_with_username_and_password(String username, String password) {
    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.get("https://airline.com/login");
        loginPage.loginToAirlinePortal(username, password);
    }

    @When("User searches for a flight from {string} to {string} on {string}")
    public void user_searches_for_a_flight(String origin, String destination, String departureDate) {
        searchPage = new FlightSearchPage(driver);
        searchPage.searchFlight(origin, destination, departureDate);
    }

    @When("User books flight {string} with passenger {string} in {string} class")
    public void user_books_flight(String flightNumber, String passengerName, String seatClass) {
        bookingPage = new BookingPage(driver);
        bookingReference = bookingPage.bookFlight(flightNumber, passengerName, seatClass);
    }

    @Then("The booking reference is displayed and details are correct")
    public void the_booking_reference_is_displayed() {
        assertEquals("The booking reference should not be null or empty", true, bookingReference != null && !bookingReference.isEmpty());
        
        driver.quit();
    }
}