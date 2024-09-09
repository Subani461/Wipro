//Name: Bhagyasri
//Date: 04/09/2024
package com.airline.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingPage {
    private WebDriver driver;

    public BookingPage(WebDriver driver) {
        this.driver = driver;
    }

    public String bookFlight(String flightNumber, String passengerName, String seatClass) {
        driver.findElement(By.id("flightNumber")).sendKeys(flightNumber);
        driver.findElement(By.id("passengerName")).sendKeys(passengerName);
        driver.findElement(By.id("seatClass")).sendKeys(seatClass);
        driver.findElement(By.id("bookButton")).click();
        return driver.findElement(By.id("bookingReference")).getText();
    }
}