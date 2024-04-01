package testnglisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener{

    @Override
    public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("Test case passed - " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
	Reporter.log("<a = href=\"\">Screenshot link</a>");
	System.out.println("Capturing scrennshot for failed case - " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	ITestListener.super.onFinish(context);
    }

}
