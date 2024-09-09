import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class laceOrderAndVerify {
	
	WebDriver driver;
	public String placeOrderAndVerify(String shippingAddress) {
	    // Navigate to the checkout page
	    driver.get("https://example.com/checkout");

	    // Enter shipping address
	    driver.findElement(By.name("shippingAddress")).sendKeys(shippingAddress);

	    // Click the place order button
	    driver.findElement(By.name("placeOrder")).click();

	    // Verify order confirmation
	    if (driver.getTitle().contains("Order Confirmation")) {
	        String orderId = driver.findElement(By.name("orderId")).getText();
	        System.out.println("Order placed successfully with ID: " + orderId);
	        return orderId;
	    } else {
	        System.out.println("Order placement failed");
	        return null;
	    }
	}


}
