/*
  Name : Asifkhan
  Description : KeyBoard Shortcuts
  Date : 05/08/2024
 */
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p28_KeyBoard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element1 = driver.findElement(By.linkText("Register"));
		element1.click();
		WebElement element2 = driver.findElement(By.id("FirstName"));
		element2.sendKeys("Asifkhan");
		element2.sendKeys(Keys.CONTROL,"a");
		element2.sendKeys(Keys.CONTROL,"c");
		WebElement element3 = driver.findElement(By.id("LastName"));
		element3.sendKeys(Keys.CONTROL,"v");
		Thread.sleep(5000);
		driver.quit();
	}

}
