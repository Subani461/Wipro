package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc1_steps {
	@Given("the user is in the login page")
	public void the_user_is_in_the_login_page() {
	  System.out.println("the user is in the login page");
	}
	@When("the user enters the valid details")
	public void the_user_enters_the_valid_details() {
		System.out.println("the user enters thhe valid details");
	}
	@Then("he reaches the HOME page")
	public void he_reaches_the_HOME_page() {
	   System.out.println("he reaches the HOME Page");
	}
}
