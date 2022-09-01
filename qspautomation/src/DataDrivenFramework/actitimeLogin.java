package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimeLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-l2kua39/login.do");
		
		 Flib flib = new Flib();
		 String username = flib.readExceldata("./data/TestDataAct.xlsx", "validcreds", 1, 0);
		 String password= flib.readExceldata("./data/TestDataAct.xlsx", "validcreds", 1, 1);
		 
		 driver.findElement(By.name("username")).sendKeys(username);
		 driver.findElement(By.name("pwd")).sendKeys(password);
		 Thread.sleep(3000);
		 driver.findElement(By.id("loginButton")).click();	 
		 
	}

}
