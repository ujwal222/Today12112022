package Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM.POM2_LogOut;
import POM.POM3_BuyProduct;
import POM.POM6_OrderPlaced;
import POM.POM8_Checkouts;
import screenshot.sc;

public class AllTest extends TestBase
{
	//1
	@Test 
	public void verifylogin()
	{
		String actual="Swag Labs";
		
		if(actual.equalsIgnoreCase(driver.getTitle()))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
	}
	
	
	//2
	@Test 
	public  void verifyLogout() throws IOException
	{
		System.out.println("At login page");
	}
	
	
	//3
	@Test
	public  void VerifyAddtocart() throws IOException
	{
		//cart
		POM3_BuyProduct d1 = new POM3_BuyProduct(driver);
		d1.cart();
		System.out.println("Click on cart");
		
		String wwe = d1.addtocartelementBag();
		
		//for screenshot
		sc.captureSC("Logout", driver);
	
		//validation
		String actual="1";
		String expected = wwe;
		
		Assert.assertEquals(actual, expected);
	}
	
	
	
	
	
}
