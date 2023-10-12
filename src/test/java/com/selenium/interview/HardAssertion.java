package com.selenium.interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
 WebDriver driver=null;

	@Test
	public void hardAssertion()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String expcTit="Google";
		Assert.assertTrue(true);
		Assert.assertEquals(driver.getTitle(), expcTit);
		Assert.assertEquals("guvi", "guvi");
		System.out.println("successfully passed");
	}

}
