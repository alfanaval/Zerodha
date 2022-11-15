package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Bivas\\Downloads\\chromedriver_win32");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
//inspect element where we have to move cursor here gmail
WebElement target =driver.findElement(By.xpath("//a[text()='Gmail']"));

//now we have create the ob of action class 
Actions act=new Actions(driver);
act.moveToElement(target).perform();

	}

}
