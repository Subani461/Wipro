package stepdefinitions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class delete {
	 Response response;
	 String output;
	@Given("the user is on the Reqres delete endpoint")
	public void the_user_is_on_the_Reqres_delete_endpoint() {
		 System.out.println("Delete End Point");
		    RestAssured.baseURI="https://dummy.restapiexample.com/";
	}

	@SuppressWarnings("static-access")
	@When("he deletes the user with ID {int}")
	public void he_deletes_the_user_with_ID(Integer int1) {
		  System.out.println("Delete the user information");
		    response =given().delete("/api/v1/delete/" + int1);
	}

	private RestAssured given() {
		// TODO Auto-generated method stub
		return null;
	}

	@Then("the system returns status code")
	public void the_system_returns_status_code() {
		 System.out.println("The Details are : ");
	 	    output=response.asString();
	 	   	System.out.println(output);
	 	   	int statusCode = response.getStatusCode();
	 	   	System.out.println(statusCode);
	 	   int expStatusCode=200;
		   	System.out.println(statusCode);
		   	assertEquals(expStatusCode,statusCode);
	}
}
