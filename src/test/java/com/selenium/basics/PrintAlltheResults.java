package com.selenium.basics;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class PrintAlltheResults {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        WebElement sb=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        sb.sendKeys("Selenium IDE");
        sb.sendKeys(Keys.ENTER);

		Thread.sleep(1000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		List<String> urls = new ArrayList<String>();
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
			if(url!=null && !url.isEmpty()&& url.startsWith("https"))
			{
			System.out.println(url);
			urls.add(url);
			}
		}
		for(String url:urls)
		{
			driver.navigate().to(url);
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
		
		driver.quit();
         
      
        }

       
	}

