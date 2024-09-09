package testCases;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.util.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	//Assuming Portal as EcommercePortal
	  private WebDriver driver;
	  private ECommercePortal eCommercePortal;

	  public void AddProductToCartSteps(ECommercePortal eCommercePortal) {
	      this.eCommercePortal = eCommercePortal;
	      this.driver = eCommercePortal.getDriver();
	  }

	  @Given("I am logged in")
	  public void i_am_logged_in() {
	      // Assume login is successful
	  }

	  @When("I search for a product")
	  public void i_search_for_a_product() {
	      eCommercePortal.searchForProduct("productName");
	  }

	  @When("I add the product to the cart")
	  public void i_add_the_product_to_the_cart() {
	      eCommercePortal.addProductToCart("productName");
	  }

	  @Then("the product should be added to the cart successfully")
	  public void the_product_should_be_added_to_the_cart_successfully() {
	      Map<String, Integer> cartItems = eCommercePortal.viewCartItems();
	      assertTrue(cartItems.containsKey("productName"));
	  }
	}
