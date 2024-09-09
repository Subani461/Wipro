package stepdefinitions;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.trackOrder;

public class trackOrderTestCase {
	WebDriver driver;
	trackOrder orderTrackingPage;
	  String orderStatus;
	@Given("I am on the order tracking page")
	public void i_am_on_the_order_tracking_page() {
	   orderTrackingPage = new trackOrder(driver);
	}
	@When("I enter the order ID {string}")
	public void i_enter_the_order_ID(String string) {
		   orderTrackingPage.enterOrderId(string);
	        orderTrackingPage.trackOrdder();
	}

	@Then("I should see the current status of the order")
	public void i_should_see_the_current_status_of_the_order() {
		 orderStatus = orderTrackingPage.getOrderStatus();
	        assertNotNull("Order status should not be null", orderStatus);
	        System.out.println("Order Status: " + orderStatus);
	        driver.quit();
	}
}
