/*
 * Name: Asifkhan
 * Description : Verifying the Login
 * Date : 09/08/2024
 */
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class validCredentials extends ReportGenerator {
	WebDriver driver;
	@BeforeClass
	  public void setUp() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000);
	  }
  @Test
  public void validCredent() throws InterruptedException {
	  test = extent.startTest("testcase3");
	  WebElement usernameField = driver.findElement(By.className("oxd-input oxd-input--active"));
		usernameField.sendKeys("Admin");
		WebElement passwordField = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		passwordField.sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		login.click();
		Thread.sleep(2000);
		String pageTitle=driver.getTitle();
		String expTitle="OrangeHRM";
		assertEquals(expTitle,pageTitle);
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("Test3 is Completed");
	  driver.quit();
  }
}
