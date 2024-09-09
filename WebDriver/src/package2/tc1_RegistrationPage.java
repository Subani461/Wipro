/*
 * Name : Asifkhan
 * Description : TestCase for Register Page.
 * Date : 06/08/2024
 */
package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc1_RegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		p34_HpmePage homepage = new p34_HpmePage(driver);
		homepage.clickRegister();
		// Registration Page
		p36_RegisterPage registerpage = new p36_RegisterPage(driver);
		registerpage.enterFirstName("Asifkhan");
		registerpage.enterLastName("Pathan");
		registerpage.enterEmail("newUser@gmail.com");

		Thread.sleep(5000);
		driver.quit();
	}

}
