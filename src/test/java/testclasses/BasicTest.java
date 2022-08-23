package testclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Selectagepage;
import pages.Selectcityanddetailspage;
import pages.Selectinsuredpage;
import pages.Selectproductpage;
import utility.Readdataproperties;


public class BasicTest {
public static WebDriver driver;
Selectproductpage sp;
Selectinsuredpage si;
Selectagepage sa;
Selectcityanddetailspage sc;
@BeforeSuite
public void launchbrowser() throws IOException {
//	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
  
WebDriverManager.chromedriver().setup();

ChromeOptions options=new ChromeOptions();
options.addArguments("--incognito");
//options.addArguments("--disable-notifications");//for window alert
options.addArguments("--start-maximized");
//options.addArguments("--headless");//to execute without opening browser
driver= new ChromeDriver(options);
driver.get(Readdataproperties.readprop("testurl"));
}
@BeforeClass
public void objectofloginpage() {
 sp=new Selectproductpage(driver);
 si=new Selectinsuredpage(driver);
 sa=new Selectagepage(driver);
 sc=new Selectcityanddetailspage(driver);
}
@AfterSuite
public void closebrowser() {
	driver.quit();
}
}
