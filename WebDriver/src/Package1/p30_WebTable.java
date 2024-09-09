/*
  Name : Asifkhan
  Description : Web Table
  Date : 05/08/2024
 */
package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p30_WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/");
		WebElement ele = driver.findElement(By.linkText("Enter the Store"));
		ele.click();
		WebElement element1 = driver.findElement(By.xpath("//img[@src='../images/dogs_icon.gif']"));
		element1.click();
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[1]"));
		List <WebElement> list = driver.findElements(By.tagName("th"));
		System.out.println("Columns are : "+list.size());
		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody"));
		List <WebElement> list1 = driver.findElements(By.tagName("tr"));
		System.out.println("Rows are : "+(list1.size()-1));
	}

}
