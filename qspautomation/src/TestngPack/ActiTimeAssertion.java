package TestngPack;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActiTimeAssertion {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-l2kua39/login.do");
	}

	@Test
	public void ActiTimeTest() throws InterruptedException
	{
		String loginpageTitle = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(loginpageTitle , "actiTIME - Login");
		Reporter.log("login page title verified",true);

		//hard Assert
		boolean statusOfusernameTextBox = driver.findElement(By.name("username")).isDisplayed();
		Assert.assertEquals(statusOfusernameTextBox, true);
		Reporter.log("username text box is dispalyed",true);
		driver.findElement(By.name("username")).sendKeys("admin");

		//--------------------------------------------------------------------------------------------------

		//hard Assert
		boolean statusOfpasswordTextBox = driver.findElement(By.name("pwd")).isDisplayed();
		Assert.assertEquals(statusOfpasswordTextBox, true);
		Reporter.log("password text box is dispalyed",true);
		driver.findElement(By.name("pwd")).sendKeys("manager");

		//----------------------------------------------------------------------------------------------------
		//hard Assert
		boolean statusOfloginbutton = driver.findElement(By.id("loginButton")).isDisplayed();
		Assert.assertEquals(statusOfloginbutton, true);
		Reporter.log("loginButton is dispalyed",true);
		driver.findElement(By.id("loginButton")).click();

		//------------------------------------------------------------------------------------------------------

		Thread.sleep(4000);
		String HomepageTitle = driver.getTitle();
		softassert.assertEquals(HomepageTitle, "actiTIME - Enter Time-Track");
		Reporter.log("Home page title verified",true);
		Reporter.log("create user",true);
		Reporter.log("create Report",true);
		softassert.assertAll();
	}

	@AfterMethod
	public void tearDoun()
	{
		driver.quit();
	}


}
