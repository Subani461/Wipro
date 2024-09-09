package com.App.PageObjects;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hotels {
     WebDriver driver;
     public WebElement hotel;
     public WebElement desc;
     public WebElement Amen;
     public WebElement room;
     public WebElement price;
     WebElement firstRoomOption;
     WebElement Rooms;
    public hotels(WebDriver driver) {
        this.driver = driver;
    }

    public void getHotelName() {
    	try {
    	// (//div[@class='d8ff70c6e0 bb80b6397f'])[1]//div[@class='c655c9a144']//div[@class='adc8292e09 ea1e323a59 fffdb20d34 fbe4119cc7 fd229921e5']//div[@class='a8323349e9']
         hotel= driver.findElement(By.xpath("(//div[@class='d8ff70c6e0 bb80b6397f'])[1]//div[@class='c655c9a144']//div[@class='adc8292e09 ea1e323a59 fffdb20d34 fbe4119cc7 fd229921e5']//div[@class='a8323349e9']//a[@rel='noopener noreferrer']"));
        hotel.click();
        // Store the handle of the original tab
        String originalHandle = driver.getWindowHandle();

        // Get the list of all window handles
        List<String> allHandles = new ArrayList<>(driver.getWindowHandles());

        // Switch to the new tab (the new tab should be the last handle)
        for (String handle : allHandles) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    	}
    	catch(StaleElementReferenceException e) {
    		System.out.println(e.getMessage());
    	}

    }
    public void getHotelDescription() {
        WebElement desc= driver.findElement(By.xpath("(//body)[1]"));
    }

    public void getAmenities() {
        WebElement Amen= driver.findElement(By.xpath("(//ul[@class='b3605c5e50 eb11e518ca bdfadf615e'])[1]"));
    }

    public void getRoomOptions() {
        room= driver.findElement(By.xpath("(//div[@id='maxotelRoomArea'])[1]"));
    }

    public void getPricing() {
        price= driver.findElement(By.xpath("(//div[@class='hotelchars'])[1]"));
    }

    public void selectFirstRoomOption() {
    	//   (//div[@id='maxotelRoomArea'])[1]//tbody//tr[2]//td[4]
        firstRoomOption = driver.findElement(By.xpath("//div[@id='maxotelRoomArea'])[1]//tbody//tr[2]//td[4]"));
        firstRoomOption.click();
         Rooms = driver.findElement(By.xpath("//select[@id='hprt_nos_select_705831507_393910721_4_0_0']"));
        Rooms.click();
    }

    public void proceedToBooking() {
        WebElement proceedButton = driver.findElement(By.xpath("//select[@id='hprt_nos_select_705831507_393910721_4_0_0']"));
        proceedButton.click();
    }
}