package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class trackOrder {
    private WebDriver driver;
    private By orderIdInput = By.id("order-id-input"); 
    private By trackOrderButton = By.id("track-order-button"); 
    private By statusElement = By.id("order-status");

    public trackOrder(WebDriver driver) {
        this.driver = driver;
    }
    public void enterOrderId(String orderId) {
        WebElement inputField = driver.findElement(orderIdInput);
        inputField.clear();
        inputField.sendKeys(orderId);
    }
    public void trackOrdder() {
        driver.findElement(trackOrderButton).click();
    }
    public String getOrderStatus() {
        WebElement statusElem = driver.findElement(statusElement);
        return statusElem.getText().trim(); // Trim to remove any extra whitespace
    }
}