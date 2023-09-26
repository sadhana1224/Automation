package com.selenium.assignment;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

public class DownloadfileinSelenium {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		String location=System.getProperty("user.dir"+"\\screenshots\\");
		//chrome
		HashMap preferences=new HashMap();
		preferences.put("plugins.always_open_pdf_externally",true);//for pdf download
		preferences.put("download.default_directory",location);

		ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("prefs", preferences);

		//Edge
		HashMap preferences1=new HashMap();
		preferences.put("plugins.always_open_pdf_externally",true);//for pdf download
		preferences.put("download.default_directory",location);

		EdgeOptions opt1=new EdgeOptions();
		opt.setExperimentalOption("prefs", preferences);

		// driver=new EdgeDriver(opt1);
		
		driver=new ChromeDriver(opt);

		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Download sample DOC file'])[1]")).click();
		driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
	}

}
