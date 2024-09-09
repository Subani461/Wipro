package com.App.Testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerTestCase2 {
	WebDriver driver;
	 private register registerPage;
	@Given("User on the home Page")
	public void user_on_the_home_Page() {
	   System.out.println("Home Page");
	   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
 	  driver = new ChromeDriver();
 	  driver.get("https://www.booking.com/");
       registerPage = new register(driver);
	}
	@When("user enters the Mail ID")
	public void user_enters_the_Mail_ID() {
	 System.out.println("Enters the ID");
	 registerPage.clickRegister();
     String Email = "PathanAsifkhan@example.com";
     registerPage.enterEmail(Email);
     registerPage.clickSubmit();
     String expURL ="https://account.booking.com/sign-in?op_token=EgVvYXV0aCL6AgoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qmQJVck1COVRpTkVWanNtN1RZTjVrdUs3eVFmblpTSnpxQjkwLWlIajZERXlXdml3b1NpbjRWWndTZTFxV0JUcDZ2OXNiQkdTc2tiREtRNXRxWElqQXFmMUpQMFdiazZ6RXE5V2ZFNWV4UkFRLVp6aEJOQ2Z5eU5sYW1yTkVZZFZqbjBlelUxNVR3YkFwU2NPNXNDc1dvLTlUM3g3c21yamhDWUV3MUxYR2d2RnBacDZ2TjdHOVRfTi1qWV91SGJ5cFQ2ZGZONTN4N0MwWDdWZThvU3hUc3lzSkhQUEpVWnBvNjhtNVBzQ245bkdDOTB4SG1QU009KmV5SnBaQ0k2SW5SeVlYWmxiR3hsY2w5b1pXRmtaWElpZlE9PUIEY29kZSoxCI7IEjDWnsDYg5wnOgBCAFiwq7u2BpIBEHRyYXZlbGxlcl9oZWFkZXKaAQVpbmRleA";
     String actURL=driver.getCurrentUrl();
     assertEquals(expURL,actURL);
	}
	@Then("user sees message on the screen as Invalid Email")
	public void user_sees_message_on_the_screen_as_Invalid_Email() {
	  System.out.println("Invalid Email");
	  driver.quit();
	}
}
