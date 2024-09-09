package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc2_steps {
	WebDriver driver;
	@Given("the user is in the registration page")
	public void the_user_is_in_the_registration_page() {
	  driver = new ChromeDriver();
	  
	}
	@When("the user enters valid details")
	public void the_user_enters_valid_details() {
	    System.out.println("the user enters the valid details");
	}
	@Then("the user able to register his details")
	public void the_user_able_to_register_his_details() {
	    System.out.println("user able to register his details");
	}
}
