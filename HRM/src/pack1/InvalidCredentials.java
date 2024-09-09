package pack1;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InvalidCredentials extends reportGenerators {
	WebDriver driver;
	
	@BeforeClass
	  public void setUp() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000);
	  }
	
  @Test
  public void verifyLogo() throws InterruptedException {
	 	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("Admin");
		WebElement passwordField = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		passwordField.sendKeys("admin123456");
		WebElement login = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		login.click();
		Thread.sleep(2000);
		String pageTitle=driver.getTitle();
		String expTitle="OrangeHRM";
		 test = extent.startTest("testcase3");
		assertEquals(expTitle,pageTitle);
  }
 

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
}
