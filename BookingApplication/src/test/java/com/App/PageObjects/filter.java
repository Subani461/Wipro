package com.App.PageObjects;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class filter {
	WebDriver driver;
	 Actions actions;
	public filter(WebDriver driver) {
		this.driver=driver;
       this.actions = new Actions(driver);

	}
	@SuppressWarnings("unused")
	public void setProperty(String s1) throws InterruptedException {
		// //div[@class='ce3813cfe9']
		Set<String> visitedElements = new HashSet<>();
		List<WebElement> items = driver.findElements(By.xpath("//body[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/div[4]//div//div//div//div"));
		System.out.println(items);
		for(WebElement Ele:items) {
			String str=Ele.getText();
				if(s1.equalsIgnoreCase(str)){
					Ele.click();
					break;
				}
		}
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	
		}
	}
