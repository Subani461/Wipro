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

public class patch extends ReportGenerator {
	private static final String BASE_URL="https://jsonplaceholder.typicode.com/";
    Response response;
    RequestSpecification request;
    @SuppressWarnings("rawtypes")
	ResponseBody body;
    String output;
    @Test
	@Given("the user in the HOME page for patch data")
	public void the_user_in_the_HOME_page_for_patch_data() {
		startTest("Patch Method");
		System.out.println("Home Page");
	    RestAssured.baseURI=BASE_URL;
	    request = RestAssured.given();
	}

	@SuppressWarnings("unchecked")
	@When("he patch the data")
	public void he_patch_the_data() {
		System.out.println("Updating");
		  JSONObject requestParams = new JSONObject();
		    requestParams.put("userId", 11);
		    requestParams.put("id", 101);
		    requestParams.put("title","SDET_BATCH4_VENKATRAMAN");
		    requestParams.put("body", "TRAINER COMES STARTS COPY N PASTE");
		    request.header("Content-Type","application/json");
		    request.body(requestParams.toJSONString());
		    response=request.put("/posts/1");
		    body = response.body();

	}

	@Then("the system return the status code")
	public void the_system_return_the_status_code() {
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
