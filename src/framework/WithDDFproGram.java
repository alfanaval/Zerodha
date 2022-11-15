package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithDDFproGram {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//create of of FileInputStream class and give path of Excel sheet in parameterised constructor
		FileInputStream fis=new FileInputStream("C:\\Users\\Bivas\\Desktop\\para\\parameterization.xlsx");
		//to open the Excel sheet we need to use create method which is present in 
		//WorkbookFactory class
		Sheet sheet = WorkbookFactory.create(fis).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//delete all cookies
		driver.manage().deleteAllCookies();
		//maximized
		driver.manage().window().maximize();
		//open the app
		driver.get("https://demo.actitime.com/login.do");
		//to enter usename in field
		String UN = sheet.getRow(12).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
	//to enter pwd in pwd field
	String pwd = sheet.getRow(13).getCell(3).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
	//to click on login button
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	//enter something on home page to ensure that selenium control on home page
	String data = sheet.getRow(10).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys(data);
	//varify the titile of home page
	//String act = driver.getTitle();
	//System.out.println(act);
	String expT = sheet.getRow(15).getCell(3).getStringCellValue();
	String actT=driver.getTitle();
	if(expT.equals(actT)) {
		System.out.println("tc is pass");
	}
	else {System.out.println("tc is fail");
	}
	
	}

}
