package com.selenium.interview;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsEX {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("alertButton")).click();	
		driver.switchTo().alert().accept();

		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("timerAlertButton"));
		ele.click();

		Thread.sleep(5000);
		driver.switchTo().alert().accept();

		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();

		Thread.sleep(2000);

		driver.findElement(By.id("promtButton")).click();

		Alert prompt=driver.switchTo().alert();

		prompt.sendKeys("sadhana");
		prompt.accept();




	}

}
