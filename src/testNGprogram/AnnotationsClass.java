package testNGprogram;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsClass {
@BeforeClass
public void openBrowser() {
Reporter.log("OpenTheBrowser",true);
}
@BeforeMethod
public void loginApp() {
	Reporter.log("login THE App",true);
}
@Test
public void varifyID() {
	Reporter.log("VarifyUserID",true);
}
@AfterMethod
public void logoutApp() {
	Reporter.log("LogoutFromApp",true);
}
@AfterClass
public void CloseBrowser() {
	Reporter.log("CloseTheBrowser",true);
}
}