package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class put {

    private RequestSpecification request;
    private Response response;

    @Given("I open the API to update the details")
    public void i_open_the_API_to_update_the_details() {
        RestAssured.baseURI = "https://petstore.swagger.io/#/pet/"; // Replace with your actual base URL
        request = RestAssured.given();
    }

    @When("user provides a valid ID of {int}, name {string}, status {string}")
    public void user_provides_a_valid_ID_of_and_name_status(Integer id, String name, String status) {
        // Create a HashMap with the updated details
        HashMap<String, Object> updatedDetails = new HashMap<>();
        updatedDetails.put("name", "PersianCat");
        updatedDetails.put("status", "SOLD");

        // Perform the PUT request
        response = request.header("Content-Type", "application/json")
                          .body(updatedDetails)
                          .put("/pet/" + id); // Adjust the endpoint if necessary
    }

    @Then("the response status code should be displayed")
    public void the_response_status_code_should_be_displayed() {
        // Print the response status code
        int statusCode = response.getStatusCode();
        System.out.println("Response Status Code: " + statusCode);
    }
}