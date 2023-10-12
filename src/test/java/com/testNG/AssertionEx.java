package com.testNG;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionEx {

	WebDriver driver=null;
	
	@Test
	public void Assertion()
	{
		driver=new ChromeDriver();
		//driver.get("https://profile.w3schools.com/");
		driver.manage().window().maximize();
		
		Assert.assertTrue(true);
		Assert.assertEquals("selenium","selenium"); //true -then only move on to next otherwise throw error
		Assert.assertEquals("welcome", "welcome");
		System.out.println("successfully passed");		
		
	}
	@Test
	public void AssertFail()
	{
	Assert.assertFalse(false);	
	Assert.assertEquals("Selenium","selenium");
	Assert.assertEquals("welcome", "welcome");
	System.out.println("successfully passed");	
	}
}
