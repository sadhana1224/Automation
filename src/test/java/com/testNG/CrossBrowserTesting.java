package com.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossBrowserTesting {
	

	WebDriver driver=null;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void launchBrowser(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browserName.equals("edge"))
		{
			driver= new EdgeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@Test
	public void verifyTitle()
	{
		try
		{
			driver.get("https://www.google.com");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("q"))));
			
			Assert.assertEquals(driver.getTitle(), "Google");
			
			driver.findElement(By.name("q")).sendKeys("Cross browser Testing");
			Thread.sleep(2000);
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	
	@AfterMethod
	public void closeBrowsers()
	{
		driver.quit();
	}
}
