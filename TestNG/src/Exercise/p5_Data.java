package Exercise;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class p5_Data {
  @Test(dataProvider = "dp")
  public void studentDetails(String S1, String S2,int Age) {
	  System.out.println("Roll No : "+S1+", Name : "+S2+", Age : "+Age);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"18B91A02F2","Asifkhan",24  },
      new Object[] { "18b91A02f3","Pawan Kalyan",24 },
      new Object[] { "18B91A02F4","Lokesh",24 },
    };
  }
}
