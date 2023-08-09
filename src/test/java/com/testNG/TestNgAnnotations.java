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

public class TestNgAnnotations {
	
	
	/*
	 * BS - 1
	 * BT - 1
	 * BC - 1
	 * BM - 3
	 * @Test - 3
	 * AM - 3
	 * AC - 1
	 * AT - 1
	 * AS - 1
	 * 
	 *
	 */
	
	
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This will get executed only once before the entire automation suite");
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This will get executed only once before the entire Test (SanityTest, RegressionTest etc)");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This will get executed only once before all the @Test annotated methods in a class");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This will get executed before each @Test annotated method");
	}
	
	
	/*
	 * priority
	 * enabled
	 * dependsOnMethods
	 * alwaysRun
	 * 
	 */
	
	@Test (priority=3, dependsOnMethods="atestCase4")
	public void testCase1()
	{
		System.out.println("Test case 1");
	}
	
	@Test (priority=2, alwaysRun=true)
	public void testCase2()
	{
		System.out.println("Test case 2");
	}
	
	@Test (priority=1, enabled=false)
	public void testCase3()
	{
		System.out.println("Test case 3");
	}
	
	@Test (priority=4)
	public void atestCase4()
	{
		System.out.println("Test case 4");
	}
	
	
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This will get executed  after each @Test annotated method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("This will get executed only once after all the @Test annotated methods in a class");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("This will get executed only once after the entire Test (Sanity Test, Regression Test etc)");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This will get executed only once after the entire automation suite");
	}
	
	
	
	
	
	

}
