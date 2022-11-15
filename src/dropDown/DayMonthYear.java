package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DayMonthYear {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Bivas\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	Thread.sleep(4000);
WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
	Select a=new Select(day);
	Thread.sleep(3000);
	a.selectByValue("3");
	//month selection
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	Select ab=new Select(month);
	Thread.sleep(3000);
	ab.selectByValue("5");
	
	}
}
