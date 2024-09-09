/*
 * Name : Asifkhan
 * Description : Implicit Wait
 * Date : 07/08/2024
 */
package package3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p43_ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement username,password;
		 username = driver.findElement(By.xpath("//input[@name='username']"));
		 username.sendKeys("Admin");
		 password = driver.findElement(By.xpath("//input[@name='password']"));
		 password.sendKeys("admin123");
		 WebElement login = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		 login.click();
	}

}
