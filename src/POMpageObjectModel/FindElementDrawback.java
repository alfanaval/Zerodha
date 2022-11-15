package POMpageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDrawback {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Bivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");


WebElement id = driver.findElement(By.xpath("//input[@name='username']"));
//refresh the page
driver.navigate().refresh();	
//now we get exception
id.sendKeys("AB001");
	}

}
