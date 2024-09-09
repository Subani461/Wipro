package com.App.PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.App.Utilities.screenShot;

public class register extends screenShot{
	static WebDriver driver;
	   WebElement gender;
	   WebElement fname;
	   WebElement lname;
	   WebElement email;
	   WebElement pass;
	   WebElement Cpass;
		public register(WebDriver driver) {
			register.driver=driver;
		}
		public void clickRegister() {
			driver.findElement(By.linkText("Register")).click();
		}
		public void registerDetails() {
			gender=driver.findElement(By.xpath("//input[@id='gender-male']"));
			gender.click();
			fname = driver.findElement(By.xpath("//input[@id='FirstName']"));
			fname.sendKeys("Asifkhan");
			lname = driver .findElement(By.xpath("//input[@id='LastName']"));
			lname.sendKeys("Pathan");
			email = driver.findElement(By.xpath("//input[@id='Email']"));
			email.sendKeys("pathanasifkhan5029@gmail.com");
			pass = driver.findElement(By.xpath("//input[@id='Password']"));
			pass.sendKeys("Assm@786");
			Cpass = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
			Cpass.sendKeys("Assm@786");
		
		}
		public void submit() {
			driver.findElement(By.xpath("//input[@id='register-button']")).click();
		}
	}
