package com.App.Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;

import com.google.common.io.Files;

@Listeners(screenShot.class)
 
public class screenShot extends TestListenerAdapter

{

	static int i = 1;

	static WebDriver driver;
	@Override

	public void onTestSuccess(ITestResult tr) 

	{

	System.out.println("Test case name is" + tr.getName());

	}

	@Override

	public void onTestFailure(ITestResult tr) 

	{
 
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	        //The below method will save the screen shot in d drive with name "screenshot.png"

	try {

		Files.copy(scrFile, new File("C:\\Users\\Administrator\\eclipse-workspace\\Cucumber_DemoWebshop\\src\\test\\resources\\screenshots\\step" + i + ".png"));

	} catch (IOException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

	}

	i++;

	}
 
 
}