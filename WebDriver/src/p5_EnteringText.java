/*
  Name : Asifkhan
  Description : Entering text in the Field i.w webElement.
  Date : 02/08/2024
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p5_EnteringText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement Reg;
		Reg = driver.findElement(By.linkText("Register"));
		Reg.click();
		WebElement fname = driver.findElement(By.id("FirstName"));
		fname.sendKeys("Asifkhan");
		Thread.sleep(5000);
		driver.quit();
	}

}
