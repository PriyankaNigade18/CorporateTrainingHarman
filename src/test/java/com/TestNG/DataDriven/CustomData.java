package com.TestNG.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData {

	@DataProvider(name="arraydata")
	public Object[][] testData()
	{
		Object data[][]={ {"Admin","admin123"},{"Sumit","test123"},{"Admin","admin123"},{"Riya","test13"}};
		
		return data;
	}
	
	 public XSSFWorkbook wb;
	
	@DataProvider(name="exceldata")
	public Object[][] fileData()
	{
		 //path of file
		  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
		  
		  //Reading in stream
		  FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			//wb-->sheet-->row-->cell-->value
			 wb=new XSSFWorkbook(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
		  
		  //number of rows
		  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
		  System.out.println("Number of rows are: "+rows);
		  
		  //number of columns
		  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
		  System.out.println("Number of columns are: "+cells);

		  //design array of same size
		  Object data[][]=new Object[rows-1][cells];
		  	  
		  //iterate array first shift data then read
		  for(int i=1;i<rows;i++)//row
		  {
			  for(int j=0;j<cells;j++)
			  {
				  //to start array from 0th position
				  data[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
				  //System.out.print(data[i-1][j]+"   ");
				  
			  }
			  System.out.println();
		  }
		  
		  
		  return data;
	}
	
}
