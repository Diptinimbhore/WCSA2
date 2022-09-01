package MethodOfWebDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("dipti");
		driver.findElement(By.name("password")).sendKeys("654dd");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='L3NKy']")).submit();
		
		
		
	}

}
