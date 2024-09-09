import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;

public class calculatorTest {
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.out.println("Test Started..");
	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  System.out.println("Test Ended..");
	  Thread.sleep(5000);
  }


  @Test
  public void AddTest() {
    calculator c = new calculator();
    int n1=4,n2=3,Eresult=7,Aresult;
    Aresult=c.Add(n1,n2);
    assertEquals(Eresult,Aresult);
  }
}
