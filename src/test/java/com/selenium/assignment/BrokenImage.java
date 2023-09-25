package com.selenium.assignment;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImage {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {

		driver=new ChromeDriver();
		driver.get("https://www.theworldsworstwebsiteever.com/"); //th
		Thread.sleep(4000);
		
		
		List<WebElement> image=driver.findElements(By.tagName("img"));
		System.out.println(image.size());
		
		for(WebElement im:image)
		{
			String imgCheck=im.getAttribute("src");
			URL url=new URL(imgCheck);
			
			URLConnection urlconnection=url.openConnection();
			HttpURLConnection httpconnection=(HttpURLConnection)urlconnection;
			httpconnection.setConnectTimeout(5000);
			httpconnection.connect();
			if(httpconnection.getResponseCode()==200)
			{
			 System.out.println(imgCheck+" - "+httpconnection.getResponseCode()+" - "+httpconnection.getResponseMessage());
			}
			else
			{
				System.err.println(imgCheck+" - "+httpconnection.getResponseCode());
			}
			
			
			httpconnection.disconnect();
		}
		
	}

}
