//Name: Bhagyasri
//Date: 04/09/2024
package com.airline.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightSearchPage {
    private WebDriver driver;

    public FlightSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchFlight(String origin, String destination, String departureDate) {
        driver.findElement(By.id("origin")).sendKeys(origin);
        driver.findElement(By.id("destination")).sendKeys(destination);
        driver.findElement(By.id("departureDate")).sendKeys(departureDate);
        driver.findElement(By.id("searchButton")).click();
    }
}