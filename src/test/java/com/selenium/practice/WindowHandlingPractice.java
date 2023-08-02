package com.selenium.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingPractice {
static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
		Set<String> child=driver.getWindowHandles();
		for(String childWin:child)
		{
			if(!parent.equalsIgnoreCase(childWin))
			{
				driver.switchTo().window(childWin);
				String childWinText=driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
				System.out.println(childWinText);
				//come back to the parent window
				driver.switchTo().window(parent);
				String parentWinText=driver.findElement(By.xpath("//div[@class='main-header']")).getText();
				System.out.println(parentWinText);
				
			}
		}

	}

}
