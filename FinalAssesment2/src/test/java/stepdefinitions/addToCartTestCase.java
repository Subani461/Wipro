package stepdefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.addToCart;

public class addToCartTestCase {
	 private WebDriver driver;
	   addToCart add ;
	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
	        driver = new ChromeDriver();
	        driver.get("https://example.com/");
		 add = new addToCart(driver);
	}

	@When("I search for a product with name {string}")
	public void i_search_for_a_product_with_name(String string) {
		  add.searchForProduct(string);
	        add.selectProduct();
	}

	@When("I add the product to the shopping cart")
	public void i_add_the_product_to_the_shopping_cart() {
		  add.addToCartt();
	}

	@Then("the product should be added to the shopping cart successfully")
	public void the_product_should_be_added_to_the_shopping_cart_successfully() {
	     	// Navigate to cart page
		    driver.get("https://example.com/cart"); 
	        assertTrue(add.isProductInCart("FaceWash"));
	        driver.quit();
	}
}
