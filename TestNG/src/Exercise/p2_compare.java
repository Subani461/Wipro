package Exercise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;

public class p2_compare {
  @Test
  public void f() {
	  int A=100;
	  int B=20;
	  boolean expResult = false;
	  compare c = new compare();
	 boolean actResult= c.compareNumbers(A,B);
	 assertEquals(expResult,actResult);
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Test Started...");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test...");
  }

}
