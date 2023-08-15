package com.selenium.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPrinterAssignment {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement search = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));
		search.sendKeys("Printers");
		search.sendKeys(Keys.ENTER);
//brands
		List<WebElement> brandfilter=driver.findElements(By.xpath("//div[@id='brandsRefinements']//li/span/a/div/label"));
		for (int i=0;i<brandfilter.size();i++) {


			brandfilter=driver.findElements(By.xpath("//div[@id='brandsRefinements']//li/span/a/div/label"));

			if(!brandfilter.get(i).isDisplayed()){
				driver.findElement(By.xpath("//*[@id='brandsRefinements']/ul/li[2]/span/div/a/span")).click();
			}
			brandfilter.get(i).click();		}

//low to high
		Select drpCountry = new Select(driver.findElement(By.id("s-result-sort-select")));
		drpCountry.selectByValue("price-asc-rank");
		driver.findElement(By.xpath("//*[@data-cel-widget='search_result_2']/div/div/div/div/div/div[1]//a")).click();

		driver.navigate().back();


		drpCountry= new Select(driver.findElement(By.id("s-result-sort-select")));
		drpCountry.selectByValue("price-desc-rank");

		//		drpCountry.selectByValue("review-rank");
		//		drpCountry.selectByValue("date-desc-rank");





		Thread.sleep(1000);

	}
}
