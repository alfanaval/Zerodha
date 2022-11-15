package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Bivas\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
//inspect the ele where we want to right click
WebElement target = driver.findElement(By.xpath("//a[text()='Gmail']"));

//we have to crete ob of Actions class
Actions act=new Actions(driver);
act.contextClick(target).perform();

	}

}
