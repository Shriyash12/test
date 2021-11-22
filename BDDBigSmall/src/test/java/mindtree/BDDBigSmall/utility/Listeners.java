package mindtree.BDDBigSmall.utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;

public class Listeners extends BaseClass implements ITestListener {

	ExtentReports extent = ExtentReport.extentReportfun();

	String pathSS = null;

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();

	}

	public void onTestFailure(ITestResult result) {

		try {
			pathSS = Screenshot.getScreenshotPath("Screenshot captured");
		} catch (IOException e1) {

			e1.printStackTrace();
		}

		test.fail(result.getTestName() + " test failed ",
				MediaEntityBuilder.createScreenCaptureFromPath(pathSS).build());

		driver.close();

	}

	public void onTestSuccess(ITestResult result) {

		try {
			pathSS = Screenshot.getScreenshotPath("Screenshot captured");
		} catch (IOException e1) {

			e1.printStackTrace();
		}

		test.pass(result.getTestName() + " test successful",
				MediaEntityBuilder.createScreenCaptureFromPath(pathSS).build());

		driver.close();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

}