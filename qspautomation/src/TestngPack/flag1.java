package TestngPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag1 {
	@Test(description="This test is used to perform a valid login")
	public void validActitimetest() {
		Reporter.log("valid login is performed ",true);
	}

	@Test(description="This test is used to perform a invalid login")
	public void invalidActitimetest() {
		Reporter.log("invalid login is performed ",true);
	}
}
