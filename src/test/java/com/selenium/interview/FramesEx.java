package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class FramesEx {
static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("frame2");
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame1");
		WebElement f1=driver.findElement(By.tagName("h1"));
		System.out.println(f1.getText());
		
	}

}
