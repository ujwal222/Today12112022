package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import POM.POM1_Login;
import POM.POM5_Filter;
import screenshot.sc;

public class TC006_Filter 
{
	
	public static void main(String[] args) throws InterruptedException, IOException
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
		
		//Login
		POM1_Login q1 = new POM1_Login(driver);
		
		q1.sendusername("standard_user");
		System.out.println("username is entered");
		
		q1.sendpassword("secret_sauce");
		System.out.println("password is entered");
		
		q1.clickLogin();
		System.out.println("click on login page");
		
		Thread.sleep(2000);
		
		//Filter
		POM5_Filter g1 = new POM5_Filter(driver);
		g1.applyFilter();
		System.out.println("filter applyed");
		Thread.sleep(2000);
		
		sc.captureSC("Filter", driver);
	
		
		driver.close();
		
		
	}

}
