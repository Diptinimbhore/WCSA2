package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeinvalidLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://desktop-l2kua39/login.do");
		Flib flib = new Flib();
		int rc=flib.getRowCount("./data/TestDataAct.xlsx","invalidcreds");
		
		for(int i=1; i<=rc; i++)
		{
			String username = flib.readExceldata("./data/TestDataAct.xlsx", "invalidcreds", i,0);
			String password = flib.readExceldata("./data/TestDataAct.xlsx", "invalidcreds", i,1);
			System.out.println(i);
			
			driver.findElement(By.name("username")).sendKeys(username);
			 driver.findElement(By.name("pwd")).sendKeys(password);
			 Thread.sleep(3000);
			 driver.findElement(By.id("loginButton")).click();	
			 driver.findElement(By.name("username")).clear();		
		}
	}

}
