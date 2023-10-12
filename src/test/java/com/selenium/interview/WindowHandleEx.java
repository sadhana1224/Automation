package com.selenium.interview;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleEx {
static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		 driver.get("https://demoqa.com/browser-windows");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 String parent=driver.getWindowHandle();
		 
		 driver.findElement(By.id("windowButton")).click();
		 
		 Set<String> allwind=driver.getWindowHandles();
		 
		 for(String child:allwind)
		 {
			 if(!parent.equals(child))
			 {
				 driver.switchTo().window(child);
				 String title=driver.findElement(By.id("sampleHeading")).getText();
				 System.out.println(title);
				 driver.switchTo().window(parent);
				
				 
			 }
		 }
	}

}
