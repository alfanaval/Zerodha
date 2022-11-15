package testNG_BatchExecution;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class B {
	@Test
	public void TC4() {
	Reporter.log("I am TC 4",true);
	}
	@Test
	public void TC5() {
	Reporter.log("i am TC5",true);
	Assert.fail();//it does ny shows test case fail in emailable report
	}
	@Test
	public void TC6() {
		Reporter.log("I am TC 6",true);
}
}