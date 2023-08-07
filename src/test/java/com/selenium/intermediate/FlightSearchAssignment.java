package com.selenium.intermediate;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FlightSearchAssignment {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Flight Booking']")).click();

		Set<String> child=driver.getWindowHandles();
		for(String childwin:child)
		{
			if(!parent.equalsIgnoreCase(childwin))
			{
				driver.switchTo().window(childwin);
				System.out.println(driver.switchTo().window(childwin).getTitle());


				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
				System.out.println("Selected the round trip option");

				//DEPARTURE
				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
				driver.findElement(By.xpath("//a[@value='MAA']")).click();
				System.out.println("  Chennai ");

				//arrival
				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
				driver.findElement(By.xpath("(//a[contains(text(),' Bengaluru (BLR)')])[2]")).click();
				System.out.println(" BENGALURU ");

				//calendar field

				//choose depart date
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")).click();

				Thread.sleep(2000);
				//return date
				/*driver.findElement(By.xpath("(//button[contains(@type,'button')])[2]")).click();
		driver.findElement(By.xpath("(//tbody/tr[4]/td[3])[2]")).click();
				 */

				driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

				//For Adults

				for(int i=1;i<=3;i++)
				{
					driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();

				}

				for(int i=1;i<=4;i++)
				{
					driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();

				}

				for(int i=0;i<2;i++)
				{
					driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();

				}

				driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();

				//Select Currency

				WebElement curr=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
				Select s=new Select(curr);

				s.selectByIndex(1);



			}
		}


	}
}



