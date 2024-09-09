package testCases;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.util.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class placeOrder {
  private WebDriver driver;
  private ECommercePortal eCommercePortal;

  public void PlaceOrderSteps(ECommercePortal eCommercePortal) {
      this.eCommercePortal = eCommercePortal;
      this.driver = eCommercePortal.getDriver();
  }

  @Given("I am on the checkout page")
  public void i_am_on_the_checkout_page() {
      eCommercePortal.navigateToCheckoutPage();
  }

  @When("I enter shipping address")
  public void i_enter_shipping_address() {
      eCommercePortal.enterShippingAddress("address", "city", "state", "zip");
  }

  @When("I place the order")
  public void i_place_the_order() {
      eCommercePortal.placeOrder();
  }

  @Then("the order should be placed successfully")
  public void the_order_should_be_placed_successfully() {
      Assert.assertTrue(eCommercePortal.getOrderStatus().equals("Placed"));
  }
}
