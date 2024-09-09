/*
  Name : Asifkhan
  Description : Checking whether the checkbox is selected or not.
  Date : 02/08/2024
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p12_CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		WebElement rememberme = driver.findElement(By.id("RememberMe"));
	    boolean res = rememberme.isSelected();
	    System.out.println("Is remember me selected : "+res);
	    driver.quit();
	}

}
