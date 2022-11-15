package testng_multibrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class A {
@Parameters("browsername")
@Test
public void TC1(String browsername) {
WebDriver driver=null;
if(browsername.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Bivas\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=new ChromeDriver();
}
else if(browsername.equals("firefox"))	
{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Bivas\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
}
driver.get("www.flipcard.com");
}
}

