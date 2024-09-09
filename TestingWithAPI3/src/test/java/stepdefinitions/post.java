package stepdefinitions;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class post {
	private static final String BASE_URL="https://reqres.in/api/users";
    Response response;
    RequestSpecification request;
    @SuppressWarnings("rawtypes")
	ResponseBody body;
    String output;
	@Given("the user in the Home Page for posting data")
	public void the_user_in_the_Home_Page_for_posting_data() {
		System.out.println("Home Page");
	    RestAssured.baseURI=BASE_URL;
	    request = RestAssured.given();
	}

	@SuppressWarnings("unchecked")
	@When("he posts data")
	public void he_posts_data() {
		System.out.println("post data");
	    JSONObject requestParams = new JSONObject();
	    requestParams.put("id", 123456);
	    requestParams.put("name", "Dog");
	    requestParams.put("status", "available");
	    request.header("Content-Type","application/json");
	    request.body(requestParams.toJSONString());
	    response=request.put("/pet");
	    body = response.body();
	}

	@Then("the system returns the status code {int}")
	public void the_system_returns_the_status_code(Integer int1) {
		 System.out.println("Validates status code");
		    System.out.println(response.getStatusLine());
		    System.out.println(body.asString());
	}



}
