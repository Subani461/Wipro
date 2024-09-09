package com.App.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.App.Utilities.screenShort;

public class homePage extends screenShort {
	WebDriver driver ;
	WebElement clickStore;
	public homePage(WebDriver driver) {
		this.driver=driver;
	}
	public void enterTheStore() {
		clickStore=driver.findElement(By.linkText("Enter the Store"));
		clickStore.click();
	}
}
