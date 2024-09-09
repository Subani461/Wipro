package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;

public class put {

    RequestSpecification request;
    Response response;

    @Given("I open the API to update the details")
    public void i_open_the_API_to_update_the_details() {
        RestAssured.baseURI = "https://dummy.restapiexample.com/"; // Replace with your actual base URL
        request = RestAssured.given();
    }

    @When("user provides a valid ID of {int}")
    public void user_provides_a_valid_ID_of(Integer int1) {
        HashMap<String, Object> updatedDetails = new HashMap<>();
        updatedDetails.put("name", "Asifkhan");
        updatedDetails.put("salary", 25000);
        updatedDetails.put("age", 24);

        response = request.header("Content-Type", "application/json")
                          .body(updatedDetails)
                          .put("/api/v1/update/" + int1);
    }

    @Then("the response status will be displayed after completion")
    public void the_response_status_will_be_displayed_after_completion() {
        System.out.println("The Details are: ");
        String output = response.getBody().asString();
        System.out.println(output);

        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);
        
        int expStatusCode=429;
	   	System.out.println(statusCode);
	   	assertEquals(expStatusCode,statusCode);
    }
}