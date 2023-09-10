package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	static FileInputStream f;// Variable to read file
	static XSSFWorkbook w;// XSSF is an inbuilt class
	static XSSFSheet sh;

	public static String stringDataRead(int i,int j) throws IOException
	{
		f=new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\ExcelRead.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");// The data in sheet1 is now available in the variable sh.
		XSSFRow r=sh.getRow(i);// Row is an interface and XSSFRow is a class.
		XSSFCell c=r.getCell(j);// To get the column j.
		return c.getStringCellValue();// To get the data in that cell.
	}
	public static String integerDataRead(int i,int j) throws IOException
	{
		f=new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\ExcelRead.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");// The data in sheet1 is now available in the variable sh.
		XSSFRow r=sh.getRow(i);// Row is an interface and XSSFRow is a class.
		XSSFCell c=r.getCell(j);// To get the column j
		int res=(int) c.getNumericCellValue();// Type casting from double to int.From excel, it is double by default
		return String.valueOf(res);// Returning the value as string.
		
	}
	
	

}
