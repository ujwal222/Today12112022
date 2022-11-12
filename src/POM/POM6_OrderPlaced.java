package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM6_OrderPlaced
{

	WebDriver driver;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement cart;
	@FindBy(xpath="//button[text()='Checkout']") private WebElement checkout;
	@FindBy(xpath="//input[@id='first-name']") private WebElement firstname;
	
	public void clickCart()
	{
		cart.click();
	}
	
	public void clickCheckout()
	{
		checkout.click();
	}
	
	public POM6_OrderPlaced(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
}
