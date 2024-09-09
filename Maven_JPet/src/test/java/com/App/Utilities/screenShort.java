package com.App.Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.google.common.io.Files;

public class screenShort extends ReportGenerator{
	static WebDriver driver;
	static int i=1;
	public static void takeScreenshot(WebDriver driver) throws IOException{
		System.out.println("Taking Screenshots");
		File scrFile;
		scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("C:\\Users\\Administrator\\eclipse-workspace\\Maven_JPet\\src\\test\\resources\\screenshorts\\step"+ i + ".jpeg"));
		i++;
	}
}
