package excelread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelclass {

	static FileInputStream f;
	static XSSFWorkbook wb;
	static XSSFSheet xs;
	
	public static String getStringData(int  a,int b) throws IOException
	{
		
		
		f = new FileInputStream("C:\\Users\\chandrashekhar\\Documents\\Obsequra\\javapgm.xlsx");
		wb = new XSSFWorkbook(f);
		xs = wb.getSheet("Sheet1");
		XSSFRow  r = xs.getRow(a);
		XSSFCell c = r.getCell(b);
		
		return c.getStringCellValue();
	}
	
	public static String getIntegerData(int a, int b) throws IOException
	{

		f = new FileInputStream("C:\\Users\\chandrashekhar\\Documents\\Obsequra\\javapgm.xlsx");
		wb = new XSSFWorkbook(f);
		xs = wb.getSheet("Sheet1");
		XSSFRow  r = xs.getRow(a);
		XSSFCell c = r.getCell(b);
		int var = (int)c.getNumericCellValue(); //convert to integer (typecasting)
		return String.valueOf(var);  //return value as string
		//to call return type : assign variable as string 
		
	}
	
	

}
