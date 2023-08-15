package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsertesting {
	
static WebDriver driver;
@BeforeTest
@Parameters({"browsers"})
public void launchbrowser(String browsername)
{
	if(browsername.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browsername.equals("edge"))
	{
		driver =new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}
@Test
public void verifyTitle()
{
	try
	{
		driver.get("https://www.google.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("q"))));
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getTitle(), "Google");
		driver.findElement(By.id("q")).sendKeys("cross browser in automation");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}

@AfterTest
public void closebrowser()
{
	driver.quit();
}

}
