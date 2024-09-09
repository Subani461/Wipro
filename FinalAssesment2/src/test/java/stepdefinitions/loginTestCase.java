package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Login;

public class loginTestCase {
	private WebDriver driver;
    private Login loginPage;
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
	        driver = new ChromeDriver();
	        driver.get("https://example.com/login"); 
	        loginPage = new Login(driver);
	}
	@When("User logs in with username {string} and password {string}")
	public void user_logs_in_with_username_and_password(String string, String string2) {
		  loginPage.enterUsername(string);
	        loginPage.enterPassword(string2);
	        loginPage.clickLoginButton();
	}
	@Then("User should be redirected to the homepage")
	public void user_should_be_redirected_to_the_homepage() {
		    String expURL="https://example.com/home";
		    String currentUrl =driver.getCurrentUrl();
	        assertEquals(expURL, currentUrl); 
	        driver.quit();
	}
}
