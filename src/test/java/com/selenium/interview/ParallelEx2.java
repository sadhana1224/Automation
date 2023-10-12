package com.selenium.interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelEx2 {
	
	WebDriver driver=null;
	
	@Test
	public void parallel2()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String exp="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertTrue(true);
		Assert.assertEquals(driver.getTitle(), exp);
		System.out.println("successfully assertion passed");
		
	}

}
