package com.selenium.practice;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Attributesoftest {

	@BeforeMethod
	public void  beforemethod()
	{
		System.out.println("this method will be executed before @Test annotation");
	}

	@Test(priority=2, enabled=false)
	
	public void test1()
	{
		System.out.println("testcase 1");
	}
	
	@Test (priority=1)
	public void test2()
	{
		System.out.println("testcase 2, priority=1");
	}
	
	@Test(priority=3,dependsOnMethods="test4")
	public void atest3()
	{
		System.out.println("testcase 3-alphabetical order,dependsOnMethod test4");
	}
	@Test(priority=4,alwaysRun=true)
	public void test4()
	{
		System.out.println("testcase 4, alwaysrun=true");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("this method will be executed after @Test annotation");
	}
	
}
