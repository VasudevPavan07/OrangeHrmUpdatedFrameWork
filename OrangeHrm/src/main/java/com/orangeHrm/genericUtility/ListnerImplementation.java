package com.orangeHrm.genericUtility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class ListnerImplementation implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		ITestListener.super.onTestStart(result);
		System.out.println("---Executing the Test Script---> "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		System.out.println("--The test script execution was Successful--> "+result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		
		String time = new Date().toString().replace(" ", "_").replace(":", "_");
		
		String testname = result.getMethod().getMethodName();
		
		System.out.println("======execute iam lsitening=====");
	
		TakesScreenshot ts = (TakesScreenshot)BaseClass.sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./Screenshot/"+testname+time+".png");
		try {
			FileHandler.copy(src, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ITestListener.super.onTestSkipped(result);
		System.out.println("--The Test script was Skipped--> "+result.getName());
	}
	//ISuiteListeners
	@Override
	public void onStart(ITestContext context) {
		ITestListener.super.onStart(context);
		System.out.println("--Initilizing suite execution--");
	}

	@Override
	public void onFinish(ITestContext context) {
		ITestListener.super.onFinish(context);
		System.out.println("--The Suite execution terminated--");
	}

	
	
	
	
//	public void onTestFailure(ITestResult result) {
//		
//		System.out.println("======execute iam lsitening=====");
//		
//		TakesScreenshot ts = (TakesScreenshot)BaseClass.sdriver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		
//		File destination = new File("./Screenshot/ss.png");
//		try {
//			FileHandler.copy(src, destination);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	

}
