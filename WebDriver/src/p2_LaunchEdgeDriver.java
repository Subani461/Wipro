/*
  Name : Asifkhan
  Description : Launching the WebDriver.
  Date : 02/08/2024
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class p2_LaunchEdgeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		WebDriver driver;
		driver = new EdgeDriver();
		driver.get("http://google.co.in");
		String s;
		s= driver.getTitle();
		System.out.println("The title of the application is : "+s);
		driver.quit();
	}

}
