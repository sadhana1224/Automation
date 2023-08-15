package com.selenium.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonAssignment {
static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	

		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
	
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("mobile phones");
		search.click();
		
		driver.findElement(By.xpath("//div[@aria-label='mobile phones']")).click();
		
		//samsung
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement samsung=driver.findElement(By.xpath("//span[text()='Samsung']"));
		wait.until(ExpectedConditions.visibilityOf(samsung));
		samsung.click();
		//oneplus
		WebElement oneplus=driver.findElement(By.xpath("//span[text()='OnePlus']"));
		oneplus.click();
	
		//third option
		driver.findElement(By.xpath("//span[contains(text(),'OnePlus Nord CE 2 Lite 5G (Black Dusk, 6GB RAM, 128GB Storage)')]")).click();
		
		
		
	}

}
