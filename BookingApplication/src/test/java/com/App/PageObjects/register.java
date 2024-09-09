package com.App.PageObjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class register {
     WebDriver driver;
    public register(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRegister() {
        WebElement registerButton = driver.findElement(By.linkText("Register")); // Adjust the selector
        registerButton.click();
    }
    public void enterEmail(String email) {
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='username']")); // Adjust the selector
        emailInput.sendKeys(email);
    }
    public void clickSubmit() {
    	WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
    	submit.click();
    }
    public void enterDetails(String password,String Cfpass) throws InterruptedException {
    	 WebDriverWait wait = new WebDriverWait(driver, 10);
    	WebElement pass = driver.findElement(By.xpath("(//input[@id='new_password'])[1]"));
    	pass.sendKeys(password);
    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	WebElement Cpass = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='confirmed_password']")));
    	Cpass.sendKeys(Cfpass);
    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	WebElement submitt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Create account')]")));
    	submitt.click();
    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
}
