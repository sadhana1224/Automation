package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class color {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

	driver.get("https://www.google.com/");

		driver.manage().window().maximize();
	WebElement cl=	driver.findElement(By.cssSelector("textarea[name='q']"));
	String clr=cl.getCssValue("color");
	System.out.println(clr);
		
	}

}
