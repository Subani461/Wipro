package com.App.PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.App.Utilities.screenShort;

public class login extends screenShort{
	WebDriver driver;
	WebElement userName;
	WebElement Pass;
	WebElement submit;
	public login(WebDriver driver) {
		this.driver=driver;
	}
	public void setUp() {
		driver.findElement(By.linkText("Sign In")).click();
	}
	public void setUserName(String username) throws InterruptedException {
		userName=driver.findElement(By.name("username"));
		userName.clear();
		userName.sendKeys(username);
		Thread.sleep(2000);
	}
	public void setPassword(String password) throws InterruptedException, IOException {
		Pass=driver.findElement(By.name("password"));
		Pass.clear();
		Pass.sendKeys(password);
		takeScreenshot(driver);
		Thread.sleep(2000);
	}
	public void clickSubmit() {
		submit = driver.findElement(By.xpath("//input[@name='signon']"));
		submit.click();
	}
}
