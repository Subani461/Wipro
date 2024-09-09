/*
  Name : Asifkhan
  Description : Mouse Over
  Date : 05/08/2024
 */
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p29_Mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element = driver.findElement(By.linkText("COMPUTERS"));
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		WebElement element2 = driver.findElement(By.linkText("Notebooks"));
		element2.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
