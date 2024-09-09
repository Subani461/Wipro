/*
 * Name : Asifkhan
 * Description : Page Factory Model for DemoWebShop
 * Date : 06/08/2024
 */
package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class p39_Demowebshop {
	WebDriver driver;
	p39_Demowebshop(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Register")
	WebElement register;
	@FindBy(linkText="Log in")
	WebElement login;
	void clickRegister() {
		register.click();
	}
	void clickLogin() {
		login.click();
	}
	// Login Page
	@FindBy(id="Email")
	WebElement email;
	@FindBy(id="Password")
	WebElement password;
	void enterUserName(String s) {
		email.sendKeys(s);
	}
	void enterPassword(String s) {
		password.sendKeys(s);
	}
	// Registration Page
	@FindBy(id="FirstName")
	WebElement fname;
	@FindBy(id="LastName")
	WebElement lname;
	@FindBy(id="Email")
	WebElement emailR;
	void enterFirstName(String s) {
		fname.sendKeys(s);
	}
	void enterLastName(String s) {
		lname.sendKeys(s);
	}
	void enterEmail(String s) {
		emailR.sendKeys(s);
	}
}
