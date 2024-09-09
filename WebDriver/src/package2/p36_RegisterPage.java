/*
 * Name : Asifkhan
 * Description : Register Page
 * Date : 06/08/2024
 */
package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class p36_RegisterPage {
	
	WebDriver driver;
	WebElement fname,lname,email;
	p36_RegisterPage(WebDriver driver){
		this.driver=driver;
	}
	
	void enterFirstName(String s) {
		fname = driver.findElement(By.id("FirstName"));
		fname.sendKeys(s);
	}
	
	void enterLastName(String s) {
		lname = driver.findElement(By.id("LastName"));
		lname.sendKeys(s);
	}
	
	void enterEmail(String s) {
		email = driver.findElement(By.id("Email"));
		email.sendKeys(s);
	}
}
