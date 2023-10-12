package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserEx {
	WebDriver driver=null;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void launchbrowser(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browsername.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void searchfun()
	{
		driver.findElement(By.name("q")).sendKeys("delta airlines");
		String exp="Google";
		Assert.assertTrue(true);
		Assert.assertEquals(driver.getTitle(), exp);
		System.out.println("assert successfull");
	}
	
	@AfterMethod
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}

}
