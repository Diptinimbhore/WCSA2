package framehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultContentMethod {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/HTML/username.html");
		driver.findElement(By.id("un")).sendKeys("admin");
		driver.switchTo().frame("frnm");
		Thread.sleep(2000);
		driver.findElement(By.id("pwd")).sendKeys("manager");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("un")).clear();
		
		

	}

}
