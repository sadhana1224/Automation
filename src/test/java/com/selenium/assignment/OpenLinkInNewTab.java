package com.selenium.assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkInNewTab {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {

		driver=new ChromeDriver();
		driver.get("https://hashnode.com/");
		
		String tab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		driver.findElement(By.xpath("(//a[text()='Get started'])[1]")).sendKeys(tab);
		
		
		
		
	}

}
