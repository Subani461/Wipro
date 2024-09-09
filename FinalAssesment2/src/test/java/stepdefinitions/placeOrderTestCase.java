package stepdefinitions;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.placeOrder;

public class placeOrderTestCase {
	WebDriver driver;
	placeOrder checkoutPage;
	@Given("I am on the checkout page")
	public void i_am_on_the_checkout_page() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
        driver = new ChromeDriver();
        driver.get("https://example.com/");
	}
	@When("I enter the shipping address {string}")
	public void i_enter_the_shipping_address(String string) {
		 checkoutPage.enterShippingAddress(string);
	}

	@When("I place the order")
	public void i_place_the_order() {	 
		  checkoutPage.placeOrdeer();       
	}
	@Then("I should receive an order confirmation with an order ID")
	public void i_should_receive_an_order_confirmation_with_an_order_ID() {
		String orderId = checkoutPage.getOrderId();
        assertNotNull("Order ID should not be null", orderId);
        System.out.println("Order ID: " + orderId);
        driver.quit();
	}

}
