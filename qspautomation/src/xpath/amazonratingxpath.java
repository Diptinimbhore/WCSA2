package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonratingxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("kurtis");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='S']")).click();
		Thread.sleep(1000);
		//String price=driver.findElement(By.xpath("(//span[.='Khushal K']/ancestor::div[@class='a-section a-spacing-small s-padding-left-micro s-padding-right-micro']/descendant::span[@class='a-price-whole'])[1]")).getText();
		//System.out.println("price Of kurtis: "+price);
	}

}
