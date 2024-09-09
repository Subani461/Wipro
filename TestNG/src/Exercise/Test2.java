package Exercise;

import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void test2() throws InterruptedException {
	  for(int j=0;j<=10;j++) {
			 System.out.println("j : "+j);
			 Thread.sleep(2000);
		 }
  }
}
