package keywordDrivenFramework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverComonLib extends BaseTest {
   
	//getOptions of dropdown
	public void getAllOptionsOfDropdown(WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement> allOps = sel.getOptions();
		for(WebElement op:allOps)
		{
			String textOfOption = op.getText();
			System.out.println(textOfOption);
		}			
	}
	
	//to right click
	public void rightClick(WebElement target) 
	{
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		
	}
	//to perform mouseHover
	public void mouseHover(WebElement target)
	{
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
	}
	
	//toprtform copy
	public void copyText() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	public void pasteText() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
}
