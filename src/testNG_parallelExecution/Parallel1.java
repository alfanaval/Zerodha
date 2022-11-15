package testNG_parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel1 {
@Test
public void TC() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Bivas\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://kite.zerodha.com/?next=%2Fdashboard");



}
}
