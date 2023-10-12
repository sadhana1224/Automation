package com.selenium.interview;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkEx {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {

		driver=new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		driver.manage().window().maximize();

		WebElement link=driver.findElement(By.xpath("//a[text()='Click Here for Broken Link']"));

		String li=link.getAttribute("href");
		if((li==null) ||(li.isEmpty()))
		{
			System.out.println("Url is empty");
		}
		
		URL url=new URL(li);
		HttpURLConnection http=(HttpURLConnection)url.openConnection();
		http.connect();
		if(http.getResponseCode()==200)
		{
			System.out.println(http.getResponseCode()+" "+url+"valid link");
		}
		else
		{
			System.out.println(http.getResponseCode()+" "+url+"broken link");
		}
	}

}
