/*
  Name : Asifkhan
  Description : Reading text from WebElement.
  Date : 05/08/2024
 */
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p32_Screenshot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.linkText("Register"));
		element.click();
		Thread.sleep(5000);
		
		
	}

}
