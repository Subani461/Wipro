package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class viewCart {
     WebDriver driver;
   By cartItemList = By.cssSelector(".cart-item"); 
     By itemName = By.cssSelector(".item-name"); 
    By itemQuantity = By.cssSelector(".item-quantity"); 

    public viewCart(WebDriver driver) {
        this.driver = driver;
    }

    public Map<String, Integer> getCartItems() {
        Map<String, Integer> itemsMap = new HashMap<>();
        List<WebElement> items = driver.findElements(cartItemList);

        for (WebElement item : items) {
            String name = item.findElement(itemName).getText();
            int quantity = Integer.parseInt(item.findElement(itemQuantity).getText());
            itemsMap.put(name, quantity);
        }

        return itemsMap;
    }
}