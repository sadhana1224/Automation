package com.selenium.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spicejet2OneWay {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");

		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.spicejet.com/");

		//one-way
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input")).sendKeys("BLR");
		driver.findElement(By.xpath("//div[text()='Delhi']")).click();
		//driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//input")).sendKeys("DEL");
	
/*
	     WebElement destinationInput = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//input"));
	        new Actions(driver).click(destinationInput).sendKeys("DEL").perform();
	    	Thread.sleep(1000);
*/
	    	String month="September";
			String year="2023";
			String date="10";
		driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
		Thread.sleep(1000);
		
	














	}

}
