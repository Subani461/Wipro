/*
  Name : Asifkhan
  Description : selecting element from dropdown.
  Date : 02/08/2024
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p9_drodown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://sampleapp.tricentis.com/101/");
		driver.findElement(By.linkText("Automobile")).click();
		Select make = new Select(driver.findElement(By.id("make")));
		make.selectByVisibleText("Toyota");
		Thread.sleep(5000);
		driver.quit();
	}

}
