package excelread;

import java.io.IOException;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		String name = Excelclass.getStringData(1, 0);
		System.out.println("name from excel 1st row : "+name);
		String age = Excelclass.getIntegerData(1, 1);
		System.out.println("age from excel 1st column : "+age);
		

	}

}
