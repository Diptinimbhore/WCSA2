package MethodOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsMethod2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("bike");
		Thread.sleep(3000);
        
		List<WebElement> webElementSuggessions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		
		for(WebElement sugg:webElementSuggessions)
		{
			
			String textOfsugg = sugg.getText();
			Thread.sleep(1000);
			System.out.println(textOfsugg);
			
		}
		
	}

}
