package TestngPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class firstTestngClass {
	@Test
	public void method1() {

		Reporter.log("method1 get executed",true);
	}
	public void method2() {

		Reporter.log("method2 get executed",true);
	}

	@Test
	public void method3() {

		Reporter.log("method3 get executed",true);
	}

	@Test
	public void method4() {

		int i=9;
		int j=0;
		int res=i/j;
		System.out.println(res);
		Reporter.log("method4 get executed",true);
	}
}
