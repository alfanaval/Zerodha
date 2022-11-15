package framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutDDF {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Bivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//delete all cookies
	driver.manage().deleteAllCookies();
	//maximize window
	driver.manage().window().maximize();
	//open the appli
	driver.get("https://demo.actitime.com/login.do");
	//enter username field
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	//enter pwd field
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	//click on login
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	//add something on home page
	driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys("SHRee");
	//actual tittal
	String act=driver.getTitle();
	System.out.println(act);
	//expected title
	String exp = "actiTIME - Enter Time-Track";
	//compared both title
	if(exp.equals(act)) {
		System.out.println("test case is pass");
	}
	else {
		System.out.println("test case is fail");
		
		//@WithOut DDF means HardCoding WE input manually throught ProGraa by using like SendKeys
		
	}


}
}
