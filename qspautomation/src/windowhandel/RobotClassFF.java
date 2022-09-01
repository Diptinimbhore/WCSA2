package windowhandel;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassFF {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[.='✕']")).click();

		driver.findElement(By.name("q")).sendKeys("iphone 12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);

		Set<String> allhandel = driver.getWindowHandles();

		for(String handle:allhandel)	
		{
			driver.findElement(By.xpath("//div[.='APPLE iPhone 12 (Blue, 64 GB)']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='_2C41yO'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='_2C41yO'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		}

	}

}
