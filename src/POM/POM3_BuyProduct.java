package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3_BuyProduct
{
	WebDriver driver;

	@FindBy(xpath="(//button[text()='Add to cart'])[1]") private WebElement bagaddtocart;
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement addtocartelement;
	@FindBy(xpath="//button[text()='Checkout']") private WebElement checkoutbutton;
	
	
	public void cart()
	{
		bagaddtocart.click();
	}
	
	public String addtocartelementBag()
	{
		addtocartelement.getText();
		return addtocartelement.getText();
	}
	
	public void addtocartelementBagClick()
	{
		addtocartelement.click();
	}
	
	public void clickCheckOutButton()
	{
		checkoutbutton.click();
	}
	public POM3_BuyProduct (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
