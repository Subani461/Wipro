package com.App.PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.App.Utilities.screenshort;

public class invalid extends screenshort{
	WebDriver driver;
	WebElement email;
	WebElement Pass;
	WebElement submit;
	public invalid(WebDriver driver) {
		this.driver=driver;
	}
	public void clickLogIn() {
		driver.findElement(By.linkText("Log in")).click();
	}
	public void inValidLogin() throws IOException {
		email = driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("Admin@gmail.com");
		 Pass = driver.findElement(By.xpath("//input[@id='Password']"));
		Pass.sendKeys("Admin123");
		 submit = driver.findElement(By.xpath("//input[@value='Log in']"));
		 takeScreenshot(driver);
		submit.click();
	}
}
