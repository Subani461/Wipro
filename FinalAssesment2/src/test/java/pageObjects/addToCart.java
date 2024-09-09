package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addToCart {
     WebDriver driver;
     By searchBox = By.id("search-input");
     By searchButton = By.id("search-button");
     By productLink = By.cssSelector(".product-item");
     By cartItem = By.cssSelector(".cart-item");
     By cartEmptyMessage = By.id("cart-empty");
      By addToCartButton = By.id("add-to-cart");

    public addToCart(WebDriver driver) {
        this.driver = driver;
    }

    public void searchForProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }

    public void selectProduct() {
        driver.findElement(productLink).click();
    }
    
    public void addToCartt() {
        driver.findElement(addToCartButton).click();
    }
    
    public boolean isProductInCart(String productName) {
        return driver.findElements(By.xpath("//div[@class='cart-item' and contains(text(),'" + productName + "')]")).size() > 0;
    }

    public boolean isCartEmpty() {
        return driver.findElement(cartEmptyMessage).isDisplayed();
    }
}