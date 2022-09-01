package TestngPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag2 {
	//this test will not run itself ...It is disabled !
	
  @Test(enabled= false)
  public void method1() {
	  Reporter.log("actitimeValid",true);
  }
  @Test
  public void method2() {
	  Reporter.log("Actitime creat user",true);
  }
  
  @Test
  public void method3() {
	  Reporter.log("Actitime creat Reports",true);
  }
}
