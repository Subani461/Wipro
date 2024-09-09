package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ReportGenerator;

public class get extends ReportGenerator{
	private static final String BASE_URL="https://jsonplaceholder.typicode.com/";
    Response response;
    RequestSpecification request;
    String output;
    @Test
    @Given("the user has the  REST API endpoint")
    public void the_user_has_the_REST_API_endpoint() {
    	startTest("Get Method");
    	 System.out.println("Home Page");
		    RestAssured.baseURI=BASE_URL;
		    request = RestAssured.given();
    }
    @When("I send a GET request to the endpoint is {string}")
    public void i_send_a_GET_request_to_the_endpoint_is(String string) {
    	response = request.get(string);
    }

    @Then("the response status code will be {int}")
    public void the_response_status_code_will_be(Integer int1) {
    	int statusCode = response.getStatusCode();
 	    int expStatusCode=int1;
	   	assertEquals(expStatusCode,statusCode);
    }

    @Then("the response content type should be as {string}")
    public void the_response_content_type_should_be_as(String string) {
    	System.out.println("The Details are : ");
	    output=response.asString();
	   	System.out.println(output);
	   	endTest();
    }

}
