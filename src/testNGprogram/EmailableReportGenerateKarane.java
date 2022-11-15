package testNGprogram;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EmailableReportGenerateKarane {
//true write kela trch emailable report generate honar naetr console madhe output disnar
	@Test
public void TC1() {
	Reporter.log("tc1 running",true);
	}
@Test
public void TC2() {
	Reporter.log("TC2 running",true);
}
@Test
public void tc3() {
	Reporter.log("TC3 running",true);
}
}
