package com.App.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.App.Utilities.screenshots;

public class login extends screenshots{
	   WebDriver driver;
	//  WebDriverWait wait = new WebDriverWait(driver, 10);

	    public login(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void clickLogin() {
	        WebElement registerButton = driver.findElement(By.linkText("Sign in")); // Adjust the selector
	        registerButton.click();
	    }
	    public void enterEmail(String email) {
	        WebElement emailInput = driver.findElement(By.xpath("//input[@id='username']")); // Adjust the selector
	        emailInput.sendKeys(email);
	    }
	    public void clickSubmit() throws InterruptedException {
	    	WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
	    	submit.click();
	    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    }
	    public void enterDetails(String password) throws InterruptedException {
	    	
	    	WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
	    	pass.clear();
	    	pass.sendKeys(password);
	    	//WebDriverWait wait = new WebDriverWait(driver, 20);
	    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    	 WebElement secondSignInButton = driver.findElement(By.xpath("//button[@type='submit']"));
	         secondSignInButton.click();

	         // Wait until the iframe is available and switch to it
	         WebDriverWait wait = new WebDriverWait(driver, 20);
	         wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("#KzsrYdvqdclpjSB")));

	         // Create Actions instance
	         Actions actions = new Actions(driver);

	         // Find the button to press and hold
	         WebElement buttonToHold = driver.findElement(By.xpath("//p[@id='KzsrYdvqdclpjSB']"));

	         // Press and hold the button
	         actions.clickAndHold(buttonToHold).perform();

	         // Optional: Add code here to perform actions while holding, if needed

	         // Release the button
	         actions.release(buttonToHold).perform();

	         // Switch back to the main content
	         driver.switchTo().defaultContent();
	         
	         // Optional: Add a delay to observe the results
	         driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);;
	    }
}
