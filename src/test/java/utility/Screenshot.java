package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot{

	
	public static String capturescrshotwithpath(WebDriver driver,String filename) throws IOException {
		
		TakesScreenshot scrshot=(TakesScreenshot)driver;
        File source=scrshot.getScreenshotAs(OutputType.FILE);
//      String path = "D:\\screenshot\\"+filename+".png";
//      String path="C:\\Users\\hp\\eclipse-workspace\\Selenium\\screenshot\\"+filename+".png";
   String path=System.getProperty("user.dir")+"\\screenshot\\"+filename+".png"  ; 
		File screenshot=new File(path);
		FileHandler.copy(source, screenshot);
		return path;
		
	}
	
	

}
