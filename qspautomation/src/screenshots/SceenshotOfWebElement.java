package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SceenshotOfWebElement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com");
		
		WebElement loginButton = driver.findElement(By.cssSelector("button[class*='L3NKy']"));
		File scr=loginButton.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/screenshot5.jpg");
		Files.copy(scr,dest);

	}

}
