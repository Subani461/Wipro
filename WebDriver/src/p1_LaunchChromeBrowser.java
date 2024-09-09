/*
  Name : Asifkhan
  Description : Launching the ChromeDriver.
  Date : 02/08/2024
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1_LaunchChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://google.co.in");
		String s;
		s= driver.getTitle();
		System.out.println("The title of the application is : "+s);
		driver.quit();
	}

}
