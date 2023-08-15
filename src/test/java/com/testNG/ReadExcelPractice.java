package com.testNG;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelPractice {
	
	@Test
	public void testdata()
	{
		XSSFWorkbook workbook=null;
		try
		{
			workbook=new XSSFWorkbook(System.getProperty("user.dir")+"/practice.xlsx");
			XSSFSheet worksheet=workbook.getSheetAt(0);
			XSSFRow row= worksheet.getRow(0);
			
			int noRows=worksheet.getPhysicalNumberOfRows();
			
			int noCells=row.getPhysicalNumberOfCells();
			
			for(int i=1;i<noRows;i++)
			{
				for(int j=0;j<noCells;j++)
				{
					String cellvalue=worksheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println("cell value-->"+cellvalue);
				}
			}
			
		}
		catch(Exception e)
		{
			
		}
	}

}
