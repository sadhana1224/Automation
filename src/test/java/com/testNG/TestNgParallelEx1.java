package com.testNG;  //my practice

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgParallelEx1 {
	static WebDriver driver;

	@BeforeMethod
	public void launchbrowser()
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test (invocationCount=3, threadPoolSize=3)
	public void launchgoogle()
	{
		driver.navigate().to("https://www.google.com/");
		String ExpTtitle="Google";
		Assert.assertTrue(driver.getTitle().equals(ExpTtitle));
	}
	
	@Test
	public void launchyahoo()
	{
		driver.navigate().to("https://in.search.yahoo.com/");
		String ExpTtitle="Yahoo Search - Web Search";
		Assert.assertTrue(driver.getTitle().equals(ExpTtitle));
	}
	@Test
	public void launchlambda() throws InterruptedException
	{

		driver.get("https://www.lambdatest.com/");
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Login']"))));
		String expectedTitle="Next-Generation Mobile Apps and Cross Browser Testing Cloud | LambdaTest";
		String actualTitle= driver.getTitle();
		Thread.sleep(2000);
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}

