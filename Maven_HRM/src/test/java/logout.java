/*
 * Name: Asifkhan
 * Description : Verifying the LogOut Module
 * Date : 09/08/2024
 */
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class logout extends ReportGenerator{
	WebDriver driver;
	@BeforeClass
	  public void setUp() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000);
	  }
  @Test
  public void logOut() throws InterruptedException {
	  test = extent.startTest("testcase5");
	  System.out.println("Test5 is Running");
	  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("Admin");
		WebElement passwordField = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		passwordField.sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		login.click();
		String pageTitle=driver.getTitle();
		String expTitle="OrangeHRM";
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		assertEquals(expTitle,pageTitle);
	  
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("Test5 is Completed");
	  driver.quit();
  }
}
