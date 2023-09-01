package com.selenium.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Spicejet5bRoundTrip {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.spicejet.com/");

		//driver.findElement(By.xpath("//div[text()='round trip']")).click();
		driver.findElement(By.xpath("//*[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();

		driver.findElement(By.xpath("//div[text()='Delhi']")).click();
		//departure date
		String year="2023";
		String month="September";
		String date="12";

		driver.findElement(By.xpath(" //div[contains(@data-testid,'month-"+month+"-"+year+"')]//div[@data-testid='undefined-calendar-day-"+date+"']/div")).click();

		//return date
		driver.findElement(By.xpath("//div[text()='Return Date']")).click();
		year="2023";
		month="October";
		date="30";

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
		

	}

}
