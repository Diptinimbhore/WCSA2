package windowhandel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bluestone {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[.='Leave a message']/ancestor::div[@class='lc-1aasxu6 ek650k30']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("dipti");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("diptinimb5435346");
		Thread.sleep(2000);
		driver.findElement(By.id("ft7aw6jma2n_3")).sendKeys("9865321456");
		Thread.sleep(2000);
		driver.findElement(By.id("3v352vzz1kb_4")).sendKeys("hdgjgfsfggf");
		Thread.sleep(2000);
		driver.findElement(By.id("mq6gpq1j4ql_5")).sendKeys("hhgierytf bdjhrg jgfwrug ");
		Thread.sleep(2000);
		
	}
}
