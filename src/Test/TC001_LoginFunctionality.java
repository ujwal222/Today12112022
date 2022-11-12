package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import POM.POM1_Login;
import screenshot.sc;

public class TC001_LoginFunctionality extends TestBase
{
	//validation
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
		
		
		
	
	}
	

