package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationComments {

	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Imag")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Gmail")).click();
		
		driver.navigate().refresh();
	}

}
