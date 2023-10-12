package com.selenium.interview;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieeEx {
static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		Set<Cookie> cookie=driver.manage().getCookies();
		System.out.println(cookie.size());

		//get all cookies
		for(Cookie cok:cookie)
		{
			System.out.println(cok.getName()+" "+cok.getValue());
			
		}
		//add cookie
		Cookie cokobj=new Cookie("Mycookie","cookie123");
		driver.manage().addCookie(cokobj);
		cookie=driver.manage().getCookies();
		System.out.println(cookie.size());
		
		//delete a specific cookie
		//driver.manage().deleteCookie(cokobj); or
		driver.manage().deleteCookieNamed("Mycookie");
		cookie=driver.manage().getCookies();
		System.out.println(cookie.size());
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		cookie=driver.manage().getCookies();
		System.out.println(cookie.size());
		
	}

}
