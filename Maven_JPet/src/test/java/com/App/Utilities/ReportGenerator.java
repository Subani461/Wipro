/*
 * Name: Asifkhan
 * Description : Code for ReportGenerator 
 * Date : 09/08/2024
 */
package com.App.Utilities;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportGenerator {
	public static ExtentReports extent;
	ExtentTest logger;
	static int i=1;
	public void startReport() {
		extent = new ExtentReports("C:\\Users\\Administrator\\eclipse-workspace\\Maven_JPet\\src\\test\\resources\\reports\\Report1.html",true);	
	}
	public void startTest() {
		logger=extent.startTest("test"+i);
		logger.log(LogStatus.PASS, "Test is pass");
	}
	public void endTest() {
		extent.endTest(logger);
	}
	public void endReport() {
		extent.flush();
		extent.close();
	}
}
