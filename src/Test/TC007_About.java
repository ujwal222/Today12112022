package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import POM.POM1_Login;
import POM.POM4_About;

import screenshot.sc;

public class TC007_About {

	
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
		
		//Login
		POM1_Login q1 = new POM1_Login(driver);
		
		q1.sendusername("standard_user");
		System.out.println("username is entered");
		
		q1.sendpassword("secret_sauce");
		System.out.println("password is entered");
		
		q1.clickLogin();
		System.out.println("click on login page");
		
		POM4_About qwe = new POM4_About(driver);
		qwe.clickmenubutton();
		System.out.println("clicked on menu buttton");
		
		qwe.clickaboutbutton();
		System.out.println("about button");
		
		//Validation
		
		String actual="DEVELOP WITH CONFIDENCE";
		String expected=driver.findElement(By.xpath("//h1[@class='supertitle ']")).getText();
		
		if(actual.equals(expected))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		
		sc.captureSC("Logout", driver);
		
		
		driver.close();
		
	}
	
}
