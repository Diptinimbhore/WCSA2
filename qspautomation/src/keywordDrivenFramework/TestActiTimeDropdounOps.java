package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestActiTimeDropdounOps extends BaseTest
{

	public static void main(String[] args,String PROP_PATH) throws IOException, InterruptedException
	{
		BaseTest bt = new BaseTest();
		bt.OpenBrowser();//open the browser
		Flib flib = new Flib();
		
		//read the data from prpperty file
		String username=flib.readPropertFile(PROP_PATH, "username");
		String password=flib.readPropertFile(PROP_PATH, "password");
		
		//valid login
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.partialLinkText("settings")).click();
		
		WebElement dropdown1 = driver.findElement(By.name("firstHierarchyLevelCode"));
		
		WebDriverComonLib wb = new WebDriverComonLib();
		wb.getAllOptionsOfDropdown(dropdown1);
		System.out.println("--------------------");
		
		WebElement dropdown2 = driver.findElement(By.name("secondHierarchyLevelCode"));
		wb.getAllOptionsOfDropdown(dropdown2);
	}
}
