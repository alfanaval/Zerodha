package dynamicElemHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClassA {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Bivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.worldometers.info/coronavirus/");
//to print corona cases
String cases = driver.findElement(By.xpath("//div[@class='maincounter-number'][1]")).getText();
System.out.println(cases);
Thread.sleep(2000);
//to print death cases
  String death = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[2]")).getText();
  System.out.println(death);
  //to find recovery
 String recover = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
 System.out.println(recover);
	}

}
