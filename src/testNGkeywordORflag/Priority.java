package testNGkeywordORflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
//priority=keyword.means order of execution of TC
	@Test(priority= 2)
public void TC1() {
		Reporter.log("Running TC1",true);
	}
@Test(priority = 3)
public void TC2() {
Reporter.log("Running TC 2",true);
}
@Test(priority = 1)
public void TC3() {
Reporter.log("running TC3",true);
}

}
