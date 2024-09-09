/*
  Name : Asifkhan
  Description : Selecting Radio Buttons.
  Date : 02/08/2024
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p13_radioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		WebElement make = driver.findElement(By.id("gender-male"));
		make.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
