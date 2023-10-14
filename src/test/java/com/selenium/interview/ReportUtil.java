package com.selenium.interview;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportUtil {

	public static ExtentSparkReporter sparkreporter;
	public static ExtentReports extentreport;
	public static ExtentTest extenttest;
	
	@BeforeSuite(alwaysRun=true)
	public static void startreport()
	{
		sparkreporter=new ExtentSparkReporter (System.getProperty("user.dir")+"/AutomationReport.html");
		sparkreporter.config().setDocumentTitle("w3schoolsAutomation");
		sparkreporter.config().setReportName("w3schools");
		sparkreporter.config().setTheme(Theme.DARK);
		
		extentreport=new ExtentReports();
		extentreport.attachReporter(sparkreporter);
		
	}
	
	public static void SetDesc(String testcasename)
	{
	extenttest=extentreport.createTest(testcasename);
		
	}
	
	public static void reportlog(String status,String desc)
	{
		if(status.equalsIgnoreCase("PASS"))
		{
			extenttest.log(Status.PASS, desc);
			
		}
		else if(status.equalsIgnoreCase("FAIL"))
		{
			extenttest.log(Status.FAIL, desc);
		}
		else if(status.equalsIgnoreCase("SKIP"))
		{
			extenttest.log(Status.SKIP, desc);
		}
		else if(status.equalsIgnoreCase("INFO"))
		{
			extenttest.log(Status.INFO, desc);
			
		}
	}
	
}
