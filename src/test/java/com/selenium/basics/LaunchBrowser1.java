package com.selenium.basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.bing.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.quit();

	}

}