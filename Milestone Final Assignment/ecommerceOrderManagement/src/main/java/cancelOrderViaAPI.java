import org.apache.hc.client5.http.entity.mime.Header;
import org.openqa.selenium.devtools.v125.network.model.AuthChallengeResponse.Response;

public class cancelOrderViaAPI {
	public void cancelOrderViaAPI(String orderId) {
	    // Set API endpoint and headers
	    String endpoint = "https://example.com/api/orders/" + orderId;
	    Header header = new Header("Authorization", "Bearer YOUR_API_KEY");

	    // Send DELETE request to cancel the order
	    Response response = RestAssured.given()
	            .header(header)
	            .delete(endpoint);

	    // Verify order status is updated to "Cancelled"
	    if (response.getStatusCode() == 200) {
	        JsonPath jsonPath = response.jsonPath();
	        String status = jsonPath.get("status");

	        if (status.equals("Cancelled")) {
	            System.out.println("Order cancelled successfully via API");
	        } else {
	            System.out.println("Failed to cancel order via API");
	        }
	    } else {
	        System.out.println("Failed to cancel order via API");
	    }
	}

}
