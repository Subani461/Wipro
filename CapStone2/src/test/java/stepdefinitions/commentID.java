package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ReportGenerator;

public class commentID extends ReportGenerator{
	private static final String BASE_URL="https://jsonplaceholder.typicode.com/";
    Response response;
    RequestSpecification request;
    String output;
    @Test
	@Given("user having the API endpoint")
	public void user_having_the_API_endpoint() {
		startReport();
		startTest("GetByCommentID");
		 System.out.println("Home Page");
	 	    RestAssured.baseURI=BASE_URL;
	 	    request = RestAssured.given();
	}
	@When("I sends a GET request to endpoint {string}")
	public void i_sends_a_GET_request_to_endpoint(String string) {
		System.out.println("Retrive the user information by ID : ");
	    response =request.get(string);
	}

	@Then("the response status code should be as {int}")
	public void the_response_status_code_should_be_as(Integer int1) {
		int statusCode = response.getStatusCode();
	 	   int expStatusCode=int1;
		   	assertEquals(expStatusCode,statusCode);
	}

	@Then("the response content type should be like {string}")
	public void the_response_content_type_should_be_like(String string) {
		 System.out.println("The Details are : ");
		    output=response.asString();
		    System.out.println(output);
	}

	@Then("the response body should contain comments for post ID {int}")
	public void the_response_body_should_contain_comments_for_post_ID(Integer int1) {
        boolean containsCommentsForPostId = response.jsonPath().getList("$").stream()
                .anyMatch(comment -> comment instanceof Map && ((Map) comment).get("postId").equals(int1));
        
        Assert.assertTrue(containsCommentsForPostId);
        endTest();
	}
}
