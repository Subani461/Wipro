/*
  Name : Asifkhan
  Description : Locator : By.TagName
  Date : 05/08/2024
 */
package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p19_ByTagName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		List <WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Total no of Clickable links are : "+list.size());
		int i=0;
		for(i=0;i<list.size();i++) {
			System.out.println("Link Text : "+list.get(i).getText());
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
