package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calculatorSumXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onClick='r(7)' and .='7']")).click();
	
		driver.findElement(By.xpath("//span[@onClick='r(3)' and .='3']")).click();
		
		driver.findElement(By.xpath("//span[@onClick='r(6)' and .='6']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='+']")).click();
		
		driver.findElement(By.xpath("//span[@onClick='r(9)' and .='9']")).click();
		
		driver.findElement(By.xpath("//span[@onClick='r(1)' and .='1']")).click();
		
		Thread.sleep(1000);
		String Sum = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
        System.out.println("sum of numbers:"+Sum);
	}

}
