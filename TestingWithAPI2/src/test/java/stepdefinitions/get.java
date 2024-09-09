package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;
public class get {
	private static final String BASE_URL="https://dummy.restapiexample.com/";
    Response response;
    RequestSpecification request;
    String output;
    boolean flag = false;
    @Given("the user is in the Home Page")
    public void the_user_is_in_the_Home_Page() {
    	 System.out.println("Home Page");
 	    RestAssured.baseURI=BASE_URL;
 	    request = RestAssured.given();
    }

    @When("he enters the valid request")
    public void he_enters_the_valid_request() {
    	 System.out.println("List of users");
  	   response = request.get("api/v1/employees");
    }

    @Then("he gets the valid response")
    public void he_gets_the_valid_response() {
    	 System.out.println("The Details are : ");
 	    output=response.asString();
 	   	System.out.println(output);
 	   	int statusCode = response.getStatusCode();
 	   	System.out.println(statusCode);
 	   int expStatusCode=429;
	   	System.out.println(statusCode);
	   	assertEquals(expStatusCode,statusCode);
    }
}
