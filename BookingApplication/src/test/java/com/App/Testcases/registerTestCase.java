package com.App.Testcases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.App.PageObjects.register;
import com.App.Utilities.ReportGenerator;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerTestCase extends ReportGenerator{
     WebDriver driver;
     register registerPage;
    @Given("User on the Home Page on Registration")
    public void user_on_the_Home_Page_on_Registration() {
    	
    	 startTest("RegisterTestCase");
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
         registerPage = new register(driver);
    }
    @When("he enters {string}")
    public void he_enters(String string) throws InterruptedException {
     registerPage.clickRegister();
     registerPage.enterEmail(string);
     registerPage.clickSubmit();
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    
    @When("user enters and {string} and {string}")
    public void user_enters_and_and(String string, String string2) throws InterruptedException {
       registerPage.enterDetails(string, string2);
       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    @Then("user receives the Confirmation mail to user mail ID")
    public void user_receives_the_Confirmation_mail_to_user_mail_ID() {
    	endTest();
       driver.quit();
    }
}