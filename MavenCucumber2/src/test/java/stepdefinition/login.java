package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver driver;
	@Given("the user is in the login page")
	public void the_user_is_in_the_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://demowebshop.tricentis.com/");
		  driver.findElement(By.linkText("Log in")).click();
		  Thread.sleep(3000);
	}
	@When("the user enters the valid details in login page")
	public void the_user_enters_the_valid_details_in_login_page() throws InterruptedException {
		 driver.findElement(By.id("Email")).sendKeys("pathanasifkhan461@gmail.com");
		   Thread.sleep(2000);
		   driver.findElement(By.id("Password")).sendKeys("Assm@786");;
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	}
	@Then("he reaches the HOME page after login")
	public void he_reaches_the_HOME_page_after_login() throws InterruptedException {
	    Thread.sleep(2000);
	    driver.quit();
	}
	// //input[@id='small-searchterms']
	// //input[@class='button-1 search-box-button']

}
