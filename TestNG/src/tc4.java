import org.testng.annotations.Test;

public class tc4 {
  @Test(priority=1)
  public void Login() {
	  System.out.println("Login");
  }
  @Test(priority=2)
  public void createOrder() {
	  System.out.println("Create Order");
  }
  @Test(priority=3)
  public void updateOrder() {
	  System.out.println("Update Order");
  }
  @Test(priority=4)
  public void deleteOrder() {
	  System.out.println("Delete Order");
  }
  @Test(priority=5)
  public void LogOut() {
		 System.out.println("LogOut");
  }
}
