package stepdefinitions;

import static org.testng.Assert.assertFalse;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.viewCart;

public class viewCartTestCase {
	   WebDriver driver;
	     viewCart cartPage;
	@Given("I am on the shopping cart page")
	public void i_am_on_the_shopping_cart_page() {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
	        driver = new ChromeDriver();
	        driver.get("https://example.com/login");
		  cartPage = new viewCart(driver);
	}

	@Then("I should see a list of products in the cart with their quantities")
	public void i_should_see_a_list_of_products_in_the_cart_with_their_quantities() {
		 Map<String, Integer> cartItems = cartPage.getCartItems(); 
		 assertFalse(cartItems.isEmpty()); 
		 // Print out the cart items Here 
		 System.out.println("Products in the cart:"); 
		 for (Map.Entry<String, Integer> entry : cartItems.entrySet()) { 
			 System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue());
	     } 
		 driver.quit();
	}
}
