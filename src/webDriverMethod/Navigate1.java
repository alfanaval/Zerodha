package webDriverMethod;


import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v101.dom.model.BackendNode;

public class Navigate1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bivas\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");/*"key"
-print it manually in small letter & "value"-it path of chrome browser which is downloaded.*/
WebDriver d=new ChromeDriver();/*print web and press con+space select driver package import hoto
print chrome and select driver*/
d.get("https://web.whatsapp.com/");
Thread.sleep(2000);
//d.close();
d.get("https://www.youtube.com/");
Thread.sleep(1000);
d.navigate().back();//now control goes to whats app
Thread.sleep(1000);
d.navigate().forward();
d.navigate().refresh();//whenever page is refresh in auto
//at that tym adress of webpage can be change
d.close();
	}

}