package TestngPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag3 {

	@Test(priority=-1)
	public void validLogin() {
		Reporter.log("valid login",true);
	}

	@Test(priority=1)
	public void e() {
		Reporter.log("e method",true);
	}

	@Test(priority=3)
	public void g() {
		Reporter.log("g method",true);
	}

	@Test(priority=6)
	public void a() {
		Reporter.log("a method",true);
	}

	@Test
	public void b() {
		Reporter.log("b method",true);
	}

	@Test
	public void m() {
		Reporter.log("m method",true);
	}

	@Test(priority=6)
	public void v() {
		Reporter.log("v method",true);
	}

	@Test(priority=2)
	public void k() {
		Reporter.log("k method",true);
	}

	@Test
	public void z() {
		Reporter.log("z method",true);
	}
}
