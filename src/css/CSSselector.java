package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver w=new ChromeDriver();
w.get("https://www.amazon.in/");
w.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("real me 9 pro plus");
w.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
	}

}
