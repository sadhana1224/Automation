package com.selenium.intermediate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesEx2 {
	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		//frame 1
		WebElement frame1=driver.findElement(By.id("frame1"));            
		driver.switchTo().frame(frame1);
		WebElement head1= driver.findElement(By.tagName("body"));

		String text=head1.getText();
		System.out.println(text);
		
		//switch child frame
		driver.switchTo().frame(0);
		WebElement head2= driver.findElement(By.tagName("body"));
		System.out.println(head2.getText());
	}

}
