package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_fliter_index {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='SAMSUNG']")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//div[.='8 GB and Above']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='4★ & above']")).click();
		Thread.sleep(2000);
        String price = driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy M52 5G (Icy Blue, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
        System.out.println("price of samsung mobile: " + price);
}
}
