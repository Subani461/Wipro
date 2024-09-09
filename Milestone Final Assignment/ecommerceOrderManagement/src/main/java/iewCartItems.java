import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iewCartItems{
static WebDriver driver;

	public static Map<String, Integer> viewCartItems() {
		// Navigate to the cart page
		try {
			driver.get("https://example.com/cart");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Find all products in the cart
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='cart-item']"));

		// Create a map to store product names and quantities
		Map<String, Integer> cartItems = new HashMap<>();

		// Iterate through each product and extract name and quantity
		for (WebElement product : products) {
			String productName = product.findElement(By.name("productName")).getText();
			int quantity = Integer.parseInt(product.findElement(By.name("quantity")).getText());
			cartItems.put(productName, quantity);
		}

		return cartItems;
	}

}
