/*
 * Name: Asifkhan
 * Description : Code for ReportGenerator 
 * Date : 09/08/2024
 */
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ReportGenerator {
	public static ExtentReports extent;
	public static ExtentTest test;
  @Test
  public void f() {
	  
  }
  @AfterMethod
  public void getResult(ITestResult result) {
	  if(result.getStatus() == ITestResult.FAILURE) {
		  test.log(LogStatus.FAIL,"Test is Fail");
	  }
	  else if(result.getStatus() == ITestResult.SUCCESS){
		  test.log(LogStatus.PASS,"Test is Pass");
	  }
  }

  @BeforeSuite
  public void beforeSuite() {
	  extent = new ExtentReports("C:\\Users\\Administrator\\eclipse-workspace\\Maven_HRM\\TestResults\\Rt1.html",true);
  }

  @AfterSuite
  public void afterSuite() {
	  extent.flush();
  }

}
