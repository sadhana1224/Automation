package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEx1 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.name("q"));
		//sendkeys
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='selenium';", search);
		//title
		System.out.println(js.executeScript("return document.title;"));
		//click
		WebElement ele=driver.findElement(By.name("btnK"));
		js.executeScript("arguments[0].click();", ele);
		
		//vertical scroll down
		js.executeScript("window.scrollTo(0,1000);");
		
		Thread.sleep(3000);
		//vertical scrollup
		//js.executeScript("window.scrollTo(0,-500);");
		
		//scroll down to the bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
		//scroll up
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
		
	}

}
