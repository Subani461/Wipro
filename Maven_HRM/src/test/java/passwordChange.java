/*
 * Name: Asifkhan
 * Description : Changing the Password
 * Date : 09/08/2024
 */
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class passwordChange extends ReportGenerator{
	WebDriver driver;
	boolean flag = false;
	@BeforeClass
	  public void setUp() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000);
	  }
  @Test
  public void changePassword() throws InterruptedException {
	  test = extent.startTest("testcase4");
	  System.out.println("Test4 is Running");
	  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("Admin");
		WebElement passwordField = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		passwordField.sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		login.click();
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		Thread.sleep(2000);
		//Changing the Password
		driver.findElement(By.xpath("//a[normalize-space()='Change Password']")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("Assm@786");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("Assm@786");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		Thread.sleep(2000);
		// Log Out
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		Thread.sleep(2000);
		// Re login with new Password
		WebElement usernameField1 = driver.findElement(By.name("username"));
		usernameField1.sendKeys("Admin");
		WebElement passwordField1 = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		passwordField1.sendKeys("Assm@786");
		WebElement loginn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		loginn.click();
		Thread.sleep(2000);
		String pageTitle=driver.getTitle();
		String expTitle="OrangeHRM";
		assertEquals(expTitle,pageTitle);		
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("Test4 is Completed");
	  driver.quit();
  }
}
