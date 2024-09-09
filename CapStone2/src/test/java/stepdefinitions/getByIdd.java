package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

import groovyjarjarantlr.collections.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ReportGenerator;

public class getByIdd extends ReportGenerator{
	private static final String BASE_URL="https://jsonplaceholder.typicode.com/";
    Response response;
    RequestSpecification request;
    String output;
    @Test
    @Given("the user having the  REST API endpoint")
    public void the_user_having_the_REST_API_endpoint() {
    	startTest("GetByID Method");
    	  System.out.println("Home Page");
	 	    RestAssured.baseURI=BASE_URL;
	 	    request = RestAssured.given();
    }

    @When("I send a GET request to the endpoint with {string}")
    public void i_send_a_GET_request_to_the_endpoint_with(String string) {
    	System.out.println("Retrive the user information by ID : ");
	    response =request.get("/posts/" + string);
    }

    @Then("the response status code wil be as {int}")
    public void the_response_status_code_wil_be_as(Integer int1) {
    	int statusCode = response.getStatusCode();
 	    int expStatusCode=int1;
	   	assertEquals(expStatusCode,statusCode);
    }

    @Then("the response content type will be as {string}")
    public void the_response_content_type_will_be_as(String string) {
    	 output=response.asString();
	 	   	System.out.println(output);
    }

    @Then("the response should contain user data with ID {int}")
    public void the_response_should_contain_user_data_with_ID(Integer int1) {
    	 // Extract user data from the response
        @SuppressWarnings("unused")
		Integer actualUserId = response.jsonPath().getInt("userId");
        Integer actualId = response.jsonPath().getInt("id");
        String actualTitle = response.jsonPath().getString("title");
        String actualBody = response.jsonPath().getString("body");
        
        // Define expected values
        Integer expectedId = 1; // Example ID
        String expectedTitle = "sunt aut facere repellat provident occaecati excepturi optio reprehenderit"; // Example title
        String expectedBody = "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum"; 
        endTest();
    }
}
