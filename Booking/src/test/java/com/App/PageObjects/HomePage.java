package com.App.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    // Locators
    private By searchBox = By.xpath("//input[@id=':rj:']");
    private By calendar = By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/span[1]/*[name()='svg'][1]");
    private By checkInDate = By.xpath("//span[@aria-label='28 August 2024']");
    private By checkOutDate = By.xpath("//span[@aria-label='1 September 2024']");
    private By person = By.xpath("//*[name()='path' and contains(@d,'M16.5 6a4.')]");
    private By guestsDropdown = By.cssSelector("body > div:nth-child(7) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    private By searchButton = By.xpath("//button[@type='submit']");
    private By promotionalBanners = By.cssSelector(".promotional-banners"); // Update with actual selector

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchCriteria(String destination, String checkIn, String checkOut, int guests) {
        WebElement searchInput = driver.findElement(searchBox);
        searchInput.sendKeys(destination);
        driver.findElement(calendar).click();
        driver.findElement(checkInDate).sendKeys(checkIn);
        driver.findElement(checkOutDate).sendKeys(checkOut);
        driver.findElement(person).click();
        WebElement guestsElement = driver.findElement(guestsDropdown);
        guestsElement.click(); // Adjust if dropdown interaction is different
        // Logic to select the number of guests

        driver.findElement(searchButton).click();
    }

    public boolean isPromotionalBannersVisible() {
        return driver.findElement(promotionalBanners).isDisplayed();
    }
}