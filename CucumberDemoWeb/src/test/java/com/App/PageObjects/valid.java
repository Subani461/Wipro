package com.App.PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.App.Utilities.screenshort;

public class valid extends screenshort{
	WebDriver driver;
	WebElement email;
	WebElement Pass;
	WebElement submit;
	public valid(WebDriver driver) {
		this.driver=driver;
	}
	public void clickLogIn() {
		driver.findElement(By.linkText("Log in")).click();
	}
	public void validLogin() throws IOException {
		 email = driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("pathanasifkhan461@gmail.com");
		 Pass = driver.findElement(By.xpath("//input[@id='Password']"));
		Pass.sendKeys("Assm@786");
		 submit = driver.findElement(By.xpath("//input[@value='Log in']"));
		 takeScreenshot(driver);
		submit.click();
	}
	
}
