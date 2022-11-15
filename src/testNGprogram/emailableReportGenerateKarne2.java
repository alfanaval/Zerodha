package testNGprogram;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class emailableReportGenerateKarne2 {
@Test
public void tc1() {
	Reporter.log("TC 1 is passes",true);
	}
@Test
public void tc2() {
	Reporter.log("TC 2 is pass",true);
}
@Test
	public void tc3() {
	Reporter.log("TC 3 Failed",true);
Assert.fail();//it is used to failed the tC intentially
}
}
