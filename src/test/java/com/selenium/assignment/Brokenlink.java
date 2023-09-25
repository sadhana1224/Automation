package com.selenium.assignment;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.Set;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {

	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		Thread.sleep(5000);
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> links=	driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		for(WebElement link:links)
		{
			String Linkurl=link.getAttribute("href");
			URL url=new URL(Linkurl); //URL is a class
			URLConnection urlConnection=url.openConnection();//opne a conenction
			HttpURLConnection httpURLConnection=(HttpURLConnection)urlConnection;
			//HttpURLConnection is a abstract class thats why using typecasting here
			httpURLConnection.setConnectTimeout(5000);
			httpURLConnection.connect();
			if(httpURLConnection.getResponseCode()==200)
			{
				System.out.println(Linkurl+" - "+httpURLConnection.getResponseCode()+" - "+httpURLConnection.getResponseMessage());
			}
			else
			{
				System.err.println(Linkurl+" - "+httpURLConnection.getResponseCode());
			}
			httpURLConnection.disconnect();
		}

	}

}
