package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utilities.ReportGenerator;

public class delete extends ReportGenerator{
	  Response response;
	 @Test
	@Given("the user in the HOME page for delete data")
	public void the_user_in_the_HOME_page_for_delete_data() {
		startTest("Delete");
		   System.out.println("Delete End Point");
		    RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
	}

	@SuppressWarnings("static-access")
	@When("he deletes the data if ID {int}")
	public void he_deletes_the_data_if_ID(Integer int1) {
		System.out.println("Delete the user information");
	    response =given().delete("/posts/" + int1);
	}

	private RestAssured given() {
		// TODO Auto-generated method stub
		return null;
	}

	@Then("the system returns  status code")
	public void the_system_returns_status_code() {
		System.out.println("Validates status code");
	    System.out.println(response.getStatusLine());
		int statusCode = response.getStatusCode();
 	   	System.out.println(statusCode);
 	   int expStatusCode=200;
	   	System.out.println(statusCode);
	   	assertEquals(expStatusCode,statusCode);
	   	endTest();
	}
}
