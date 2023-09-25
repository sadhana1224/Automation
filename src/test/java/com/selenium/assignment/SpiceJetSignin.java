package com.selenium.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJetSignin {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//disable pop up
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/"); //-->1st testcase
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@data-testid='user-mobileno-input-box']")).sendKeys("9688741481");
		driver.findElement(By.xpath("//input[@data-testid='password-input-box-cta']")).sendKeys("Sadhumaa@123");
		driver.findElement(By.xpath("//div[@data-testid='login-cta']")).click();

	}

}
