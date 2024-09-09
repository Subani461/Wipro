import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addProductToCart {
	WebDriver driver;

	public void addProductToCart(String productName) {
		// Navigate to the product search page
		driver.get("https://example.com/search");

		// Enter product name in the search field
		driver.findElement(By.name("search")).sendKeys(productName);

		// Click the search button
		driver.findElement(By.name("searchButton")).click();

		// Find the product and add it to the cart
		WebElement product = driver.findElement(By.xpath("//div[@class='product']//h2[text()='" + productName + "']"));
		product.findElement(By.name("addToCart")).click();

		// Verify product is added to the cart
		if (driver.findElement(By.name("cartCount")).getText().equals("1")) {
			System.out.println(productName + " added to the cart successfully");
		}
	}
}