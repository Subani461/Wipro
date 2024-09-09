package Exercise;

import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void test1() throws InterruptedException {
	 
	 for(int i=0;i<=10;i++) {
		 System.out.println("i : "+i);
		 Thread.sleep(2000);
	 }
  }
}
