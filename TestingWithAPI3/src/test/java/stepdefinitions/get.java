package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class get {
	private static final String BASE_URL="https://petstore.swagger.io/v2";
    Response response;
    RequestSpecification request;
    String output;
	@Given("I open the API to retrive the details")
	public void i_open_the_API_to_retrive_the_details() {
		 System.out.println("Home Page");
	 	    RestAssured.baseURI=BASE_URL;
	 	    request = RestAssured.given();
	}

	@When("I provide a valid ID of {int}")
	public void i_provide_a_valid_ID_of(Integer int1) {
		System.out.println("Retrive the user information by ID : ");
	    response =request.get("pet/" + int1);
	}

	@Then("the response status will be displayed")
	public void the_response_status_will_be_displayed() {
		 System.out.println("The Details are : ");
	 	    output=response.asString();
	 	   	System.out.println(output);
	 	   	int statusCode = response.getStatusCode();
	 	   	System.out.println(statusCode);
	}
}
