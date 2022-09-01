package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginactiTime {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-l2kua39/login.jsp");
		
		String loginpagetitle = driver.getTitle();
		if(loginpagetitle.equals("actiTIME - Login"))
		{
			System.out.println("login page title is verified | test case is passed");
		}
		
		else
		{
			System.out.println(" login page title is not verified | test case is failed");
		}
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		
		System.out.println(" home page title is verified | test case is passed");
		
		
	}
	

}
