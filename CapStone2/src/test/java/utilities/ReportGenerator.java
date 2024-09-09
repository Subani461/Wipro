package utilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportGenerator{

    private static ExtentReports extent;
    private static ExtentTest logger;
    private static int i = 1;

    // Initialize the ExtentReports object
    public static void startReport() {
        if (extent == null) {
            extent = new ExtentReports("C:\\Users\\Administrator\\eclipse-workspace\\CapStone2\\src\\test\\resources\\ReportGenerator\\Report.html",true);
        }
    }

    // Start a new test
    public static void startTest(String testName) {
        if (extent != null) {
            logger = extent.startTest(testName);
        } else {
            System.out.println("ExtentReports is not initialized.");
        }
		logger.log(LogStatus.PASS, "Test is pass");
		i++;
    }


    // End the current test
    public static void endTest() {
        if (extent != null && logger != null) {
            extent.endTest(logger);
        } else {
            System.out.println("ExtentReports or logger is not initialized.");
        }
    }

    // Finalize the report
    public static void endReport() {
        if (extent != null) {
            extent.flush();
            extent.close();
        } else {
            System.out.println("ExtentReports is not initialized.");
        }
    }
}