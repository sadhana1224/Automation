package com.selenium.assignment;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;
import org.openqa.selenium.interactions.*;
public class Spicejet5aOneWay 
{

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.spicejet.com/");

		//driver.findElement(By.xpath("//div[@data-testid='one-way-radio-button']")).click();
		driver.findElement(By.xpath("//*[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();

		driver.findElement(By.xpath("//div[text()='Delhi']")).click();
		//departure date
		String year="2023";
		String month="September";
		String date="18";

		driver.findElement(By.xpath(" //div[contains(@data-testid,'month-"+month+"-"+year+"')]//div[@data-testid='undefined-calendar-day-"+date+"']/div")).click();

		
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		//adult	
		for(int i=1;i<=3;i++)
		{
			driver.findElement(By.xpath("//*[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		//children
		for(int i=0;i<=2;i++)
		{
			driver.findElement(By.xpath("//*[@data-testid='Children-testID-plus-one-cta']")).click();
		}
		//infant
		for(int i=0;i<=2;i++)
		{
			driver.findElement(By.xpath("//*[@data-testid='Infant-testID-plus-one-cta']")).click();
		}
		//currency
		driver.findElement(By.xpath("//div[contains(text(),'Currency')]")).click();
		driver.findElement(By.xpath("(//div[contains(text(),'INR')])[1]")).click();

	//	driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();

		Actions act=new Actions(driver);
		WebElement search=driver.findElement(By.xpath("//div[contains(text(),'Search Flight')]"));
		act.doubleClick(search).build().perform();
/*
		//i agree part
		//	driver.findElement(By.xpath("//div[contains(text(),'I have read and agreed to the ')]")).click();
		driver.findElement(By.xpath("//*[@class='css-1dbjc4n r-13awgt0 r-18u37iz']//div[@class='css-1dbjc4n r-1tf5bf9 r-1777fci r-1ww30s9']")).click();
		Thread.sleep(2000);
		//Continue
		Actions act1=new Actions(driver);
		WebElement con=	driver.findElement(By.xpath("//*[@class='css-1dbjc4n r-13awgt0 r-18u37iz']//*[contains(text(),'Continue')]"));
		act1.click(con).build().perform();
*/
		/* optional	
		driver.findElement(By.xpath("(//div[contains(text(),'Senior Citizen')])[2]")).click();		
		driver.findElement(By.xpath("(//div[contains(text(),'Armed Forces')])[2]")).click();
		 */


	}
}