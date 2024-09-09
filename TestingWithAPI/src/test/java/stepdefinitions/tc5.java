package stepdefinitions;

import static org.junit.Assert.assertThat;
import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matcher.*;
public class tc5 {
    Response response;
    boolean flag=true;
	@Given("the user is on the Reqres delete endpoint")
	public void the_user_is_on_the_Reqres_delete_endpoint() {
	    System.out.println("Delete End Point");
	    RestAssured.baseURI="https://reqres.in/api/users";
	}

	@SuppressWarnings("static-access")
	@When("he deletes the user with ID {int}")
	public void he_deletes_the_user_with_ID(Integer int1) {
	    System.out.println("Delete the user information");
	    response =given().delete("/users/" + int1);
	}

	private RestAssured given() {
		// TODO Auto-generated method stub
		return null;
	}

	@Then("the system returns status code")
	public void the_system_returns_status_code() {
		System.out.println("Validates status code");
	    System.out.println(response.getStatusLine());
	    int expStatusCode=204;
	   	int statusCode = response.getStatusCode();
	   	System.out.println(statusCode);
	   	assertEquals(expStatusCode,statusCode);
	}

}
