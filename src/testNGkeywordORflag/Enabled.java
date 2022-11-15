package testNGkeywordORflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
@Test(enabled = false)//intentially we are skip/ignored the TC1
public void TC1() {
	Reporter.log("running TC1",true);
}
@Test
public void tc2() {
	Reporter.log("Runnig TC 2",true);
}




}
