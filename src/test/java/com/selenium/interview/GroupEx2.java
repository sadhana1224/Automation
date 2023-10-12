package com.selenium.interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupEx2 {
	WebDriver driver=null;
	
	@Test(groups= {"smoke"})
	public void titlePage()
	{
		driver=new ChromeDriver();
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		driver.manage().window().maximize();
		
		String exp="Myntra";
		Assert.assertTrue(true);
		Assert.assertEquals(driver.getTitle(), exp);
		System.out.println("successfully assert passed");
	}

}
