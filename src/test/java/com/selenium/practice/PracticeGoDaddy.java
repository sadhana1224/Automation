package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeGoDaddy {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to("https://www.godaddy.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		System.out.println("the title is --->"+driver.getTitle());
		System.out.println("current url -->"+driver.getCurrentUrl());

		//page source
		/*	String source=driver.getPageSource();
		System.out.println(source);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 */
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"id-bdbb1f62-1be8-4426-a29d-c4fc9fc7a9c3\"]/div[2]/span[1]/input")));
	
		ele.sendKeys("java");
		driver.findElement(By.xpath("//span[contains(text(),'Search Domain')]")).click();



		//driver.quit();
	}

}
