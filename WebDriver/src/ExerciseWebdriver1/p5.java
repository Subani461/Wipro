package ExerciseWebdriver1;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.Select;

public class p5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://advantageonlineshopping.com/");	
	    WebElement contactUs = driver.findElement(By.linkText("CONTACT US"));
		contactUs.click();
		Thread.sleep(5000); 
		List <WebElement> categories = driver.findElements(By.cssSelector("selector-for-categories"));
		boolean exist=false;
		for(WebElement Category:categories) {
			if(Category.getText().equals("Mice")) {
				exist=true;
				break;
			}
		}
		if(exist) {
			System.out.println("Mice Category Found");
		}
		else {
			System.out.println("Mice Category not Found");
		}
		System.out.println(categories.size());
		Thread.sleep(5000);
		driver.quit();	
	}
}
