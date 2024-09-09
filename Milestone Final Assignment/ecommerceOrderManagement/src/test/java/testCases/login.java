package testCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	private WebDriver driver;

	public login(ECommercePortal eCommercePortal) {
      this.eCommercePortal = eCommercePortal;
      this.driver = eCommercePortal.getDriver();
  }

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		eCommercePortal.navigateToLoginPage();
	}

	@When("I enter valid credentials")
	public void i_enter_valid_credentials() {
		eCommercePortal.loginToECommercePortal("username", "password");
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
		assertTrue(eCommercePortal.isLoggedIn());
	}
}
