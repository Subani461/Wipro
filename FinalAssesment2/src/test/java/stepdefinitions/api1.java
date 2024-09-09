package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class api1 {
    private String orderId;
    private Response apiResponse;

    @Given("I have an order ID {string}")
    public void i_have_an_order_id(String orderId) {
        this.orderId = orderId;
    }

    @When("I retrieve the order details via API")
    public void i_retrieve_the_order_details_via_api() {
        apiResponse = RestAssured
            .given()
            .when()
            .get("/api/orders/" + orderId + "/details");
    }

    @Then("the order details should match the UI")
    public void the_order_details_should_match_the_ui() {
       
        String expectedItemName = "Laptop";
        int expectedQuantity = 1;
        double expectedTotalAmount = 1200.00;

       
        assertThat(apiResponse.getStatusCode(), equalTo(200));
        assertThat(apiResponse.jsonPath().getString("orderId"), equalTo(orderId));
        assertThat(apiResponse.jsonPath().getString("itemName"), equalTo(expectedItemName));
        assertThat(apiResponse.jsonPath().getInt("quantity"), equalTo(expectedQuantity));
        assertThat(apiResponse.jsonPath().getDouble("totalAmount"), closeTo(expectedTotalAmount, 0.01));
    }
}

