package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM7_Selectproduct 
{

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"item_0_title_link\"]/div") private WebElement productBikeLight;
	@FindBy(xpath="//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[2]") private WebElement validationBikeLight;
	
	public void ClickproductBikeLight()
	{
		productBikeLight.click();	
	}
	
	public String BikeLightValidation()
	{
		return validationBikeLight.getText();
	}
	
	public POM7_Selectproduct(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
