package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1_Login 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']") private WebElement username;
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	@FindBy(xpath="//input[@id='login-button']") private WebElement login;
	
	
	public void sendusername(String a)
	{
		username.sendKeys(a);
	}
	
	public void sendpassword(String a)
	{
		password.sendKeys(a);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	public POM1_Login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
