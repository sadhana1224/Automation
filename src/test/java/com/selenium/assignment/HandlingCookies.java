package com.selenium.assignment;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {

		driver=new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");

		//capture cookie
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println("before add cookies "+cookies.size());

		//print all the cookies
		for(Cookie cok:cookies)
		{
			System.out.println(cok.getName()+" : "+cok.getValue());
		}

		//add cookie
		Cookie cokobj=new Cookie("Mycookie123","helooo");
		driver.manage().addCookie(cokobj);
		cookies=driver.manage().getCookies();
		System.out.println("after adding cookie"+cookies.size());

//delete a cookie
		driver.manage().deleteCookie(cokobj);
	// or 	driver.manage().deleteCookieNamed("Mycookie123");
		cookies=driver.manage().getCookies();
		System.out.println("after delete 1 cookie "+cookies.size());
	
		//delete all cookies
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("after deleting all  cookie"+cookies.size());
		
	}

}
