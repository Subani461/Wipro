/*
  Name : Asifkhan
  Description : counting  no of  element from dropdown.
  Date : 02/08/2024
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p10_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://sampleapp.tricentis.com/101/");
		driver.findElement(By.linkText("Automobile")).click();
		Select make = new Select(driver.findElement(By.id("make")));
		int count=0;
		count = make.getOptions().size();
		System.out.println(count);
		Thread.sleep(5000);
		driver.quit();
	}

}
