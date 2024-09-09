package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class tc3 {
	private static final String BASE_URL="https://reqres.in/api/users";
    Response response;
    RequestSpecification request;
    @SuppressWarnings("rawtypes")
	ResponseBody body;
    String output;
	@Given("the user is on the update page for the user data")
	public void the_user_is_on_the_update_page_for_the_user_data() {
	  System.out.println("Home Page");
	    RestAssured.baseURI=BASE_URL;
	    request = RestAssured.given();
	}

	@SuppressWarnings("unchecked")
	@When("he updates the previous data")
	public void he_updates_the_previous_data() {
	  System.out.println("Updating");
	  JSONObject requestParams = new JSONObject();
	    requestParams.put("name", "morpheus");
	    requestParams.put("job", "zion-resident");
	    request.header("Content-Type","application/json");
	    request.body(requestParams.toJSONString());
	    response=request.put("/name");
	    body = response.body();
	}

	@Then("the system returns the status code {int} OK")
	public void the_system_returns_the_status_code_OK(Integer int1) {
		System.out.println("Validates status code");
	    System.out.println(response.getStatusLine());
	    System.out.println(body.asString());
	    int expStatusCode=200;
	   	int statusCode = response.getStatusCode();
	   	System.out.println(statusCode);
	   	assertEquals(expStatusCode,statusCode);
	}

}
