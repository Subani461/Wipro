package ExerciseWebdriver1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class p3_screenshot {
	static WebDriver driver;
	static int i=0;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		takeScreenshot();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("Admin");
		takeScreenshot();
		
		WebElement passwordField = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		passwordField.sendKeys("admin123");
		takeScreenshot();
		
		WebElement login = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		login.click();
		
		takeScreenshot();
		Thread.sleep(5000);
		driver.quit();
	}
	static void takeScreenshot() throws IOException{
		System.out.println("Taking Screenshots");
		File scrFile;
		scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("C:\\Users\\Administrator\\eclipse-workspace\\Screenshots\\step"+ i + ".jpeg"));
		i++;
	}

}
