package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM5_Filter 
{

	WebDriver driver;
	private Select ss3;	
	
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement filter;
	@FindBy(xpath="//button[text()='Add to cart']") private List<WebElement> allelement;
	
	public void applyFilter() 
	{
		ss3.selectByVisibleText("Price (high to low)");
	}
	
	
	
	public POM5_Filter(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		ss3 = new Select(filter);
	}
}
