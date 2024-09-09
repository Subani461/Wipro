package com.App.PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.App.Utilities.screenShort;

public class mainPage extends screenShort {
	WebDriver driver ;
	WebElement clickFish;
	WebElement selectFish;
	WebElement addToCart;
	WebElement proceedToCheckOut;
	public mainPage(WebDriver driver) {
		this.driver=driver;
	}
	public void enterTheFishStore() throws IOException {
		clickFish=driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']"));
		clickFish.click();
		selectFish = driver.findElement(By.xpath("//a[normalize-space()='FI-SW-01']"));
		takeScreenshot(driver);
		selectFish.click();
		addToCart = driver.findElement(By.xpath("(//a[@class='Button'][normalize-space()='Add to Cart'])[1]"));
		takeScreenshot(driver);
		addToCart.click();
		proceedToCheckOut = driver.findElement(By.xpath("//a[normalize-space()='Proceed to Checkout']"));
		takeScreenshot(driver);
		proceedToCheckOut.click();
	}
}
