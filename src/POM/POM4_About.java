package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM4_About {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]") private WebElement menubutton;
	@FindBy(xpath="//*[@id=\"about_sidebar_link\"]") private WebElement aboutbutton;
	
	public void clickmenubutton()
	{
		menubutton.click();	
	}
	
	public void clickaboutbutton()
	{
		aboutbutton.click();	
	}
	
	public POM4_About(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
