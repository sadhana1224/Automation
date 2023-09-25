package com.testNG;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExelPractice {
static WebDriver driver=null;
@DataProvider(name="fetchdata")
public  Object[][] dataset() throws IOException
{
	Object[][] data=null;
	XSSFWorkbook wb=null;
	
	try
	{
		wb=new XSSFWorkbook(System.getProperty("user.dir")+"/searchtitles.xlsx");
		XSSFSheet sh=wb.getSheet("testdata");
		XSSFRow r=sh.getRow(0);
		
		int nr=sh.getPhysicalNumberOfRows();
		int nc=r.getPhysicalNumberOfCells();
		
		data=new Object[nr-1][nc];
		for(int i=1;i<nr;i++)
		{
			for(int j=0;j<nc;j++)
			{
				String cv=sh.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=cv;
			}
		}

		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		wb.close();
	}
		return data;
		
	}



	
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(dataProvider="fetchdata")
	public void fetchdata(String url,String searchTeram) throws InterruptedException
	{
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys(searchTeram);

		Thread.sleep(2000);
	}
	
}
