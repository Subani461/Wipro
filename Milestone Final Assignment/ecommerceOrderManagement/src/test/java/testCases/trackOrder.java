package testCases;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.util.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class trackOrder {
	private WebDriver driver;
	private ECommercePortal eCommercePortal;

	public void TrackOrderStatusSteps(ECommercePortal eCommercePortal) {
		this.eCommercePortal = eCommercePortal;
		this.driver = eCommercePortal.getDriver();
	}

	@Given("I have a valid order ID")
	public void i_have_a_valid_order_id() {
		eCommercePortal.setID("ORDER1123");
	}

	@When("I navigate to the order tracking page")
	public void i_navigate_to_the_order_tracking_page() {
		eCommercePortal.navigateToOrderTrackingPage();
	}

	@Then("the order status should be displayed correctly")
	public void the_order_status_should_be_displayed_correctly() {
		String orderStatus = eCommercePortal.getOrderStatus();
		assertNotNull(orderStatus);
		assertTrue(orderStatus.equals("Shipped") || orderStatus.equals("Delivered") || orderStatus.equals("Cancelled"));
	}
}