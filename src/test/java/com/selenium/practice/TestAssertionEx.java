package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAssertionEx {
	
	WebDriver driver=null;
	
	@BeforeMethod
	public void beforemethod()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void assertequals()
	{
		driver.navigate().to("https://www.google.com/");
		String expectedTitle="Google";
		Assert.assertEquals(driver.getTitle(), expectedTitle);
		driver.findElement(By.id("APjFqb")).sendKeys("TestNg Assertions");
	}
	
	@Test
	public void assertnotequals() throws InterruptedException
	{
		driver.navigate().to("https://www.google.com/");
		String expectedTitle="Google1";
		Assert.assertNotEquals(driver.getTitle(), expectedTitle);
		driver.findElement(By.id("APjFqb")).sendKeys("TestNg Assertions");
		Thread.sleep(1000);
	}
	@Test
	public void asserttrue()
	{
		driver.navigate().to("https://www.google.com/");
		String expectedTitle="Google";
		Assert.assertTrue(driver.getTitle().equals(expectedTitle));
		driver.findElement(By.id("APjFqb")).sendKeys("TestNg Assertions");
	}
	@Test
	public void assertfalse()
	{
		driver.navigate().to("https://www.google.com/");
		String expectedTitle="Google1";
		Assert.assertFalse(driver.getTitle().equals(expectedTitle));
		driver.findElement(By.id("APjFqb")).sendKeys("TestNg Assertions");
	}
	@AfterMethod
	public void aftermethod()
	{
		driver.quit();
	}
	

}
