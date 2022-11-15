package testNG_BatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
@Test(enabled = false)
public void TC1() {
Reporter.log("I am TC 1",true);
}
@Test
public void TC2() {
Reporter.log("i am TC2",true);
}
@Test
public void TC3() {
	Reporter.log("I am TC 3",true);
}
}