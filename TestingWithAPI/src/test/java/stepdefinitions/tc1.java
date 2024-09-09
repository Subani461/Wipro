package stepdefinitions;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tc1 {
	private static final String BASE_URL="https://reqres.in/";
    Response response;
    RequestSpecification request;
    String output;
    
	@Given("the user is in the Home Page")
	public void the_user_is_in_the_Home_Page() {
	    System.out.println("Home Page");
	    RestAssured.baseURI=BASE_URL;
	    request = RestAssured.given();
	}
	@When("he enters the valid request")
	public void he_enters_the_valid_request() {
	   System.out.println("List of users");
	   response = request.get("api/users?page=2");
	}

	@Then("he gets the valid response")
	public void he_gets_the_valid_response() {
	    System.out.println("The Details are : ");
	    output=response.asString();
	   	System.out.println(output);
	   	@SuppressWarnings("unused")
		int expStatusCode=200;
	   	int statusCode = response.getStatusCode();
	   	System.out.println(statusCode);
	   	assertEquals(expStatusCode,statusCode);
	   }
}
