package com.testNG; //practice

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNggr2 {
	@BeforeMethod (alwaysRun=true)
	public void beforemethod()
	{
		System.out.println("before method");
	}
	
	@Test(groups= {"regression"})
	public void test5()
	{
		System.out.println("testcase 5");
	}
	@Test(groups= {"sanity"})
	public void test6()
	{
		System.out.println("testcase 6");
	}
	@Test(groups= {"sanity","smoke"})
	public void test7()
	{
		System.out.println("testcase 7");
	}
	@Test(groups= {"smoke"})
	public void test8()
	{
		System.out.println("testcase 8");
	}
	@AfterMethod (alwaysRun=true)
	public void aftermethod()
	{
		System.out.println("before method");
	}
}


