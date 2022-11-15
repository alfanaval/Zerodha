package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.firefox.driver","C:\\Users\\Bivas\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.youtube.com/");
driver.close();
	}

}
