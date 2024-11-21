package com.TestNG.TestListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener
{
	
	
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test started...."+result.getName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Case Sataus Pass:"+result.getName());
	}

	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Case Status Fail:"+result.getName());
		
	}
}
