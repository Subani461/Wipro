package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginMultiple {
	WebDriver driver;
	@Given("the user is in the login page with multiple data")
	public void the_user_is_in_the_login_page_with_multiple_data() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://demowebshop.tricentis.com/");
		  driver.findElement(By.linkText("Log in")).click();
		  Thread.sleep(3000);
	}
	@When("he enters {string} and {string}")
	public void he_enters_and(String username, String password) throws InterruptedException {
		driver.findElement(By.id("Email")).sendKeys("username");
		   Thread.sleep(2000);
		   driver.findElement(By.id("Password")).sendKeys("password");;
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	}
	@Then("he reaches the HOME Page for every input")
	public void he_reaches_the_HOME_Page_for_every_input() throws InterruptedException {
		 Thread.sleep(2000);
		    driver.quit();
	}

}
