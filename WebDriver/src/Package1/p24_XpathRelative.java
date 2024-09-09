/*
  Name : Asifkhan
  Description : Locator : By.xPathRelative-id
  Date : 05/08/2024
 */
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p24_XpathRelative {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		element.sendKeys("Asifkhan");
		Thread.sleep(5000);
		driver.quit();
	}

}
