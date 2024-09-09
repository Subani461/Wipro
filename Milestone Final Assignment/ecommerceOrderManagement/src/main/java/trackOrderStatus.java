import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class trackOrderStatus {
	WebDriver driver;
	public String trackOrderStatus(String orderId) {
	    // Navigate to the order tracking page
	    driver.get("https://example.com/track-order");

	    // Enter order ID
	    driver.findElement(By.name("orderId")).sendKeys(orderId);

	    // Click the track button
	    driver.findElement(By.name("track")).click();

	    // Get the current order status
	    String status = driver.findElement(By.name("status")).getText();
	    System.out.println("Current order status: " + status);
	    return status;
	}
}
