package screenshotSep23;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DriverCommand;

import com.google.common.io.Files;

public class ScreenshotOfPage {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Bivas\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("https://www.axisbank.com/");
TakesScreenshot sc=(TakesScreenshot)d;
File src=sc.getScreenshotAs(OutputType.FILE);
File des=new File("C:\\Users\\Bivas\\Desktop\\scr\\axisBank.jpg");
Files.copy(src,des);

	}

}
