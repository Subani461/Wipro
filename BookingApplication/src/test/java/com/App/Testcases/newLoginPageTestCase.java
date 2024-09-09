package com.App.Testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.App.PageObjects.login;
import com.App.Utilities.ReportGenerator;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class newLoginPageTestCase extends ReportGenerator {
     WebDriver driver;
     login loginPage;
     @Given("user on the Home Page for Login")
     public void user_on_the_Home_Page_for_Login() throws InterruptedException {
    	 startReport();
    	startTest("LoginTest");
    	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
     	  driver = new ChromeDriver();
     	  driver.get("https://www.booking.com/");
     	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     		try {
     		   	 WebElement close = driver.findElement(By.xpath("//button[@aria-label='Dismiss sign in information.']"));
     		   	  close.click();
     		   	  }
     		   	 catch(Exception e) {
     		   		 e.printStackTrace();
     		   	 }
           loginPage = new login(driver);
     }
	@When("he enters {string} and {string}")
	public void he_enters_and(String string, String string2) throws InterruptedException, IOException {
		
		System.out.println("When method is running");
		loginPage.clickLogin();
		loginPage.enterEmail(string);
		loginPage.clickSubmit();
		loginPage.enterDetails(string2);
		takeScreenshot(driver);
	}
	@Then("user sees navigates to the Home Page.")
	public void user_sees_navigates_to_the_Home_Page() {
		endTest();
		driver.quit();
	}
}