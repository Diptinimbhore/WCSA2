package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant  {

		static WebDriver driver;
		public void OpenBrowser()throws IOException
		{
			Flib flib=new Flib();

			//read the browser value
			String browservalue=flib.readPropertFile("./data/config.property","browser");

			//read the url
			String url=flib.readPropertFile("./data/config.property","url");
			if( browservalue.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(url);

			}

			else if( browservalue.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(url);		

			}
		}
		//close the browsers
		public void closeBrowser() 
		{
			driver.quit();	
		}

	}
