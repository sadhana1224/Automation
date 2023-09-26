package com.selenium.assignment; //robot class working

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload2Methods {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		driver=new ChromeDriver();

		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		//using send keys method
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();

		//driver.findElement(By.xpath("//input[@id='file-upload']"));

		//using robot class
		WebElement button=driver.findElement(By.xpath("//input[@id='file-upload']"));;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);
		//copy th path
		//ctrl V
		//Enter
		Robot rb=new Robot();

		rb.delay(2000);

		StringSelection ss=new StringSelection("\"C:\\Users\\Guest User\\Downloads\\javaatsyllabus.pdf\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		//Ctrl V

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);	
		rb.delay(2000);
		//enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(2000);
	}

}
