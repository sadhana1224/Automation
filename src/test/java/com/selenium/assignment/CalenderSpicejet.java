package com.selenium.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalenderSpicejet {
	static WebDriver driver;

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		driver = new ChromeDriver(options);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String month = "September";
		String year = "2023";
		String date = "11";
	//	both method is working
		
	//	 first method
        // Click on the "Departure Date" input field
        driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//div[contains(@data-testid,'month-September-2023')]//div[@data-testid='undefined-calendar-day-10']/div
		String dateXPath = String.format("//div[contains(@data-testid,'month-%s-%s')]//div[@data-testid='undefined-calendar-day-%s']/div", month, year, date);
		WebElement dateElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dateXPath)));       
		dateElement.click();

	/*	 
		//second method
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement c=  driver.findElement(By.xpath(" //div[contains(@data-testid,'month-"+month+"-"+year+"')]//div[@data-testid='undefined-calendar-day-"+date+"']/div"));
		WebElement dateElement = wait.until(ExpectedConditions.elementToBeClickable(c));
		dateElement.click();
	
		*/
	}
}
