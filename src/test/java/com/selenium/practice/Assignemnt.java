package com.selenium.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Set;
public class Assignemnt {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

	//window handle
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		Set<String>s=driver.getWindowHandles();

		for(String windowhandle:s)
		{
			if(!windowhandle.equals(parent))
			{				
				driver.switchTo().window(windowhandle);
				System.out.println(driver.switchTo().window(windowhandle).getTitle());
			}
		}		

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr")));


		List<WebElement> fruit=driver.findElements(By.xpath("//tbody/tr"));

		for(WebElement fruitn:fruit)
		{				
			List<WebElement> tds=fruitn.findElements(By.tagName("td"));
			for(WebElement td:tds )
			{
				System.out.print(td.getText()+" ");	
			}
			System.out.println(); 
		}
		System.out.println("---------------------------------------------------");
		driver.findElement(By.xpath("//a[@aria-label='Next']")).click();

		List<WebElement> second=driver.findElements(By.xpath("//tbody/tr"));
		for(WebElement sec:second)
		{
			List<WebElement> row=sec.findElements(By.tagName("td"));
			for(WebElement r:row)
			{
				System.out.print(r.getText()+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------");
		//third
		//if i click the number 3-using copy the xpath
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div[2]/ul/li[5]/a")).click();
		//if i click the next button
		driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		List<WebElement> third=driver.findElements(By.xpath("//tbody/tr"));
		for(WebElement th:third)
		{
			List<WebElement> row1=th.findElements(By.tagName("td"));
			for(WebElement r1:row1)
			{
				System.out.print(r1.getText()+" ");	
			}
			System.out.println();
		}	
		System.out.println("---------------------------------------------------");
		//four
		//click on last button
		driver.findElement(By.xpath("//a[@aria-label='Last']")).click();
		//next button
	//	driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		
		List<WebElement> fourth=driver.findElements(By.xpath("//tbody/tr"));
		for(WebElement f:fourth)
		{
			List<WebElement> finalrow=f.findElements(By.tagName("td"));
			
				String vegName = finalrow.get(0).getText();
			    String price = finalrow.get(1).getText();
			    String discountPrice = finalrow.get(2).getText();
			    	   		
			System.out.println("vegname->"+vegName+"  "+"price->"+price+"  "+"discount price->"+discountPrice);
			
		}
		
	}

}


