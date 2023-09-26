package com.selenium.assignment; //working

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot3MEthods {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {

		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//full page screenshots
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\homepage.png");
		FileUtils.copyFile(src, trg);
		
		//screenshot of particular section
		WebElement section=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));

		src=section.getScreenshotAs(OutputType.FILE);
		trg=new File(".\\screenshots\\feature.png");
		FileUtils.copyFile(src, trg);
		
		//screenshot of particular webelement
		
		WebElement ele=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	src=ele.getScreenshotAs(OutputType.FILE);
	trg=new File(".\\screenshots\\logo.png");
	FileUtils.copyFile(src, trg);
	}

}
