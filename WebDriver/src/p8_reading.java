/*
  Name : Asifkhan
  Description : Reading text from the Field i.w webElement.
  Date : 02/08/2024
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p8_reading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement search;
		search = driver.findElement(By.name("q"));
		search.sendKeys("Iphone"+Keys.RETURN);
		String s;
		s = search.getAttribute("value");
		System.out.println(s);
		Thread.sleep(5000);
		driver.quit();
	}

}
