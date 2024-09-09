package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class delete { Response response;
String output;
	@Given("the user is on the Swagger Application to delete details")
	public void the_user_is_on_the_Swagger_Application_to_delete_details() {
		 System.out.println("Delete End Point");
		    RestAssured.baseURI="https://petstore.swagger.io/v2/pet/1";
	}

	@SuppressWarnings("static-access")
	@When("he deletes the content with ID {int}")
	public void he_deletes_the_content_with_ID(Integer int1) {
		 System.out.println("Delete the user information");
		    response =given().delete("/pet/" + int1);
	}

	private RestAssured given() {
		// TODO Auto-generated method stub
		return null;
	}

	@Then("the system returns status code")
	public void the_system_returns_status_code() {
		System.out.println("The Details are : ");
 	   	int statusCode = response.getStatusCode();
 	   	System.out.println(statusCode);
	}
}
