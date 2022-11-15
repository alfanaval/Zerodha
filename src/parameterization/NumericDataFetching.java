package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NumericDataFetching {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//to crete object of FileInputStream class
		FileInputStream fis=new FileInputStream("C:\\Users\\Bivas\\Desktop\\para\\parameterization.xlsx");
//to open Excel Sheet we need to use createMethod which is present in WorkBookFactory class
		double data = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(2).getCell(2).getNumericCellValue();
	System.out.println(data);
	}

}
