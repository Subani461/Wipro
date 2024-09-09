package package3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p44_properties {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Properties obj =  new Properties();
		FileInputStream objFile = new FileInputStream("obj.properties");
		obj.load(objFile);
		String register=obj.getProperty("register");
		String fname=obj.getProperty("fname");
		String lname=obj.getProperty("lname");
		String login=obj.getProperty("login");
		System.out.println("Register Link has a text of : "+register);
		System.out.println("FirstName has a id of : "+fname);
		System.out.println("LastName has id of : "+lname);
		System.out.println("Login link has a text of : "+login);
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		WebElement Fname = driver.findElement(By.id(fname));
		Fname.sendKeys("firstname1");
		WebElement Lname = driver.findElement(By.id(lname));
		Fname.sendKeys("lastname1");
		Thread.sleep(5000);
		driver.quit();
	}

}
