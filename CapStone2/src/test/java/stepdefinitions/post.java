package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import utilities.ReportGenerator;

public class post extends ReportGenerator{
	private static final String BASE_URL="https://jsonplaceholder.typicode.com/";
	 Response response;
	    RequestSpecification request;
	    @SuppressWarnings("rawtypes")
		ResponseBody body;
	    String output;
	    @Test
	@Given("the user in the HOME page for post data")
	public void the_user_in_the_HOME_page_for_post_data() {
		startTest("Post Method");
		System.out.println("Home Page");
	    RestAssured.baseURI=BASE_URL;
	    request = RestAssured.given();
	}

	@SuppressWarnings("unchecked")
	@When("he posts the data")
	public void he_posts_the_data() {
		  JSONObject requestParams = new JSONObject();
		    requestParams.put("userId", 11);
		    requestParams.put("id", 101);
		    requestParams.put("title","SDET_BATCH4");
		    requestParams.put("body", "COPY N PASTE");
		    request.header("Content-Type","application/json");
		    request.body(requestParams.toJSONString());
		    response=request.put("/posts/1");
		    body = response.body();
	}

	@Then("the system returns the status code {int}")
	public void the_system_returns_the_status_code(Integer int1) {
		System.out.println("Validates status code");
	    System.out.println(response.getStatusLine());
	    System.out.println(body.asString());
		int statusCode = response.getStatusCode();
 	   	System.out.println(statusCode);
 	   int expStatusCode=200;
	   	System.out.println(statusCode);
	   	assertEquals(expStatusCode,statusCode);
	   	endTest();
	}

}
