package com.App.PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.App.Utilities.screenShot;

public class search extends screenShot{
	static WebDriver driver;
	WebElement product;
	WebElement submit;
	public search(WebDriver driver) {
		search.driver = driver;
	}
	public void searchProduct() {
		product = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		product.sendKeys("Fiction EX");
		
	}
	public void clickSearch() {
		submit=driver.findElement(By.xpath("//input[@value='Search']"));
		submit.click();
	}
}
