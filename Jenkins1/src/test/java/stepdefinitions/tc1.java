package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc1 {
	@Given("user on the Home Page")
	public void user_on_the_Home_Page() {
	    System.out.println("Home Page");
	}
	@When("he enters the credentials to login")
	public void he_enters_the_credentials_to_login() {
	   System.out.println("Credentials Entering");
	}
	@Then("user logs into the Application")
	public void user_logs_into_the_Application() {
	    System.out.println("Logs into the Application");
	}
}
