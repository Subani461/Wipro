package pack1;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class OrangeHRM extends reportGenerators {
	WebDriver driver;
	WebDriverWait wait;
	@Test
  
	@BeforeClass
  public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
  }
  @Test
  public void verifyTitle() {
	  String expTitle = "OrangeHRM";
	  String actTitle = driver.getTitle();
	  test = extent.startTest("testcase1");
	  assertEquals(expTitle,actTitle);
  }
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
