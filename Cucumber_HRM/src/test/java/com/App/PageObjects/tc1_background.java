package com.App.PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc1_background {
	WebDriver driver;
	WebElement email;
	WebElement Pass;
	WebElement submit;
	public tc1_background(WebDriver driver) {
		this.driver=driver;
	}
	public void clickLogIn() {
		driver.findElement(By.linkText("Log in")).click();
	}
	public void validLogin() {
		 email = driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("pathanasifkhan461@gmail.com");
		 Pass = driver.findElement(By.xpath("//input[@id='Password']"));
		Pass.sendKeys("Assm@786");
		 submit = driver.findElement(By.xpath("//input[@value='Log in']"));
		submit.click();
	}
	
}
