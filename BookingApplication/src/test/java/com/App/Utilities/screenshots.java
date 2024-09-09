package com.App.Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.google.common.io.Files;

public class screenshots{
	static WebDriver driver;
	static int i=1;
	public static void takeScreenshot(WebDriver driver) throws IOException{
		System.out.println("Taking Screenshots");
		File scrFile;
		scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("C:\\Users\\Administrator\\eclipse-workspace\\BookingApplication\\src\\test\\resources\\ScreenShots\\step"+ i + ".jpeg"));
		i++;
	}
}
