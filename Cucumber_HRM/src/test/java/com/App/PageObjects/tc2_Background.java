package com.App.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc2_Background {
	WebDriver driver;
	WebElement email;
	WebElement Pass;
	WebElement submit;
	public tc2_Background(WebDriver driver) {
		this.driver=driver;
	}
	public void clickLogIn() {
		driver.findElement(By.linkText("Log in")).click();
	}
	public void inValidLogin() {
		email = driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("Admin@gmail.com");
		 Pass = driver.findElement(By.xpath("//input[@id='Password']"));
		Pass.sendKeys("Admin123");
		 submit = driver.findElement(By.xpath("//input[@value='Log in']"));
		submit.click();
	}
}
