package ExerciseWebdriver1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/");
		WebElement ele = driver.findElement(By.linkText("Enter the Store"));
		ele.click();
		List <WebElement> list2 =driver.findElements(By.tagName("a"));
		int count = list2.size();
		System.out.println("The no of Clickable links are : "+count);
	}

}
