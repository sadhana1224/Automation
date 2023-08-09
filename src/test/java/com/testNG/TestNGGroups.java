package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGGroups {
	
	
	
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod()
	{
		System.out.println("This will get executed before each @Test annotated method");
	}
	
	
	@Test(groups= {"sanity"})
	public void testCase1()
	{
		System.out.println("Test case 1");
	}
	
	@Test (groups= {"sanity","smoke"})
	public void testCase2()
	{
		System.out.println("Test case 2");
	}
	
	@Test (groups= {"smoke"})
	public void testCase3()
	{
		System.out.println("Test case 3");
	}
	
	@Test (groups= {"sanity","regression","smoke"})
	public void testCase4()
	{
		System.out.println("Test case 4");
	}
	
	
	
	
	@AfterMethod(alwaysRun=true)
	public void afterMethod()
	{
		System.out.println("This will get executed  after each @Test annotated method");
	}
	
	
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This will get executed only once after the entire automation suite");
	}
	
	
	
	
	
	

}
