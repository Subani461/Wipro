/*
  Name : Asifkhan
  Description : selecting one by one element from dropdown.
  Date : 02/08/2024
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p11_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://sampleapp.tricentis.com/101/");
		driver.findElement(By.linkText("Automobile")).click();
		Select make = new Select(driver.findElement(By.id("make")));
		int count=0;
		count = make.getOptions().size();
		int i=0;
		for(i=0;i<count;i++) {
			make.selectByIndex(i);
			Thread.sleep(2000);
		}
		driver.quit();
	}

}
