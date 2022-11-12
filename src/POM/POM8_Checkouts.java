package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM8_Checkouts 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='first-name']") private WebElement firstname;
	@FindBy(xpath="//input[@id='last-name']") private WebElement lastname;
	@FindBy(xpath="//input[@id='postal-code']") private WebElement pincode;
	@FindBy(xpath="//input[@id='continue']") private WebElement continueButton;
	@FindBy(xpath="//button[@id='finish']") private WebElement finishButtoon;
	@FindBy(xpath="//h2[@class='complete-header']") private WebElement thankyouText;
	
	public void sendfirstname()
	{
		firstname.sendKeys("Ujwal");
	}
	
	public void sendlastname()
	{
		lastname.sendKeys("Chaudhari");
	}
	
	public void sendPincode()
	{
		pincode.sendKeys("442001");
	}
	
	public void clickContinueButton()
	{
		continueButton.click();
	}
	
	public void clickfinishButtoon()
	{
		finishButtoon.click();
	}
	
	public String checkThankyouText()
	{
		return thankyouText.getText();
	}
	
	public POM8_Checkouts(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
