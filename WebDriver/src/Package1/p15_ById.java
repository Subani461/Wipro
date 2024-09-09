/*
  Name : Asifkhan
  Description : Locator : By.Id
  Date : 05/08/2024
 */
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p15_ById {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement reg = driver.findElement(By.linkText("Register"));
		reg.click();
		WebElement element = driver.findElement(By.id("FirstName"));
		element.sendKeys("Asifkhan");
		Thread.sleep(5000);
		driver.quit();
	}

}
