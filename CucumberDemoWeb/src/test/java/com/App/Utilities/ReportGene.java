package com.App.Utilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportGene {
	public static ExtentReports extent;
	ExtentTest logger;
	static int i=1;
	public static ExtentTest test;
	public void startReport() {
		extent = new ExtentReports("C:\\Users\\Administrator\\eclipse-workspace\\CucumberDemoWeb\\src\\test\\resources\\ReportGeneration\\Report1.html",true);	
	}
	public void startTest() {
		
		logger=extent.startTest("test"+i);
		logger.log(LogStatus.PASS, "Test is pass");
		i++;
		
	}
	public void endTest() {
		extent.endTest(logger);
	}
	public void endReport() {
		extent.flush();
		extent.close();
	}
}
