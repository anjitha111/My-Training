package excelread;

import java.io.IOException;

public class ExcelClass
{
public static void main(String[] args) throws IOException {
		
	String result1=ExcelRead.stringDataRead(1, 0);// We are calling method like this since it is a static method.
	String result2=ExcelRead.integerDataRead(0, 0);
	System.out.println("Excel data1 is "+result1);
	System.out.println("Excel data2 is "+result2);	
	}
}