package Restassured.Genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class ExcelFileutility 
{
	public String readDataFromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException  {
	 FileInputStream fis =new FileInputStream(Constantutility.ExcelFilepath);
	 Workbook wb=WorkbookFactory.create(fis);
	 Sheet s=wb.getSheet(sheet);
	 Row r=s.getRow(row);
	 Cell cel=r.getCell(cell);
	 String value=cel.getStringCellValue();
	 wb.close();
	 return value; 
	}

	public Object[][] readmultipleDataFromexcelsheet(String sheet)throws EncryptedDocumentException,IOException
	{
		
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\pro1.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
	        Sheet s=wb.getSheet(sheet);
	        int lastrow=s.getLastRowNum();
            int lastcell=s.getRow(0).getLastCellNum();
            Object[][] data=new Object[lastrow][lastcell];
            for(int i=0;i<lastrow;i++)
            {
            	for(int j=0;j<lastcell;j++)
            	{
            		data[i][j]=s.getRow(i+1).getCell(j).getStringCellValue();
            	}
            }
	 return data;
	 
	
 }
 
}
