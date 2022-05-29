package resouces;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsTestNG {
	static ExtentReports extent;

	public static ExtentReports getReportObject() {
		// ExtentReport, ExtentSparkReporter
		String path = System.getProperty("user.dir") + "\\HTMLReports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation_Results");
		reporter.config().setDocumentTitle("Testing Results");
		// This is use for all execution yhi sare execution ko store krne ka kam krta
		// hai
		// using listener we are using defined extentCreate test in onTestStart method.
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Aman", path);
		return extent;
	}
}
