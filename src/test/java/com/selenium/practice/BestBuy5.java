package com.selenium.practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuy5 {

	static WebDriver driver;

	public static void main(String[] args) throws ProtocolException {
		driver=new ChromeDriver();
		driver.get("https://www.bestbuy.com/"); //-->1st testcase
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//choose country
		driver.findElement(By.xpath("(//div[@class='country-selection']//h4[text()='United States'])[1]")).click();

		//scroll down to the bottom of the page
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		List<WebElement> bottomlinks=driver.findElements(By.xpath("//a[@class='body-copy-sm mr-200']"));
		for(WebElement link:bottomlinks)
		{
			String url=link.getAttribute("href");
			  try {
		            URL bottomurl = new URL(url);
		            HttpURLConnection connection = (HttpURLConnection) bottomurl.openConnection();
		            connection.setRequestMethod("HEAD");
		            int responseCode=connection.getResponseCode();

		            if (responseCode != HttpURLConnection.HTTP_OK) {
		                System.out.println("The URL '" + url + "' is novalidated.");
		            } else {
		                System.out.println("The URL '" + url + "' is validated.");
		            }
		        } catch (IOException e) {
		            System.out.println("An exception occurred, indicating a broken link.");
		        }
			
		}

	}

}
