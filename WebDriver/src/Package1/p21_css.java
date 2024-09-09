/*
  Name : Asifkhan
  Description : Locator : By.cssSelector
  Date : 05/08/2024
 */
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p21_css {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element = driver.findElement(By.linkText("Log in"));
		element.click();
		WebElement element2 = driver.findElement(By.cssSelector("input#Email"));
		element2.sendKeys("pathanasifkhan461@gmail.com");
		Thread.sleep(5000);
		driver.quit();
	}

}
