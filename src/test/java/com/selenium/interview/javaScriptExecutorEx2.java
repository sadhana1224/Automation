package com.selenium.interview;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutorEx2 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {

		driver=new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//flash
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		javascriptUtil.flashEle(logo, driver);
		//drawborder	
		WebElement border=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		javascriptUtil.drawElement(border, driver);

		//refresh the page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0);");


		//zoom
		WebElement zoome=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		javascriptUtil.zoomElement(zoome, driver);
		//alert
		//	javascriptUtil.alertbox(driver, "hello sadhana");

	}

}
