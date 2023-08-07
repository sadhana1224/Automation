package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsExecuteEx2 {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement searchText=driver.findElement(By.name("q"));
		js.executeScript("arguments[0].value='Javascriptexecutor';", searchText);
		
		WebElement imageClick=driver.findElement(By.linkText("Images"));
		js.executeScript("arguments[0].click();", imageClick);
	}

}
