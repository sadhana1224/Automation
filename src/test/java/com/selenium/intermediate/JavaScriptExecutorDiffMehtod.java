package com.selenium.intermediate; //working

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDiffMehtod {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {

		driver=new ChromeDriver();
	
		driver.get("https://demo.nopcommerce.com/");
		
		//draw border for perticular element and take screenshot
		
	/*	WebElement ele=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavascriptUtil.drawBorder(ele, driver);
*/
		
		//title of the page
	String title=JavascriptUtil.getTitleJS(driver);
	System.out.println(title);
	
	//generate alert
//	JavascriptUtil.generateAlert(driver, "this is my alert");
	
	//refresh page
	
	// JavascriptUtil.refreshJS(driver);
	
	//scroll up to the page
	//JavascriptUtil.scrollPAgeUp(driver);
	
	//flash 
	WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	JavascriptUtil.flash(logo, driver);
	}
}
