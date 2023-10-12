package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Guest User\\Downloads\\javaatsyllabus.pdf");
		
		Thread.sleep(2000);
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(2000);
		
		if(driver.getPageSource().contains("File Uploaded!"))
		{
			System.out.println("file upload succesfull");
		}
		else
		{
			System.out.println("not successfull");
		}
		
		
				
	}

}
