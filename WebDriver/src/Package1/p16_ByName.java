/*
  Name : Asifkhan
  Description : Locator : By.name
  Date : 05/08/2024
 */
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p16_ByName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement search;
		search = driver.findElement(By.name("q"));
		search.sendKeys("Iphone 15 Pro Max"+Keys.RETURN);
		Thread.sleep(5000);
		driver.quit();
	}

}
