import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshota_z {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Bivas\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
TakesScreenshot s=(TakesScreenshot)driver;
File src = s.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\Bivas\\Desktop\\scr\\abc.png");
Files.copy(src, dest);
driver.close();
	}

}
