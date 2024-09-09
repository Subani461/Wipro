/*
 * Name : Asifkhan
 * Description : Login Page
 * Date : 06/08/2024
 */
package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class p35_LoginPage {
	
	WebDriver driver;
	WebElement username,password;
	p35_LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	void enterUserName(String s) {
		username = driver.findElement(By.id("Email"));
		username.sendKeys(s);
	}
	
	void enterPassword(String s) {
		password=driver.findElement(By.id("Password"));
		password.sendKeys(s);
	}
}
