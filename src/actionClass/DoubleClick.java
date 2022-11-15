package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Bivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
//to copy the path of of chrome simply, Double click and give \
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
//inspect the ele where we want to move the cursor
WebElement target = driver.findElement(By.xpath("//a[text()='Gmail']"));
//create an object of Actions class
Actions Act=new Actions(driver);
Act.moveToElement(target).doubleClick().perform();
//here after using double click our gmail nt open this is ok right
	}

}
