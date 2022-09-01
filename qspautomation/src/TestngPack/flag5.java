package TestngPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag5 {
 
	@Test()
	public void LoginActiTime() {

		int i=9/0;
		System.out.println(i);
		Reporter.log(" login successful",true);
	}

	@Test(dependsOnMethods = "LoginActiTime")
	public void createUserActiTime() {

		Reporter.log("create user",true);
	}

	@Test(dependsOnMethods = "createUserActiTime", alwaysRun = true)
	public void logoutActiTime() {

		Reporter.log("Logout ActiTime successful",true);
	}
}
