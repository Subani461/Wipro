/*
  Name : Asifkhan
  Description : Locator : By.xPathRelative-contains
  pattern : //*[contains(@name,'value')]
  Date : 05/08/2024
 */
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p27_ContainsText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"Content\"]/h2"));
		String s = element.getText();
		System.out.println(s);
	}

}
