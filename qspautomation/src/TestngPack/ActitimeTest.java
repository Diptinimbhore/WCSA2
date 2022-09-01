package TestngPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActitimeTest {

	@Test(priority=1)
	public void LoginActiTime() {

		Reporter.log("Actitime login",true);
	}

	@Test(priority=2)
	public void createUserActiTime() {

		Reporter.log("create user",true);
	}

	@Test(priority=3)
	public void logoutActiTime() {

		Reporter.log("Logout ActiTime",true);
	}
}
