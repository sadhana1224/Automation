package com.testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelUsingApachePOI {
	
	/*
	 * four classes for reading excel using Apache POI
	 * 
	 * XSSFWorkbook
	 * XSSFSheet
	 * XSSFRow
	 * XSSFCell
	 * 
	 */
	
	@Test
	public void readData() throws IOException
	{
		
		XSSFWorkbook workbook=null;
		
		try
		{
			//System.getProperty("user.dir")--> will give the path of the current working directory
			workbook= new XSSFWorkbook(System.getProperty("user.dir")+"/exceltitles.xlsx");
			XSSFSheet worksheet= workbook.getSheetAt(0);
			XSSFRow row= worksheet.getRow(0);
			
			//it will return the no. of rows in that specific sheet
			int noOfRows= worksheet.getPhysicalNumberOfRows();
			 
			//it will return the no.of cells in that specific row (row no->1)
			int noOfCells= row.getPhysicalNumberOfCells();
			
			for (int i=1;i<noOfRows;i++)
			{
				for(int j=0;j<noOfCells;j++)
				{
					String cellValue= worksheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println("Cell Value -->"+cellValue);
					
							
				}
			}
			
		}
		catch(Exception ex)
		{
			
		}
		finally
		{
			workbook.close();
		}
	}
	

}
