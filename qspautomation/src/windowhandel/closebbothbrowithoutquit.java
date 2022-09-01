package windowhandel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closebbothbrowithoutquit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(1000);
		String parentHandel = driver.getWindowHandle();
		System.out.println(parentHandel);
		Set<String> allhandel = driver.getWindowHandles();
		System.out.println(allhandel);


		for(String Wh:allhandel)
		{
			driver.switchTo().window(Wh).close();;


		}

	}
}
