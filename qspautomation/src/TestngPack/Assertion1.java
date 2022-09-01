package TestngPack;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion1 {
	@Test
	public void actiTime()
	{
		Reporter.log("Enter the url",true);
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(false,true);
		Reporter.log("verity the login page title",true);
		Reporter.log("Enter the username",true);
		Reporter.log("Enter the password",true);
		Reporter.log("click on login button",true);
		Reporter.log("verify the Home page title",true);
		Reporter.log("cteate user",true);
		Reporter.log("Delete user" ,true);
		Reporter.log("cteate Report",true);
		softassert.assertAll();
	}

}
