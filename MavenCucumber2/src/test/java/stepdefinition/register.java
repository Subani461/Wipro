package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register {
	WebDriver driver;
	@Given("the user is in the registration page")
	public void the_user_is_in_the_registration_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://demowebshop.tricentis.com/");
		  driver.findElement(By.linkText("Register")).click();
		  Thread.sleep(3000);
	}
	@When("the user enters valid details in registration Page")
	public void the_user_enters_valid_details_in_registration_Page() throws InterruptedException {
	   driver.findElement(By.id("FirstName")).sendKeys("Asifkhan");;
	   Thread.sleep(3000);
	   driver.findElement(By.id("LastName")).sendKeys("Pathan");;
	   Thread.sleep(3000);
	   driver.findElement(By.id("Email")).sendKeys("pathanasifkhan461@gmail.com");;
	   Thread.sleep(3000);
	   driver.findElement(By.name("Password")).sendKeys("Assm@786");;
	   Thread.sleep(3000);
	   driver.findElement(By.id("ConfirmPassword")).sendKeys("Assm@786");;
	   Thread.sleep(3000);
	   driver.findElement(By.id("register-button")).click();
	}
	@Then("the user able to register his details")
	public void the_user_able_to_register_his_details() throws InterruptedException {
		Thread.sleep(3000);
	  driver.quit();
	}
}
