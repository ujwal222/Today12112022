package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import POM.POM1_Login;
import POM.POM3_BuyProduct;
import POM.POM6_OrderPlaced;
import POM.POM8_Checkouts;
import screenshot.sc;

public class TC004_OrderPlaced extends TestBase
{
	String s2;
	
	@Test
	public  void verifyOrderPlaced() throws IOException
	{
		//cart
		POM3_BuyProduct z2 = new POM3_BuyProduct(driver);
		z2.addtocartelementBagClick();
		System.out.println("Bag product is selected");
		
		POM6_OrderPlaced z3 = new POM6_OrderPlaced(driver);
		z3.clickCart();
		System.out.println("clicked on cart button");
		
		z3.clickCheckout();
		System.out.println("cliked on checkout button");
		
		//checkouts
		POM8_Checkouts z4 = new POM8_Checkouts(driver);
		z4.sendfirstname();
		System.out.println("Firstname is entered");
		
		z4.sendlastname();
		System.out.println("last name is entered");
		
		z4.sendPincode();
		System.out.println("pincode is entered");
		
		z4.clickContinueButton();
		System.out.println("clicked on continue button");
		
		z4.clickfinishButtoon();
		System.out.println("clicled on finised button");
		
		s2=z4.checkThankyouText();
		
		// for screenshot
		sc.captureSC("Logout", driver);
		
	
		
		//Validation
		
			String actual=s2;
			String expected="THANK YOU FOR YOUR ORDER";
			
			if(actual.equals(expected))
			{
				System.out.println("test case is passed");
			}
			else
			{
				System.out.println("Test ia failed");
			}
		}
}	

		
	
	
	

