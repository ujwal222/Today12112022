package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class sc
{
	public static  void captureSC(String a, WebDriver driver) throws IOException 
	{
	
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\cujwa\\OneDrive\\Desktop\\SC\\"+a+".jpg");
		FileHandler.copy(source, dest);
		
	}
}
