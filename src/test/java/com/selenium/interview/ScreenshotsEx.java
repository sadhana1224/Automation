package com.selenium.interview;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotsEx {
static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		//full part
		/*
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File tar=new File(".\\screenshots\\amazon.png");
		FileUtils.copyFile(src, tar);
		*/
		//section
		WebElement sec=driver.findElement(By.xpath("//div[@class='a-section a-spacing-none shogun-widget deals-shoveler fresh-shoveler']"));
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File src1=sec.getScreenshotAs(OutputType.FILE);
		File tar1=new File(".\\screenshots\\section.png");
		FileUtils.copyFile(src1, tar1);
		
		Thread.sleep(3000);
		//element
		WebElement logo=driver.findElement(By.id("nav-logo-sprites"));
	
		File src2=logo.getScreenshotAs(OutputType.FILE);
		File tar2=new File(".\\screenshots\\logoo.png");
		FileUtils.copyFile(src2, tar2);
		
		
		
	}

}
