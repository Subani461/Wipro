import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Lab_Priority {
  @Test(priority=1)
  public void register() {
	  System.out.println("Register");
  }
  @Test(priority=2)
  public void login() {
	  System.out.println("Login");
  }
  @Test(priority=3)
  public void readEmail() {
	  System.out.println("ReadEmail");
  }
  @Test(priority=4)
  public void sendEmail() {
	  System.out.println("Send Email");
  }
  @Test(priority=5)
  public void deleteEmail() {
	  System.out.println("Delete Email");
  }
  @Test(priority=6)
  public void logout() {
	  System.out.println("Log Out");
  }
 

}
