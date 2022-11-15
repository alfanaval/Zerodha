package findElements;

import java.time.Duration;
import java.util.List;

import org.asynchttpclient.netty.timeout.TimeoutsHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Bivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//implicitly wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
int count=0;
driver.get("http://www.flipkart.com/");

//to click on cancel botton
List<WebElement> allElements=driver.findElements(By.xpath("//div"));
for(WebElement i:allElements) {
	String str=i.getText();
	System.out.println(str);
	count++;
}
	
}
	
	




	

 
}
	


