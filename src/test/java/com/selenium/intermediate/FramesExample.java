package com.selenium.intermediate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {
	static WebDriver driver;
	public static void main(String[] args) {
		
			driver=new ChromeDriver();
			driver.navigate().to("https://demoqa.com/frames");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.switchTo().frame("frame1");
			System.out.println(driver.findElement(By.tagName("h1")).getText());

			driver.switchTo().defaultContent();
			
			driver.switchTo().frame("frame2");
			System.out.println(driver.findElement(By.tagName("h1")).getText());
			
	}

}
