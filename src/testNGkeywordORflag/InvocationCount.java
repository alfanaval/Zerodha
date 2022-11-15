package testNGkeywordORflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
//invocationCount are keyword use to run 1TC at multiple time
	@Test(invocationCount=10)
	public void TC1() {
		Reporter.log("Running TC1",true);
	}
}
