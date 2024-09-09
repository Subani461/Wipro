/*
  Name : Asifkhan
  Description : Printing the title in the Console.
  Date : 05/08/2024
 */
package ExerciseWebdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1_Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		System.out.println("The Title of the Application is : "+title);
	}

}
