package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POM.POM1_Login;
import POM.POM2_LogOut;
import screenshot.sc;

public class TestBase 
{
	WebDriver driver;
	@BeforeClass
	public  void Launch() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver2.exe");
		ChromeOptions k1 = new ChromeOptions();
		k1.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(k1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("browser is launched");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		
		POM1_Login q1 = new POM1_Login(driver);
		
		q1.sendusername("standard_user");
		System.out.println("username is entered");
		
		q1.sendpassword("secret_sauce");
		System.out.println("password is entered");
		
		q1.clickLogin();
		System.out.println("click on login page");
		
		sc.captureSC("uc1", driver);
		System.out.println("screenshot is taken");	
	}
	
	@AfterMethod
	public void verifyLogOut()
	{
		//logout
		POM2_LogOut q3 = new POM2_LogOut(driver);
		q3.clickmenubutton();
		System.out.println("click on menu button");
			
		q3.clicklogout();
		System.out.println("click on Logout button");
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
}
