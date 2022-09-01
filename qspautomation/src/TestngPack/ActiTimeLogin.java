package TestngPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActiTimeLogin {

	WebDriver driver;
	@Parameters({"browser","username","password"})
	@Test
	public void actitimelogin(String browservalue,String validusername,String validpassword) throws InterruptedException 
	{
		if( browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://desktop-l2kua39/login.do");
			driver.findElement(By.name("username")).sendKeys(validusername);
			driver.findElement(By.name("pwd")).sendKeys(validpassword);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			driver.close();
			
		}

		else if( browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://desktop-l2kua39/login.do");
			driver.findElement(By.name("username")).sendKeys(validusername);
			driver.findElement(By.name("pwd")).sendKeys(validpassword);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			driver.close();
				
		}

	}
}
