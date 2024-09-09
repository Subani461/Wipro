package com.App.PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.App.Utilities.screenShot;

public class login extends screenShot {
	static WebDriver driver;
	WebElement userName;
	public WebElement errorMsg;
	WebElement Pass;
	WebElement submit;
	public login(WebDriver driver) {
		login.driver=driver;
	}
	public void setUp() {
		driver.findElement(By.linkText("Log in")).click();
	}
	public void setEmail(String email) {
		userName=driver.findElement(By.xpath("//input[@id='Email']"));
		userName.clear();
		userName.sendKeys(email);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void setPassword(String password)  {
		Pass=driver.findElement(By.xpath("//input[@id='Password']"));
		Pass.clear();
		Pass.sendKeys(password);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickSubmit()  {
		
		submit = driver.findElement(By.xpath("(//input[@value='Log in'])[1]"));
		submit.click();
	}
}
