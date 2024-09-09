package Package;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class tc1 extends listenerClass {
  @Test
  public void f() {
	  driver = new EdgeDriver();
	  driver.get("https://demowebshop.tricentis.com/");
	  String expTitle = "Demo Web Shop";
	  String actTitle = driver.getTitle();
	  assertEquals(expTitle, actTitle);
	  driver.quit();
  }
}
