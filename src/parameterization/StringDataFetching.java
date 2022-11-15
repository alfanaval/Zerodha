package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StringDataFetching {
	public static void main(String[] args) throws Throwable {
		//create ob of FileInputStream class
		//give path of Excel sheet in parameterised constroctor
		FileInputStream fis=new FileInputStream("C:\\Users\\Bivas\\Desktop\\para\\parameterization.xlsx");
		//to open the excel sheet need to call create methd present in WorkBook factory class
	String data = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(7).getCell(1).getStringCellValue();
	System.out.println(data);
	
	
	
	}

}
