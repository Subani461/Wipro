/*
 * Name : Asifkhan
 * Description : Home Page
 * Date : 06/08/2024
 */
package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class p34_HpmePage {
	
	WebDriver driver;
	WebElement register,login;
	p34_HpmePage(WebDriver driver){
		this.driver=driver;
	}
	
	void clickRegister() {
		register=driver.findElement(By.linkText("Register"));
		register.click();
	}
	
	void clickLogin() {
		login = driver.findElement(By.linkText("Log in"));
		login.click();
	}
}
