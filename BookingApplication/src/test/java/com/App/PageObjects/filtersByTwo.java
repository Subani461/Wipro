package com.App.PageObjects;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class filtersByTwo {
	WebDriver driver;
	 Actions actions;
	public filtersByTwo(WebDriver driver) {
		this.driver=driver;
       this.actions = new Actions(driver);

	}
	@SuppressWarnings("unused")
	public void setProperty(String s1,String s2) throws InterruptedException {
		try {
			List<WebElement> items1 = driver.findElements(By.xpath("//div[@class='ce3813cfe9']"));
			for(WebElement Ele1:items1) {
				String str1=Ele1.getText();
					if(s1.equalsIgnoreCase(str1)){
						System.out.println(str1);
						Ele1.click();
						driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
						for(WebElement Ele2:items1) {
							String str2=Ele2.getText();
							if(s2.equalsIgnoreCase(str2)) {
								Ele2.click();
								driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
							}
						}
						break;
					}
					driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		}
	}
		catch(StaleElementReferenceException e) {
			System.out.println(e);		}
	}
}
