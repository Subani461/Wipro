import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class lab_LaunchTheApplication {
	WebDriver driver;
  @Test
  public void f() {
	  String expTitle="Google";
	  String actTitle =driver.getTitle();
	  assertEquals(expTitle,actTitle);
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
