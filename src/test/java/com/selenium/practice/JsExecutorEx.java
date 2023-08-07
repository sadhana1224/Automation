package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class JsExecutorEx {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0,1000);");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0,-500);");
		
		System.out.println(js.executeScript("return document.title;"));
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0,0);");
		Thread.sleep(2000);
		
		WebElement footerText= driver.findElement(By.xpath("//strong[text()='GreenKart']"));
		js.executeScript("arguments[0].scrollIntoView(true);", footerText);
		
		

	}

}
