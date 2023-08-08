package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		//	driver.findElement(By.id("input")).sendKeys("Selenium");

		driver.findElement(By.className("gLFyf")).sendKeys("java");

		Thread.sleep(1000);
		driver.findElement(By.name("q")).clear();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Imag")).click();
		Thread.sleep(1000);
		driver.quit();

	}

}
