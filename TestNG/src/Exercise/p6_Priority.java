package Exercise;

import org.testng.annotations.Test;

public class p6_Priority {
  @Test(priority=1)
  public void login() {
	  System.out.println("Log in");
  }
  @Test(priority=2)
  public void sendEmail() {
	  System.out.println("sending Email");
  }
  @Test(priority=3)
  public void logout() {
	  System.out.println("Log Out");
  }
}
