/*
 * Name : Asifkhan
 * Description :ExtentReports
 * Date : 06/08/2024
 */
package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class p40_extentReports {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver;
			driver = new ChromeDriver();
			ExtentReports extent;
			ExtentTest logger; 
			extent = new ExtentReports("C:\\Users\\Administrator\\eclipse-workspace\\TestResults\\report.html",true);
			logger=extent.startTest("test1");
			driver.get("https://demowebshop.tricentis.com/");
			String s ;
			s= driver.getTitle();
			System.out.println(s);
			logger.log(LogStatus.PASS, "Test is pass");
			extent.endTest(logger);
			extent.flush();
			extent.close();
			driver.quit();
	}

}
