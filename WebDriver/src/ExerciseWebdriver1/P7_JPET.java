package ExerciseWebdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7_JPET {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/");
		WebElement ele = driver.findElement(By.linkText("Enter the Store"));
		ele.click();
		WebElement element1 = driver.findElement(By.xpath("//img[@src='../images/dogs_icon.gif']"));
		element1.click();
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		element2.click();
		Thread.sleep(3000);
		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		element3.click();
		Thread.sleep(3000);
		WebElement element4 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a"));
		element4.click();
		Thread.sleep(3000);
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[5]/input"));
		try {
		String Text = element5.getText();
		int value = Integer.parseInt(Text.trim());
		System.out.println(value);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		Thread.sleep(5000);
		driver.quit();
		
	}

}