package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Login;

public class invalidTestCase {
	WebDriver driver;
	Login loginPage;
	@Given("User is on the login Page")
	public void user_is_on_the_login_Page() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
        driver = new ChromeDriver();
        driver.get("https://example.com/login"); 
        loginPage = new Login(driver);
	}

	@When("User try logs  with username {string} and password {string}")
	public void user_try_logs_with_username_and_password(String string, String string2) {
		loginPage.enterUsername(string);
        loginPage.enterPassword(string2);
        loginPage.clickLoginButton();
	}

	@Then("User should see an error message {string}")
	public void user_should_see_an_error_message(String string) {
		    String expURL="https://example.com/home";
		    String currentUrl =driver.getCurrentUrl();
	        assertEquals(expURL, currentUrl); 
	        driver.quit();
	}

}
