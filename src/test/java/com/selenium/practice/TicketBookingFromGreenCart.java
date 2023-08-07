package com.selenium.practice;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TicketBookingFromGreenCart 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String parenWindow=driver.getWindowHandle();

		driver.findElement(By.xpath("//a[text()='Flight Booking']")).click();

		Set<String> allWind = driver.getWindowHandles();

		for(String childWind:allWind)
		{
			if(!(parenWindow.equalsIgnoreCase(childWind)))
			{

				driver.switchTo().window(childWind);

				//select Radio button
				driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

				//select Departure City
                driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
				driver.findElement(By.xpath("//a[contains(text(),' Pune (PNQ)')]")).click();

				
				//Select Arraival City
				
				driver.findElement(By.xpath("(//a[contains(text(),'Mumbai (BOM)')])[2]")).click();
				
				
				//Calender Depart date
				driver.findElement(By.xpath("(//tbody/tr[5]/td[4])[1]")).click();
				
				//Calender Return Date
				/*driver.findElement(By.xpath("(//button[contains(@type,'button')])[2]")).click();
				driver.findElement(By.xpath("(//tbody/tr[4]/td[3])[2]")).click();
				*/
				Thread.sleep(2000);
				//Select Paseengers
				
				driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
				
				//For Adults
				int i=1;
				while(i<=4)
				{
					driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
					i++;
				}
				
				int j=0;
				while(j<=3)
				{
					driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
					j++;
				}
				
				int k=0;
				while(k<2)
				{
					driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
					k++;
				}
				
				driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
				
				//Select Currency
				
				WebElement curr=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
			     Select sc=new Select(curr);
			
			sc.selectByIndex(2);
			
			
			
			}
		}


	}
}

/*	outerloop:
for(int row=1;row<6;row++) {
	for(int data=1;data<8;data++) {
		String tempXpath="//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr["+row+"]/td["+data+"]/a";
		String temp= driver.findElement(By.xpath(tempXpath)).isDisplayed();

		if(temp.equals("13")){
			driver.findElement(By.xpath(tempXpath)).click();
			break outerloop;
 */