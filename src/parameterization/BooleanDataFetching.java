package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BooleanDataFetching {
public static void main(String[] args) throws Throwable {
	//create the ob of FileInputStream class and give the path of excel sheet
	//in parameterised constructor
	FileInputStream fis=new FileInputStream("C:\\Users\\Bivas\\Desktop\\para\\parameterization.xlsx");
	//we need to call create method which is present in workbook factory class to open the excel sheet
	boolean value = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(9).getCell(4).getBooleanCellValue();
System.out.println(value);

}
}
