package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import POM.POM1_Login;
import POM.POM3_BuyProduct;
import screenshot.sc;

public class TC003_AddToCart extends TestBase
{
	
	String wwe;
	
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
		
		if(actual.equals(expected))
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failed");
		}
	}
	
}
	
		

