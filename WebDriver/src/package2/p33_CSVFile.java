/*
 * Name : Asifkhan
 * Description : Reading data from csv file and matching those in Text fields in Application
 * Date : 06/08/2024
 */
package package2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p33_CSVFile {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String datafile = "C:\\SeleniumDownloads\\txtdoc.csv";
		BufferedReader br = null;
		String Line ="";
		String cvsSplitBy = ",";
		br = new BufferedReader(new FileReader(datafile));
		while((Line = br.readLine()) != null){
			String [] data = Line.split(cvsSplitBy);
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver;
			driver = new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			WebElement register = driver.findElement(By.linkText("Register"));
			register.click();
			WebElement fname = driver.findElement(By.id("FirstName"));
			fname.sendKeys(data[0]);
			WebElement lname = driver.findElement(By.id("LastName"));
			lname.sendKeys(data[1]);
			WebElement email = driver.findElement(By.id("Email"));
			email.sendKeys(data[2]);
			WebElement password = driver.findElement(By.id("Password"));
			password.sendKeys(data[3]);
			Thread.sleep(5000);
			driver.quit();
		}
	}
}
