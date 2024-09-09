package com.App.PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logout {
	static WebDriver driver;
	WebElement out;
	WebElement userName;
	WebElement Pass;
	WebElement submit;
	public logout(WebDriver driver) {
		logout.driver=driver;
	}
	public void clickLogIn() {
		driver.findElement(By.linkText("Log in")).click();
	}
	public void validLogin() {
		userName=driver.findElement(By.xpath("//input[@id='Email']"));
		userName.clear();
		userName.sendKeys("Pathanasifkhan461@gmail.com");
		Pass=driver.findElement(By.xpath("//input[@id='Password']"));
		Pass.clear();
		Pass.sendKeys("Assm@786");
	}
	public void clickSubmit()  {
		submit = driver.findElement(By.xpath("//input[@value='Log in']"));
		submit.click();
	}
	public void clickLogOut() {
		out=driver.findElement(By.linkText("Log out"));
		out.click();
	}
}
