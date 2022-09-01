package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		Dimension size = loginButton.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		
		System.out.println(height);
		System.out.println(width);
		
	}	

}
