package RobotClass;

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

		driver.findElement(By.xpath("//button[.='✕']")).click();

		driver.findElement(By.name("q")).sendKeys("iphone12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();

		String parenthandle = driver.getWindowHandle();
		Set<String> alltabs = driver.getWindowHandles();

		for(String tab:alltabs)
		{
			System.out.println(tab);
			if(!parenthandle.equals(tab))
			{
				System.out.println(tab);
				driver.switchTo().window(tab);
			}
		}

		driver.findElement(By.xpath("//a[@class='_1fGeJ5' and .='256 GB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Green']/ancestor::ul[@class='_1q8vHb']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Remove')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();

	}

}
