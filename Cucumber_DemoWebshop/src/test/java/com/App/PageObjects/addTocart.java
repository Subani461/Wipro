package com.App.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addTocart {
	static WebDriver driver;
	WebElement add; 
	WebElement msg;
	WebElement wishlist;
	boolean flag = false;
	public addTocart(WebDriver driver) {
		addTocart.driver=driver;
	}
	public void searchProducts() {
		search s = new search(driver);
		s.searchProduct();
		s.clickSearch();
	}
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250);");
	}
	public void addToCart() {
		add=driver.findElement(By.xpath("//a[normalize-space()='Fiction EX']"));
		add.click();
		wishlist = driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-78']"));
		wishlist.click();
	}
}
