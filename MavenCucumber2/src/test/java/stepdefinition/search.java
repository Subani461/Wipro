package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search {
	WebDriver driver;
	boolean flag=false;
	@Given("the user is in the home page")
	public void the_user_is_in_the_home_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://demowebshop.tricentis.com/");
		  Thread.sleep(3000);
	}
	@When("the user enter the name of product")
	public void the_user_enter_the_name_of_product() {
	   driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Fiction EX");
	   driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
	}
	@Then("items corresponding to the product are displayed")
	public void items_corresponding_to_the_product_are_displayed() throws InterruptedException {
	   Thread.sleep(2000);
	   driver.quit();
	}
}
