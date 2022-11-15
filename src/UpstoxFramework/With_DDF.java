package UpstoxFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF {
public static void main(String[] args) throws Throwable {
	//naviagate to sheet in excel
	FileInputStream fis=new FileInputStream("C:\\Users\\Bivas\\Desktop\\upstxFrameworkWithDDF\\upstoxFrameworkWithDDf.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
	//set the property of browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Bivas\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//maximi the browser
	driver.manage().window().maximize();
	//del all cookies
	driver.manage().deleteAllCookies();
	//open the app
	driver.get("https://login-v2.upstox.com/");
	//navigate to UN
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys(UN);
	//navigate to pwd
	String pwd = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	//to click on sign in
	driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
	//to enter pin
	String pin = sh.getRow(0).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='yob']")).sendKeys(pin);
	//click on no i am good
	driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
	//varify user navigate to home page
	
	String expT = sh.getRow(0).getCell(3).getStringCellValue();
String actT = driver.getTitle();
if(actT.equals(expT)){
	System.out.println("user navigate to homeoGE TC IS PASS");
}
else {
	System.out.println("tc is failed");
}

}
}
