package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectinsuredpage {

	WebDriver driver;

	@FindBy (xpath="(//*[@class='checkbox'])[5]")
	WebElement fathercheckbox;
	@FindBy(id="submitButton")
    WebElement continuebutton;
		
    public Selectinsuredpage(WebDriver driver) 
    {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
	}

	public void selectinsured() 
	{
					
		fathercheckbox.click();
					
		continuebutton.click();
					
	}
		

}

