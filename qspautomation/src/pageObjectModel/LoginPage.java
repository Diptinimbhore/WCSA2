package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

	@FindBy(name="username")private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton")private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;
	@FindBy(xpath = "//a[contains(text(),'Actimind')]") private WebElement linkActitime;
	@FindBy(xpath = "//a[contains(text(),'License')]")private WebElement licenseLink;
	@FindBy(xpath = "//a[contains(@src,'timer')]") private WebElement logoActiTime;

	//initialization
	public  LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}

	//utilization
	public WebElement getUsn()
	{
		return usn;
	}

	public WebElement getpass()
	{
		return pass;
	}

	public WebElement getLoginButton()
	{
		return loginButton;
	}

	public WebElement getCheckBox()
	{
		return checkBox;
	}

	public WebElement getLinkActiTime()
	{
		return linkActitime;
	}

	public WebElement getLicenseLink()
	{
		return licenseLink;
	}

	public WebElement getLogoActiTime()
	{
		return logoActiTime;
	}

	//operational method
	public void ValidLoginActiTime(String validUsername,String validPassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginButton.click();
	}

	public void inValidLoginActiTime(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginButton.click();
		Thread.sleep(3000);
		usn.clear();
	}
}
