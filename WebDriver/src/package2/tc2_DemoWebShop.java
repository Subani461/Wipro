/*
 * Name : Asifkhan
 * Description : Page Factory Model for DemoWebShop with tc2
 * Date : 06/08/2024
 */
package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc2_DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		p39_Demowebshop DWW = new p39_Demowebshop(driver);
		DWW.clickRegister();
		DWW.enterFirstName("Asifkhan");
		DWW.enterLastName("Pathan");
		DWW.enterEmail("newUser@gmail.com");
		Thread.sleep(5000);
		driver.quit();
	}

}
