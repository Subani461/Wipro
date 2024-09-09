/*
 * Name : Asifkhan
 * Description : Explicit Wait
 * Date : 07/08/2024
 */
package package3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p44_ExplicitlyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement register;
		register=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Register123")));
		register.click();
		driver.quit();
	}

}
