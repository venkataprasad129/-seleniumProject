package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenersImplimentation implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) 
	{
		System.err.println("onTestStart");
	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.err.println("onTestSuccess");
		
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.err.println("onTestFailure");
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.err.println("onTestSkipped");
		
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
