package testNGkeywordORflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeouts {
@Test(timeOut = 5000)
public void TC1() {
	Reporter.log("TC 1 rinning",true);
}
}
