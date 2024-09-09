/*
 * Name : Asifkhan
 * Description : TestCase for Login Page.
 * Date : 06/08/2024
 */
package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc1_LoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		p34_HpmePage homepage = new p34_HpmePage(driver);
		// Login Page
		homepage.clickLogin();
		p35_LoginPage loginpage = new p35_LoginPage(driver);
		loginpage.enterUserName("newUser@gmail.com");
		loginpage.enterPassword("password");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
