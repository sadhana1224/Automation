package com.testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	SoftAssert sa=new SoftAssert();
	
	@Test
	public void softassertion()
	{
		sa.assertTrue(false);
		sa.assertEquals("selenium1", "selenium"); //if pass or failed it will move to next
		sa.assertEquals("sadhana", "sadhana");
	}
}
