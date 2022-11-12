package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import POM.POM1_Login;
import POM.POM2_LogOut;
import screenshot.sc;

public class TC002_LogoutFunctionality extends TestBase
{
	
	@Test
	public  void verifyLogout() throws IOException
	{
		//logout
		POM2_LogOut q3 = new POM2_LogOut(driver);
		q3.clickmenubutton();
		System.out.println("click on menu button");
		
		q3.clicklogout();
		System.out.println("click on Logout button");
		
		//for screenshot
		sc.captureSC("Logout", driver);
		
		//validation
				System.out.println("At login page");
	}
		
		
		
		
		
		
		
		
	}
	
	
	
	

