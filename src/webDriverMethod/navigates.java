package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigates {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Bivas\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("https://www.youtube.com/");
Thread.sleep(9000);
d.get("https://www.amazon.in/");
Thread.sleep(2000);
d.navigate().back();
Thread.sleep(1000);
d.navigate().forward();
Thread.sleep(2000);
d.navigate().refresh();
d.close();

	}

}
