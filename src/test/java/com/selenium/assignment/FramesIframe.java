package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesIframe {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		driver.switchTo().frame("//*[@id='Multiple']/iframe"); //outside frame
		
		driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
		
		driver.findElement(By.xpath("/html/body/section/div/div/iframe")); //inside frame

	}

}
