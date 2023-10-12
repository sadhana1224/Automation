package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		WebElement pf=driver.findElement(By.tagName("body"));
		System.out.println(pf.getText());
		
		driver.switchTo().frame(0);
		WebElement cf=driver.findElement(By.tagName("p"));
		System.out.println(cf.getText());
		
		driver.switchTo().parentFrame();
		System.out.println(pf.getText());
		
	}

}
