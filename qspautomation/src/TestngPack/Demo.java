package TestngPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void a() {
	  Reporter.log("Hi I am method a",true);
  }
}
