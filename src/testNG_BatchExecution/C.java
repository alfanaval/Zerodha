package testNG_BatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class C {
	@Test
	public void TC7() {
	Reporter.log("I am TC 7",true);
	}
	@Test
	public void TC8() {
	Reporter.log("i am TC8",true);
	}
	@Test
	public void TC9() {
		Reporter.log("I am TC 9",true);
}
}