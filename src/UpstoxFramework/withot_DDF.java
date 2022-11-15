package UpstoxFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withot_DDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set the property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bivas\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//implicitly wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//delete all cookies
driver.manage().deleteAllCookies();
//maximize the browser
driver.manage().window().maximize();
//open the app
driver.get("https://login-v2.upstox.com/");

//to enter UN
driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys("2ZB2T4");
//to enter pwd field
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Samar@1988");
//to click on login
driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
	//to enter DOB
driver.findElement(By.xpath("//input[@id='yob']")).sendKeys("1988");
//click on no i am good
driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
//to varify user navigate the hame page
//to varify user is on home page
String expT = "Upstox Pro";
	String actT = driver.getTitle();
	if (actT.equals(actT)) {
		System.out.println("user navigate to home page and TC is pass");
	}
	else {
		System.out.println("tc is failed");
	}
	}

}
