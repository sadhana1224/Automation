package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationProgram {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");
		
		driver.findElement(By.cssSelector("div.category-cards")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		System.out.println("forward success");
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		System.out.println("refresh success");
		
		driver.navigate().to("https:///www.google.com");
		Thread.sleep(1000);
		
		driver.quit();
		

	}

}
