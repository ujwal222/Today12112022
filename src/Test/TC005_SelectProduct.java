package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import POM.POM1_Login;
import POM.POM7_Selectproduct;

import screenshot.sc;

public class TC005_SelectProduct
{

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver2.exe");
		ChromeOptions k1 = new ChromeOptions();
		k1.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(k1);
		System.out.println("browser is launched");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
		POM1_Login d1= new POM1_Login(driver);
		d1.sendusername("standard_user");
		System.out.println("username is entered");
		
		d1.sendpassword("secret_sauce");
		System.out.println("password is entered");
		
		d1.clickLogin();
		System.out.println("click on login page");
		
		POM7_Selectproduct d2 = new POM7_Selectproduct(driver);
		d2.ClickproductBikeLight();
		System.out.println("clicked on bike product");
		
		String actual=d2.BikeLightValidation();
		String expected="A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.";
		
		if(actual.equals(expected))
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
		
		sc.captureSC("SelectProduct", driver);
		
		
		
	}
}
