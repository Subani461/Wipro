/*
 * Name: Asifkhan
 * Description : Verifying the title of OrangeHRM
 * Date : 09/08/2024
 */
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Title extends ReportGenerator {
	WebDriver driver;
	@BeforeClass
	  public void setUp() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000);
	  }
  @Test
  public void verifyTitle() {
	  test = extent.startTest("testcase1");
	  System.out.println("Test1 is Running");
	  String expTitle = "OrangeHRM";
	  String actTitle = driver.getTitle();
	  System.out.println(actTitle);
	  assertEquals(expTitle,actTitle);
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("Test1 is Completed");
	  driver.quit();
  }
}
