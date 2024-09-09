package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class placeOrder {
    private WebDriver driver;
    private By addressField = By.id("shipping-address"); // Selector for the address field
    private By placeOrderButton = By.id("place-order"); // Selector for the place order button
    private By orderIdElement = By.id("order-id"); // Selector for the order ID


    public placeOrder(WebDriver driver) {
        this.driver = driver;
    }

    public void enterShippingAddress(String address) {
        WebElement addressInput = driver.findElement(addressField);
        addressInput.clear();
        addressInput.sendKeys(address);
    }

    public void placeOrdeer() {
        driver.findElement(placeOrderButton).click();
    }

    public String getOrderId() {
        WebElement orderIdElem = driver.findElement(orderIdElement);
        return orderIdElem.getText();  
}
}

