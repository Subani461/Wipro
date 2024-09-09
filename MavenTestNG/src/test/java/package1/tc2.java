package package1;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;



public class tc2 extends customListener {
	//WebDriver driver;
  @Test
  public void f() {
	  driver = new EdgeDriver();
	  driver.get("http://www.google.co.in");
	  String expTitle = "Google";
	  String actTitle = driver.getTitle();
	  assertEquals(expTitle, actTitle);
	  driver.quit();
  }
 }

