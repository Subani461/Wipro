
import org.apache.hc.client5.http.entity.mime.Header;
import org.jsoup.Connection.Response;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.json.Json;

public class verifyOrderViaAPI {
	WebDriver driver;
	public void verifyOrderViaAPI(String orderId) {
	    // Set API endpoint and headers
	    String endpoint = "https://example.com/api/orders/" + orderId;
	    Header header = new Header("Authorization", "Bearer YOUR_API_KEY");

	    // Send GET request to retrieve order details
	    Response response = RestAssured.given()
	            .header(header)
	            .get(endpoint);

	    // Verify order details match UI
	    if (response.statusCode() == 200) {
	        Json jsonPath = ((Object) response).jsonPath();
	        String productName = ((WebDriver) jsonPath).get("items[0].productName");
	        int quantity = jsonPath.get("items[0].quantity");
	        double totalAmount = jsonPath.get("totalAmount");

	        // Compare with UI values
	        Map<String, Integer> cartItems = iewCartItems.viewCartItems();
	        assertTrue(cartItems.containsKey(productName));
	        assertEquals(cartItems.get(productName), quantity);

	        // Get the total amount from the UI
	        double uiTotalAmount = getTotalAmountFromUI();
	        assertEquals(uiTotalAmount, totalAmount, 0.01);

	        System.out.println("Order details verified successfully via API");
	    } else {
	        System.out.println("Failed to verify order details via API");
	    }
	}

	// Helper method to get the total amount from the UI
	private double getTotalAmountFromUI() {
	    // Navigate to the order summary page
	    driver.get("https://example.com/order-summary");

	    // Get the total amount from the UI
	    String totalAmountText = driver.findElement(By.name("totalAmount")).getText();
	    return Double.parseDouble(totalAmountText.replace("$", ""));
	}



}
