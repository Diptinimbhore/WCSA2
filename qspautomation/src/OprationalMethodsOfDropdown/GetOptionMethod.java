package OprationalMethodsOfDropdown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/HTML/multiselectdropdown.html");
		Thread.sleep(2000);
		
		WebElement multiselectdd = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselectdd);
		
		List<WebElement> allOps = sel.getOptions();
		
		for(int i=0;i<allOps.size();i++)
		{
			WebElement op = allOps.get(i);
			String text = op.getText();
			System.out.println(text);
			Thread.sleep(1000);
		}
		
		
		
	}

}
