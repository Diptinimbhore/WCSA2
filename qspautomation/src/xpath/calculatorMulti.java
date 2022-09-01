package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calculatorMulti {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='7']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='5']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='×']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='4']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='9']")).click();
		Thread.sleep(1000);
		String Sum = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
        System.out.println(Sum);
	}

}
