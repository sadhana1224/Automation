package com.selenium.intermediate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingAutoIt {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();

		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		
		Thread.sleep(2000);
		WebElement uploadButton= driver.findElement(By.id("file-upload"));
		uploadButton.click();
		//driver.findElement(By.id("file-upload")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\Guest User\\OneDrive\\Documents\\fileuploadscript.exe");	
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(2000);
		
		if(driver.getPageSource().contains("File Uploaded!"))
		{
			System.out.println("File Upload Successful");
		}
		else
		{
			System.out.println("File Upload not successful");
		}

	}

}
