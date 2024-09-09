package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.junit.Test;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ReportGenerator;

public class getComment extends ReportGenerator{
	private static final String BASE_URL="https://jsonplaceholder.typicode.com/";
    Response response;
    RequestSpecification request;
    String output;
    @Test
	@Given("User having the API endpoint")
	public void user_having_the_API_endpoint() {
		startTest("Get By Comment");
		System.out.println("Home Page");
	    RestAssured.baseURI=BASE_URL;
	    request = RestAssured.given();
	}
	@When("I send a GET request to the endpoint {string}")
	public void i_send_a_GET_request_to_the_endpoint(String string) {
		System.out.println("List of users");
		   response = request.get(string);
	}
	@Then("the response status code should be {int}")
	public void the_response_status_code_should_be(Integer int1) {
			int statusCode = response.getStatusCode();
	 	   int expStatusCode=int1;
		   	assertEquals(expStatusCode,statusCode);
	}

	@Then("the response content type should be {string}")
	public void the_response_content_type_should_be(String string) {
		    System.out.println("The Details are : ");
		    output=response.asString();
		    System.out.println(output);
	}

	@Then("the response body should contain a list of comments")
	public void the_response_body_should_contain_a_list_of_comments() {
		 Assert.assertTrue(response.jsonPath().getList("comments").size() > 0);
		 endTest();
	}

}
