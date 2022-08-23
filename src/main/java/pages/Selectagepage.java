package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Selectagepage {
	WebDriver driver;
	@FindBy(id="submitButton")
	WebElement continuebutton;

	@FindBy(id="Self")
	WebElement selfage;
	@FindBy(id="Father")
	WebElement fatherage;

		public Selectagepage(WebDriver driver) {
		this.driver= driver;
	PageFactory.initElements(driver, this);
		}

		public void selectdropdown(WebElement ele,String value ) {
			Select sel=new Select(ele);
			sel.selectByVisibleText(value);
		}
		public void selectpersonages() {
			selectdropdown(selfage, "26 yr");

			selectdropdown(fatherage, "60 yr");
			continuebutton.click();
		}


}
