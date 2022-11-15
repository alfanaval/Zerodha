package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//to set property
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Bivas\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		//create the object of browser setting class
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		c.addArguments("start-maximized");
		//to open the browser
		WebDriver driver=new ChromeDriver(c);
		Thread.sleep(4000);
		driver.get("https://www.hdfc.com/");//problem are there
	}

}
