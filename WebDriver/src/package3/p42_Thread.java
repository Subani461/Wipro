/*
 * Name : Asifkhan
 * Description : Thread.sleep
 * Date : 06/08/2024
 */
package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class p42_Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		WebElement username,password;
		 username = driver.findElement(By.xpath("//input[@name='username']"));
		 username.sendKeys("Admin");
		 password = driver.findElement(By.xpath("//input[@name='password']"));
		 password.sendKeys("admin123");
		 WebElement login = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		 login.click();
		 
	}

}
