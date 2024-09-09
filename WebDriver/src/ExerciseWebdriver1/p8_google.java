package ExerciseWebdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p8_google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		// Entering the some text in search field
		WebElement element = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		element.sendKeys("learning selenium"+Keys.RETURN);
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/span/a/div/div/div/div[2]/cite"));
		element2.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
