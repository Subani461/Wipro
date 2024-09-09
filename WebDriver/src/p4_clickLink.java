/*
  Name : Asifkhan
  Description : Clicking on Log in WebElement.
  Date : 02/08/2024
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4_clickLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/");
		WebElement login;
		login = driver.findElement(By.linkText("Enter the Store"));
		login.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
