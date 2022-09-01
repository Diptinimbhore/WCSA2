package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/HTML/checkbox.html");
		Thread.sleep(2000);
		WebElement sqlCheckBox = driver.findElement(By.id("sql"));
		sqlCheckBox.click();
		boolean status = sqlCheckBox.isSelected();
		System.out.println(status);
		
		
	}

}
