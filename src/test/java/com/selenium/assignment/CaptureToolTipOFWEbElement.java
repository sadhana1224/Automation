package com.selenium.assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureToolTipOFWEbElement {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {

		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().frame(0);
		
	WebElement tooltip=	driver.findElement(By.xpath("//a[normalize-space()='ThemeRoller']"));
	String tooltext=tooltip.getAttribute("title");
	System.out.println(tooltext);
	}

}
