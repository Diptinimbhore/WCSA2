package singleSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UnsupportedException {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/HTML/singleselectdropdown.html");
		Thread.sleep(2000);
		
		WebElement ssDropdown = driver.findElement(By.id("menu"));
		Select sel = new Select(ssDropdown);
		sel.deselectAll();
	}

}
