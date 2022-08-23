package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v101.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectproductpage {
WebDriver driver;
@FindBy (xpath="//*[@class='shadowHandlerBox']//i[@class='icon-bg homeIconsBg health-insurance']")
WebElement healthinsurance;
@FindBy (xpath="(//*[@type='checkbox'])[5]")
WebElement fathercheckbox;
@FindBy(id="submitButton")
WebElement continuebutton;
@FindBy(id="btnLogin")
WebElement loginbutton;
	
	public Selectproductpage(WebDriver driver) {
	this.driver= driver;
PageFactory.initElements(driver, this);
	}

	public void clickonproduct() {
		
		healthinsurance.click();
	
		
	}
	public String gettitlepage() {
		String titleofpage = driver.getTitle();
		System.out.println(titleofpage);
		return titleofpage;
	}
}


