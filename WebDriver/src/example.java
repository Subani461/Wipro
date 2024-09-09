import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		
	}
}
