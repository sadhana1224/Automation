package com.testNG;  //my practice

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgParallelEx2 {
	static WebDriver driver;
	@BeforeMethod
	public void launchbrowser()
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void launchlambda()
	{
		driver.navigate().to("https://www.lambdatest.com/");
		String ExpTtitle="Next-Generation Mobile Apps and Cross Browser Testing Cloud | LambdaTest";
		Assert.assertTrue(driver.getTitle().equals(ExpTtitle));
	}
	@Test
	public void launchbrowserstack()
	{
		driver.navigate().to("https://www.browserstack.com/");
		String ExpTtitle="Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertTrue(driver.getTitle().equals(ExpTtitle));
	}
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
