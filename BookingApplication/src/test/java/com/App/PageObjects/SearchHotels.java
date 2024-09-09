package com.App.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchHotels {
	WebDriver driver;
	public SearchHotels(WebDriver driver) {
		this.driver=driver;
	}
	public void chooseCity() {
		WebElement city = driver.findElement(By.xpath("//input[@aria-label='Where are you going?']"));
		city.sendKeys("New York");
	}
	@SuppressWarnings("unused")
	public void chooseDateCheckIn() {
		 // Open the date picker
      try {
		WebElement datePicker = driver.findElement(By.xpath("//button[@data-testid='date-display-field-start']"));
        datePicker.click();
        // Define desired check-in and check-out dates
        @SuppressWarnings("unused")
		String checkInMonthYear = "September 2024";
        String checkInDay = "10";
        String checkOutMonthYear = "September 2024";
        String checkOutDay = "20";
        while (true) {
        	// (//h3)[1][@class='eb73dc0c10 d2fc2d6042']
        	String month = driver.findElement(By.xpath("//h3[normalize-space()='September 2024']")).getText();
        	if(month.equals(checkInMonthYear)) {
        		break;
        	}
        	else {
        		WebElement move = driver.findElement(By.xpath("//button[@aria-label='Next month']"));
        		move.click();
        	}
        }
        List <WebElement> ele = driver.findElements(By.xpath("(//tbody)[1]//tr//td//span"));
        for(WebElement element:ele) {
        	String date=element.getText();
        	if(date.equals(checkInDay)) {
        		element.click();
        		break;
        	}
        }
        for(WebElement element:ele) {
        	String date=element.getText();
        	if(date.equals(checkOutDay)) {
        		element.click();
        		break;
        	}
        }
      }
      catch(StaleElementReferenceException e) {
    	  System.out.println(e);
      }
	}
	public void selectMembers() {
		//  //div[@class='a6391e882c']
		// //div[@class='f340be2edd']
		// (//div[@class='f340be2edd'])[3]
		//(//button[@class='a83ed08757 ebbedaf8ac ada2387af8'])[1]
		int Adults=4;
		WebElement mem = driver.findElement(By.xpath("(//div[@class='e22b782521'])[3]"));
		mem.click();
		WebElement adult = driver.findElement(By.xpath("(//div[@class='a7a72174b8'])[1]"));
		adult.click();
		// (//button[@type='button'])[8]
		for(int i=0;i<2;i++) {
			WebElement add = driver.findElement(By.xpath("(//div[@class='a7a72174b8'])[1]"));
			add.click();
		}
		// //div[@class='a7a72174b8'])[3]
		int rooms=2;
		WebElement Room = driver.findElement(By.xpath("(//div[@class='a7a72174b8'])[3]"));
		adult.click();
		for(int i=0;i<rooms;i++) {
			WebElement add = driver.findElement(By.xpath("(//button[@type='button'])[12]"));
			add.click();
		}
		// 
		//WebElement Done = driver.findElement(By.xpath("(//button[@class='dba1b3bddf e99c25fd33 ea757ee64b a86bcdb87f d3785a8ddc ea220f5cdc ed852f1b1f c437808707'])[1]"));
		//Done.click();
	}
	public void clickSearch() {
		WebElement ss = driver.findElement(By.xpath("//button[@type='submit']"));
		ss.click();
	}
}
