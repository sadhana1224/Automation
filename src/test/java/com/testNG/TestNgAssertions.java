package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAssertions {

	WebDriver driver=null;


	@BeforeMethod
	public void launchBrowser()
	{
		driver= new ChromeDriver();
	}

	//@Test
	public void testCase1()
	{
		driver.get("https://www.google.com");
		String expectedTitle="Google";
		Assert.assertEquals(driver.getTitle(), expectedTitle);
		driver.findElement(By.name("q")).sendKeys("TestNg Assertions");
		
	}
	
	//@Test
	public void testCase2()
	{
		driver.get("https://www.google.com");
		String expectedTitle="Google";
		Assert.assertNotEquals(driver.getTitle(), expectedTitle);
		driver.findElement(By.name("q")).sendKeys("TestNg Assertions");
		
	}
	
	//@Test
	public void testCase3()
	{
		driver.get("https://www.google.com");
		String expectedTitle="Google1";
		Assert.assertTrue(driver.getTitle().equals(expectedTitle));
		driver.findElement(By.name("q")).sendKeys("TestNg Assertions");
		
	}
	
	@Test
	public void testCase4()
	{
		driver.get("https://www.google.com");
		String expectedTitle="Google";
		Assert.assertFalse(driver.getTitle().equals(expectedTitle));
		driver.findElement(By.name("q")).sendKeys("TestNg Assertions");
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}

}
