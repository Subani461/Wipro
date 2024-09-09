package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@SuppressWarnings("unused")
public class API2 {
    private String orderId;
    private Response apiResponse;
    private WebDriver driver;

    @Given("I have an order ID {string}")
    public void i_have_an_order_id(String orderId) {
        this.orderId = orderId;
    }

    @When("I cancel the order via API")
    public void i_cancel_the_order_via_api() {
        apiResponse = RestAssured
            .given()
            .when()
            .delete("/api/orders/" + orderId);
    }

    @Then("the order status should be updated to {string}")
    public void the_order_status_should_be_updated_to(String expectedStatus) {
        assertThat(apiResponse.getStatusCode(), equalTo(200));
        assertThat(apiResponse.getBody().asString(), containsString("has been cancelled"));
    }
}