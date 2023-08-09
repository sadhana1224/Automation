package com.testNG; //practice

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgGr1 {

	@BeforeMethod(alwaysRun=true)
	public void beforemethod()
	{
		System.out.println("before method");
	}
	
	@Test (groups= {"sanity"})
	public void test1()
	{
		System.out.println("testcase 1");
	}
	@Test(groups= {"smoke","sanity"})
	public void test2()
	{
		System.out.println("testcase 2");
	}
	@Test(groups= {"regression"})
	public void test3()
	{
		System.out.println("testcase 2");
	}
	@Test(groups= {"smoke"})
	public void test4()
	{
		System.out.println("testcase 4");
	}
	@AfterMethod (alwaysRun=true)
	public void aftermethod()
	{
		System.out.println("before method");
	}
}
