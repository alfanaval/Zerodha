package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NumberButStringConversion {
public static void main(String[] args) throws Throwable {
	//create ob of FileInputStreamClass and give path
	//of excel sheet in its parameterised constructor
	FileInputStream fis=new FileInputStream("C:\\Users\\Bivas\\Desktop\\para\\parameterization.xlsx");
//we need to use create method which is present in workbookFactory class to open the ExcelSheet
	String value = WorkbookFactory.create(fis).getSheet("sheet1").getRow(7).getCell(3).getStringCellValue();
System.out.println(value);



}
}