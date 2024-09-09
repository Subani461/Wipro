package Exercise;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class P1_String {
  @Test
  public void stringLengthTest() {
	  String str = "JOHN";
	  int expectedResult = 4;
	  int actResult=str.length();
	  System.out.println("The Actual length of the string is : "+actResult);
	  assertEquals(expectedResult,actResult);
  }
}
