/*
  Name : Asifkhan
  Description : Registration Form JPET Store Completely.
  Date : 02/08/2024
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p14_JPET {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/");
		// Clicking on the Link to go the Application.
		WebElement select = driver.findElement(By.linkText("Enter the Store"));
		select.click();
		// Clicking on the webElement Sign In.
		WebElement Register = driver.findElement(By.linkText("Sign In"));
		Register.click();
		// Selecting a new user Registration.
		WebElement Registration = driver.findElement(By.linkText("Register Now!"));
		Registration.click();
		
		// Entering the details in the Text Fields i.e User Information.
		WebElement User = driver.findElement(By.name("username"));
		User.sendKeys("Asif461");
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("Assm@786");
		WebElement RPassword = driver.findElement(By.name("repeatedPassword"));
		RPassword.sendKeys("Assm@786");
		
		// Entering Account Details
		WebElement Fname = driver.findElement(By.name("account.firstName"));
		Fname.sendKeys("Asifkhan")
;		WebElement Lname = driver.findElement(By.name("account.lastName"));
	    Lname.sendKeys("Pathan");
		WebElement Email = driver.findElement(By.name("account.email"));
		Email.sendKeys("pathanasifkhan461@gmail.com");
		WebElement Phone = driver.findElement(By.name("account.phone"));
		Phone.sendKeys("6305438229");
		WebElement Address1 = driver.findElement(By.name("account.address1"));
		Address1.sendKeys("Islampet");
		WebElement Address2 = driver.findElement(By.name("account.address2"));
		Address2.sendKeys("Soda Mastan Street");
		WebElement City = driver.findElement(By.name("account.city"));
		City.sendKeys("Bapatla");
		WebElement State = driver.findElement(By.name("account.state"));
		State.sendKeys("AP");
		WebElement Zip = driver.findElement(By.name("account.zip"));
		Zip.sendKeys("522101");
		WebElement Country = driver.findElement(By.name("account.country"));
		Country.sendKeys("INDIA");
		// Entering the Profile Information
		Select make = new Select(driver.findElement(By.name("account.languagePreferences")));
		make.selectByVisibleText("English");
		Select make1 = new Select(driver.findElement(By.name("account.favoriteCategoryId")));
		make1.selectByVisibleText("Fish");
		//Checking the CheckBox.
		WebElement C1 = driver.findElement(By.name("account.listOption"));
		if(!C1.isSelected()) {
			C1.click();
		}
		WebElement C2 = driver.findElement(By.name("account.bannerOption"));
		if(!C1.isSelected()) {
			C1.click();
		}
		// Save Account Information
		WebElement enter = driver.findElement(By.name("newAccount"));
		enter.click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
