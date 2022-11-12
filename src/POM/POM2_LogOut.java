package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2_LogOut
{
	WebDriver driver;
	
	@FindBy(xpath="//button[text()='Open Menu']") private WebElement menubutton;
	@FindBy(xpath="//a[text()='Logout']") private WebElement logoutbutton;
	
	public void clickmenubutton()
	{
		menubutton.click();
	}

	public void clicklogout()
	{
		logoutbutton.click();
	}
	
	public POM2_LogOut (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
}
