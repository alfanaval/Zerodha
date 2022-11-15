package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Bivas\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("https://www.onlinesbi.sbi/");
Thread.sleep(2000);
d.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-default']")).click();
Thread.sleep(3000);
d.findElement(By.xpath("//span[text()='Corporate']")).click();

	}

}
