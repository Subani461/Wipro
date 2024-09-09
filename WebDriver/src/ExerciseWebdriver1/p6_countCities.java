package ExerciseWebdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p6_countCities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		Select make = new Select(driver.findElement(By.name("fromPort")));
		int total = make.getOptions().size();
		System.out.println("The total cities are : "+total);
		Thread.sleep(5000);
		driver.quit();
	}

}
