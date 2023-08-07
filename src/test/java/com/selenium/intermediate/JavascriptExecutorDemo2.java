package com.selenium.intermediate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class JavascriptExecutorDemo2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		//JavascriptExecutor is used to execute javascript commands in Selenium
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Pass value to a text box without using sendkeys()
		WebElement searchText=driver.findElement(By.name("q"));
		js.executeScript("arguments[0].value='Javascriptexecutor';", searchText);
		
		//click on a webelement
		WebElement imageClick=driver.findElement(By.linkText("Images"));
		js.executeScript("arguments[0].click();", imageClick);
		
	}

}
