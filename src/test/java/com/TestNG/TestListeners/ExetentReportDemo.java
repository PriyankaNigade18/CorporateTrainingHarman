package com.TestNG.TestListeners;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExetentReportDemo {
  @Test
  public void createReport() 
  {
	  
	  ExtentReports extent=new ExtentReports();
	  
	  //path for report
	  ExtentSparkReporter spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//CRMReport.html");
	  
	  //configuration
	  spark.config().setDocumentTitle("AutomationReport");
	  spark.config().setReportName("CRM Regression Report");
	  spark.config().setTheme(Theme.DARK);
	  
	  //attach report to extent object
	  
	  extent.attachReporter(spark);
	  
	  //create a test to set the log
	  
	 ExtentTest test= extent.createTest("CRM Appliaction Test");
	  
	 //logs
	 test.log(Status.PASS, "Test Pass");
	  
	 test.log(Status.FAIL, "Test Fail");
	 test.log(Status.SKIP, "Test skip");
	 test.log(Status.INFO, "Test Info");
	 
	 //flush()
	 extent.flush();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
