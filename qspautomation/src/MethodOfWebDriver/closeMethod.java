package MethodOfWebDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class closeMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://omayo.blogspot.com/");
		 driver.findElement(By.linkText("Open a popup window")).click();
         Thread.sleep(1000);
		 driver.close();
		
	}

}
