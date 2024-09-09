/*
 * Name: Asifkhan
 * Description : Running Test2
 * Date : 09/08/2024
 */
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class P2_tc2 {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println(driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.co.in/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
