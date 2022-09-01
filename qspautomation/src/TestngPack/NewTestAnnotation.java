package TestngPack;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestAnnotation {
  @Test
  public void Test1() {
	  Reporter.log("Test1 method  Annotation",true);
  }
  
  @Test
  public void Test2() {
	  Reporter.log("Test2 method  Annotation",true);
  }
  
  @BeforeMethod
  public void Test3() {
	  Reporter.log("Beforemethod  Annotation",true);
  }
  
  @BeforeClass
  public void Test4() {
	  Reporter.log("Before class Annotation",true);
  }
  
  @BeforeTest
  public void Test5() {
	  Reporter.log("BeforeTest Annotation",true);
  }
  
  @AfterMethod
  public void Test6() {
	  Reporter.log("AfterMethod Annotation",true);
  }
  
  @AfterClass
  public void Test7() {
	  Reporter.log("Afterclass Annotation",true);
  }
  
  @AfterTest
  public void Test8() {
	  Reporter.log("AfterTest Annotation",true);
  }
}
