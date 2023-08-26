package Listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ListenersImplementationExtentReports implements ITestListener
{
	private ExtentReports report;
	private ExtentTest test;
	public static ExtentTest stest;

	@Override
	public void onStart(ITestContext context)
	{
		ExtentSparkReporter spark =new ExtentSparkReporter("./ExtentReports/report.");
		spark.config().setReportName("ExtentReports");
		spark.config().setDocumentTitle("VTIGER-CRM");
		spark.config().setTheme(Theme.STANDARD);
		
		report= new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Author","Venkat");
		report.setSystemInfo("OS",System.getProperty("os.name"));
		report.setSystemInfo("OS Version",System.getProperty("os version"));
		report.setSystemInfo("Java Version",System.getProperty("Java Version"));
		
	}

	@Override
	public void onTestStart(ITestResult result)
	{
		Capabilities cap=((RemoteWebDriver)(BaseClass2.sdriver)).getCapabilities();
		report.setSystemInfo("Browser",cap.getBrowserName());
		report.setSystemInfo("Browser Version",cap.getBrowserVersion());
		
		test = report.createTest(result.getMethod().getMethodName());
		stest = test;
		}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.pass(result.getMethod().getMethodName()+"pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getMethod().getMethodName()+"fail");
		test.fail(result.getThrowable());
		TakesScreenshot ts =(TakesScreenshot)(BaseClass2.sdriver);
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dest= new File(".ElementScreenshot/" +result.getMethod().getMethodName()+".png");
		try
		{
			FileUtils.copyFile(src, dest);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(dest.getAbsolutePath());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.skip(result.getMethod().getMethodName()+"skipped");
		test.skip(result.getThrowable());
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		
     report.flush();
	}

}
