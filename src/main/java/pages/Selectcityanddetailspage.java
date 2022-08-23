package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectcityanddetailspage {
	WebDriver driver;
	WebDriverWait wait;

	
	@FindBy (xpath="//*[@class='active']")
	WebElement city;
	@FindBy(id="txtcity")
	WebElement pincode;
	@FindBy(id="fullname")
	WebElement fullname;
	@FindBy(id="pmobile")
	WebElement mobno;
	@FindBy(xpath="//*[text()='Continue']")
	WebElement continuebutton;
	
		public Selectcityanddetailspage(WebDriver driver) {
		this.driver= driver;
	PageFactory.initElements(driver, this);
	wait= new WebDriverWait(driver,Duration.ofSeconds(60));
		}

		public void selectcity() {
			pincode.sendKeys("413512");
			wait.until(ExpectedConditions.elementToBeClickable(city));
			city.click();
			
		}
		public void personaldetails() {
			fullname.sendKeys("priya malwad");
			mobno.sendKeys("8555808782");
			
		
		}

}
