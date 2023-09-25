package com.selenium.assignment;  //code is working

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenLinkAnotherProgram {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {

		driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
	List<WebElement>link=driver.findElements(By.tagName("a"));
	int brokenlink=0;
	System.out.println(link.size());
	
	for(WebElement links:link)
	{
		String url=links.getAttribute("href");
		
		if(url==null || url.isEmpty())
		{
			System.out.println("Url is empty");
			continue;
		}
		
		URL li=new URL(url);
		
		HttpURLConnection httpurlconnect=(HttpURLConnection) li.openConnection();
		httpurlconnect.connect();
		if(httpurlconnect.getResponseCode()>=400)
		{
			System.out.println(httpurlconnect.getResponseCode() +url +" is " + " broken link ");
		}
		else
		{
			System.out.println(httpurlconnect.getResponseCode() +url +" is " + " valid link ");
	
		}
	}
	
	System.out.println(brokenlink);
	
		driver.close();
	}

}
