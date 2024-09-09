package package1;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class tc1 extends customListener {
	//WebDriver driver;
  @Test
  public void f() {
	  driver = new EdgeDriver();
	  driver.get("https://demowebshop.tricentis.com/");
	  String expTitle = "Demo Web Shops";
	  String actTitle = driver.getTitle();
	  assertEquals(expTitle, actTitle);
	  driver.quit();
  }
  }
