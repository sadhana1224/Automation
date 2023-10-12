package com.selenium.interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.testNG.SoftAssertion;

public class SoftAssertionEx {

	WebDriver driver=null;
	SoftAssert sa=new SoftAssert();
	@Test
	
	public void softAssertion()
	{
	
		sa.assertTrue(false);
		//sa.assertEquals(driver.getTitle(), expt);
		sa.assertEquals("guvi1", "guvi");
		sa.assertEquals("guvi", "guvi");
		
	}
}
