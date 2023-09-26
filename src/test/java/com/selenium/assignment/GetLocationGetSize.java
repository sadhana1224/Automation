package com.selenium.assignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationGetSize {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {

		driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		//location
		//method 1
	WebElement fb=	driver.findElement(By.xpath("//img[@alt='Facebook']"));
	System.out.println(fb.getLocation());
	System.out.println(fb.getLocation().getX());
	System.out.println(fb.getLocation().getY());
	//method 2
	System.out.println(fb.getRect().getX());
	System.out.println(fb.getRect().getY());
	
	//size
	System.out.println(fb.getSize());
	System.out.println(fb.getSize().getWidth());
	System.out.println(fb.getSize().getHeight());
	
	//method 2
	System.out.println(fb.getRect().getDimension().getWidth());
	System.out.println(fb.getRect().getDimension().getHeight());
	}

}
